package com.programe.datastructure.assignments.Nov14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoMatrices {
    public static void main(String[] args) {
        /**
         * Q4. Add the matrices
         * Problem Description
         *
         * You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
         * Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.
         *
         * The Following will give you an idea of matrix addition:
         *
         * Problem Constraints
         * 1 <= A.size(), B.size() <= 1000 1 <= A[i].size(), B[i].size() <= 1000 1 <= A[i][j], B[i][j] <= 1000
         *
         * Example Input -
         * Input 1:
         * A = [[1, 2, 3],
         *      [4, 5, 6],
         *      [7, 8, 9]]
         *
         * B = [[9, 8, 7],
         *      [6, 5, 4],
         *      [3, 2, 1]]
         *
         * Output -
         * [[10, 10, 10],
         *  [10, 10, 10],
         *  [10, 10, 10]]
         */
        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<>();
        matrix1.add(new ArrayList<>(List.of(1, 2, 3)));
        matrix1.add(new ArrayList<>(List.of(4, 5, 6)));
        matrix1.add(new ArrayList<>(List.of(7, 8, 9)));
        printMatrix(matrix1);

        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<>();
        matrix2.add(new ArrayList<>(List.of(9,8,7)));
        matrix2.add(new ArrayList<>(List.of(6,5,4)));
        matrix2.add(new ArrayList<>(List.of(3,2,1)));
        printMatrix(matrix2);

        printMatrix(solve(matrix1,matrix2));


    }

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> matrix1,
                                               ArrayList<ArrayList<Integer>> matrix2) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0;i<matrix1.size();i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<matrix1.get(i).size();j++) {
                list.add(matrix1.get(i).get(j)+matrix2.get(i).get(j));
            }
            result.add(list);
        }
        return result;
    }

    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix){
        System.out.print("\n[\n");
        for(int i=0;i<matrix.size();i++) {
            System.out.print("[");
            for(int j=0;j<matrix.get(i).size();j++) {
                System.out.print(matrix.get(i).get(j)+",");
            }
            System.out.print("]\n");
        }
        System.out.print("]");
    }
}
