package com.programe.datastructure.leetcode;

public class PeakIndexMountainArray852 {

    public static void main(String args[]) {

        /**
         * You are given an integer mountain array arr of length n where the values
         * increase to a peak element and then decrease.
         * Return the index of the peak element.
         *
         * Your task is to solve it in O(log(n)) time complexity.
         *
         * Example 1:
         * Input: arr = [0,1,0]
         * Output: 1
         *
         * Example 2:
         * Input: arr = [0,5,6,9,10,9,8,7,6,5,4,3,2,1]
         * Output: 4
         *
         * Example 3:
         * Input: arr = [0,5,6,9,10,9,8,7,6,5,4,3,2,1]
         * Output: 1
         *
         */
        int[] arr = {0,5,6,9,10,9,8,7,6,5,4,3,2,1};
        System.out.printf("Peak Element in array - {%d}",bruteForceSolution(arr));
        System.out.printf("\n\n\nPeak Element in Array - {%d}",peakIndexInMountainArray(arr));

    }


    public static int bruteForceSolution(int[] arr){
        int i=0;
        while(arr[i]<arr[i+1]) {
            i++;
        }
        return i;
    }




    public static int peakIndexInMountainArray(int[] arr) {
        return findLargest(arr, 0, arr.length-1);
    }
    private static int findLargest(int[] arr, int i, int j) {
        int middle = (i+j)/2;
        if(i>=j) {
            return middle;
        }
        if(arr[middle]<arr[middle+1]) {
            return findLargest(arr, middle+1, j);
        } else {
            return findLargest(arr, i, middle);
        }
    }

}
