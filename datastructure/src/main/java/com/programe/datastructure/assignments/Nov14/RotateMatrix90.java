package com.programe.datastructure.assignments.Nov14;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix90 {
    public static void main(String[] args) {

        /**
         * for 90 digree rotation any matrix we have to follow two steps
         * 1. we need to tranpose matrix (row to columns )
         * 2. reverse each row finally you will get rotate matrix (90 digree)
         */

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(6,7,8,9,10));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(11,12,13,14,15));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(16,17,18,19,20));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(21,22,23,24,25));
        matrix.add(list);

        System.out.print("\n\nStep 0 Matrix - \n");
        printMatrix(matrix);

        rotation90Digree(matrix);

    }

    private static void rotation90Digree(ArrayList<ArrayList<Integer>> matrix) {
        //step 1 transpose matrix -
        transposeMatrix(matrix);
        System.out.print("\nAfter Transpose Matrix - \n");
        printMatrix(matrix);

        //step 2 to reverse each row
        reverseRows(matrix);
        System.out.print("\nAfter Reverse each Rows - \n");
        printMatrix(matrix);

    }

    private static void reverseRows(ArrayList<ArrayList<Integer>> matrix) {
        for(int i=0;i<matrix.size();i++) {
            int x=0;
            int y=matrix.get(i).size()-1;
            while(x<y) {
                int tmp = matrix.get(i).get(x);
                matrix.get(i).set(x, matrix.get(i).get(y));
                matrix.get(i).set(y, tmp);
                x++;y--;
            }
        }


    }

    /**
     * TC - O(N^2)
     * @param matrix
     */
    private static void transposeMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for(int i=0;i<matrix.size();i++) {
            for(int j=i;j<matrix.get(i).size();j++) {
                int tmp=matrix.get(i).get(j);
                matrix.get(i).set(j, matrix.get(j).get(i));
                matrix.get(j).set(i, tmp);
            }
        }
    }


    private static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        System.out.print("\n[\n");
        for(int i=0;i<matrix.size();i++){
            System.out.print("[");
            for(int j=0;j<matrix.get(i).size();j++) {
                System.out.print(matrix.get(i).get(j)+"\t");
            }
            System.out.print("],\n");
        }
        System.out.print("]");
    }
}
