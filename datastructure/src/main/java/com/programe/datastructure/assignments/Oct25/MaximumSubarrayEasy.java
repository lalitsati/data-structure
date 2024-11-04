package com.programe.datastructure.assignments.Oct25;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSubarrayEasy {
    public static void main(String[] args) {
        /**
         * Q1. Maximum Subarray Easy
         * Problem Description
         * You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so
         * that the sum of contiguous elements is maximum.
         * But the sum must not exceed B.
         *
         * Problem Constraints
         * 1 <= A <= 103
         * 1 <= B <= 109
         * 1 <= C[i] <= 106
         *
         * Example Input
         * Input 1:
         * A = 5   (size of an Array)
         * B = 12
         * C = [2, 1, 3, 4, 5]
         *
         * Example Output
         * Output 1:
         * 12
         *
         * Example 2 -
         * A = 3
         * B = 1
         * C = [2, 2, 2]
         * Output -
         * 0
         * Explanation -
         * All elements are greater than B, which means we cannot select any subarray.
         * Hence, the answer is 0.
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2, 1, 3, 4, 3));
        int a=5;
        int b = 12;
        System.out.printf("Maximum sum up to {%d} is - {%d}",b,maxSubarray(a,b,list));

    }

    public static int maxSubarray(int a, int b, ArrayList<Integer> list) {

        int maxSum = 0;
        for(int i=0;i<a;i++) {
            int sum=0;
            for(int j=i;j<a;j++) {
                sum +=list.get(j);
                if(sum<=b && sum>maxSum) {
                    maxSum=sum;
                }
                if(maxSum==b) {
                    break;
                }
            }
        }
        return maxSum;
    }
}
