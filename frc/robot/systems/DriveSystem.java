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

package frc.robot.systems;

import org.aluminati3555.drive.AluminatiDrive;
import org.aluminati3555.drive.AluminatiMotorGroup;
import org.aluminati3555.input.AluminatiJoystick;
import org.aluminati3555.input.AluminatiPigeon;
import org.aluminati3555.motion.AluminatiMPManager;
import org.aluminati3555.system.AluminatiSystem;

import edu.wpi.first.wpilibj.DriverStation;

/**
 * This is the drivetrain class for the robot
 * 
 * @author Caleb Heydon
 */
public class DriveSystem extends AluminatiDrive implements AluminatiSystem {
    // Constants
    private static final int DRIVE_CURRENT_LIMIT_1 = 80;

    private AluminatiJoystick driverJoystick;
    private boolean usingLimelight;

    /**
     * Sets this to true to disable normal driving while using the limelight
     */
    public void setUsingLimelight(boolean usingLimelight) {
        this.usingLimelight = usingLimelight;
    }

    public void update(long timestamp, boolean enabled) {
        // Report failures to driver
        if (!this.getLeftGroup().isOK()) {
            DriverStation.reportError("Fault detected in the left side of the drive", false);
        }

        if (!this.getLeftGroup().isEncoderOK()) {
            DriverStation.reportError("Encoder failure detected in the left side of the drive", false);
        }

        if (!this.getRightGroup().isOK()) {
            DriverStation.reportError("Fault detected in the right side of the drive", false);
        }

        if (!this.getRightGroup().isEncoderOK()) {
            DriverStation.reportError("Encoder failure detected in the right side of the drive", false);
        }

        if (!this.getGyro().isOK()) {
            DriverStation.reportError("Gyro fault detected", false);
        }

        if (enabled) {
            if (driverJoystick.getRawButtonPressed(2)) {
                if (!this.isInverted()) {
                    this.setInverted(true);
                } else {
                    this.setInverted(false);
                }
            }

            if (!usingLimelight) {
                this.arcadeDrive(driverJoystick);
            }
        }
    }

    public DriveSystem(AluminatiMotorGroup left, AluminatiMotorGroup right, AluminatiPigeon gyro,
            AluminatiJoystick driverJoystick) {
        super(left, right, gyro);

        this.getLeftGroup().getMaster().configPeakCurrentDuration(500);
        this.getLeftGroup().getMaster().configPeakCurrentLimit(DRIVE_CURRENT_LIMIT_1);
        this.getLeftGroup().getMaster().configContinuousCurrentLimit(DRIVE_CURRENT_LIMIT_1);
        this.getLeftGroup().getMaster().enableCurrentLimit(true);

        this.getRightGroup().getMaster().configPeakCurrentDuration(500);
        this.getRightGroup().getMaster().configPeakCurrentLimit(DRIVE_CURRENT_LIMIT_1);
        this.getRightGroup().getMaster().configContinuousCurrentLimit(DRIVE_CURRENT_LIMIT_1);
        this.getRightGroup().getMaster().enableCurrentLimit(true);

        // Configure drive for motion profiling
        AluminatiMPManager.configTalons(this.getLeftGroup().getMaster(), this.getRightGroup().getMaster(),
                this.getGyro());

        this.driverJoystick = driverJoystick;
    }
}
