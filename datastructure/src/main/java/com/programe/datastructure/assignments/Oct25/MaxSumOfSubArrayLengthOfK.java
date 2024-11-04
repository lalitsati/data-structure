package com.programe.datastructure.assignments.Oct25;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxSumOfSubArrayLengthOfK {

    public static void main(String[] args) {

        /**
         * Given an array length of N, find max subarray sum of length k
         * Example -
         * Input -
         * arr = [-3,4,-2,5,3,-2,8,2,-1,4]
         * K = 5
         * Output = 16
         * Explanation -
         * s        e       Sum
         * 0        4       7
         * 1        5       8
         * 2        6       12
         * 3        7       16
         * 4        8       10
         * 5        9       11
         *
         * so Maximum sum is - 16
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(-3,4,-2,5,3,-2,8,2,-1,4));
        int k=5;
        System.out.printf("\nmaximum sum of sumArray is - {%d}",bruteForceSolution(list, k));
        System.out.printf("\nmaximum sum of sumArray is - {%d}",slidingWindowTechnique(list, k));


    }

    /**
     * O(N)
     * @param list
     * @param k
     */
    private static int slidingWindowTechnique(ArrayList<Integer> list, int k) {
        int i=0;
        int e=k-i-1;
        int maxSum=Integer.MIN_VALUE;
        int n=list.size();
        int sum=0;
        while(e<n) {
            if(i==0) {
                for(int j=0;j<=e;j++) {
                    sum +=list.get(j);
                }
            } else {
                sum = sum-list.get(i-1)+list.get(e);
            }
            if(maxSum<sum) {
                maxSum = sum;
            }
            e++;i++;
        }
        return maxSum;
    }


    /**
     * O(N^2)
     * @param list
     * @param k
     * @return
     */
    public static int bruteForceSolution(ArrayList<Integer> list, int k) {
        int i=0;
        int e = k-i-1;
        int n = list.size();
        int maxSum=0;
        while(e<n) {
            int sum=0;
            for(int j=i;j<=e;j++) {
                sum += list.get(j);
            }
            if(maxSum<sum) {
                maxSum=sum;
            }
            i++;e++;
        }
        return maxSum;
    }
}
