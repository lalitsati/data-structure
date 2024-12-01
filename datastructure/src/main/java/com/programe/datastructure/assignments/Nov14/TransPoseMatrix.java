package com.programe.datastructure.assignments.Nov14;

import java.util.ArrayList;
import java.util.Arrays;

public class TransPoseMatrix {
    public static void main(String[] args) {
        /**
         * TransPose Matrix - convert row to cols and cols to rows
         *
         * [
         * [24,63,39,81,84,30],
         * [21,64,95,6,88,73],
         * [33,6,63,96,86,66],
         * [62,88,23,52,94,77],
         * [81,58,74,18,16,25],
         * [26,40,88,64,72,23],
         * [45,44,86,92,50,26],
         * [64,34,83,26,29,68],
         * [43,42,7,17,45,52],
         * [94,25,62,19,95,77]
         * ]
         */
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(9,10,11,12,13,14,15,16));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(17,18,19,20,21,22,23,24));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(25,26,27,28,29,30,31,32));
        matrix.add(list);


        printMatrix(matrix);
       /*transPoseMatrix(matrix);
        System.out.println("\n\nAfter Transpose ");
        printMatrix(matrix);*/

        /*optimizedSolution(matrix);
        System.out.println("\n\nAfter Optimized ");
        printMatrix(matrix);*/

        System.out.println("\n\nTranspose N X M sized matrix ");
        printMatrix(solve(matrix));

    }


    /**
     * Not sure wether row and cols counts are same or not
     * it means it is N X M matrix so in this case we have to take one extra space
     * @param matrix
     * @return
     */
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> matrix) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int rows= matrix.size();
        int cols = matrix.get(0).size();
        for(int i=0;i< cols;i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int j = 0; j <rows; j++) {
                tmp.add(matrix.get(j).get(i));
            }
            result.add(tmp);
        }
        return result;
    }



    /**
     * Algo - N X N matrix (row and cols should be same)
     * in this approach principal diagonal will be same on both matrix
     * we will, applying swaping only below of PD and Above of PD
     * that's the reason we will define j from i+1 because 00 element and n-1,n-1 element will be always set
     * @param matrix
     */
    private static void optimizedSolution(ArrayList<ArrayList<Integer>> matrix) {
        int n=matrix.size();
        int n1=matrix.get(0).size();
        for(int i=0;i<=n-2;i++) {
            for(int j=i+1;j<=n1-1;j++) {
                int tmp = matrix.get(i).get(j);
                matrix.get(i).set(j, matrix.get(j).get(i));
                matrix.get(j).set(i, tmp);
            }
        }
    }


    /**
     * Algo -
     * swap - ij to ji in matrix
     * @param matrix
     */
    private static void transPoseMatrix(ArrayList<ArrayList<Integer>> matrix) {
        int count=0;
        for(int i=0;i<matrix.size();i++) {
            for(int j=i;j<matrix.get(i).size();j++) {
                count++;
                int tmp = matrix.get(i).get(j);
                matrix.get(i).set(j, matrix.get(j).get(i));
                matrix.get(j).set(i, tmp);
            }
        }
        System.out.println("\nValue of count- "+count);
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
