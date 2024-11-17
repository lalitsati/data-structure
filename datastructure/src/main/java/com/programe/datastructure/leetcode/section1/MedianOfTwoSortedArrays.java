package com.programe.datastructure.leetcode.section1;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        /**
         * 4. Median of Two Sorted Arrays
         * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two
         * sorted arrays.
         * The overall run time complexity should be O(log (m+n)).
         *
         * Example 1:
         * Input: nums1 = [1,3], nums2 = [2]
         * Output: 2.00000
         * Explanation: merged array = [1,2,3] and median is 2.
         *
         * Example 2:
         * Input: nums1 = [1,2], nums2 = [3,4]
         * Output: 2.50000
         * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
         *
         * Constraints:
         * nums1.length == m
         * nums2.length == n
         * 0 <= m <= 1000
         * 0 <= n <= 1000
         * 1 <= m + n <= 2000
         * -106 <= nums1[i], nums2[i] <= 106
         */

        int[] num1 = {};
        int[] num2 = {1};
        System.out.print("\nMidian of Two Sorted Array is - "+bruteForceApproach(num1, num2));

    }

    /**
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static double bruteForceApproach(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int n=n1+n2;
        int[] arr = new int[n];
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if(j<n1 && k<n2) {
                arr[i] = nums1[j]<nums2[k]?nums1[j++]:nums2[k++];
            } else if(j<n1) {
                arr[i]=nums1[j++];
            } else if(k<n2){
                arr[i]=nums2[k++];
            }

        }
        if(arr.length>=1) {
            if (n <= 1) {
                return arr[0];
            }
            if (n % 2 == 0) {
                return (double) (arr[n / 2] + arr[n / 2 - 1]) / 2;
            } else {
                return (double) arr[n / 2];
            }
        } else {
            return 0.00;
        }
    }
}
