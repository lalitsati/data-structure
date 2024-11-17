package com.programe.datastructure.assignments.nov9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColumnSumMatrix {
    public static void main(String[] args) {
        /**
         * Q1. Column Sum
         *
         * Problem Description
         * You are given a 2D integer matrix A, return a 1D integer array containing column-wise
         * sums of original matrix.
         *
         * Problem Constraints
         * 1 <= A.size() <= 103
         * 1 <= A[i].size() <= 103
         * 1 <= A[i][j] <= 103
         *
         * Example Input
         * Input 1:
         * [1,2,3,4]
         * [5,6,7,8]
         * [9,2,3,4]
         *
         * Output 1:
         * {15,10,13,16}
         */
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(5,6,7,8));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(9,2,3,4));
        matrix.add(list);

        printMatrix(matrix);
        printResult(solve( matrix));

    }


    /**
     *
     * @param matrix
     * @return
     */
    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<matrix.get(0).size();i++) {
            int sum=0;
            for(int j=0;j<matrix.size();j++) {
                sum += matrix.get(j).get(i);
            }
            result.add(sum);
        }
        return result;
    }


    /**
     * Print Result One daiamationed array
     * @param list
     */
    private static void printResult(ArrayList<Integer> list) {
        System.out.print("\n\nSum of Each Column -");
        for(int i:list) {
            System.out.print(i+",");
        }
        System.out.println();
    }

    /**
     * print whole matrix
     * @param matrix
     */
    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for(int i=0;i<matrix.size();i++) {
            for(int j=0;j<matrix.get(i).size();j++) {
                System.out.print(matrix.get(i).get(j)+",");
            }
            System.out.println();
        }
    }
}
