package com.project.euler;

public class LargeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//100 50-digit numbers written as an array of 5 digit numbers.
		
		int s[][]={
			
				{37107,28753,39021, 2798,79799,82208,37590,24651,01357,40250},
				{46376,93767,74900, 9712,64812,48969,70078,05041,70182,60538},
				{74324,98619,95247,41059,47423,33095,13058,12372,66173, 9629},
				{91942,21336,35741,61572,52243,05633, 1811,07240,61549, 8250},
				{23067,58820,75393,46171,17198,03104,21047,51377,80632,46676},
				{89261,67069,66236,33820,13637,84183,83684,17873,43617,26757},
				{28112,87981,28499,79408, 6548,19315,92621,69127,58898,32738},
				{44274,22891,74325,20321,92358,94228,76796,48767,02721,89318},
				{47451,44573,60013, 6439, 9116,72168,56844,58871,16031,53276},
				{70386,48610,58430,25439,93961,98289,17593,66568,67579,34951},
				{62176,45714,18565,60629,50215,72231,96586,75507,93241,93331},
				{64906,35246,27419, 4929,10143,24458,13822,66334,79447,58178},
				{92575,86771,83372,17661,96375,15905,79239,72824,55988,38407},
				{58203,56532,53593,99008,40263,35689,48830,18945,86282,27828},
				{80181,19938,48262,82014,27819,41399,40567,58715,11700,94390},
				{35398,66437,28271,12653,82998,72407,84473, 5319,01042,93586},
				{86515,50600,62958,64861,53207,52733,71959,19142,05172,55829},
				{71693,88870,77154,66499,11559,34876,03532,92171,49700,56938},
				{54370,07057,68266,84624,62149,56500,76471,78729,44383,77604},
				{53282,65410,87568,28443,19119,06346,94037,85521,77792,95145},
				{36123,27252,50002,96071, 7508,25638,15656,71088,52583,50721},
				{45876,57617,24109,76447,33911,06072,18265,23687,72236,36045},
				{17423,70690,58518,60660,44820,76212, 9813,28786, 7339,69412},
				{81142,66041,80868,30619,32846, 8111,91061,55694,05126,89692},
				{51934,32545,17283,88641,91804,70492,93215, 5864,25630,49483},
				{62467,22164,84350,76201,72791,80399,44693,00473,29563,40691},
				{15732,44438,69081,25794,51408,90577, 6229,42919,71079,28209},
				{55037,68752,56787,73091,86254, 7449,69844,50833, 3936,82126},
				{18336,38482,53301,54686,19612,43487,67681,29753,43759,46515},
				{80386,28759,28784,90201,52168,55548,28717,20121,92577,66954},
				{78182,83375,79931,03614,74035,68564,49095,52709,78647,97581},
				{16726,32010, 4368,97842,55353,99209,31837,44149,78068,60984},
				{48403, 9812,90777,91799, 8821,87953,27364,47567,55908,48030},
				{87086,98755,13927,11854,51707,85441,61852,42432, 6931,50332},
				{59959,40689,57565,36782,10707,49269,66537,67632,62354,47210},
				{69793,95067,96526,94742,59770,97391,66693,76304,26339,87085},
				{41052,68470,82990,85211,39942,73657,34116,18276,03150,01271},
				{65378,60736,15010,80857,  914,99395,12557, 2819,87460,04375},
				{35829,03531,74347,17326,93212,35781,54982,62974,25527,37307},
				{94953,75976,51053, 5946,96606,76831,56574,37716,74018,75275},
				{88902,80257,17332,29619,17666,87138,19931,81104,87701,90271},
				{25267,68027,60780,03013,67868, 9925,25463,40106,16328,66526},
				{36270,21854, 4977, 5585,62994,65806,36237,99314,07462,55962},
				{24074,48690,82311,74977,79236,54662,57246,92332,28109,17141},
				{91430,28819,71032,88597,80666,97608,92938,63828,50253,33403},
				{34413,06557,80161,27815,92181,50055,61868,83646,84200,90470},
				{23053, 8117,28164,30487,62379,19698,42487,25503,66387,84583},
				{11487,69693,21549, 2810,42402, 1383,35124,46218,14417,73470},
				{63783,29949,06362,59666,49858,76182,21225,22551,24867,64533},
				{67720,18697,16985,44312,41957,24099,13959,  895,23100,58822},
				{95548,25530,02635,20781,53229,67962,49481,64195,38682,18774},
				{76085,32713,22857,23110,42480,34561,24867,69706,45079,95236},
				{37774,24253,54112,91684,27686,55389,26205, 2491,03265,72967},
				{23701,91327,57256,75285,65324,82582,65463, 9220,70585,96522},
				{29798,86027,22583,31913,12637,51473,41994,88953,47657,45501},
				{18495,70145,48792,88984,85682,77260,77713,72140,37988,79715},
				{38298,20378,30314,73527,72158, 3481,44513,49137,32266,51381},
				{34829,54382,91999,18180,27891,65224,31027,39225,11228,69539},
				{40957,95306,64052,32632,53804,41000,59654,93915,98795,93635},
				{29746,15218,55023,71307,64225,51211,83693,80358, 3885,84903},
				{41698,11622,20729,77186,15823,66784,24689,15799,35329,61922},
				{62467,95719,44012,69043,87710,72750,48102,39089,55235,97457},
				{23189,70677,25479,15061,50550,49539,22979,53090,11299,67519},
				{86188, 8822,58753,14529,58409,92512, 3829,  940,77707,75672},
				{11306,73970,83047,24483,81653,38735,02340,84564,70580,77308},
				{82959,17476,71403,63198,  818,71290,11875,49131,05471,26581},
				{97623,33104,48183,86269,51545,63349,26366,57289,75634,00500},
				{42846,28018,35170,70527,83183,94258,82145,52122,72512,50327},
				{55121,60354,69812,  581,76216,52128,27652,75169,12968,97789},
				{32238,19573,43293,39946,43750,19078,36945,76588,33523,99886},
				{75506,16496,51847,75180,73816,88378,61091,52735,79297,01337},
				{62177,84275,21926,23401,94239,96391,68044,98399,31733,12731},
				{32924,18570,71473,49566,91667,46876,34660,91503,59146,77504},
				{99518,67143,02352,19628,89489,01024,23325,11691,36196,26622},
				{73267,46080, 5915,47471,83079,83928,68535,20694,69445,40724},
				{76841,82252,46744,17161,51403,64279,82273,34805,55562,14818},
				{97142,61791,03425,98647,20451,68939,89422,17982,60880,76852},
				{87783,64618,27993,46313,76775,43078, 9363,33301,89826,42090},
				{10848,80252,16746,70883,21512, 1858,83543,22381,28769,52786},
				{71329,61247,47824,64538,63699,30090,49310,36361,97638,78039},
				{62184,07357,23997,94223,40623,53938, 8339,65132,74080,11116},
				{66627,89198,14880,87797,94187,68761,44230, 3098,44908,51411},
				{60661,82629,36828,36764,74477,92391,80335,11098,90697,90714},
				{85786,94408,95529,90653,64044,74255,76083,65997,66457,95096},
				{66024,39640,99053,89607,12019,82199,76047,59949, 1972,30297},
				{64913,98268,  329,73156,03712,00413,77903,78556,60850,89252},
				{16730,93931,98727,50275,46890,69037, 7539,41304,26523,15011},
				{94809,37724,50487,95150,95410, 9216,45863,75471, 5984,36791},
				{78639,16702,11874,92431,99570, 6419,17969,77759,90283,  699},
				{15368,71371,19366,14952,81130,58763,80278,41075,44497,33078},
				{40789,92311,55355,62561,14232,24232,55033,68544,24889,17353},
				{44889,91150,14406,48020,36906,80639,60672,32219,32041,49535},
				{41503,12888, 3395,36053,29934, 3680, 6977,71065,05666,31954},
				{81234,88067,32101,46739, 5856,85579,34581,40362,78227, 3280},
				{82616,57077,39483,27592,23284,59417,06525, 9451,23252,30608},
				{22918,80205,87773,19719,83945, 1808,88072,42966,19808,11197},
				{77158,54250,20165,45090,41324,58097,86882,77894,87218,59617},
				{72107,83843,50691,86155,43566,28840,62257,47369,22845, 9516},
				{20849,60398,01340,01723,93067,16668,23555,24525,28046, 9722},
				{53503,53422,64725,24250,87405,40755,91789,78126,43303,31690},
		};// end of array
		
		int add[] = new int[10];
		
		int i,j;
		int sizei, sizej;
		
		int sum=0, count=0;
		
		sizei= s.length;
		sizej=s[0].length;
		
		sizej = sizej-1;
		
			for(j=sizej; j>=0; j--){
				
				for(i=0; i<sizei; i++){
					
					sum = sum + s[i][j];
				
			}// inner for
				add[j] = sum;
				while(sum>=100){
					sum = sum/10;
				}
				if(j>1){
				add[j-1]=sum;
				}
				
		}// outer for		

				 sum = add[0];
				 while(sum>0){
					 sum = sum/10;
					 count++;
				 }//while
			
			System.out.print(""+add[0]);
				 
			sum = add[1];
			
			while(count<=10){
				sum = sum/10;
				count++;								
			}
			System.out.print(""+sum);
	}

}
