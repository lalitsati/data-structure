package com.programe.datastructure.assignments.Oct25;

import java.util.ArrayList;
import java.util.Arrays;

public class GoodSubarrays {
    public static void main(String[] args) {
        /**
         * Q1. Good Subarrays Easy
         * Problem Description
         * Given an array of integers A, a subarray of an array is said to be good if it fulfills any one of the criteria:
         * 1. Length of the subarray is be even, and the sum of all the elements of the subarray must be less than B.
         * 2. Length of the subarray is be odd, and the sum of all the elements of the subarray must be greater than B.
         * Your task is to find the count of good subarrays in A.
         *
         * Problem Constraints
         * 1 <= len(A) <= 5 x 103
         * 1 <= A[i] <= 103
         * 1 <= B <= 107
         *
         * Example Input
         * Input 1:
         * A = [1, 2, 3, 4, 5]
         * B = 4
         * Example Output
         * Output 1: 6
         * Explanation 1:
         * Even length good subarrays = {1, 2}
         * Odd length good subarrays = {1, 2, 3}, {1, 2, 3, 4, 5}, {2, 3, 4}, {3, 4, 5}, {5}
         *
         * Example 2 -
         * Input 2:
         * A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
         * B = 65
         * Output 2:  36
         *
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9));
        int b = 65;
        System.out.printf("Total Number of subarary which are meeting the current criterea - {%d}",
                solve(list,b));

    }

    /**
     *
     * @param list
     * @param b
     * @return
     */
    public static int solve(ArrayList<Integer> list, int b) {

        int n = list.size();
        int count=0;
        for(int i=1;i<=n;i++) {
            int e=i-0-1;
            int j=0;
            int sum=0;
            while(e<n) {
                if(j==0) {
                    for(int k=0;k<=e;k++)
                    sum += list.get(k);
                } else {
                    sum = sum-list.get(j-1)+list.get(e);
                }
                if((i%2==0 && sum<b) ||
                        (i%2!=0 && sum>b)) {
                    count++;
                }
                e++;j++;
            }
        }
        return count;
    }
}
