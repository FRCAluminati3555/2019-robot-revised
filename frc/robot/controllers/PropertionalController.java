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

package frc.robot.controllers;

/**
 * This is a simple proportional controller for turning
 * 
 * @author Caleb Heydon
 */
public class PropertionalController {
    private double kP;
    private double allowableError;
    private double minOutput;
    private double maxOutput;

    /**
     * Updates the controller and returns the output
     * @param setPoint
     * @param currentValue
     * @return
     */
    public double update(double setPoint, double currentValue) {
        double error = setPoint - currentValue;

        if (Math.abs(error) <= allowableError) {
            return 0;
        }

        double output = error * kP;

        if (output < 0 && output > -minOutput) {
            output = -minOutput;
        } else if (output > 0 && output < minOutput) {
            output = minOutput;
        }

        if (output < -maxOutput) {
            output = -maxOutput;
        } else if (output > maxOutput) {
            output = maxOutput;
        }

        return output;
    }

    public PropertionalController(double kP, double allowableError, double minOutput, double maxOutput) {
        this.kP = kP;
        this.allowableError = allowableError;
        this.minOutput = minOutput;
        this.maxOutput = maxOutput;
    }
}
