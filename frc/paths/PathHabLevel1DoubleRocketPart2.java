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
		{0, 0, 10.000, 0},
		{-0.069, -1.372, 10.000, -30.000},
		{-0.343, -4.117, 10.000, -30.000},
		{-0.961, -8.234, 10.000, -30.000},
		{-2.058, -13.723, 10.000, -30.000},
		{-3.774, -20.584, 10.000, -29.999},
		{-6.244, -28.818, 10.000, -29.998},
		{-9.606, -38.424, 10.000, -29.996},
		{-13.997, -49.402, 10.000, -29.992},
		{-19.555, -61.753, 10.000, -29.985},
		{-26.417, -75.476, 10.000, -29.974},
		{-34.719, -90.571, 10.000, -29.955},
		{-44.599, -107.039, 10.000, -29.926},
		{-56.195, -124.879, 10.000, -29.884},
		{-69.644, -144.091, 10.000, -29.824},
		{-85.082, -164.675, 10.000, -29.741},
		{-102.647, -186.632, 10.000, -29.629},
		{-122.477, -209.961, 10.000, -29.481},
		{-144.708, -234.662, 10.000, -29.291},
		{-169.478, -260.735, 10.000, -29.051},
		{-196.855, -286.809, 10.000, -28.754},
		{-226.840, -312.882, 10.000, -28.395},
		{-259.363, -337.584, 10.000, -27.970},
		{-294.288, -360.913, 10.000, -27.479},
		{-331.477, -382.869, 10.000, -26.925},
		{-370.793, -403.454, 10.000, -26.312},
		{-412.099, -422.666, 10.000, -25.649},
		{-455.258, -440.506, 10.000, -24.946},
		{-500.132, -456.973, 10.000, -24.215},
		{-546.584, -472.068, 10.000, -23.470},
		{-594.477, -485.791, 10.000, -22.727},
		{-643.673, -498.142, 10.000, -22.003},
		{-694.036, -509.120, 10.000, -21.315},
		{-745.429, -518.726, 10.000, -20.678},
		{-797.713, -526.960, 10.000, -20.108},
		{-850.752, -533.821, 10.000, -19.619},
		{-904.409, -539.310, 10.000, -19.223},
		{-958.545, -543.427, 10.000, -18.929},
		{-1013.025, -546.172, 10.000, -18.746},
		{-1067.711, -547.544, 10.000, -18.677},
		{-1122.409, -546.419, 10.000, -18.725},
		{-1176.926, -543.921, 10.000, -18.888},
		{-1231.125, -540.051, 10.000, -19.162},
		{-1284.868, -534.809, 10.000, -19.540},
		{-1338.018, -528.194, 10.000, -20.013},
		{-1390.438, -520.207, 10.000, -20.569},
		{-1441.991, -510.848, 10.000, -21.195},
		{-1492.539, -500.117, 10.000, -21.875},
		{-1541.946, -488.013, 10.000, -22.594},
		{-1590.073, -474.537, 10.000, -23.334},
		{-1636.784, -459.688, 10.000, -24.080},
		{-1681.942, -443.468, 10.000, -24.814},
		{-1725.409, -425.875, 10.000, -25.523},
		{-1767.048, -406.909, 10.000, -26.194},
		{-1806.723, -386.572, 10.000, -26.816},
		{-1844.294, -364.862, 10.000, -27.381},
		{-1879.626, -341.780, 10.000, -27.884},
		{-1912.582, -317.326, 10.000, -28.321},
		{-1943.023, -291.499, 10.000, -28.692},
		{-1970.869, -265.425, 10.000, -29.000},
		{-1996.108, -239.352, 10.000, -29.250},
		{-2018.796, -214.404, 10.000, -29.449},
		{-2039.057, -190.828, 10.000, -29.604},
		{-2057.030, -168.624, 10.000, -29.722},
		{-2072.851, -147.793, 10.000, -29.810},
		{-2086.657, -128.334, 10.000, -29.874},
		{-2098.586, -110.248, 10.000, -29.919},
		{-2108.775, -93.533, 10.000, -29.950},
		{-2117.362, -78.191, 10.000, -29.971},
		{-2124.482, -64.222, 10.000, -29.984},
		{-2130.275, -51.624, 10.000, -29.991},
		{-2134.876, -40.399, 10.000, -29.996},
		{-2138.423, -30.546, 10.000, -29.998},
		{-2141.053, -22.065, 10.000, -29.999},
		{-2142.905, -14.957, 10.000, -30.000},
		{-2144.114, -9.221, 10.000, -30.000},
		{-2144.817, -4.857, 10.000, -30.000},
		{-2145.154, -1.866, 10.000, -30.000},
		{-2145.259, -0.247, 10.000, -30.000},
		{-2145.272, 0.000, 10.000, -30.000},
		{-2145.272, 0.000, 10.000, -30.000}

	};
  
	// WAYPOINT_DATA: [{"position":{"x":194,"y":30},"theta":-0.5235833333312303,"comment":""},{"position":{"x":185,"y":34},"theta":-0.5235833333312303,"comment":""}]
	// IS_REVERSED: true
	// FILE_NAME: PathHabLevel1DoubleRocketPart2
}