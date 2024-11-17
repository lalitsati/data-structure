package com.programe.datastructure.leetcode.section1;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        /**
         * 16. 3Sum Closest
         * Given an integer array nums of length n and an integer target, find three integers in nums such
         * that the sum is closest to target.
         *
         * Example 1:
         * Input: nums = [-1,2,1,-4], target = 1
         * Output: 2
         * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
         *
         * Example 2:
         * Input: nums = [0,0,0], target = 1
         * Output: 0
         * Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
         */
        int[] nums = {4,0,5,-5,3,3,0,-4,-5};
        int target=100;
        System.out.print("Closest sum -"+threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest=Integer.MAX_VALUE;
        int result=0;
        for(int i=0;i<n;i++){
            int x=i+1,y=n-1;

            while(x<y){
                int sum = nums[i]+nums[x]+nums[y];
               int diff = sum<=target && sum>=0?target-sum:sum-target;
                if((diff>=0 && diff<closest) || (diff<=0 && diff>closest)) {
                    closest = diff;
                    result=sum;
                 }
                if(diff<nums[x]) {
                    x++;
                } else {
                    y--;
                }
            }
        }
        return result;
    }
}
