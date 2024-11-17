package com.programe.datastructure.assignments.nov9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainDiagonalSumOfMatrix {
    public static void main(String[] args) {
        /**
         * Q2. Main Diagonal Sum
         *
         * Problem Description
         * You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
         * Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
         *
         * Problem Constraints
         * 1 <= N <= 103
         * -1000 <= A[i][j] <= 1000
         *
         * Example Input -
         * 1 -2 -3
         * -4 5 -6
         * -7 -8 9
         * Output - 15
         */
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,-2,-3));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(-4,5,-6));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(-7,-8,9));
        matrix.add(list);
        System.out.print("\n Sum of all Digonals - "+solve(matrix));

    }

    /**
     *
     * @param matrix
     * @return
     */
    public  static int solve(final List<ArrayList<Integer>> matrix) {
        int sum=0;
        for(int i=0;i<matrix.size();i++) {
            sum += matrix.get(i).get(i);
        }
        return sum;
    }

}
