package com.programe.datastructure.arrays.binarysearch;

public class SearchSortedAndRotatedArray {

    public static void main(String[] args) {
        /**
         * Given a sorted rotated array of unique elements and a target(Value of X).
         * find the index of target in the array.
         * if target is not present in the array, return -1.
         * Example -
         * arr = {9,11,14,15,20,22,25,1,2,3,5,7}
         * X = 14
         * Output - 2 (position of 14 in rotate array)
         *
          */
        int[] arr = {9,11,14,15,20,22,25,1,2,3,5,7};
        int x = 5;
        System.out.println("current position of x in array -: "+bruteForceMethod(arr, x));
        usingBinarySearch(arr, x);
    }

    /**
     * Time Complexity - O(logN)
     * Space Complexity - O(1)
     * @param arr
     * @param x
     */
    private static void usingBinarySearch(int[] arr, int x) {

        //first find the minimum element inside array -
        int minElPosition = findMinimumElement(arr);
        System.out.println("minumum element position in array-  "+minElPosition);
       int result = binarySearch(arr, 0, minElPosition, x);
       if(result==-1) {
           result = binarySearch(arr, minElPosition, arr.length-1, x);
       }
        System.out.println("Element position is -  "+result);
    }
    public static int binarySearch(int[] arr, int left, int right, int x){

          while(left<=right) {
              int mid = (left+right)/2;
              if(arr[mid] == x) {
                  return mid;
              } else if(arr[mid] < x) {
                  left = mid+1;
              } else {
                  right = mid-1;
              }
          }
          return -1;
    }
    private static int findMinimumElement(int[] arr) {
        int left=0, right=arr.length-1;
        while(left<right) {
            int mid = (left+right)/2;
            if(arr[mid]<arr[right]) {
                right = mid;
            } else {
                left = mid +1;
            }
        }
        return left;
    }

    /**
     * Time Complexity - O(n)
     * Space Complexity - O(1)
     * @param arr
     * @param x
     * @return
     */
    private static int bruteForceMethod(int[] arr, int x) {
        for(int i=0;i< arr.length;i++) {
            if(arr[i]==x) {
                return i;
            }
        }
        return -1;
    }
}
