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
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package frc.paths;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;


public class PathHabLevel1DoubleRocketPart2 extends SrxTrajectory {
	
	public PathHabLevel1DoubleRocketPart2() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}
	
	public PathHabLevel1DoubleRocketPart2(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}
    
	public boolean highGear = true;

	double[][] centerPoints = {
		{-0.069, -1.389, 10.000, -30.000},
		{-0.347, -4.167, 10.000, -30.000},
		{-0.972, -8.333, 10.000, -30.000},
		{-2.083, -13.889, 10.000, -30.000},
		{-3.819, -20.833, 10.000, -29.999},
		{-6.319, -29.167, 10.000, -29.999},
		{-9.722, -38.889, 10.000, -29.997},
		{-14.167, -50.000, 10.000, -29.993},
		{-19.792, -62.500, 10.000, -29.986},
		{-26.736, -76.389, 10.000, -29.975},
		{-35.139, -91.667, 10.000, -29.957},
		{-45.139, -108.334, 10.000, -29.930},
		{-56.875, -126.389, 10.000, -29.890},
		{-70.486, -145.834, 10.000, -29.834},
		{-86.111, -166.667, 10.000, -29.755},
		{-103.889, -188.889, 10.000, -29.650},
		{-123.959, -212.501, 10.000, -29.510},
		{-146.389, -236.112, 10.000, -29.331},
		{-171.181, -259.723, 10.000, -29.106},
		{-198.334, -283.334, 10.000, -28.831},
		{-227.848, -306.945, 10.000, -28.500},
		{-259.723, -330.556, 10.000, -28.110},
		{-293.959, -354.168, 10.000, -27.659},
		{-330.556, -377.779, 10.000, -27.147},
		{-369.445, -400.001, 10.000, -26.576},
		{-410.487, -420.835, 10.000, -25.952},
		{-453.543, -440.279, 10.000, -25.283},
		{-498.474, -458.335, 10.000, -24.580},
		{-545.140, -475.001, 10.000, -23.855},
		{-593.404, -490.279, 10.000, -23.123},
		{-643.127, -504.168, 10.000, -22.400},
		{-694.169, -516.668, 10.000, -21.701},
		{-746.391, -527.779, 10.000, -21.042},
		{-799.655, -537.502, 10.000, -20.440},
		{-853.822, -545.835, 10.000, -19.907},
		{-908.753, -552.779, 10.000, -19.458},
		{-964.308, -558.335, 10.000, -19.103},
		{-1020.350, -562.502, 10.000, -18.851},
		{-1076.739, -565.279, 10.000, -18.709},
		{-1133.302, -565.979, 10.000, -18.680},
		{-1189.796, -563.901, 10.000, -18.765},
		{-1246.013, -560.433, 10.000, -18.963},
		{-1301.813, -555.577, 10.000, -19.266},
		{-1357.059, -549.332, 10.000, -19.669},
		{-1411.610, -541.698, 10.000, -20.161},
		{-1465.329, -532.675, 10.000, -20.730},
		{-1518.076, -522.264, 10.000, -21.362},
		{-1569.712, -510.463, 10.000, -22.042},
		{-1620.099, -497.274, 10.000, -22.755},
		{-1669.098, -482.695, 10.000, -23.484},
		{-1716.569, -466.728, 10.000, -24.213},
		{-1762.374, -449.372, 10.000, -24.929},
		{-1806.374, -430.627, 10.000, -25.616},
		{-1848.430, -410.493, 10.000, -26.264},
		{-1888.403, -388.970, 10.000, -26.862},
		{-1926.154, -366.059, 10.000, -27.405},
		{-1961.580, -342.447, 10.000, -27.887},
		{-1994.644, -318.836, 10.000, -28.307},
		{-2025.347, -295.225, 10.000, -28.668},
		{-2053.689, -271.614, 10.000, -28.971},
		{-2079.670, -248.003, 10.000, -29.221},
		{-2103.289, -224.391, 10.000, -29.423},
		{-2124.548, -200.780, 10.000, -29.582},
		{-2143.480, -177.859, 10.000, -29.704},
		{-2160.189, -156.326, 10.000, -29.796},
		{-2174.814, -136.182, 10.000, -29.863},
		{-2187.495, -117.427, 10.000, -29.911},
		{-2198.369, -100.060, 10.000, -29.944},
		{-2207.576, -84.083, 10.000, -29.967},
		{-2215.255, -69.495, 10.000, -29.981},
		{-2221.545, -56.295, 10.000, -29.990},
		{-2226.584, -44.485, 10.000, -29.995},
		{-2230.511, -34.063, 10.000, -29.998},
		{-2233.466, -25.030, 10.000, -29.999},
		{-2235.587, -17.386, 10.000, -30.000},
		{-2237.012, -11.131, 10.000, -30.000},
		{-2237.882, -6.265, 10.000, -30.000},
		{-2238.335, -2.788, 10.000, -30.000},
		{-2238.509, -0.699, 10.000, -30.000},
		{-2238.544, 0.000, 10.000, -30.000},
		{-2238.544, 0.000, 10.000, -30.000}

	};
  
	// WAYPOINT_DATA: [{"position":{"x":194,"y":30},"theta":-0.5235833333312303,"comment":""},{"position":{"x":185,"y":34},"theta":-0.5235833333312303,"comment":""}]
	// IS_REVERSED: true
	// FILE_NAME: PathHabLevel1DoubleRocketPart2
}