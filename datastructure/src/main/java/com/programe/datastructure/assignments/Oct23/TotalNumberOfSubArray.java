package com.programe.datastructure.assignments.Oct23;

import java.util.ArrayList;
import java.util.Arrays;

public class TotalNumberOfSubArray {

    public static void main(String[] args) {

        /**
         * Sub-Array is called continues part of an array
         * How many subArray can in array - N(N+1)/2
         *
         * Example of an array - [-7, 1, 5, 2, -4, 3, 0]
         * subArray -
         * [-7]
         * [-7,1]
         * [-7,1,5]
         * ----
         * ---
         * --
         * [-7, 1, 5, 2, -4, 3, 0]
         * [1]
         * [1,5]
         * [1,5,2]
         * ----
         * ---
         * [1, 5, 2, -4, 3, 0]
         * [5]
         * [5,2]
         * ----
         * ----
         * [ 5, 2, -4, 3, 0]
         * [2]
         * [2,-4]
         * -----
         * ----
         * [2, -4, 3, 0]
         * [-4]
         * [-4,3]
         * [-4, 3, 0]
         * ---
         * --
         * [0]
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(-7, 1, 5, 2, -4, 3, 0));
        findAllSubArray(list);

    }

    public static void findAllSubArray(ArrayList<Integer> list){

        int n = list.size();
        int count=0;
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++){
                count++;
                printSubArray(list, i,j);
            }
        }
        int count1 = (n*(n+1))/2;
        System.out.printf("\nTotal Number of SubArray - {%d} ---- {%d}",count,count1);
    }

    /**
     * print sum array (O(N))
     * @param list
     * @param start
     * @param end
     */
    public static void printSubArray(ArrayList<Integer> list, int start, int end){
        System.out.print("\n[");
        while(start<=end) {
            System.out.print(list.get(start)+",");
            start++;
        }
        System.out.print("]");
    }

}
