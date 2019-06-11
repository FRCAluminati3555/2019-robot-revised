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

package frc.robot.auto;

import org.aluminati3555.auto.AluminatiAutoTask;
import org.aluminati3555.input.AluminatiPigeon;

import edu.wpi.first.wpilibj.Timer;
import frc.robot.controllers.TurnInPlaceController;
import frc.robot.systems.DriveSystem;

/**
 * This action turns the robot using the gyro sensor and a pi control loop
 * 
 * @author Caleb Heydon
 */
public class ActionTurnToYaw implements AluminatiAutoTask {
    private boolean running;
    private double targetAngle;

    private DriveSystem driveSystem;
    private AluminatiPigeon gyro;

    private TurnInPlaceController controller;

    public void start(long timestamp) {
        running = true;
    }

    public void update(long timestamp) {
        if (running) {
            double output = controller.update(targetAngle, gyro.getYaw(), Timer.getFPGATimestamp());

            // Check if complete
            if (output == 0) {
                running = false;
            }

            driveSystem.manualArcadeDrive(output, 0);
        }
    }

    public void stop() {
        running = false;
        driveSystem.manualArcadeDrive(0, 0);
    }

    public boolean isComplete() {
        return running;
    }

    /**
     * This method does nothing in this action
     */
    public void advanceState() {

    }

    public ActionTurnToYaw(double targetAngle, DriveSystem driveSystem, AluminatiPigeon gyro) {
        this.targetAngle = targetAngle;
        this.driveSystem = driveSystem;
        this.gyro = gyro;

        // Creat new pi controller
        controller = new TurnInPlaceController(0.1, 0, 0, 0, 1);
    }
}
