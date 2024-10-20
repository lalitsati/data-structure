package com.programe.datastructure.leetcode;

public class FindMinRotatedSortedArray {

    public static void main(String[] args) {

        /**
         * 153. Find Minimum in Rotated Sorted Array
         *
         * Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
         * For example, the array nums = [0,1,2,4,5,6,7] might become:
         *
         * [4,5,6,7,0,1,2] if it was rotated 4 times.
         * [0,1,2,4,5,6,7] if it was rotated 7 times.
         *
         * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1],
         * a[0], a[1], a[2], ..., a[n-2]].
         *
         * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
         * You must write an algorithm that runs in O(log n) time.
         *
         * Example 1:
         * Input: nums = [3,4,5,1,2]
         * Output: 1
         * Explanation: The original array was [1,2,3,4,5] rotated 3 times.
         *
         * Example 2:
         * Input: nums = [4,5,6,7,0,1,2]
         * Output: 0
         * Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
         *
         */
        int[] arr = {1};
        System.out.printf("Minimum element - {%d}",findMin(arr));

        System.out.printf("\n\n\n\n\nMinimum element - {%d}",findMin1(arr));


    }


    /**
     *
     * @param arr
     * @return
     */
    private static int findMin1(int arr[]) {
        int x=0,y=arr.length-1;
        int min=0;
        while(x<y) {
            if(arr[x]>arr[y]) {
                x++;
            } else {
                y--;
            }
        }
        return arr[x];
    }


    /**
     *  NOT working below methods
     * @param arr
     * @return
     */
    public static int findMin(int[] arr) {

        int x=0,y= arr.length-1;
        while(x<y) {
            int middle=(x+y)/2;

            if(arr[middle]>arr[y]){
                x=middle+1;
            } else {
                y=middle;
            }
        }
        return arr[y];
    }
}
