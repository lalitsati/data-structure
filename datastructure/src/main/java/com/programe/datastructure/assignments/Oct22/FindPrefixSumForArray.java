package com.programe.datastructure.assignments.Oct22;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPrefixSumForArray {

    public static void main(String[] args){

        /**
         * Q7. In-place Prefix Sum
         * Problem Description
         * Given an array A of N integers. Construct prefix sum of the array in the given array itself.
         *
         * Problem Constraints
         * 1 <= N <= 105
         * 1 <= A[i] <= 103
         *
         * Example Input
         * Input :
         * A = [1, 2, 3, 4, 5]
         * Output -
         * [1, 3, 6, 10, 15]
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(4, 3, 2));
        printArr(findPrefixArray(list));

    }

    /**
     * Return prefix array
     * @param list
     */
    private static ArrayList<Integer> findPrefixArray(ArrayList<Integer> list) {
        for(int i=1;i<list.size();i++) {
            list.set(i, (list.get(i-1)+list.get(i)));
        }
        return list;
    }


    public static void printArr(ArrayList<Integer> list){
        for(int i : list) {
            System.out.printf("%d,",i);
        }

    }
}
