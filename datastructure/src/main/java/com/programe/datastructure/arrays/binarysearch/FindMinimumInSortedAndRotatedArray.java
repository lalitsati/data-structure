package com.programe.datastructure.arrays.binarysearch;

public class FindMinimumInSortedAndRotatedArray {

    public static void main(String[] args) {

        /**
         * Find Minimum in Sorted and Rotated Array -----
         * Given a sorted rotatd array of unique elements. find the minimum element in the array.
         *
         * Sample input -
         * arr = {7,8,10,15,16,2,4,6}
         * Sample Out - 2   (Minimum element)
         */

        int[] arr = {7,10,15,16,2,4,6};
        bruteForceApproach(arr);
        binarySearchApproach(arr);


    }

    private static void binarySearchApproach(int[] arr) {
        int left=0, right= arr.length-1, mid=0;
        while(left<right) {
            mid = (left+right)/2;
            if(arr[mid]<arr[right]) {
                right = mid;
            } else {
                left = mid+1;
            }
        }
        System.out.print("\n binarySearchApproach - Minimum Element - "+arr[right]);
    }

    /**
     * Time Complexity - O(n)
     * Space Complexity - O(1)
     * @param arr
     */
    private static void bruteForceApproach(int[] arr) {
        int min=arr[0];
        for(int i=0;i<arr.length;i++) {
            if(min>arr[i]) {
                min = arr[i];
            }
        }
        System.out.print("\n bruteForceApproach - Min Element - "+min);
    }
}