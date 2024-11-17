package com.programe.datastructure.assignments.nov9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinorDiagonalSum {
    public static void main(String[] args) {
        /**
         * Q2. Minor Diagonal Sum
         * Problem Description
         * You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
         *
         * Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1
         * (where i, j are 1-based).
         *
         * Problem Constraints
         * 1 <= N <= 103
         * -1000 <= A[i][j] <= 1000
         *
         * Example Input -
         * Input 1:
         *  A = [[1, -2, -3],
         *       [-4, 5, -6],
         *       [-7, -8, 9]]
         *  Output 1:
         *  -14
         *
         */
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, -2, -3));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(-4, 5, -6));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(-7, -8, 9));
        matrix.add(list);

        System.out.print("Min Sum of Diagonal - "+solve(matrix));
        solve(matrix);
    }

    public static int solve(final List<ArrayList<Integer>> matrix) {
        //find out all the Diagonal
        int rows=matrix.size();
        int cols=matrix.get(0).size();
       int n=0;
       int mainSum =Integer.MAX_VALUE;
        while(n<cols) {
            int sum=0;
            int i=0, j=n;
            while(j>=0) {
                sum += matrix.get(i).get(j);
                j--;i++;
            }
            if(sum< mainSum){
                mainSum = sum;
            }
            n++;
        }
         n=1;
        while(n<rows) {
            int sum=0;
            int i=n, j=cols-1;
            while(i<rows) {
                sum += matrix.get(i).get(j);
                j--;i++;
            }
            if(sum< mainSum) {
                mainSum =sum;
            }
            n++;
        }
        return mainSum;
    }
}
