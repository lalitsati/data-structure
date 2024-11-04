package com.programe.datastructure.assignments.Oct23;

import java.util.ArrayList;
import java.util.Arrays;

public class FindSubArrayInGivenRange {

    public static void main(String[] args) {

        /**
         * Q4. Subarray in given range
         * Problem Description
         * Given an array A of length N, return the subarray from B to C.
         *
         * Problem Constraints
         * 1 <= N <= 105
         * 1 <= A[i] <= 109
         * 0 <= B <= C < N
         *
         * Example Input
         * Input 1:
         * A = [4, 3, 2, 6]
         * B = 1
         * C = 3
         * Output 1:
         * [3, 2, 6]
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(4, 3, 2, 6));
        int a=1, b=3;
        printArray(generateSubArray(list, a, b));
    }

    /**
     *
     * @param list
     * @param x
     * @param y
     * @return
     */
    public static ArrayList<Integer> generateSubArray(ArrayList<Integer> list, int x, int y) {
        ArrayList<Integer> subArray = new ArrayList<>();
        while(x<=y){
            subArray.add(list.get(x++));
        }
        return subArray;
    }

    /**
     *
     * @param subArray
     */
    public static void printArray(ArrayList<Integer> subArray){
        System.out.print("\n[");
        for(int i : subArray) {
            System.out.print(i+",");
        }
        System.out.print("]");
    }
}
