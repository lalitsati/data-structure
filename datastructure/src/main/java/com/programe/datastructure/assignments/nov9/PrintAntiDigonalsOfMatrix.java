package com.programe.datastructure.assignments.nov9;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintAntiDigonalsOfMatrix {
    public static void main(String[] args) {
        /**
         * This class giving 3 or more questions -
         * 1. principal Diagonal - for principal diagonal matrix should be in squire safe (N*N)
         * 2. Anti Diagonal  - if we are taking about only one anti-diagonal then matrix also should be in squire safe (N*N)
         * 3. All the Digonals from left to right - it can be multiple Diagonals
         * 4. All the Digoanls from right to left -
         *
         *
         *
         *
         * Q3. Anti Diagonals
         *
         * Problem Description
         * Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
         *
         * Problem Constraints
         * 1<= N <= 1000
         * 1<= A[i][j] <= 1e9
         *
         * Input 1:
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * Output 1:
         * 1 0 0
         * 2 4 0
         * 3 5 7
         * 6 8 0
         * 9 0 0
         *
         * Explaination -
         * The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0
         * making the row as [1, 0, 0].
         * The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the
         * row as [2, 4, 0].
         * The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the
         * row as [3, 5, 7].
         * The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the
         * row as [6, 8, 0].
         * The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the
         * row as [9, 0, 0].
         *
         *
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

        printMatrix(matrix);
        principalDiagonal(matrix);
        antiDiagonal(matrix);
        printMatrix(allDiagonals(matrix));

    }


    public static ArrayList<ArrayList<Integer>> allDiagonals(ArrayList<ArrayList<Integer>> matrix) {
        /**
         * How many Diagonals can be in a matrix let's check -
         * 1,2,3
         * 4,5,6
         * 6,7,8
         *
         * Diagonals -
         *  1
         *  2,4
         *  3,5,6
         *  6,7
         *  8
         *  Note - matrix can any size (N*M)  (N- size of rows, M- size of Columns)
         *  Count of all Diagonals - N+M-1
         *
         * i-representing row, and j-representing col
         */
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        getPrincipalFace(matrix,result);
        getAntiFace(matrix,result);
        return result;
    }

    /**
     * Print all the element antiface
     * @param matrix
     * @param result
     * @return
     */
    private static ArrayList<ArrayList<Integer>> getAntiFace(ArrayList<ArrayList<Integer>> matrix,
                                                             ArrayList<ArrayList<Integer>> result) {
        int rows= matrix.size();
        int cols = matrix.get(0).size();
        //print anti-diagonal -
       int n = rows-1;
        while(n>0) {
            ArrayList<Integer> list = new ArrayList<>();
            int count=0;
            for(int i=rows-n, j=cols-1 ;i<rows;i++,j--) {
                list.add(matrix.get(i).get(j));
                count++;

            }
            while(count<cols) {
                list.add(0);
                count++;
            }
            result.add(list);
            n--;
        }
        return result;

    }

    /**
     * Print all the principle element
     * @param matrix
     * @param result
     * @return
     */
    private static ArrayList<ArrayList<Integer>> getPrincipalFace(ArrayList<ArrayList<Integer>> matrix,
                                         ArrayList<ArrayList<Integer>> result) {
        int rows= matrix.size();
        int cols = matrix.get(0).size();
        int n = cols;
        while(n>0) {
            ArrayList<Integer> list = new ArrayList<>();
            int count=0;
            for(int i=0, j=cols-n;j>=0 && i<rows;j--,i++) {
                list.add(matrix.get(i).get(j));
                count++;
            }
            while(count<cols) {
                list.add(0);
                count++;
            }
            result.add(list);
            n--;
        }
        return result;
    }


    /**
     * O(N)
     * @param matrix
     */
    public static void antiDiagonal(ArrayList<ArrayList<Integer>> matrix){
        int n = matrix.size();
        System.out.print("\nAnti-Diagonal Elements - [");
        for(int i=0,j=n-1;i<n;i++,j--) {
            System.out.print(matrix.get(i).get(j)+",");
        }
        System.out.print("]");
    }

    /**
     * O(N)
     * @param matrix
     */
    public static void principalDiagonal(ArrayList<ArrayList<Integer>> matrix){
            System.out.print("\nPrincipal Diagonal - [");
            for(int i=0;i<matrix.size();i++) {
                System.out.print(matrix.get(i).get(i)+",");
            }
        System.out.print("]");
    }




    /**
     * print whole matrix
     * @param matrix
     */
    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
       System.out.print("\n\n");
        for(int i=0;i<matrix.size();i++) {
            for(int j=0;j<matrix.get(i).size();j++) {
                System.out.print(matrix.get(i).get(j)+",");
            }
            System.out.println();
        }
    }
}
