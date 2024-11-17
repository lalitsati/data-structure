package com.programe.datastructure.assignments.nov9;

public class _2DMatrix {
    public static void main(String[] args) {
        /**
         * 2DMatrix - matrix is a spacific type of 2D array, where each number is an element
         * --- it is combination of rows and cols
         * How to define -
         *int[][] matrix = new int[3][3];
         */

        //print uppermost and right most element of matrix (3*3) matrix size -
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        printMatrix(matrix);
        printTopRowAndRightCols(matrix);

    }

   public static void printTopRowAndRightCols(int[][] matrix){
        for(int i=0;i<matrix[0].length;i++) {
            System.out.print(matrix[0][i]+",");
        }
        for(int i=1;i<matrix.length;i++) {
            System.out.print(matrix[i][matrix[i].length-1]+",");
        }

    }

    /**
     * Print whole matrix
     * @param matrix
     */
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
