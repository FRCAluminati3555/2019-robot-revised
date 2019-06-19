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
import org.aluminati3555.vision.AluminatiLimelight;

import edu.wpi.first.wpilibj.Timer;
import frc.robot.controllers.PIDTurnController;
import frc.robot.controllers.TurnInPlaceController;
import frc.robot.systems.DriveSystem;
import frc.robot.systems.HatchSystem;

/**
 * This action autonomously places a hatch using the limelight
 * 
 * @author Caleb Heydon
 */
public class ActionAutoPlaceHatch implements AluminatiAutoTask {
    private static final double TARGET = 65;

    private DriveSystem driveSystem;
    private AluminatiLimelight limelight;

    private State state = State.ALIGNING;
    private AluminatiAutoTask task;

    private TurnInPlaceController turnController;
    private PIDTurnController forwardController;

    public void start(long timestamp) {
        task.start(timestamp);

        limelight.setPipeline(0);
    }

    public void update(long timestamp) {
        task.update(timestamp);

        if (state == State.ALIGNING) {
            driveSystem.setUsingLimelight(true);

            double area = limelight.getArea();
            if (area < TARGET) {
                double forward = limelight.hasTarget() ? -forwardController.update(TARGET, area, timestamp) : 0;

                driveSystem.manualArcadeDrive(-turnController.update(0, limelight.getX(), Timer.getFPGATimestamp()),
                        forward);
            } else {
                driveSystem.manualArcadeDrive(0, 0);
                state = State.RELEASING;

                task.advanceState();
            }
        } else if (state == State.RELEASING) {
            driveSystem.setUsingLimelight(false);
            limelight.setPipeline(1);

            if (task.isComplete()) {
                state = State.COMPLETE;
            }
        } else if (state != State.COMPLETE) {
            stop();
        }
    }

    public void stop() {
        driveSystem.setUsingLimelight(false);
        limelight.setPipeline(1);

        state = State.COMPLETE;
    }

    public void advanceState() {

    }

    public boolean isComplete() {
        return (state == State.COMPLETE);
    }

    public ActionAutoPlaceHatch(DriveSystem driveSystem, HatchSystem hatchSystem, AluminatiLimelight limelight) {
        this.driveSystem = driveSystem;
        this.limelight = limelight;

        this.task = new ActionPlaceHatch(hatchSystem);
        this.turnController = new TurnInPlaceController(0.07, 0, 0.2, 0.25, 0.4);
        this.forwardController = new PIDTurnController(0.1, 0, 0, 0, 0.1, 0.5, 0, 0);
    }

    private enum State {
        ALIGNING, RELEASING, COMPLETE
    }
}
