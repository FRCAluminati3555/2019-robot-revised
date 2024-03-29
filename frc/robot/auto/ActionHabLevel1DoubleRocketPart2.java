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

import frc.paths.PathHabLevel1DoubleRocketPart2;
import frc.robot.systems.DriveSystem;

/**
 * This action plays the HabLevel1DoubleRocketPart2 motion profile
 * 
 * @author Caleb Heydon
 */
public class ActionHabLevel1DoubleRocketPart2 implements AluminatiAutoTask {
    private DriveSystem driveSystem;
    private boolean inverted;

    public void start(long timestamp) {
        driveSystem.startMP(new PathHabLevel1DoubleRocketPart2(inverted), false);
    }

    public void update(long timestamp) {

    }

    public void stop() {
        driveSystem.stopMP();
    }

    public void advanceState() {

    }

    public boolean isComplete() {
        return driveSystem.isMPDone();
    }

    public ActionHabLevel1DoubleRocketPart2(DriveSystem driveSystem, boolean inverted) {
        this.driveSystem = driveSystem;
        this.inverted = inverted;
    }
}
