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
import org.aluminati3555.auto.AluminatiAutoTaskList;
import org.aluminati3555.vision.AluminatiLimelight;

import frc.robot.systems.DriveSystem;
import frc.robot.systems.HatchSystem;

/**
 * This auto mode comes off of level one and places a hatch on the front of the
 * cargo ship
 * 
 * @author Caleb Heydon
 */
public class ModeHabLevel1CargoFrontHatch implements AluminatiAutoTask {
    private AluminatiAutoTaskList taskList;

    public void start(long timestamp) {
        taskList.start(timestamp);
    }

    public void update(long timestamp) {
        taskList.update(timestamp);
    }

    public void stop() {
        taskList.stop();
    }

    public void advanceState() {

    }

    public boolean isComplete() {
        return taskList.isComplete();
    }

    public ModeHabLevel1CargoFrontHatch(DriveSystem driveSystem, HatchSystem hatchSystem,
            AluminatiLimelight limelight) {
        taskList = new AluminatiAutoTaskList();

        taskList.add(new ModeHabLevel1Floor(driveSystem));
        taskList.add(new ActionAutoPlaceHatch(driveSystem, hatchSystem, limelight));
    }
}
