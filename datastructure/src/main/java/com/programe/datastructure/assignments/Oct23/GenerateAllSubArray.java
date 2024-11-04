package com.programe.datastructure.assignments.Oct23;

import java.util.ArrayList;
import java.util.Arrays;

public class GenerateAllSubArray {

    public static void main(String[] args) {

        /**
         * Q5. Generate all subarrays
         * Problem Description
         * You are given an array A of N integers.
         * Return a 2D array consisting of all the subarrays of the array
         * Note : The order of the subarrays in the resulting 2D array does not matter.
         *
         * Problem Constraints
         * 1 <= N <= 100
         * 1 <= A[i] <= 105
         *
         * Example Input
         * Input 1:
         * A = [1, 2, 3]
         * Output 1:
         * [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
         *
         *
         * Input 2:
         * A = [5, 2, 1, 4]
         * Output 2:
         * [[1 ], [1 4 ], [2 ], [2 1 ], [2 1 4 ], [4 ], [5 ], [5 2 ], [5 2 1 ], [5 2 1 4 ] ]
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(5, 2, 1, 4));
        print2DArray(generateAllSubArray(list));

    }

    /**
     *  O(N^3)
     * @param list -
     * @return subArrays
     */
    private static ArrayList<ArrayList<Integer>> generateAllSubArray(ArrayList<Integer> list) {
        ArrayList<ArrayList<Integer>> subArrays = new ArrayList<>();
        int n = list.size();
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                subArrays.add(generateSubArray(list,i,j));
            }
        }
        return subArrays;
    }

    /**
     * O(N)
     * @param list
     * @param start
     * @param end
     * @return
     */
    public static ArrayList<Integer> generateSubArray(ArrayList<Integer> list, int start, int end){
        ArrayList<Integer> subArray = new ArrayList<>();
        while(start<=end) {
            subArray.add(list.get(start++));
        }
        return subArray;
    }


    /**
     * print 2D subArrays
     * @param subArrays
     */
    public static void print2DArray(ArrayList<ArrayList<Integer>> subArrays){
        for(int i=0;i<subArrays.size();i++) {
            System.out.print("\n[");
            for(int j=0;j<subArrays.get(i).size();j++) {
                System.out.print(subArrays.get(i).get(j)+",");
            }
            System.out.print("]");
        }

    }
}
