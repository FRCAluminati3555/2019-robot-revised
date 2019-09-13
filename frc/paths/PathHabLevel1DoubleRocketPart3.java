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


public class PathHabLevel1DoubleRocketPart3 extends SrxTrajectory {
	
	public PathHabLevel1DoubleRocketPart3() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}
	
	public PathHabLevel1DoubleRocketPart3(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}
    
	public boolean highGear = true;

	double[][] centerPoints = {
		{0, 0, 10.000, 0},
		{0.067, 1.332, 10.000, 90.005},
		{0.333, 3.997, 10.000, 90.005},
		{0.933, 7.994, 10.000, 90.005},
		{1.999, 13.324, 10.000, 90.005},
		{3.664, 19.986, 10.000, 90.005},
		{6.062, 27.980, 10.000, 90.005},
		{9.327, 37.307, 10.000, 90.005},
		{13.590, 47.966, 10.000, 90.005},
		{18.986, 59.957, 10.000, 90.005},
		{25.648, 73.281, 10.000, 90.005},
		{33.709, 87.937, 10.000, 90.005},
		{43.302, 103.926, 10.000, 90.005},
		{54.561, 121.247, 10.000, 90.005},
		{67.552, 138.568, 10.000, 90.005},
		{82.275, 155.889, 10.000, 90.005},
		{98.730, 173.210, 10.000, 90.005},
		{116.917, 190.531, 10.000, 90.005},
		{136.836, 207.852, 10.000, 90.005},
		{158.487, 225.173, 10.000, 90.005},
		{181.870, 242.494, 10.000, 90.005},
		{206.986, 259.815, 10.000, 90.005},
		{233.833, 277.136, 10.000, 90.005},
		{262.413, 294.457, 10.000, 90.004},
		{292.725, 311.778, 10.000, 90.004},
		{324.768, 329.099, 10.000, 90.004},
		{358.544, 346.420, 10.000, 90.003},
		{394.052, 363.741, 10.000, 90.002},
		{431.292, 381.062, 10.000, 90.001},
		{470.265, 398.383, 10.000, 90.000},
		{510.969, 415.703, 10.000, 89.999},
		{553.405, 433.024, 10.000, 89.997},
		{597.574, 450.345, 10.000, 89.995},
		{643.474, 467.666, 10.000, 89.992},
		{691.107, 484.987, 10.000, 89.989},
		{740.472, 502.308, 10.000, 89.986},
		{791.569, 519.629, 10.000, 89.981},
		{844.398, 536.950, 10.000, 89.976},
		{898.959, 554.271, 10.000, 89.970},
		{955.252, 571.592, 10.000, 89.963},
		{1013.277, 588.913, 10.000, 89.955},
		{1073.035, 606.234, 10.000, 89.946},
		{1134.524, 623.555, 10.000, 89.936},
		{1197.746, 640.876, 10.000, 89.923},
		{1262.699, 658.197, 10.000, 89.910},
		{1329.385, 675.518, 10.000, 89.894},
		{1397.803, 692.839, 10.000, 89.876},
		{1467.953, 710.160, 10.000, 89.856},
		{1539.835, 727.481, 10.000, 89.833},
		{1613.449, 744.802, 10.000, 89.808},
		{1688.795, 762.123, 10.000, 89.780},
		{1765.874, 779.444, 10.000, 89.748},
		{1844.684, 796.765, 10.000, 89.713},
		{1925.227, 814.086, 10.000, 89.674},
		{2007.501, 831.407, 10.000, 89.631},
		{2091.508, 848.728, 10.000, 89.583},
		{2177.247, 866.049, 10.000, 89.530},
		{2264.718, 883.370, 10.000, 89.471},
		{2353.921, 900.691, 10.000, 89.407},
		{2444.856, 918.012, 10.000, 89.337},
		{2537.523, 935.333, 10.000, 89.260},
		{2631.923, 952.654, 10.000, 89.176},
		{2728.054, 969.975, 10.000, 89.083},
		{2825.918, 987.296, 10.000, 88.983},
		{2925.513, 1004.617, 10.000, 88.873},
		{3026.841, 1021.938, 10.000, 88.754},
		{3129.901, 1039.259, 10.000, 88.625},
		{3234.693, 1056.580, 10.000, 88.484},
		{3341.217, 1073.901, 10.000, 88.331},
		{3449.473, 1091.222, 10.000, 88.166},
		{3559.461, 1108.543, 10.000, 87.987},
		{3671.181, 1125.864, 10.000, 87.793},
		{3784.634, 1143.185, 10.000, 87.584},
		{3899.818, 1160.506, 10.000, 87.358},
		{4016.735, 1177.827, 10.000, 87.114},
		{4135.384, 1195.148, 10.000, 86.850},
		{4255.764, 1212.468, 10.000, 86.566},
		{4377.877, 1229.789, 10.000, 86.260},
		{4501.722, 1247.110, 10.000, 85.931},
		{4627.299, 1264.431, 10.000, 85.575},
		{4754.609, 1281.752, 10.000, 85.193},
		{4883.650, 1299.073, 10.000, 84.781},
		{5014.423, 1316.394, 10.000, 84.338},
		{5146.929, 1333.715, 10.000, 83.862},
		{5281.166, 1351.036, 10.000, 83.349},
		{5417.136, 1368.357, 10.000, 82.797},
		{5554.838, 1385.678, 10.000, 82.203},
		{5694.272, 1402.999, 10.000, 81.565},
		{5835.438, 1420.320, 10.000, 80.878},
		{5978.336, 1437.641, 10.000, 80.138},
		{6122.966, 1454.962, 10.000, 79.343},
		{6269.328, 1472.283, 10.000, 78.487},
		{6417.423, 1489.604, 10.000, 77.567},
		{6567.249, 1506.925, 10.000, 76.577},
		{6718.808, 1524.246, 10.000, 75.513},
		{6872.098, 1541.567, 10.000, 74.369},
		{7027.121, 1558.888, 10.000, 73.140},
		{7183.876, 1576.209, 10.000, 71.820},
		{7342.363, 1593.530, 10.000, 70.405},
		{7502.582, 1610.851, 10.000, 68.890},
		{7664.533, 1628.172, 10.000, 67.269},
		{7828.216, 1645.493, 10.000, 65.540},
		{7993.632, 1662.814, 10.000, 63.699},
		{8160.779, 1680.135, 10.000, 61.747},
		{8329.659, 1697.456, 10.000, 59.683},
		{8500.270, 1714.777, 10.000, 57.511},
		{8672.614, 1732.098, 10.000, 55.238},
		{8846.690, 1749.419, 10.000, 52.873},
		{9022.498, 1766.740, 10.000, 50.428},
		{9200.038, 1784.061, 10.000, 47.918},
		{9379.310, 1801.382, 10.000, 45.362},
		{9560.314, 1818.703, 10.000, 42.779},
		{9743.050, 1836.024, 10.000, 40.191},
		{9927.519, 1853.345, 10.000, 37.620},
		{10113.719, 1870.666, 10.000, 35.085},
		{10301.652, 1887.987, 10.000, 32.607},
		{10491.317, 1905.308, 10.000, 30.201},
		{10682.714, 1922.629, 10.000, 27.881},
		{10875.842, 1939.950, 10.000, 25.658},
		{11070.703, 1957.271, 10.000, 23.539},
		{11267.297, 1974.592, 10.000, 21.529},
		{11465.622, 1991.913, 10.000, 19.631},
		{11665.679, 2009.234, 10.000, 17.844},
		{11867.468, 2026.554, 10.000, 16.167},
		{12070.990, 2043.875, 10.000, 14.597},
		{12276.244, 2061.196, 10.000, 13.131},
		{12483.229, 2078.517, 10.000, 11.765},
		{12691.947, 2095.838, 10.000, 10.495},
		{12902.397, 2113.159, 10.000, 9.315},
		{13114.579, 2130.480, 10.000, 8.222},
		{13328.493, 2147.801, 10.000, 7.211},
		{13544.139, 2165.122, 10.000, 6.279},
		{13761.517, 2182.443, 10.000, 5.420},
		{13980.628, 2199.764, 10.000, 4.633},
		{14201.470, 2217.085, 10.000, 3.913},
		{14424.045, 2234.406, 10.000, 3.258},
		{14648.352, 2251.727, 10.000, 2.666},
		{14874.390, 2269.048, 10.000, 2.135},
		{15102.161, 2286.369, 10.000, 1.663},
		{15331.598, 2302.358, 10.000, 1.250},
		{15562.566, 2317.014, 10.000, 0.895},
		{15794.934, 2330.338, 10.000, 0.598},
		{16028.567, 2342.329, 10.000, 0.360},
		{16263.333, 2352.988, 10.000, 0.181},
		{16499.098, 2362.315, 10.000, 0.064},
		{16735.729, 2370.309, 10.000, 0.009},
		{16973.093, 2376.971, 10.000, 0.005},
		{17211.057, 2382.301, 10.000, 0.005},
		{17449.487, 2386.298, 10.000, 0.005},
		{17688.250, 2388.963, 10.000, 0.005},
		{17927.213, 2390.295, 10.000, 0.005},
		{18166.242, 2390.295, 10.000, 0.005},
		{18405.272, 2390.295, 10.000, 0.005},
		{18644.301, 2390.295, 10.000, 0.004},
		{18883.331, 2390.295, 10.000, 0.004},
		{19122.360, 2390.295, 10.000, 0.004},
		{19361.390, 2390.295, 10.000, 0.003},
		{19600.400, 2389.911, 10.000, 0.003},
		{19839.305, 2388.195, 10.000, 0.003},
		{20077.973, 2385.147, 10.000, 0.002},
		{20316.268, 2380.766, 10.000, 0.002},
		{20554.059, 2375.053, 10.000, 0.002},
		{20791.212, 2368.008, 10.000, 0.001},
		{21027.594, 2359.630, 10.000, 0.001},
		{21263.072, 2349.919, 10.000, 0.001},
		{21497.511, 2338.877, 10.000, 0.000},
		{21730.780, 2326.502, 10.000, 0.000},
		{21962.745, 2312.794, 10.000, -0.000},
		{22193.273, 2297.754, 10.000, -0.001},
		{22422.229, 2281.382, 10.000, -0.001},
		{22649.502, 2264.061, 10.000, -0.001},
		{22875.042, 2246.740, 10.000, -0.002},
		{23098.850, 2229.419, 10.000, -0.002},
		{23320.926, 2212.098, 10.000, -0.002},
		{23541.269, 2194.777, 10.000, -0.002},
		{23759.881, 2177.456, 10.000, -0.003},
		{23976.761, 2160.135, 10.000, -0.003},
		{24191.908, 2142.814, 10.000, -0.003},
		{24405.324, 2125.493, 10.000, -0.003},
		{24617.007, 2108.172, 10.000, -0.003},
		{24826.958, 2090.851, 10.000, -0.004},
		{25035.177, 2073.531, 10.000, -0.004},
		{25241.664, 2056.210, 10.000, -0.004},
		{25446.419, 2038.889, 10.000, -0.004},
		{25649.442, 2021.568, 10.000, -0.004},
		{25850.733, 2004.247, 10.000, -0.004},
		{26050.291, 1986.926, 10.000, -0.004},
		{26248.118, 1969.605, 10.000, -0.004},
		{26444.212, 1952.284, 10.000, -0.005},
		{26638.574, 1934.963, 10.000, -0.005},
		{26831.205, 1917.642, 10.000, -0.005},
		{27022.103, 1900.321, 10.000, -0.005},
		{27211.269, 1883.000, 10.000, -0.005},
		{27398.703, 1865.679, 10.000, -0.005},
		{27584.405, 1848.358, 10.000, -0.005},
		{27768.374, 1831.037, 10.000, -0.005},
		{27950.612, 1813.716, 10.000, -0.005},
		{28131.117, 1796.395, 10.000, -0.004},
		{28309.891, 1779.074, 10.000, -0.004},
		{28486.932, 1761.753, 10.000, -0.004},
		{28662.241, 1744.432, 10.000, -0.004},
		{28835.819, 1727.111, 10.000, -0.004},
		{29007.664, 1709.790, 10.000, -0.004},
		{29177.777, 1692.469, 10.000, -0.004},
		{29346.157, 1675.148, 10.000, -0.004},
		{29512.806, 1657.827, 10.000, -0.004},
		{29677.723, 1640.506, 10.000, -0.003},
		{29840.907, 1623.185, 10.000, -0.003},
		{30002.360, 1605.864, 10.000, -0.003},
		{30162.080, 1588.543, 10.000, -0.003},
		{30320.068, 1571.222, 10.000, -0.003},
		{30476.325, 1553.901, 10.000, -0.003},
		{30630.849, 1536.580, 10.000, -0.002},
		{30783.641, 1519.259, 10.000, -0.002},
		{30934.701, 1501.938, 10.000, -0.002},
		{31084.028, 1484.617, 10.000, -0.002},
		{31231.624, 1467.296, 10.000, -0.002},
		{31377.488, 1449.975, 10.000, -0.002},
		{31521.619, 1432.654, 10.000, -0.001},
		{31664.018, 1415.333, 10.000, -0.001},
		{31804.686, 1398.012, 10.000, -0.001},
		{31943.621, 1380.691, 10.000, -0.001},
		{32080.824, 1363.370, 10.000, -0.001},
		{32216.295, 1346.049, 10.000, -0.000},
		{32350.034, 1328.728, 10.000, -0.000},
		{32482.041, 1311.407, 10.000, -0.000},
		{32612.315, 1294.086, 10.000, 0.000},
		{32740.858, 1276.766, 10.000, 0.000},
		{32867.668, 1259.445, 10.000, 0.001},
		{32992.747, 1242.124, 10.000, 0.001},
		{33116.093, 1224.803, 10.000, 0.001},
		{33237.707, 1207.482, 10.000, 0.001},
		{33357.589, 1190.161, 10.000, 0.001},
		{33475.739, 1172.840, 10.000, 0.001},
		{33592.157, 1155.519, 10.000, 0.002},
		{33706.843, 1138.198, 10.000, 0.002},
		{33819.797, 1120.877, 10.000, 0.002},
		{33931.019, 1103.556, 10.000, 0.002},
		{34040.508, 1086.235, 10.000, 0.002},
		{34148.266, 1068.914, 10.000, 0.002},
		{34254.291, 1051.593, 10.000, 0.003},
		{34358.584, 1034.272, 10.000, 0.003},
		{34461.145, 1016.951, 10.000, 0.003},
		{34561.974, 999.630, 10.000, 0.003},
		{34661.071, 982.309, 10.000, 0.003},
		{34758.436, 964.988, 10.000, 0.003},
		{34854.069, 947.667, 10.000, 0.003},
		{34947.969, 930.346, 10.000, 0.003},
		{35040.138, 913.025, 10.000, 0.004},
		{35130.574, 895.704, 10.000, 0.004},
		{35219.279, 878.383, 10.000, 0.004},
		{35306.251, 861.062, 10.000, 0.004},
		{35391.491, 843.741, 10.000, 0.004},
		{35474.999, 826.420, 10.000, 0.004},
		{35556.775, 809.099, 10.000, 0.004},
		{35636.819, 791.778, 10.000, 0.004},
		{35715.131, 774.457, 10.000, 0.004},
		{35791.710, 757.136, 10.000, 0.004},
		{35866.558, 739.815, 10.000, 0.005},
		{35939.673, 722.494, 10.000, 0.005},
		{36011.057, 705.173, 10.000, 0.005},
		{36080.708, 687.852, 10.000, 0.005},
		{36148.627, 670.531, 10.000, 0.005},
		{36214.814, 653.210, 10.000, 0.005},
		{36279.269, 635.889, 10.000, 0.005},
		{36341.992, 618.568, 10.000, 0.005},
		{36402.983, 601.247, 10.000, 0.005},
		{36462.242, 583.926, 10.000, 0.005},
		{36519.768, 566.605, 10.000, 0.005},
		{36575.563, 549.284, 10.000, 0.005},
		{36629.625, 531.963, 10.000, 0.005},
		{36681.955, 514.642, 10.000, 0.005},
		{36732.554, 497.321, 10.000, 0.005},
		{36781.420, 480.000, 10.000, 0.005},
		{36828.554, 462.680, 10.000, 0.005},
		{36873.956, 445.359, 10.000, 0.005},
		{36917.625, 428.038, 10.000, 0.005},
		{36959.563, 410.717, 10.000, 0.005},
		{36999.769, 393.396, 10.000, 0.005},
		{37038.242, 376.075, 10.000, 0.005},
		{37074.984, 358.754, 10.000, 0.005},
		{37109.993, 341.433, 10.000, 0.005},
		{37143.270, 324.112, 10.000, 0.005},
		{37174.815, 306.791, 10.000, 0.005},
		{37204.628, 289.470, 10.000, 0.005},
		{37232.709, 272.149, 10.000, 0.005},
		{37259.058, 254.828, 10.000, 0.005},
		{37283.675, 237.507, 10.000, 0.005},
		{37306.559, 220.186, 10.000, 0.005},
		{37327.712, 202.865, 10.000, 0.005},
		{37347.132, 185.544, 10.000, 0.005},
		{37364.821, 168.223, 10.000, 0.005},
		{37380.777, 150.902, 10.000, 0.005},
		{37395.001, 133.581, 10.000, 0.005},
		{37407.493, 116.260, 10.000, 0.005},
		{37418.272, 99.323, 10.000, 0.005},
		{37427.424, 83.718, 10.000, 0.005},
		{37435.082, 69.445, 10.000, 0.005},
		{37441.380, 56.505, 10.000, 0.005},
		{37446.450, 44.897, 10.000, 0.005},
		{37450.426, 34.621, 10.000, 0.005},
		{37453.441, 25.678, 10.000, 0.005},
		{37455.628, 18.068, 10.000, 0.005},
		{37457.121, 11.789, 10.000, 0.005},
		{37458.053, 6.843, 10.000, 0.005},
		{37458.556, 3.230, 10.000, 0.005},
		{37458.765, 0.949, 10.000, 0.005},
		{37458.813, 0.000, 10.000, 0.005},
		{37458.813, 0.000, 10.000, 0.005}

	};
  
	// WAYPOINT_DATA: [{"position":{"x":175,"y":75},"theta":-1.5707499999936907,"comment":""},{"position":{"x":135,"y":26},"theta":-3.1414999999873814,"comment":""},{"position":{"x":40,"y":26},"theta":-3.1414999999873814,"comment":""}]
	// IS_REVERSED: false
	// FILE_NAME: PathHabLevel1DoubleRocketPart3
}