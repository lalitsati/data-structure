package com.programe.datastructure.arrays.sorting;

public class Sort012 {

    public static void main(String[] args) {

        /**
         * Sort 0,1,2
         * Given an array containing 0's, 1's and 2's Sort the array.
         * Note - You can't use any library function.
         * - Traverse array only once.
         *
         * Sample input -
         * arr = {0,1,1,0,2,1,0,2,0,2,1}
         * Sample Out -
         * arr = {0,0,0,0,1,1,1,1,2,2,2}
         */

        int[] arr = {2,2,2,2,2,2,1,1,1,1,1,1,0,0,0,0,0,0};
        System.out.print("\n Print array before Sorting - ");
        printArray(arr);
        /*approach1TraverseTwoTime(arr);
        System.out.print("\n Print array after Sorting Approach1 - ");
        printArray(arr);*/

        approach2TraverseOneTime(arr);
        System.out.print("\n Print array after Sorting Approach2 - ");
        printArray(arr);


    }


    /**
     * Traverse only one time
     * @param arr
     */
    private static void approach2TraverseOneTime(int[] arr) {
        int i=0, j=0, k= arr.length-1;

        while(i<=k) {
            if(arr[i]==0) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j++;
            } else if(arr[i]==1) {
                i++;
            } else {
                int tmp = arr[i];
                arr[i] = arr[k];
                arr[k] = tmp;
                k--;
            }
        }
    }

    /**
     * Traverse count = 2
     * Time Complexity =  O(n)
     * @param arr
     */
    private static void approach1TraverseTwoTime(int[] arr) {
        //count 0,1,2 in array
        int zeroCount=0, oneCount=0;
        for(int i:arr) {
            if(i==0) {
                zeroCount++;
            } else if(i==1) {
                oneCount++;
            }
        }
        //set 0,1,2 value as per count
        for(int i=0;i< arr.length;i++) {
            if(zeroCount-->0) {
                arr[i]=0;
            } else if(oneCount-->0) {
                arr[i]=1;
            } else {
                arr[i]=2;
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
