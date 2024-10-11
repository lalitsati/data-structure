package com.programe.datastructure.arrays.binarysearch;

public class RotateArrayFromOnePointer {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 7, 9, 11, 14, 15, 20, 22, 25};
        int k =4;
        System.out.println("Array before Rotate !! ");
        printArr(arr);
        reverseApproach(arr, k-1);

    }


    /**
     * Reverse Approach
     * @param arr
     * @param k
     */
    private static void reverseApproach(int[] arr, int k) {
        //first reverse the array;
        reverse(arr, 0, arr.length-1);
         System.out.println("\nAfter Reverse !! ");
        printArr(arr);
        //first half rotate
        reverse(arr, 0, arr.length-k-1);
         System.out.println("\nAfter Rotate first half !! ");
        printArr(arr);
        //Second half rotate
        reverse(arr, arr.length-k, arr.length-1);
         System.out.println("\nAfter Rotate Second half !! ");
        printArr(arr);
    }
    private static void reverse(int[] arr, int left, int right) {
        int tmp;
        while(left<right) {
            tmp=arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }


    /**
     * Print Array
     * @param arr
     */
    public static void printArr(int[] arr) {
        for(int i:arr) {
            System.out.print(i+",");
        }
    }

}