package com.programe.datastructure.assignments.nov9;

import java.util.ArrayList;
import java.util.Arrays;

public class RowSumOfMatrix {
    public static void main(String[] args) {
        /**
         * Q4. Row Sum
         *
         * Problem Constraints
         * 1 <= A.size() <= 103
         * 1 <= A[i].size() <= 103
         * 1 <= A[i][j] <= 103
         *
         * Example -
         * Input 1:
         * [1,2,3,4]
         * [5,6,7,8]
         * [9,2,3,4]
         * Output 1:
         * [10,26,18]
         */
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(5,6,7,8));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(9,2,3,4));
        matrix.add(list);

        printList(solve(matrix));


    }

    public static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<matrix.size();i++) {
            int sum=0;
            for(int j=0;j<matrix.get(i).size();j++) {
                sum +=matrix.get(i).get(j);
            }
            result.add(sum);
        }
        return result;
    }

    public static void printList(ArrayList<Integer> list){
           System.out.print("\nSum of earch row - [");
            for(int i : list) {
                System.out.print(i+",");
            }
            System.out.print("]");
    }
}
