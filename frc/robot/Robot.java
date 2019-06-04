/**
 * Copyright (c) 2019 Team 3555
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package frc.robot;

import org.aluminati3555.auto.AluminatiAutoTask;
import org.aluminati3555.data.AluminatiData;
import org.aluminati3555.drive.AluminatiMotorGroup;
import org.aluminati3555.input.AluminatiJoystick;
import org.aluminati3555.input.AluminatiPigeon;
import org.aluminati3555.output.AluminatiRelay;
import org.aluminati3555.output.AluminatiTalonSRX;
import org.aluminati3555.output.AluminatiVictorSPX;
import org.aluminati3555.pneumatics.AluminatiCompressor;
import org.aluminati3555.pneumatics.AluminatiDoubleSolenoid;
import org.aluminati3555.robot.AluminatiRobot;
import org.aluminati3555.vision.AluminatiCameraHelper;
import org.aluminati3555.vision.AluminatiLimelight;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import frc.robot.controllers.TurnInPlaceController;
import frc.robot.systems.CargoSystem;
import frc.robot.systems.ClimberSystem;
import frc.robot.systems.DriveSystem;
import frc.robot.systems.HatchSystem;

/**
 * This is the main class of the robot
 * 
 * @author Caleb Heydon
 */

public class Robot extends AluminatiRobot {
  // Constants
  public static final String[] AUTO_MODES = { "Manual" };

  // Robot state
  private RobotMode robotMode;
  private AluminatiAutoTask autoTask;

  // Power distribution
  private PowerDistributionPanel pdp;

  // Joystick
  private AluminatiJoystick driverJoystick;
  private AluminatiJoystick operatorJoystick;

  // Systems
  private DriveSystem driveSystem;
  private AluminatiLimelight limelight;
  private AluminatiCompressor compressor;
  private ClimberSystem climberSystem;
  private CargoSystem cargoSystem;
  private HatchSystem hatchSystem;

  @Override
  public void robotInit() {
    // Configure pid
    AluminatiData.encoderF = 0.45;
    AluminatiData.encoderP = 0.5;
    AluminatiData.encoderI = 0.0001;
    AluminatiData.encoderD = 0.25;

    AluminatiData.gyroF = 0.45;
    AluminatiData.gyroP = 0.5;
    AluminatiData.gyroI = 0.0001;
    AluminatiData.gyroD = 0.25;

    // Set thread priority
    Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

    // Set default robot mode
    robotMode = RobotMode.OPERATOR_CONTROL;

    // Disable LiveWindow telemetry
    LiveWindow.disableAllTelemetry();

    // Setup pdp
    pdp = new PowerDistributionPanel();
    pdp.clearStickyFaults();

    // Setup joysticks
    driverJoystick = new AluminatiJoystick(1);
    operatorJoystick = new AluminatiJoystick(0);

    // Setup drivetrain
    AluminatiMotorGroup left = new AluminatiMotorGroup(new AluminatiTalonSRX(41), new AluminatiTalonSRX(43));
    AluminatiMotorGroup right = new AluminatiMotorGroup(true, new AluminatiTalonSRX(42), new AluminatiTalonSRX(44));
    AluminatiPigeon gyro = new AluminatiPigeon(left.getMotors()[1]);
    driveSystem = new DriveSystem(left, right, gyro, driverJoystick);

    // Setup limelight
    limelight = new AluminatiLimelight();
    limelight.setPipeline(0);
    limelight.setLEDMode(AluminatiLimelight.LEDMode.OFF);

    // Setup compressor
    compressor = new AluminatiCompressor();
    compressor.start();

    // Setup climber
    climberSystem = new ClimberSystem(new AluminatiTalonSRX(45), new DigitalInput(9), new AluminatiDoubleSolenoid(4, 5),
        driverJoystick, operatorJoystick);

    // Setup cargo handler
    cargoSystem = new CargoSystem(new AluminatiVictorSPX(46), new AluminatiVictorSPX(47), new Ultrasonic(1, 0),
        new AluminatiDoubleSolenoid(6, 7), new AluminatiRelay(0), operatorJoystick);

    // Setup hatch mechanism
    hatchSystem = new HatchSystem(new AluminatiDoubleSolenoid(2, 3), new AluminatiDoubleSolenoid(0, 1), driveSystem,
        new TurnInPlaceController(0.07, 0, 0.2, 0.25, 0.4), limelight, driverJoystick, operatorJoystick);

    // Start camera
    AluminatiCameraHelper.start(0);

    // Display auto modes on dashboard
    sendAutoModes();
  }

  @Override
  public void robotPeriodic() {

  }

  @Override
  public void disabledInit() {

  }

  @Override
  public void disabledPeriodic() {
    // Use brake mode if connected to the driverstation/fms
    if (DriverStation.getInstance().isDSAttached() || DriverStation.getInstance().isFMSAttached()) {
      driveSystem.brake();
    } else {
      // Use coast for vision calibration
      driveSystem.coast();
    }

    // Update systems
    long timestamp = System.currentTimeMillis();
    driveSystem.update(timestamp, false);
    climberSystem.update(timestamp, false);
    cargoSystem.update(timestamp, false);
    hatchSystem.update(timestamp, false);
  }

  @Override
  public void autonomousInit() {
    // Set brake mode
    driveSystem.brake();

    // Put limelight into camera mode and put leds back in pipeline mode
    limelight.setPipeline(1);
    limelight.setLEDMode(AluminatiLimelight.LEDMode.CURRENT_PIPELINE);

    loadAutoMode();
    if (autoTask != null) {
      robotMode = RobotMode.AUTONOMOUS;
      autoTask.start(System.currentTimeMillis());
    }
  }

  @Override
  public void autonomousPeriodic() {
    long timestamp = System.currentTimeMillis();

    autoControl(timestamp);

    // Update systems
    driveSystem.update(timestamp, (robotMode == RobotMode.OPERATOR_CONTROL));
    climberSystem.update(timestamp, (robotMode == RobotMode.OPERATOR_CONTROL));
    cargoSystem.update(timestamp, (robotMode == RobotMode.OPERATOR_CONTROL));
    hatchSystem.update(timestamp, (robotMode == RobotMode.OPERATOR_CONTROL));
  }

  @Override
  public void teleopInit() {
    // Set coast mode
    driveSystem.coast();

    // Stop auto task if one is running
    if (autoTask != null) {
      autoTask.stop();
    }

    // Put limelight into camera mode and put leds back in pipeline mode
    limelight.setPipeline(1);
    limelight.setLEDMode(AluminatiLimelight.LEDMode.CURRENT_PIPELINE);

    // Set control mode
    robotMode = RobotMode.OPERATOR_CONTROL;
  }

  @Override
  public void teleopPeriodic() {
    long timestamp = System.currentTimeMillis();

    autoControl(timestamp);

    // Update systems
    driveSystem.update(timestamp, (robotMode == RobotMode.OPERATOR_CONTROL));
    climberSystem.update(timestamp, (robotMode == RobotMode.OPERATOR_CONTROL));
    cargoSystem.update(timestamp, (robotMode == RobotMode.OPERATOR_CONTROL));
    hatchSystem.update(timestamp, (robotMode == RobotMode.OPERATOR_CONTROL));
  }

  @Override
  public void testInit() {
    driveSystem.coast();

    // Turn on limelight for testing
    limelight.setPipeline(0);

    // Set control mode
    robotMode = RobotMode.OPERATOR_CONTROL;
  }

  @Override
  public void testPeriodic() {

  }

  /**
   * Sends the auto modes to the dashboard
   */
  private void sendAutoModes() {
    NetworkTableInstance.getDefault().getTable("SmartDashboard").getEntry("Auto List").setStringArray(AUTO_MODES);
  }

  /**
   * Loads the selected auto into autoTask
   */
  private void loadAutoMode() {
    String auto = NetworkTableInstance.getDefault().getTable("SmartDashboard").getEntry("Auto Mode")
        .getString("Manual");

    if (auto.equals(AUTO_MODES[0])) {
      // Manual

      // Do nothing
    }
  }

  /**
   * Controls the robot during auto
   */
  private void autoControl(long timestamp) {
    if (robotMode == RobotMode.OPERATOR_CONTROL) {
      driveSystem.coast();

      // Set limelight mode
      if (driverJoystick.getRawButton(1)) {
        // Enable if trigger is down
        limelight.setPipeline(0);
      } else {
        limelight.setPipeline(1);
      }
    } else if (autoTask != null || driverJoystick.getRawButtonPressed(11)) {
      if (autoTask.isComplete()) {
        // Stop task and cleanup
        autoTask.stop();
        robotMode = RobotMode.OPERATOR_CONTROL;

        // Put drive in coast mode
        driveSystem.coast();
      } else {
        autoTask.update(timestamp);
      }
    }
  }

  private enum RobotMode {
    AUTONOMOUS, OPERATOR_CONTROL
  }
}