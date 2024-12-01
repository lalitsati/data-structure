package com.programe.datastructure.assignments.nov27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfXorOfAllPairs {
    public static void main(String[] args) {
        /**
         * Q3. Sum of Xor of all Pairs
         * Problem Description
         * Given an array A of N integers. Find the sum of bitwise XOR all pairs of numbers in the array.
         * Since the answer can be large, return the remainder after the dividing the answer by 10^9+7.
         *
         * Problem Constraints
         * 1 <= N <= 105
         * 1 <= A[i] < 109
         *
         * Example Input 1-
         * A = [1, 2, 3]
         * Output - 6;
         * Example Explanation -
         * Pair    Xor
         * {1, 2}  3
         * {1, 3}  2
         * {2, 3}  1
         * Sum of xor of all pairs = 3 + 2 + 1 = 6.
         */

        List<Integer> list = Arrays.asList(70888,2417,136,95979,93360,55711,80569,64649,19693,90763,23586,18259,15715,8892,1366,8309,66170,19072,14992,91483,97245,48005,33421,71066,13466,30368,64109,16774,75716,46089,16630,48154,54068,90749,79857,23699,36068,16539,75467,70069,8531,74888,45046,63364,1700,46827,66181,84044,5470,16145,15859,61819,39245,44618,56957,32737,83232,88394,10435,99447,74729,63209,41291,56117,73824,43939,87646,77242,23936,57145,19369,29799,7593,65583,90142,66660,16156,99084,69776,63866,76482,7229,73722,1848,80838,37809,49241,4559,40342,12830,72173,45910,13158,40251,52829,56422,80268,34148,49616,79998,42949,3770,43284,53760,13135,56608,25722,51506,84685,31359,83992,12095,93927,34882,54470,87060,52071,71099,40354,66851,76124,31100,30348,37187,65467,7775,58378,96237,39193,91903,11685,42785,71378,55261,60362,62463,389,19420,18059,94095,91510,38628,67099,76089,10315,88611,48118,80494,39632,98663,81366,87389,57555,96965,17183,59294,64328,14262,69012,89099,22182,73908,35167,24098,75015,2370,27693,46661,46956,91649,80784,68281,49911,11740,12379,21962,87504,80061,78154,63654,95841,245,63383,41278,43194,52888,20102,76552,493,25758,68442,64127,54866,51204,92989,45057,85637,73353,20860,94896,74531,52433,3209,79314,40753,66086,29240,88625,73365,6066,69506,48732,61435,79205,39653,1764,36241,9813,21121,67872,75627,84313,6396,69385,88992,3534,45344,13503,36587,61298,21976,7298,8715,50540,55222,73593,40675,60290,41040,80879,22426,2560,34718,45137,20573,90360,84414,71537,65944,40413,82801,71238,16033,77831,50779,65066,12781,39890,454,7258,85753,37502,39871,68602,7810,3952,38776,847,49197,51600,65349,30946,7616,52554,89823,44612,31655);
        System.out.print("\nSum of All set of XOR - " + bruteForceSolution(list));
        System.out.print("\nBit Contribution  - " + bitContribution(list));

    }

    private static int bitContribution(List<Integer> list) {
        /**
         * 1. count ith bit set or unset for whole list maintain  this count count1 and count0
         * 2. apply bit contribution technique
         * contribution = count1 * count0 * 1<<i         (where 1<<i means 2^i)
         * 3. sum of all the bit contribution till 32'bits
         * 4. return this sum
         *
         */
        final int MOD = 1000000007;
        int i = 0;
        long sumXOR = 0;
        while (i < 32) {
            int count1 = 0, count0 = 0;
            //1. count ith bit set or unset for whole list maintain  this count count1 and count0
            for (int num : list) {
                if ((num & (1 << i)) > 0) {
                    count1++;
                } else {
                    count0++;
                }

            }
            long contribution = (long) (count1%MOD) * (count0%MOD) * ((1L << i)%MOD);
            sumXOR = (sumXOR+contribution) % MOD;
            i++;
        }
        return (int) sumXOR;
    }


    /**
     * Brute Force Tech
     * TC - O(N^2)
     *
     * @param list
     * @return
     */
    public static int bruteForceSolution(List<Integer> list) {
        /**
         * 1. find all set of Sub Array size of 2-
         * 2. find all the XOR value of all sub Array -
         * 3. calculate total of all the XOR
         */
        int n = list.size();
        long sumXOR = 0;
        final int MOD = 1000000007;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                sumXOR += list.get(i) ^ list.get(j);
                sumXOR %= MOD;
            }
        }
        return (int) sumXOR;
    }
}
