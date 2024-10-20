package com.programe.datastructure.leetcode;


import java.util.Arrays;

public class ContainesDuplicate {

    public static void main(String args[]) {

        /**
         * Given an integer array nums, return true if any value appears at least twice in the array,
         * and return false if every element is distinct.
         *
         * Example 1:
         * Input: nums = [1,2,3,1]
         * Output: true
         * Explanation:
         * The element 1 occurs at the indices 0 and 3.
         *
         * Example 2:
         * Input: nums = [1,1,1,3,3,4,3,2,4,2]
         * Output: true
         */
        int[] arr = {1,2,3,4,5,6,7,8,9,9};
        System.out.printf("is Duplicate available in arr - {%b}",isDuplicate(arr));


    }

    private static boolean isDuplicate(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i]==arr[i+1]) {
                return true;
            }
        }
        return false;

    }
}