package com.programe.datastructure.assignments.Oct22;

import java.util.ArrayList;
import java.util.Arrays;

public class EquilibriumIndexes {

    public static void main(String[] args) {

        /**
         * Q2. Equilibrium index of an array
         * Problem Description
         * You are given an array A of integers of size N.
         * Your task is to find the equilibrium index of the given array
         *
         * The equilibrium index of an array is an index such that the sum of elements at lower
         * indexes is equal to the sum of elements at higher indexes.
         * If there are no elements that are at lower indexes or at higher indexes,
         * then the corresponding sum of elements is considered as 0.
         *
         * Note:
         * Array indexing starts from 0.
         * If there is no equilibrium index then return -1.
         * If there are more than one equilibrium indexes then return the minimum index.
         *
         *
         * Problem Constraints
         * 1 <= N <= 105
         * -105 <= A[i] <= 105
         *
         * Example Input
         * Input 1:
         * A = [-7, 1, 5, 2, -4, 3, 0]
         * Output 1:
         * 3
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(-9567,4282,-8150,-507,-4368,7650,7834,5994,6029,5977,-8131,8327,3421,9402,-4050,7917,-5939,-942,-6335,-2009,5579,2814,-2182,2974,6038,-7243,-9261,8571,-74,5663,-1680,-1180,-7929,-5241,-4283,-7102,8716,-2030,9839,4754,7722,-4286,3694,109,-59,-7893,-8036,8136,704,-7362,6050,5782,1408,-9171,-2858,9037,-9765,-8160,-8906,1405,2724,-1525,-3142,-2331,-6559,-6712,5717,6692,-2836,4884,-9282,-8093,-1108,-4037,-6764,6636,1113,2372,2314,-863,5107,1962,332,9255,-952,-3059,-763,-1010,-8148,-4187,-6949,-9266,-6649,-1086,-1823,1172,7468,3576,-2651,-2810,1327,-4869,-2638,-194,1668,4050,4008,4203,-8614,-4107,3707,-4164,759,-3964,4149,-8391,-5467,5070,6646,2723,904,5479,-3756,4658,4062,-9748,-7888,3846,5479,-1837,9681,7306,-6371,-8648,-9198,8204,1090,-1853,405,-1200,-4693,3426,548,-442,9966,9007,-4362,1204,-1166,-8452,-9174,3597,-2045,-2079,-3192,4880,-7953,-2939,7343,1277,-2347,-2526,7729,-7062,-3200,9711,-8148,-5192,2015,-9040,4451,-2866,-9280,-1428,1601,-3913,-7821,2407,-8553,3208,-8036,5504,230,5581,2992,4554,-1305,5040,1350,6145,-8674,1838,-8340,5663,5000,6941,-3385,-4323,5479,5561,2765,7494,2773,3704,-3010,-636,-3644,-4567,2449,3915,-353,-8880,-370,2873,9045,8600,6881,9702,4767,-587,4684,2002,3471,-6580,-5013,-8027,-3364,-3163,2114,-6655,4191,-5744,-4798,7604,-2697,-2367,-3678,-4537,-7843,748,910,2253,2549,-4975,7251,-2691,9460,-19,338,-1454,4184,-4846,9527,-9705,6109,-5078,3366,5740,-1281,-5422,6854,4534,2823,9693,-8986,-6408,4579,-4497,-6209,-8900,5450,-4754,-3622,-3314,-1627,265,5987,8514,-9536,-324,6247,1841,2614,9397,3512,-7554,1691,4304,-1112,3789,8212,-4595,-729,5671,-3167,-3448,6861,-2790,5387,2572,-4657,-6065,565,-2281,-8854,-8131,7003,5690,2997,4270,1647,405,-9540,-3289,-8486,-9280,-4131,1922,2244,6311,-3125,3156,-2776,-7586,6614,4065,-3392,336,-5931,-4488,-967,-7013,-1896,4905,3854,-352,-2333,3925,-4450,-2947,3731,3545,-7588,3047,7058,-652,-3031,9708,-5050,9896,-1990,7437,2033,1836,1020,1184,-1879,6986,-1442,3706,5075,-3121,-9057,-2218,-3482,4503,3820,-6814,-5543,2953,5419,-4234,5083,-7989,-9044,4759,5001,-4816,-1455,-8982,6230,3789,2067,8913,-7197,-5700,-9605,-8917,1602,9068,6983,-9851,6490,-3681,-4583,7416,-9859,-4794,-7003,-5078,-6571,2147,-3032,-3745,4378,552,-6223,1308,3407,-2074,-8225,-9206,-811,3335,-8321,-2336,-9302,-8629,1250,876,-2147,-9869,-684,-4668,5552,1592,-1862,-2060,-6691,7282,-231,-6022,-8175,3090,23,-1629,4508,-777,6424,9660,5148,487,-8604,-9050,-8296,-5051,1232,2182,-5361,-2854,1218,-7355,-6655,-1729,-5164,-1944,-306,-4147,8714,-6277,1108,-9160,7330,-6345,4768,2387,1281,2193,9069,5224,-1424,-5967,-5322,8263,7794,-7210,4531,1829,4972,-3197,2109,1927,-7533,-4550,6185,4942,6430,-2290,9205,2406,4109,4017,8010,-4812,287,7817,-9775,8070,3510,5722,-7001,-9778,1177,-7398,7125,-9041,-8945,8841,4140,8770,1732,4705,-9492,2868,-9211,-3526,-4864,-9068,-4073,-5433,6376,7314,7935,8647,2811,-2688,2510,-1002,-3529,-8859,-3419,9237,-4087,-9237,6027,-5347,-5957,-3261,-9781,-905,405,-8287,2930,-1011,-9123,-7448,-482,3555,-5767,9878,-7135,8479,-3306,-6033,9624,5480,-3615,1633,8225,-1602,4878,3622,-7586,-2040,7472,3912,-1787,4356,4270,-3100,-3538,-4678,-588,3346,6,-8615,-7688,-5733,-6071,-9479,9312,7716,-9107,-9610,-1293,914,-5513,7474,-2969,-8765,-8385,-5457,-1915,-5540,-3095,-8457,6298,-8301,8233,1029,-4112,2573,2999,9666,-809,2257,2203,-3387,570,6012,5346,-3049,-9127,-1107,-8724,6999,-1803,6059,-7293,3701,9062,4683,-936,7469,-4921,4463,-7966,6283,4111,-7324,2921,-6848,-7417,-4208,4091,4538,-5774,4881,-7206,5092,-5863,-8729,-4802,9619,-2294,8733,4161,7050,-2423,-9985,-2006,1193,-9158,-3103,3704,-9680,5482,3379,7462,-7796,7093,-7317,-7236,-1509,-4516,-7529,-5514,7038,3530,5514,6408,2528,3836,2356,-6926,-5410,-5950,-8132,2058,-6010,-978,-4080,-5457,4366,-6540,9812,-5810,6537,-9194,-5296,6306,-5225,-3031,-7157,9866,3675,9126,-7522,5244,-295,-5015,-2796,-6973,-2139,7290,-3673,-2610,-7329,-810,8879,3250,-6699,500,-960,5795,-6513,6157,-5470,8876,-3657,2257,2402,-7110,5820,-7334,2321,-3148,6831,-7754,2049,-6758,5024,6154,-6541,-6987,-7337,7168,546,-8561,4313,7753,2398,-7691,-3355,5309,6411,-5404));
        System.out.printf("Equilibrium Indexe is - {%d}",solve(list));

    }

    public static int solve(ArrayList<Integer> list) {

        int n = list.size();
       for(int i=0;i<n;i++) {

           //get lowerIndex sum from i
           int lowerIndexSum=0;
           for(int j=0;j<i;j++) {
               lowerIndexSum +=list.get(j);
           }
           //get higherIndex sum from i
           int higherIndexSum=0;
           for(int j=i+1;j<n;j++) {
               higherIndexSum += list.get(j);
           }
           if(lowerIndexSum==higherIndexSum) {
               return i;
           }
       }
       return -1;
    }
}