package com.programe.datastructure.leetcode;

public class MaximumSubArray {

    public static void main(String[] args) {

        /**
         * #53. Maximum Subarray
         * Given an integer array nums, find the subarray with the largest sum, and return its sum.
         *
         * Example 1:
         *
         * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
         * Output: 6
         * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
         *
         * Example 2:
         *
         * Input: nums = [5,4,-1,7,8]
         * Output: 23
         * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
         *
         *
         */

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4,8};
        bruteForceApproach(arr);
        approach2(arr);
        approach3(arr);


    }

    /**
     * Time - Complexity - O(n)
     * Space - Complexity - O(1)
     * Final Approach Good Time Complexity
     * @param arr
     */
    private static void approach3(int[] arr) {
        int maxSum=arr[0];
        int total=0;
        for(int i=0;i<arr.length;i++) {
            total += arr[i];
            if(total>maxSum) {
                maxSum=total;
            }
            //if total is lest then 0 then we have to assign value 0
            if(total<0) {
                total=0;
            }
        }
        System.out.printf("\n\nMaximum Sum of SubArray -: {%d}",maxSum);
    }

    /**
     * Time Complexity - O(i*j)
     * Space Complexity - O(1)
     * @param arr
     */
    private static void approach2(int[] arr) {
        int maxSum=arr[0];

        for(int i=0;i<arr.length;i++) {
            int total=0;
            for(int j=i;j<arr.length;j++) {
                total += arr[j];
                if(total>maxSum) {
                    maxSum=total;
                }
            }
        }
        System.out.printf("\n\nmaximum Sum of SubArray -: {%d}",maxSum);
    }

    /**
     * Time Complexity = O(n3)
     * Space Complexity = O(1)
     * @param arr
     */
    public static void bruteForceApproach(int[] arr){
        int maxSum=arr[0];
        String indexes="";
        //first one traverse from one to array of length
        for(int i=0;i< arr.length;i++) {
            //second loop will be traverse from ith to length
            for(int j=i;j< arr.length;j++) {
                int sum=0;
                //third loop will be from i to J   to get  each sub array
                for(int k=i;k<=j;k++) {
                    sum += arr[k];
                }
                if(sum>maxSum) {
                    maxSum=sum;
                    indexes = i+","+j;
                }
            }
        }
        System.out.printf("Subarray indexes - {%s} and Maximum sum - {%d}",indexes,maxSum);
    }

}
