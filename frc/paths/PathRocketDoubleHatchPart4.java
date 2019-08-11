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


public class PathRocketDoubleHatchPart4 extends SrxTrajectory {
	
	public PathRocketDoubleHatchPart4() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}
	
	public PathRocketDoubleHatchPart4(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}
    
	public boolean highGear = true;

	double[][] centerPoints = {
		{0, 0, 10.000, 0},
		{-0.068, -1.352, 10.000, -0.000},
		{-0.338, -4.055, 10.000, -0.000},
		{-0.946, -8.110, 10.000, -0.000},
		{-2.027, -13.516, 10.000, -0.000},
		{-3.717, -20.275, 10.000, -0.000},
		{-6.150, -28.385, 10.000, -0.000},
		{-9.462, -37.846, 10.000, -0.000},
		{-13.787, -48.659, 10.000, -0.000},
		{-19.261, -60.824, 10.000, -0.000},
		{-26.019, -74.341, 10.000, -0.000},
		{-34.197, -89.209, 10.000, -0.000},
		{-43.929, -105.429, 10.000, -0.000},
		{-55.350, -123.000, 10.000, -0.000},
		{-68.596, -141.923, 10.000, -0.000},
		{-83.802, -162.198, 10.000, -0.000},
		{-101.103, -183.824, 10.000, -0.000},
		{-120.567, -205.451, 10.000, -0.000},
		{-142.194, -227.077, 10.000, -0.000},
		{-165.983, -248.703, 10.000, -0.000},
		{-191.934, -270.330, 10.000, -0.001},
		{-220.049, -291.956, 10.000, -0.001},
		{-250.325, -313.583, 10.000, -0.001},
		{-282.765, -335.209, 10.000, -0.001},
		{-317.367, -356.835, 10.000, -0.002},
		{-354.132, -378.462, 10.000, -0.002},
		{-393.060, -400.088, 10.000, -0.003},
		{-434.150, -421.715, 10.000, -0.003},
		{-477.403, -443.341, 10.000, -0.004},
		{-522.818, -464.967, 10.000, -0.005},
		{-570.396, -486.594, 10.000, -0.005},
		{-620.137, -508.220, 10.000, -0.006},
		{-672.040, -529.847, 10.000, -0.007},
		{-726.106, -551.473, 10.000, -0.009},
		{-782.335, -573.099, 10.000, -0.010},
		{-840.726, -594.726, 10.000, -0.012},
		{-901.280, -616.352, 10.000, -0.013},
		{-963.996, -637.979, 10.000, -0.015},
		{-1028.876, -659.605, 10.000, -0.017},
		{-1095.917, -681.231, 10.000, -0.019},
		{-1165.122, -702.858, 10.000, -0.022},
		{-1236.489, -724.484, 10.000, -0.025},
		{-1310.019, -746.110, 10.000, -0.028},
		{-1385.711, -767.737, 10.000, -0.031},
		{-1463.566, -789.363, 10.000, -0.034},
		{-1543.584, -810.990, 10.000, -0.038},
		{-1625.764, -832.616, 10.000, -0.042},
		{-1710.107, -854.242, 10.000, -0.047},
		{-1796.612, -875.869, 10.000, -0.051},
		{-1885.281, -897.495, 10.000, -0.056},
		{-1976.111, -919.122, 10.000, -0.062},
		{-2069.105, -940.748, 10.000, -0.068},
		{-2164.261, -962.374, 10.000, -0.074},
		{-2261.580, -984.001, 10.000, -0.080},
		{-2361.061, -1005.627, 10.000, -0.087},
		{-2462.705, -1027.254, 10.000, -0.095},
		{-2566.512, -1048.880, 10.000, -0.102},
		{-2672.481, -1070.506, 10.000, -0.111},
		{-2780.613, -1092.133, 10.000, -0.120},
		{-2890.908, -1113.759, 10.000, -0.129},
		{-3003.365, -1135.386, 10.000, -0.139},
		{-3117.985, -1157.012, 10.000, -0.149},
		{-3234.767, -1178.638, 10.000, -0.160},
		{-3353.713, -1200.265, 10.000, -0.171},
		{-3474.820, -1221.891, 10.000, -0.183},
		{-3598.091, -1243.517, 10.000, -0.195},
		{-3723.524, -1265.144, 10.000, -0.209},
		{-3851.120, -1286.770, 10.000, -0.222},
		{-3980.878, -1308.397, 10.000, -0.237},
		{-4112.799, -1330.023, 10.000, -0.252},
		{-4246.882, -1351.649, 10.000, -0.267},
		{-4383.129, -1373.276, 10.000, -0.283},
		{-4521.538, -1394.902, 10.000, -0.300},
		{-4662.109, -1416.529, 10.000, -0.318},
		{-4804.843, -1438.155, 10.000, -0.336},
		{-4949.740, -1459.781, 10.000, -0.355},
		{-5096.800, -1481.408, 10.000, -0.375},
		{-5246.022, -1503.034, 10.000, -0.396},
		{-5397.406, -1524.661, 10.000, -0.417},
		{-5550.954, -1546.287, 10.000, -0.439},
		{-5706.664, -1567.913, 10.000, -0.462},
		{-5864.536, -1589.540, 10.000, -0.485},
		{-6024.572, -1611.166, 10.000, -0.510},
		{-6186.770, -1632.792, 10.000, -0.535},
		{-6351.130, -1654.419, 10.000, -0.561},
		{-6517.653, -1676.045, 10.000, -0.588},
		{-6686.339, -1697.672, 10.000, -0.615},
		{-6857.188, -1719.298, 10.000, -0.644},
		{-7030.199, -1740.924, 10.000, -0.673},
		{-7205.373, -1762.551, 10.000, -0.703},
		{-7382.709, -1784.177, 10.000, -0.734},
		{-7562.208, -1805.804, 10.000, -0.766},
		{-7743.870, -1827.430, 10.000, -0.799},
		{-7927.694, -1849.056, 10.000, -0.832},
		{-8113.681, -1870.683, 10.000, -0.867},
		{-8301.831, -1892.309, 10.000, -0.902},
		{-8492.143, -1913.936, 10.000, -0.938},
		{-8684.618, -1935.562, 10.000, -0.975},
		{-8879.255, -1957.188, 10.000, -1.013},
		{-9076.055, -1978.815, 10.000, -1.052},
		{-9275.018, -2000.441, 10.000, -1.092},
		{-9476.144, -2022.068, 10.000, -1.132},
		{-9679.432, -2043.694, 10.000, -1.173},
		{-9884.882, -2065.320, 10.000, -1.216},
		{-10092.496, -2086.947, 10.000, -1.259},
		{-10302.272, -2108.573, 10.000, -1.303},
		{-10514.210, -2130.199, 10.000, -1.347},
		{-10728.312, -2151.826, 10.000, -1.393},
		{-10944.576, -2173.452, 10.000, -1.439},
		{-11163.002, -2195.079, 10.000, -1.486},
		{-11383.591, -2216.705, 10.000, -1.534},
		{-11606.343, -2238.331, 10.000, -1.583},
		{-11831.258, -2259.958, 10.000, -1.633},
		{-12058.335, -2281.584, 10.000, -1.683},
		{-12287.574, -2303.211, 10.000, -1.734},
		{-12518.977, -2324.837, 10.000, -1.786},
		{-12752.542, -2346.463, 10.000, -1.838},
		{-12988.270, -2368.090, 10.000, -1.891},
		{-13226.092, -2388.365, 10.000, -1.945},
		{-13465.875, -2407.288, 10.000, -1.999},
		{-13707.482, -2424.859, 10.000, -2.054},
		{-13950.779, -2441.079, 10.000, -2.110},
		{-14195.630, -2455.947, 10.000, -2.166},
		{-14441.901, -2469.463, 10.000, -2.222},
		{-14689.456, -2481.628, 10.000, -2.279},
		{-14938.159, -2492.442, 10.000, -2.335},
		{-15187.876, -2501.903, 10.000, -2.392},
		{-15438.472, -2510.013, 10.000, -2.450},
		{-15689.811, -2516.771, 10.000, -2.507},
		{-15941.759, -2522.178, 10.000, -2.564},
		{-16194.179, -2526.233, 10.000, -2.622},
		{-16446.938, -2528.936, 10.000, -2.679},
		{-16699.871, -2529.739, 10.000, -2.736},
		{-16952.750, -2527.838, 10.000, -2.793},
		{-17205.371, -2524.586, 10.000, -2.849},
		{-17457.600, -2519.982, 10.000, -2.906},
		{-17709.300, -2514.027, 10.000, -2.961},
		{-17960.338, -2506.720, 10.000, -3.017},
		{-18210.577, -2498.061, 10.000, -3.072},
		{-18459.882, -2488.050, 10.000, -3.126},
		{-18708.119, -2476.688, 10.000, -3.180},
		{-18955.152, -2463.974, 10.000, -3.233},
		{-19200.846, -2449.909, 10.000, -3.285},
		{-19445.066, -2434.492, 10.000, -3.337},
		{-19687.677, -2417.723, 10.000, -3.387},
		{-19928.544, -2399.603, 10.000, -3.437},
		{-20167.530, -2380.131, 10.000, -3.486},
		{-20404.502, -2359.307, 10.000, -3.535},
		{-20639.352, -2337.681, 10.000, -3.582},
		{-20872.038, -2316.054, 10.000, -3.628},
		{-21102.562, -2294.428, 10.000, -3.674},
		{-21330.924, -2272.802, 10.000, -3.718},
		{-21557.123, -2251.175, 10.000, -3.762},
		{-21781.159, -2229.549, 10.000, -3.804},
		{-22003.033, -2207.922, 10.000, -3.846},
		{-22222.743, -2186.296, 10.000, -3.886},
		{-22440.292, -2164.670, 10.000, -3.926},
		{-22655.677, -2143.043, 10.000, -3.965},
		{-22868.900, -2121.417, 10.000, -4.003},
		{-23079.961, -2099.791, 10.000, -4.040},
		{-23288.858, -2078.164, 10.000, -4.076},
		{-23495.594, -2056.538, 10.000, -4.111},
		{-23700.166, -2034.911, 10.000, -4.145},
		{-23902.576, -2013.285, 10.000, -4.179},
		{-24102.823, -1991.659, 10.000, -4.211},
		{-24300.908, -1970.032, 10.000, -4.243},
		{-24496.829, -1948.406, 10.000, -4.273},
		{-24690.589, -1926.779, 10.000, -4.303},
		{-24882.185, -1905.153, 10.000, -4.332},
		{-25071.619, -1883.527, 10.000, -4.360},
		{-25258.891, -1861.900, 10.000, -4.388},
		{-25443.999, -1840.274, 10.000, -4.414},
		{-25626.945, -1818.647, 10.000, -4.440},
		{-25807.729, -1797.021, 10.000, -4.465},
		{-25986.350, -1775.395, 10.000, -4.489},
		{-26162.808, -1753.768, 10.000, -4.512},
		{-26337.103, -1732.142, 10.000, -4.535},
		{-26509.236, -1710.516, 10.000, -4.557},
		{-26679.206, -1688.889, 10.000, -4.578},
		{-26847.014, -1667.263, 10.000, -4.598},
		{-27012.659, -1645.636, 10.000, -4.618},
		{-27176.141, -1624.010, 10.000, -4.637},
		{-27337.461, -1602.384, 10.000, -4.655},
		{-27496.618, -1580.757, 10.000, -4.673},
		{-27653.612, -1559.131, 10.000, -4.689},
		{-27808.444, -1537.504, 10.000, -4.706},
		{-27961.113, -1515.878, 10.000, -4.721},
		{-28111.620, -1494.252, 10.000, -4.737},
		{-28259.964, -1472.625, 10.000, -4.751},
		{-28406.145, -1450.999, 10.000, -4.765},
		{-28550.163, -1429.372, 10.000, -4.778},
		{-28692.019, -1407.746, 10.000, -4.791},
		{-28831.713, -1386.120, 10.000, -4.803},
		{-28969.243, -1364.493, 10.000, -4.815},
		{-29104.611, -1342.867, 10.000, -4.826},
		{-29237.817, -1321.240, 10.000, -4.837},
		{-29368.859, -1299.614, 10.000, -4.847},
		{-29497.739, -1277.988, 10.000, -4.857},
		{-29624.457, -1256.361, 10.000, -4.866},
		{-29749.012, -1234.735, 10.000, -4.875},
		{-29871.404, -1213.109, 10.000, -4.883},
		{-29991.633, -1191.482, 10.000, -4.891},
		{-30109.700, -1169.856, 10.000, -4.898},
		{-30225.605, -1148.229, 10.000, -4.906},
		{-30339.346, -1126.603, 10.000, -4.912},
		{-30450.925, -1104.977, 10.000, -4.919},
		{-30560.341, -1083.350, 10.000, -4.925},
		{-30667.595, -1061.724, 10.000, -4.931},
		{-30772.686, -1040.097, 10.000, -4.936},
		{-30875.615, -1018.471, 10.000, -4.941},
		{-30976.380, -996.845, 10.000, -4.946},
		{-31074.984, -975.218, 10.000, -4.950},
		{-31171.424, -953.592, 10.000, -4.954},
		{-31265.702, -931.965, 10.000, -4.958},
		{-31357.817, -910.339, 10.000, -4.962},
		{-31447.770, -888.713, 10.000, -4.965},
		{-31535.560, -867.086, 10.000, -4.969},
		{-31621.187, -845.460, 10.000, -4.972},
		{-31704.652, -823.833, 10.000, -4.974},
		{-31785.954, -802.207, 10.000, -4.977},
		{-31865.093, -780.581, 10.000, -4.979},
		{-31942.070, -758.954, 10.000, -4.981},
		{-32016.884, -737.328, 10.000, -4.983},
		{-32089.535, -715.702, 10.000, -4.985},
		{-32160.024, -694.075, 10.000, -4.987},
		{-32228.350, -672.449, 10.000, -4.988},
		{-32294.514, -650.822, 10.000, -4.990},
		{-32358.515, -629.196, 10.000, -4.991},
		{-32420.353, -607.570, 10.000, -4.992},
		{-32480.029, -585.943, 10.000, -4.993},
		{-32537.542, -564.317, 10.000, -4.994},
		{-32592.892, -542.690, 10.000, -4.995},
		{-32646.080, -521.064, 10.000, -4.996},
		{-32697.105, -499.438, 10.000, -4.996},
		{-32745.967, -477.811, 10.000, -4.997},
		{-32792.667, -456.185, 10.000, -4.997},
		{-32837.204, -434.558, 10.000, -4.998},
		{-32879.579, -412.932, 10.000, -4.998},
		{-32919.791, -391.306, 10.000, -4.999},
		{-32957.840, -369.679, 10.000, -4.999},
		{-32993.727, -348.053, 10.000, -4.999},
		{-33027.451, -326.427, 10.000, -4.999},
		{-33059.012, -304.800, 10.000, -4.999},
		{-33088.411, -283.174, 10.000, -5.000},
		{-33115.647, -261.547, 10.000, -5.000},
		{-33140.720, -239.921, 10.000, -5.000},
		{-33163.631, -218.295, 10.000, -5.000},
		{-33184.379, -196.668, 10.000, -5.000},
		{-33202.965, -175.042, 10.000, -5.000},
		{-33219.415, -153.964, 10.000, -5.000},
		{-33233.825, -134.238, 10.000, -5.000},
		{-33246.330, -115.864, 10.000, -5.000},
		{-33257.065, -98.842, 10.000, -5.000},
		{-33266.166, -83.171, 10.000, -5.000},
		{-33273.767, -68.852, 10.000, -5.000},
		{-33280.004, -55.884, 10.000, -5.000},
		{-33285.012, -44.268, 10.000, -5.000},
		{-33288.925, -34.004, 10.000, -5.000},
		{-33291.880, -25.091, 10.000, -5.000},
		{-33294.011, -17.530, 10.000, -5.000},
		{-33295.454, -11.321, 10.000, -5.000},
		{-33296.343, -6.463, 10.000, -5.000},
		{-33296.814, -2.957, 10.000, -5.000},
		{-33297.002, -0.803, 10.000, -5.000},
		{-33297.042, 0.000, 10.000, -5.000},
		{-33297.042, 0.000, 10.000, -5.000}

	};
  
	// WAYPOINT_DATA: [{"position":{"x":27,"y":297},"theta":0,"comment":""},{"position":{"x":180,"y":290},"theta":-0.08726388888853838,"comment":""}]
	// IS_REVERSED: true
	// FILE_NAME: PathRocketDoubleHatchPart4
}