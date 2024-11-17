package com.programe.datastructure.assignments.nov9;

import java.util.ArrayList;
import java.util.Arrays;

public class MatrixProblem1 {
    public static void main(String[] args) {
        /**
         * Q1. Matrix Scalar Product
         *
         * Problem Description
         * You are given a matrix A and  an integer B, you have to perform scalar multiplication of matrix A
         * with an integer B.
         *
         * Problem Constraints
         * 1 <= A.size() <= 1000
         * 1 <= A[i].size() <= 1000
         * 1 <= A[i][j] <= 1000
         * 1 <= B <= 1000
         *
         * Example Input
         *
         * Input 1:
         * A = [[1, 2, 3],
         *      [4, 5, 6],
         *      [7, 8, 9]]
         * B = 2
         *
         * Output 1:
         * [[2, 4, 6],
         * [8, 10, 12],
         * [14, 16, 18]]
         *
         */
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(4,5,6));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(7,8,9));
        matrix.add(list);

        int b=2;
        solve(matrix, b);
        printMatrix(matrix);

    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> matrix, int b) {
        for(int i=0;i<matrix.size();i++) {
            for(int j=0;j<matrix.get(i).size();j++) {
                matrix.get(i).set(j, matrix.get(i).get(j)*b);
            }
        }
        return matrix;
    }

    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix){
        System.out.print("\n\n");
        for(int i=0;i<matrix.size();i++) {
            for(int j=0;j<matrix.get(i).size();j++) {
                System.out.print(matrix.get(i).get(j)+"\t");
            }
            System.out.println();
        }
    }
}
