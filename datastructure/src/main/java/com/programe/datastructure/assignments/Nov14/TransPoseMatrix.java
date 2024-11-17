package com.programe.datastructure.assignments.Nov14;

import java.util.ArrayList;
import java.util.Arrays;

public class TransPoseMatrix {
    public static void main(String[] args) {
        /**
         * TransPose Matrix - convert row to cols and cols to rows
         */
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(5,6,7,8));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(9,10,11,12));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(13,14,15,16));
        matrix.add(list);

        printMatrix(matrix);
       transPoseMatrix(matrix);
        System.out.println("\n\nAfter Transpose ");
        printMatrix(matrix);

        optimizedSolution(matrix);
        System.out.println("\n\nAfter Optimized ");
        printMatrix(matrix);

    }

    private static void optimizedSolution(ArrayList<ArrayList<Integer>> matrix) {
        int n=matrix.size();
        for(int i=0;i<=n-2;i++) {
            for(int j=i+1;j<=n-1;j++) {
                int tmp = matrix.get(i).get(j);
                matrix.get(i).set(j, matrix.get(j).get(i));
                matrix.get(j).set(i, tmp);
            }
        }
    }


    /**
     *
     * @param matrix
     */
    private static void transPoseMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for(int i=0;i<matrix.size();i++) {
            for(int j=i;j<matrix.get(i).size();j++) {
                int tmp = matrix.get(i).get(j);
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
