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


public class HabLevel2FloorPath extends SrxTrajectory {
	
	public HabLevel2FloorPath() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}
	
	public HabLevel2FloorPath(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}
    
	public boolean highGear = true;

	double[][] centerPoints = {
		{0, 0, 10.000, 0},
		{-0.068, -1.352, 10.000, 0.000},
		{-0.338, -4.057, 10.000, 0.000},
		{-0.947, -8.114, 10.000, 0.000},
		{-2.028, -13.523, 10.000, 0.000},
		{-3.719, -20.284, 10.000, 0.000},
		{-6.153, -28.398, 10.000, 0.000},
		{-9.466, -37.864, 10.000, 0.000},
		{-13.793, -48.682, 10.000, 0.000},
		{-19.270, -60.853, 10.000, 0.000},
		{-26.031, -74.375, 10.000, 0.000},
		{-34.213, -89.250, 10.000, 0.000},
		{-43.949, -105.478, 10.000, 0.000},
		{-55.376, -123.057, 10.000, 0.000},
		{-68.628, -141.989, 10.000, 0.000},
		{-83.841, -162.274, 10.000, 0.000},
		{-101.150, -183.910, 10.000, 0.000},
		{-120.623, -205.546, 10.000, 0.000},
		{-142.260, -227.183, 10.000, 0.000},
		{-166.060, -248.819, 10.000, 0.000},
		{-192.024, -270.456, 10.000, 0.000},
		{-220.151, -292.092, 10.000, 0.000},
		{-250.442, -313.729, 10.000, 0.000},
		{-282.897, -335.365, 10.000, 0.000},
		{-317.515, -357.002, 10.000, 0.000},
		{-354.297, -378.638, 10.000, 0.000},
		{-393.243, -400.275, 10.000, 0.000},
		{-434.352, -421.911, 10.000, 0.000},
		{-477.625, -443.548, 10.000, 0.000},
		{-523.062, -465.184, 10.000, 0.000},
		{-570.662, -486.821, 10.000, 0.000},
		{-620.426, -508.457, 10.000, 0.000},
		{-672.353, -530.093, 10.000, 0.000},
		{-726.444, -551.730, 10.000, 0.000},
		{-782.699, -573.366, 10.000, 0.000},
		{-841.118, -595.003, 10.000, 0.000},
		{-901.700, -616.639, 10.000, 0.000},
		{-964.446, -638.276, 10.000, 0.000},
		{-1029.355, -659.912, 10.000, 0.000},
		{-1096.428, -681.549, 10.000, 0.000},
		{-1165.665, -703.185, 10.000, 0.000},
		{-1237.065, -724.822, 10.000, 0.000},
		{-1310.629, -746.458, 10.000, 0.000},
		{-1386.357, -768.095, 10.000, 0.000},
		{-1464.248, -789.731, 10.000, 0.000},
		{-1544.303, -811.368, 10.000, 0.000},
		{-1626.521, -833.004, 10.000, 0.000},
		{-1710.904, -854.640, 10.000, 0.000},
		{-1797.449, -876.277, 10.000, 0.000},
		{-1886.159, -897.913, 10.000, 0.000},
		{-1977.032, -919.550, 10.000, 0.000},
		{-2070.069, -941.186, 10.000, 0.000},
		{-2165.269, -962.823, 10.000, 0.000},
		{-2262.634, -984.459, 10.000, 0.000},
		{-2362.161, -1006.096, 10.000, 0.000},
		{-2463.853, -1027.732, 10.000, 0.000},
		{-2567.708, -1049.369, 10.000, 0.000},
		{-2673.726, -1071.005, 10.000, 0.000},
		{-2781.909, -1092.642, 10.000, 0.000},
		{-2892.255, -1114.278, 10.000, 0.000},
		{-3004.764, -1135.915, 10.000, 0.000},
		{-3119.438, -1157.551, 10.000, 0.000},
		{-3236.275, -1179.187, 10.000, 0.000},
		{-3355.275, -1200.824, 10.000, 0.000},
		{-3476.439, -1222.460, 10.000, 0.000},
		{-3599.767, -1244.097, 10.000, 0.000},
		{-3725.259, -1265.733, 10.000, 0.000},
		{-3852.914, -1287.370, 10.000, 0.000},
		{-3982.733, -1309.006, 10.000, 0.000},
		{-4114.715, -1330.643, 10.000, 0.000},
		{-4248.861, -1352.279, 10.000, 0.000},
		{-4385.171, -1373.916, 10.000, 0.000},
		{-4523.644, -1395.552, 10.000, 0.000},
		{-4664.281, -1417.189, 10.000, 0.000},
		{-4807.082, -1438.825, 10.000, 0.000},
		{-4952.046, -1460.462, 10.000, 0.000},
		{-5099.174, -1482.098, 10.000, 0.000},
		{-5248.466, -1503.734, 10.000, 0.000},
		{-5399.921, -1525.371, 10.000, 0.000},
		{-5553.540, -1547.007, 10.000, 0.000},
		{-5709.323, -1568.644, 10.000, 0.000},
		{-5867.269, -1590.280, 10.000, 0.000},
		{-6027.379, -1611.917, 10.000, 0.000},
		{-6189.652, -1633.553, 10.000, 0.000},
		{-6354.089, -1655.190, 10.000, 0.000},
		{-6520.690, -1676.826, 10.000, 0.000},
		{-6689.455, -1698.463, 10.000, 0.000},
		{-6860.383, -1720.099, 10.000, 0.000},
		{-7033.474, -1741.736, 10.000, 0.000},
		{-7208.730, -1763.372, 10.000, 0.000},
		{-7386.149, -1785.009, 10.000, 0.000},
		{-7565.732, -1806.645, 10.000, 0.000},
		{-7747.478, -1828.281, 10.000, 0.000},
		{-7931.388, -1849.918, 10.000, 0.000},
		{-8117.461, -1871.554, 10.000, 0.000},
		{-8305.699, -1893.191, 10.000, 0.000},
		{-8496.100, -1914.827, 10.000, 0.000},
		{-8688.664, -1936.464, 10.000, 0.000},
		{-8883.392, -1958.100, 10.000, 0.000},
		{-9080.217, -1978.384, 10.000, 0.000},
		{-9279.002, -1997.316, 10.000, 0.000},
		{-9479.612, -2014.896, 10.000, 0.000},
		{-9681.913, -2031.123, 10.000, 0.000},
		{-9885.769, -2045.998, 10.000, 0.000},
		{-10091.045, -2059.521, 10.000, 0.000},
		{-10297.606, -2071.692, 10.000, 0.000},
		{-10505.316, -2082.510, 10.000, 0.000},
		{-10714.040, -2091.976, 10.000, 0.000},
		{-10923.644, -2100.090, 10.000, 0.000},
		{-11133.991, -2106.851, 10.000, 0.000},
		{-11344.946, -2112.260, 10.000, 0.000},
		{-11556.375, -2116.317, 10.000, 0.000},
		{-11768.142, -2119.021, 10.000, 0.000},
		{-11980.093, -2120.008, 10.000, 0.000},
		{-12192.008, -2118.291, 10.000, 0.000},
		{-12403.684, -2115.221, 10.000, 0.000},
		{-12614.985, -2110.799, 10.000, 0.000},
		{-12825.776, -2105.025, 10.000, 0.000},
		{-13035.922, -2097.898, 10.000, 0.000},
		{-13245.288, -2089.419, 10.000, 0.000},
		{-13453.738, -2079.588, 10.000, 0.000},
		{-13661.138, -2068.404, 10.000, 0.000},
		{-13867.352, -2055.869, 10.000, 0.000},
		{-14072.244, -2041.981, 10.000, 0.000},
		{-14275.680, -2026.740, 10.000, 0.000},
		{-14477.525, -2010.148, 10.000, 0.000},
		{-14677.642, -1992.203, 10.000, 0.000},
		{-14875.898, -1972.906, 10.000, 0.000},
		{-15072.156, -1952.256, 10.000, 0.000},
		{-15266.299, -1930.620, 10.000, 0.000},
		{-15458.280, -1908.983, 10.000, 0.000},
		{-15648.096, -1887.347, 10.000, 0.000},
		{-15835.749, -1865.710, 10.000, 0.000},
		{-16021.238, -1844.074, 10.000, 0.000},
		{-16204.564, -1822.437, 10.000, 0.000},
		{-16385.725, -1800.801, 10.000, 0.000},
		{-16564.724, -1779.164, 10.000, 0.000},
		{-16741.558, -1757.528, 10.000, 0.000},
		{-16916.229, -1735.891, 10.000, 0.000},
		{-17088.737, -1714.255, 10.000, 0.000},
		{-17259.080, -1692.618, 10.000, 0.000},
		{-17427.260, -1670.982, 10.000, 0.000},
		{-17593.277, -1649.346, 10.000, 0.000},
		{-17757.129, -1627.709, 10.000, 0.000},
		{-17918.819, -1606.073, 10.000, 0.000},
		{-18078.344, -1584.436, 10.000, 0.000},
		{-18235.706, -1562.800, 10.000, 0.000},
		{-18390.904, -1541.163, 10.000, 0.000},
		{-18543.938, -1519.527, 10.000, 0.000},
		{-18694.809, -1497.890, 10.000, 0.000},
		{-18843.516, -1476.254, 10.000, 0.000},
		{-18990.060, -1454.617, 10.000, 0.000},
		{-19134.440, -1432.981, 10.000, 0.000},
		{-19276.656, -1411.344, 10.000, 0.000},
		{-19416.709, -1389.708, 10.000, 0.000},
		{-19554.598, -1368.071, 10.000, 0.000},
		{-19690.323, -1346.435, 10.000, 0.000},
		{-19823.885, -1324.799, 10.000, 0.000},
		{-19955.283, -1303.162, 10.000, 0.000},
		{-20084.517, -1281.526, 10.000, 0.000},
		{-20211.588, -1259.889, 10.000, 0.000},
		{-20336.495, -1238.253, 10.000, 0.000},
		{-20459.238, -1216.616, 10.000, 0.000},
		{-20579.818, -1194.980, 10.000, 0.000},
		{-20698.234, -1173.343, 10.000, 0.000},
		{-20814.487, -1151.707, 10.000, 0.000},
		{-20928.576, -1130.070, 10.000, 0.000},
		{-21040.501, -1108.434, 10.000, 0.000},
		{-21150.263, -1086.797, 10.000, 0.000},
		{-21257.860, -1065.161, 10.000, 0.000},
		{-21363.295, -1043.524, 10.000, 0.000},
		{-21466.565, -1021.888, 10.000, 0.000},
		{-21567.672, -1000.252, 10.000, 0.000},
		{-21666.616, -978.615, 10.000, 0.000},
		{-21763.395, -956.979, 10.000, 0.000},
		{-21858.011, -935.342, 10.000, 0.000},
		{-21950.464, -913.706, 10.000, 0.000},
		{-22040.752, -892.069, 10.000, 0.000},
		{-22128.878, -870.433, 10.000, 0.000},
		{-22214.839, -848.796, 10.000, 0.000},
		{-22298.637, -827.160, 10.000, 0.000},
		{-22380.271, -805.523, 10.000, 0.000},
		{-22459.742, -783.887, 10.000, 0.000},
		{-22537.048, -762.250, 10.000, 0.000},
		{-22612.192, -740.614, 10.000, 0.000},
		{-22685.171, -718.977, 10.000, 0.000},
		{-22755.987, -697.341, 10.000, 0.000},
		{-22824.639, -675.705, 10.000, 0.000},
		{-22891.128, -654.068, 10.000, 0.000},
		{-22955.453, -632.432, 10.000, 0.000},
		{-23017.614, -610.795, 10.000, 0.000},
		{-23077.612, -589.159, 10.000, 0.000},
		{-23135.446, -567.522, 10.000, 0.000},
		{-23191.116, -545.886, 10.000, 0.000},
		{-23244.623, -524.249, 10.000, 0.000},
		{-23295.966, -502.613, 10.000, 0.000},
		{-23345.146, -480.976, 10.000, 0.000},
		{-23392.162, -459.340, 10.000, 0.000},
		{-23437.014, -437.703, 10.000, 0.000},
		{-23479.702, -416.067, 10.000, 0.000},
		{-23520.227, -394.430, 10.000, 0.000},
		{-23558.588, -372.794, 10.000, 0.000},
		{-23594.786, -351.158, 10.000, 0.000},
		{-23628.820, -329.521, 10.000, 0.000},
		{-23660.690, -307.885, 10.000, 0.000},
		{-23690.397, -286.248, 10.000, 0.000},
		{-23717.940, -264.612, 10.000, 0.000},
		{-23743.319, -242.975, 10.000, 0.000},
		{-23766.535, -221.339, 10.000, 0.000},
		{-23787.587, -199.702, 10.000, 0.000},
		{-23806.475, -178.066, 10.000, 0.000},
		{-23823.218, -156.795, 10.000, 0.000},
		{-23837.902, -136.876, 10.000, 0.000},
		{-23850.661, -118.309, 10.000, 0.000},
		{-23861.631, -101.095, 10.000, 0.000},
		{-23870.948, -85.233, 10.000, 0.000},
		{-23878.745, -70.723, 10.000, 0.000},
		{-23885.160, -57.565, 10.000, 0.000},
		{-23890.326, -45.760, 10.000, 0.000},
		{-23894.379, -35.307, 10.000, 0.000},
		{-23897.455, -26.206, 10.000, 0.000},
		{-23899.688, -18.458, 10.000, 0.000},
		{-23901.214, -12.062, 10.000, 0.000},
		{-23902.168, -7.018, 10.000, 0.000},
		{-23902.685, -3.326, 10.000, 0.000},
		{-23902.901, -0.987, 10.000, 0.000},
		{-23902.950, 0.000, 10.000, 0.000},
		{-23902.950, 0.000, 10.000, 0.000}

	};
  
	// WAYPOINT_DATA: [{"position":{"x":20,"y":115},"theta":0,"comment":""},{"position":{"x":130,"y":115},"theta":0,"comment":""}]
	// IS_REVERSED: true
	// FILE_NAME: HabLevel2FloorPath
}