package com.programe.datastructure.assignments.Nov14;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix90 {
    public static void main(String[] args) {

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
