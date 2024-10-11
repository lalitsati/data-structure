package com.programe.datastructure.arrays.binarysearch;

public class FindElementInSorted2DArray {

    public static void main(String[] args) {

        /**
         * Find Element in Sorted 2D Array --
         * Given a row-wise and column-wise sorted matrix and a target check if targer is present in the matrix
         * <p>
         * Sample input -
         * matrix = {
         *     {1,4,6,8,10},
         *     {2,7,9,12,15},
         *     {3,11,20,22,24},
         *     {5,16,25,30,40}
         * }
         * <p>
         * Target = 11
         * Sample Output - true [3,2]
         *
         **/

        int[][] matrix = {
                {1,4,6,8,10},
                {2,7,9,12,15},
                {3,11,20,22,24},
                {5,16,25,30,40}
        };
        int row=4, col=5;
        int k=111;
        bruteForceApproach(matrix, row, col, k);
        binarySearchApproach(matrix, k, row, col);
    }


    /**
     * Time Complexity - O(row+col)
     * Space complexity - O(1)
     * @param matrix
     * @param k
     * @param row
     * @param col
     */
    public static void binarySearchApproach(int[][] matrix, int k,
                                            int row, int col){

        //assign row and cols values
        int i=0, j=col-1;
        boolean flag=true;
        while(i<row && j<col) {
            if(matrix[i][j]==k) {
                System.out.printf("\n binarySearchApproach - Found, Indexes are - [%d,%d]",i,j);
                flag=false;
                break;
            }
            if(k<matrix[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        if(flag) {
            System.out.println("\n binarySearchApproach - Not Found !!!!");
        }
    }


    /**
     * Time Complexity - O(n*m)
     * Space Complexity - O(1)
     * @param matrix
     * @param row
     * @param col
     * @param k
     */
    public static void bruteForceApproach(int[][] matrix, int row, int col, int k){
        boolean flag=true;
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                if(matrix[i][j]==k){
                    System.out.printf("\n bruteForceApproach - Number found at location - [%d,%d]",i,j);
                    flag = false;
                }
            }
        }
        if(flag) {
            System.out.print("\n bruteForceApproach - Not Found !!!!");
        }
    }
}