package com.programe.datastructure.arrays.sorting;

public class Sort01 {

    public static void main(String[] args) {

        /**
         * Sort 0,1
         *
         * You are given an array of 0s and 1s in random order.
         * segregate 0s on left side and 1s on right side of the array
         * [Basically you have to sort the array]
         *
         * Note - Traverse array only once.
         *
         * Sample input
         * arr = {0,1,1,0,0,1,0,1,0}
         * Sample Output -
         * arr = {0,0,0,0,01,1,1,1}
         *
         */
        int arr[] = {1,1,1,1,1,1,1,0,0,0,0};
        System.out.print("\n Before Sorting : ");
        printArray(arr);
        //Approach 1 to traverse 2 times in array -
        /*approach1(arr);
        System.out.print("\n After Sorting Approach 1 : ");
        printArray(arr);*/

        //Approach 2 to optimize previous solution only one time traverse in array
        approach2(arr);
        System.out.print("\n After Sorting Approach 2 : ");
        printArray(arr);

    }


    /**
     * Approach 2 is only traverse one time in array and sort it
     * @param arr
     */
    public static void approach2(int[] arr) {
        //note position of found first 1 value in array
        int posOne = 0;
        for(int i=0;i< arr.length;i++) {
            if(arr[i]==0) {
                int tmp=arr[posOne];
                arr[posOne] = arr[i];
                arr[i] = tmp;
                posOne++;
            }
        }
    }

    /**
     * Traverse Count  - 2
     * @param arr
     */
    private static void approach1(int[] arr) {

        //count the number of 0 and 1;
        int count0=0, count1=0;
        for(int i : arr) {
            if(i==0) {
                count0++;
            } else {
                count1++;
            }
        }
        //add 0 in array first as per count and then add 1 for remaining
        for(int i=0;i< arr.length;i++) {
            if(count0>0) {
                arr[i] = 0;
                count0--;
            } else {
                arr[i] = 1;
            }
        }
    }


    /**
     * Soring Array
     * @param arr
     */
    public static void printArray(int[] arr){
        for(int i : arr) {
            System.out.print(i+",");
        }

    }

}
