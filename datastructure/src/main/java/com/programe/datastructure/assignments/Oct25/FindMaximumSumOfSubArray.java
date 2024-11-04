package com.programe.datastructure.assignments.Oct25;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMaximumSumOfSubArray {

    public static void main(String[] args) {
        /**
         * Find the Maximum Sum of subArray -
         * Example -
         * [2,1,-6,9,1,6,3]
         * Output - 19
         * Explanation -
         * [9,1,6,3] - having maximum sum is 19
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,1,-6,9,1,6,3));
        findMaximumSumOfSubArray(list);

    }

    /** O(N^3)
     * Brute Force Approach
     * @param list
     */
    private static void findMaximumSumOfSubArray(ArrayList<Integer> list) {

        int maxSum =0;
        int start=0, end=0;
        int n = list.size();
        for(int i=0;i<n;i++) {
            int sum=0;
            for(int j=i;j<n;j++) {
               for(int k=i;k<=j;k++) {
                   sum += list.get(k);
               }
                if(sum>maxSum) {
                    start=i;
                    end=j;
                    maxSum=sum;
                }
            }
        }
        System.out.print("\n\nSub Array will be [");
        while(start<=end) {
            System.out.print(list.get(start++)+",");
        }
        System.out.print("]");
    }
}
