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


public class PathHabLevel2Floor extends SrxTrajectory {
	
	public PathHabLevel2Floor() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}
	
	public PathHabLevel2Floor(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}
    
	public boolean highGear = true;

	double[][] centerPoints = {
		{0, 0, 10.000, 0},
		{-0.101, -2.028, 10.000, 0.000},
		{-0.507, -6.085, 10.000, 0.000},
		{-1.420, -12.171, 10.000, 0.000},
		{-3.043, -20.284, 10.000, 0.000},
		{-5.578, -30.426, 10.000, 0.000},
		{-9.229, -42.597, 10.000, 0.000},
		{-14.199, -56.796, 10.000, 0.000},
		{-20.690, -73.023, 10.000, 0.000},
		{-28.905, -91.279, 10.000, 0.000},
		{-39.047, -111.563, 10.000, 0.000},
		{-51.319, -133.876, 10.000, 0.000},
		{-65.924, -158.217, 10.000, 0.000},
		{-83.064, -184.586, 10.000, 0.000},
		{-102.942, -212.984, 10.000, 0.000},
		{-125.762, -243.410, 10.000, 0.000},
		{-151.726, -275.865, 10.000, 0.000},
		{-180.935, -308.320, 10.000, 0.000},
		{-213.390, -340.774, 10.000, 0.000},
		{-249.090, -373.229, 10.000, 0.000},
		{-288.035, -405.684, 10.000, 0.000},
		{-330.227, -438.138, 10.000, 0.000},
		{-375.663, -470.593, 10.000, 0.000},
		{-424.345, -503.048, 10.000, 0.000},
		{-476.273, -535.503, 10.000, 0.000},
		{-531.446, -567.957, 10.000, 0.000},
		{-589.864, -600.412, 10.000, 0.000},
		{-651.528, -632.867, 10.000, 0.000},
		{-716.438, -665.321, 10.000, 0.000},
		{-784.592, -697.776, 10.000, 0.000},
		{-855.993, -730.231, 10.000, 0.000},
		{-930.639, -762.685, 10.000, 0.000},
		{-1008.530, -795.140, 10.000, 0.000},
		{-1089.667, -827.595, 10.000, 0.000},
		{-1174.049, -860.050, 10.000, 0.000},
		{-1261.676, -892.504, 10.000, 0.000},
		{-1352.550, -924.959, 10.000, 0.000},
		{-1446.668, -957.414, 10.000, 0.000},
		{-1544.032, -989.868, 10.000, 0.000},
		{-1644.642, -1022.323, 10.000, 0.000},
		{-1748.497, -1054.778, 10.000, 0.000},
		{-1855.597, -1087.232, 10.000, 0.000},
		{-1965.943, -1119.687, 10.000, 0.000},
		{-2079.535, -1152.142, 10.000, 0.000},
		{-2196.372, -1184.597, 10.000, 0.000},
		{-2316.454, -1217.051, 10.000, 0.000},
		{-2439.782, -1249.506, 10.000, 0.000},
		{-2566.355, -1281.961, 10.000, 0.000},
		{-2696.174, -1314.415, 10.000, 0.000},
		{-2829.238, -1346.870, 10.000, 0.000},
		{-2965.548, -1379.325, 10.000, 0.000},
		{-3105.103, -1411.779, 10.000, 0.000},
		{-3247.904, -1444.234, 10.000, 0.000},
		{-3393.950, -1476.689, 10.000, 0.000},
		{-3543.242, -1509.144, 10.000, 0.000},
		{-3695.779, -1541.598, 10.000, 0.000},
		{-3851.562, -1574.053, 10.000, 0.000},
		{-4010.590, -1606.508, 10.000, 0.000},
		{-4172.863, -1638.962, 10.000, 0.000},
		{-4338.382, -1671.417, 10.000, 0.000},
		{-4507.146, -1703.872, 10.000, 0.000},
		{-4679.156, -1736.326, 10.000, 0.000},
		{-4854.412, -1768.781, 10.000, 0.000},
		{-5032.913, -1801.236, 10.000, 0.000},
		{-5214.659, -1833.691, 10.000, 0.000},
		{-5399.651, -1866.145, 10.000, 0.000},
		{-5587.888, -1898.600, 10.000, 0.000},
		{-5779.371, -1931.055, 10.000, 0.000},
		{-5974.099, -1963.509, 10.000, 0.000},
		{-6172.073, -1995.964, 10.000, 0.000},
		{-6373.292, -2028.419, 10.000, 0.000},
		{-6577.756, -2060.873, 10.000, 0.000},
		{-6785.466, -2093.328, 10.000, 0.000},
		{-6996.422, -2125.783, 10.000, 0.000},
		{-7210.623, -2158.238, 10.000, 0.000},
		{-7428.069, -2190.692, 10.000, 0.000},
		{-7648.761, -2223.147, 10.000, 0.000},
		{-7872.699, -2255.602, 10.000, 0.000},
		{-8099.882, -2288.056, 10.000, 0.000},
		{-8330.310, -2320.511, 10.000, 0.000},
		{-8563.984, -2352.966, 10.000, 0.000},
		{-8800.903, -2385.420, 10.000, 0.000},
		{-9041.068, -2417.875, 10.000, 0.000},
		{-9284.478, -2450.330, 10.000, 0.000},
		{-9531.134, -2482.785, 10.000, 0.000},
		{-9781.035, -2515.239, 10.000, 0.000},
		{-10034.182, -2547.694, 10.000, 0.000},
		{-10290.574, -2580.149, 10.000, 0.000},
		{-10550.212, -2612.603, 10.000, 0.000},
		{-10813.095, -2645.058, 10.000, 0.000},
		{-11079.223, -2677.513, 10.000, 0.000},
		{-11348.597, -2709.967, 10.000, 0.000},
		{-11621.217, -2742.422, 10.000, 0.000},
		{-11897.082, -2774.877, 10.000, 0.000},
		{-12176.192, -2807.332, 10.000, 0.000},
		{-12458.548, -2839.786, 10.000, 0.000},
		{-12744.149, -2872.241, 10.000, 0.000},
		{-13032.996, -2904.696, 10.000, 0.000},
		{-13325.088, -2937.150, 10.000, 0.000},
		{-13620.325, -2967.577, 10.000, 0.000},
		{-13918.502, -2995.975, 10.000, 0.000},
		{-14219.418, -3022.344, 10.000, 0.000},
		{-14522.870, -3046.685, 10.000, 0.000},
		{-14828.654, -3068.998, 10.000, 0.000},
		{-15136.568, -3089.282, 10.000, 0.000},
		{-15446.409, -3107.538, 10.000, 0.000},
		{-15757.974, -3123.765, 10.000, 0.000},
		{-16071.060, -3137.964, 10.000, 0.000},
		{-16385.465, -3150.134, 10.000, 0.000},
		{-16700.986, -3160.276, 10.000, 0.000},
		{-17017.419, -3168.390, 10.000, 0.000},
		{-17334.562, -3174.475, 10.000, 0.000},
		{-17652.213, -3178.532, 10.000, 0.000},
		{-17970.140, -3180.013, 10.000, 0.000},
		{-18288.013, -3177.436, 10.000, 0.000},
		{-18605.526, -3172.832, 10.000, 0.000},
		{-18922.477, -3166.199, 10.000, 0.000},
		{-19238.664, -3157.537, 10.000, 0.000},
		{-19553.883, -3146.847, 10.000, 0.000},
		{-19867.932, -3134.129, 10.000, 0.000},
		{-20180.608, -3119.382, 10.000, 0.000},
		{-20491.707, -3102.607, 10.000, 0.000},
		{-20801.028, -3083.803, 10.000, 0.000},
		{-21108.366, -3062.971, 10.000, 0.000},
		{-21413.520, -3040.110, 10.000, 0.000},
		{-21716.287, -3015.221, 10.000, 0.000},
		{-22016.463, -2988.304, 10.000, 0.000},
		{-22313.846, -2959.358, 10.000, 0.000},
		{-22608.233, -2928.384, 10.000, 0.000},
		{-22899.449, -2895.929, 10.000, 0.000},
		{-23187.419, -2863.475, 10.000, 0.000},
		{-23472.144, -2831.020, 10.000, 0.000},
		{-23753.623, -2798.565, 10.000, 0.000},
		{-24031.857, -2766.111, 10.000, 0.000},
		{-24306.845, -2733.656, 10.000, 0.000},
		{-24578.588, -2701.201, 10.000, 0.000},
		{-24847.086, -2668.747, 10.000, 0.000},
		{-25112.338, -2636.292, 10.000, 0.000},
		{-25374.344, -2603.837, 10.000, 0.000},
		{-25633.105, -2571.382, 10.000, 0.000},
		{-25888.620, -2538.928, 10.000, 0.000},
		{-26140.891, -2506.473, 10.000, 0.000},
		{-26389.915, -2474.018, 10.000, 0.000},
		{-26635.694, -2441.564, 10.000, 0.000},
		{-26878.228, -2409.109, 10.000, 0.000},
		{-27117.516, -2376.654, 10.000, 0.000},
		{-27353.559, -2344.200, 10.000, 0.000},
		{-27586.356, -2311.745, 10.000, 0.000},
		{-27815.908, -2279.290, 10.000, 0.000},
		{-28042.214, -2246.835, 10.000, 0.000},
		{-28265.275, -2214.381, 10.000, 0.000},
		{-28485.090, -2181.926, 10.000, 0.000},
		{-28701.660, -2149.471, 10.000, 0.000},
		{-28914.984, -2117.017, 10.000, 0.000},
		{-29125.063, -2084.562, 10.000, 0.000},
		{-29331.897, -2052.107, 10.000, 0.000},
		{-29535.485, -2019.653, 10.000, 0.000},
		{-29735.827, -1987.198, 10.000, 0.000},
		{-29932.924, -1954.743, 10.000, 0.000},
		{-30126.776, -1922.288, 10.000, 0.000},
		{-30317.382, -1889.834, 10.000, 0.000},
		{-30504.743, -1857.379, 10.000, 0.000},
		{-30688.858, -1824.924, 10.000, 0.000},
		{-30869.727, -1792.470, 10.000, 0.000},
		{-31047.352, -1760.015, 10.000, 0.000},
		{-31221.730, -1727.560, 10.000, 0.000},
		{-31392.864, -1695.105, 10.000, 0.000},
		{-31560.751, -1662.651, 10.000, 0.000},
		{-31725.394, -1630.196, 10.000, 0.000},
		{-31886.791, -1597.741, 10.000, 0.000},
		{-32044.942, -1565.287, 10.000, 0.000},
		{-32199.848, -1532.832, 10.000, 0.000},
		{-32351.508, -1500.377, 10.000, 0.000},
		{-32499.923, -1467.923, 10.000, 0.000},
		{-32645.093, -1435.468, 10.000, 0.000},
		{-32787.017, -1403.013, 10.000, 0.000},
		{-32925.696, -1370.558, 10.000, 0.000},
		{-33061.129, -1338.104, 10.000, 0.000},
		{-33193.316, -1305.649, 10.000, 0.000},
		{-33322.259, -1273.194, 10.000, 0.000},
		{-33447.955, -1240.740, 10.000, 0.000},
		{-33570.407, -1208.285, 10.000, 0.000},
		{-33689.612, -1175.830, 10.000, 0.000},
		{-33805.573, -1143.376, 10.000, 0.000},
		{-33918.287, -1110.921, 10.000, 0.000},
		{-34027.757, -1078.466, 10.000, 0.000},
		{-34133.981, -1046.011, 10.000, 0.000},
		{-34236.959, -1013.557, 10.000, 0.000},
		{-34336.692, -981.102, 10.000, 0.000},
		{-34433.179, -948.647, 10.000, 0.000},
		{-34526.421, -916.193, 10.000, 0.000},
		{-34616.418, -883.738, 10.000, 0.000},
		{-34703.169, -851.283, 10.000, 0.000},
		{-34786.675, -818.829, 10.000, 0.000},
		{-34866.935, -786.374, 10.000, 0.000},
		{-34943.949, -753.919, 10.000, 0.000},
		{-35017.719, -721.464, 10.000, 0.000},
		{-35088.242, -689.010, 10.000, 0.000},
		{-35155.521, -656.555, 10.000, 0.000},
		{-35219.553, -624.100, 10.000, 0.000},
		{-35280.341, -591.646, 10.000, 0.000},
		{-35337.883, -559.191, 10.000, 0.000},
		{-35392.179, -526.736, 10.000, 0.000},
		{-35443.230, -494.282, 10.000, 0.000},
		{-35491.035, -461.827, 10.000, 0.000},
		{-35535.595, -429.372, 10.000, 0.000},
		{-35576.910, -396.917, 10.000, 0.000},
		{-35614.979, -364.463, 10.000, 0.000},
		{-35649.802, -332.008, 10.000, 0.000},
		{-35681.380, -299.553, 10.000, 0.000},
		{-35709.713, -267.099, 10.000, 0.000},
		{-35734.827, -235.192, 10.000, 0.000},
		{-35756.853, -205.313, 10.000, 0.000},
		{-35775.992, -177.464, 10.000, 0.000},
		{-35792.447, -151.642, 10.000, 0.000},
		{-35806.421, -127.849, 10.000, 0.000},
		{-35818.118, -106.084, 10.000, 0.000},
		{-35827.740, -86.348, 10.000, 0.000},
		{-35835.489, -68.640, 10.000, 0.000},
		{-35841.569, -52.960, 10.000, 0.000},
		{-35846.182, -39.309, 10.000, 0.000},
		{-35849.532, -27.687, 10.000, 0.000},
		{-35851.821, -18.093, 10.000, 0.000},
		{-35853.252, -10.527, 10.000, 0.000},
		{-35854.028, -4.989, 10.000, 0.000},
		{-35854.352, -1.481, 10.000, 0.000},
		{-35854.426, 0.000, 10.000, 0.000},
		{-35854.426, 0.000, 10.000, 0.000}

	};
  
	// WAYPOINT_DATA: [{"position":{"x":20,"y":115},"theta":0,"comment":""},{"position":{"x":130,"y":115},"theta":0,"comment":""}]
	// IS_REVERSED: true
	// FILE_NAME: PathHabLevel2Floor
}