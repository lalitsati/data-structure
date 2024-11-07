package com.programe.datastructure.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String[] args){
        /**
         * Given an array of integers nums and an integer target, return indices of the two numbers such that they
         * add up to target.
         * You may assume that each input would have exactly one solution, and you may not use the same element twice.
         * You can return the answer in any order
         *
         * Example 1:
         * Input: nums = [2,7,11,15], target = 9
         * Output: [0,1]
         * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         *
         * Example 2:
         * Input: nums = [3,2,4], target = 6
         * Output: [1,2]
         * Example 3:
         *
         * Input: nums = [3,3], target = 6
         * Output: [0,1]
         *
         * Constraints:
         * 2 <= nums.length <= 104
         * -109 <= nums[i] <= 109
         * -109 <= target <= 109
         *
         */
        int[] arr = {3,2,3};
        int target=6;
        //printArr(solve(arr, target));
        printArr(solve1(arr, target));

    }


    private static int[] solve1(int[] arr, int target) {
        Map<Integer, Integer> tmp = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            int val = target-arr[i];
            if(tmp.containsKey(val)) {
                return new int[]{tmp.get(val),i};
            } else {
                tmp.put(arr[i], i);
            }
        }
        return null;
    }

    /**
     * Need to check (More optimized )
     * @param arr
     * @param target
     * @return
     */
    private static int[] solve(int[] arr, int target) {
        int i=0,e=1;
        int sum=arr[0];
        int n = arr.length;
        while(e<n) {
            sum = arr[i]+arr[e];
            if(sum==target) {
                return new int[]{i,e};
            }
            e++;i++;
        }
        return null;
    }

    public static void printArr(int[] arr){
        for(int i=0;i< arr.length;i++) {
            System.out.print(arr[i]+",");
        }
    }
}
