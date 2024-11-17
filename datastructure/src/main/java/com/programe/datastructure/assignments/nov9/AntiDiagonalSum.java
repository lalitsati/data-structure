package com.programe.datastructure.assignments.nov9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AntiDiagonalSum {
    public static void main(String[] args) {
        /**
         * Q2. Anti Diagonal Sum
         *
         * Input 1:
         *
         *  A = [[1, -2, -3],
         *       [-4, 5, -6],
         *       [-7, -8, 9]]
         *
         *  Output 1:
         *  -5
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

        System.out.print("Sum of Anti Diagonal Matrix - "+solve(matrix));

    }

    public static int solve(final List<ArrayList<Integer>> matrix) {
        int sum =0;
        int j = matrix.get(0).size()-1;
        for(int i=0;i<matrix.size();i++) {
            sum += matrix.get(i).get(j);
            j--;
        }
        return sum;
    }
}
