package com.programe.datastructure.assignments.nov9;

import java.util.ArrayList;
import java.util.Arrays;

public class RowToColumnZero {
    public static void main(String[] args) {
        /**
         * Q5. Row to Column Zero
         *
         * Problem Description
         * You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0.
         * Specifically, make entire ith row and jth column zero.
         *
         * Problem Constraints
         * 1 <= A.size() <= 103
         * 1 <= A[i].size() <= 103
         * 0 <= A[i][j] <= 103
         *
         * Example Input
         * Input 1:
         * [1,2,3,4]
         * [5,6,7,0]
         * [9,2,0,4]
         *
         * Output 1:
         * [1,2,0,0]
         * [0,0,0,0]
         * [0,0,0,0]
         *
         */

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(51,21,90,38,57,12,11,1,68,60));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(81,24,63,97,75,70,23,91,39,84));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(0,21,97,12,46,48,50,3,57,69));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(44,8,42,34,99,0,98,10,53,67));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(23,34,43,86,31,18,9,54,61,48));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(90,61,21,87,26,67,88,28,70,45));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(98,14,5,92,1,4,44,99,67,98));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(18,42,32,61,80,64,32,89,70,93));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(89,61,7,10,0,85,29,40,13,0));
        matrix.add(list);

        list = new ArrayList<>();
        list.addAll(Arrays.asList(85,63,66,43,56,67,99,0,67,66));
        matrix.add(list);

        printMatrix(matrix);
        //bruteForce(matrix);
        //approach2(matrix);
        approach3(matrix);
        printMatrix(matrix);

    }

    /**
     * check all the rows which having 0 value and marke all the elements are negative
     * check all the cols which having 0 value and makred all the elements are negative
     * @param matrix
     */
    public static void approach3(ArrayList<ArrayList<Integer>> matrix){
        //traverse row
        int n=matrix.size();
        for(int i=0;i<n;i++) {
            boolean flag=false;
            for(int j=0;j<matrix.get(i).size();j++) {
                if(matrix.get(i).get(j)==0){
                    flag=true;
                    break;
                }
            }
            if(flag){
                for(int j=0;j<matrix.get(i).size();j++) {
                    if(matrix.get(i).get(j)>0) {
                        matrix.get(i).set(j, matrix.get(i).get(j)*-1);
                    }
                }
            }
        }

        //Traverse Cols -
        for(int i=0;i<n;i++) {
            boolean flag=false;
            for(int j=0;j<matrix.get(i).size();j++) {
                if(matrix.get(j).get(i)==0) {
                   flag=true;
                   break;
                }
            }
            if(flag) {
                for(int j=0;j<n;j++) {
                    if(matrix.get(j).get(i)>0) {
                        matrix.get(j).set(i, matrix.get(j).get(i)*-1);
                    }
                }
            }
        }
        markZero(matrix);

    }



    /**
     *
     * @param matrix
     */
    private static void approach2(ArrayList<ArrayList<Integer>> matrix) {
        //check rows wise zero -
        int n=matrix.size();
        for(int i=0;i<n;i++){
            boolean flag=false;
            int j=0;
            for(;j<matrix.get(i).size();j++) {
                if(matrix.get(i).get(j)==0) {
                    //set negative value for ith row
                    for(int k=0;k<matrix.get(i).size();k++) {
                        if(matrix.get(i).get(k)>0) {
                            matrix.get(i).set(k, matrix.get(i).get(k)*-1);
                        }
                    }
                    //set negative value for jth col
                    for(int k=0;k<matrix.size();k++) {
                        if(matrix.get(k).get(j)>0) {
                            matrix.get(k).set(j, matrix.get(k).get(j)*-1);
                        }
                    }
                }
            }
        }
        markZero(matrix);

    }


    private static void markZero(ArrayList<ArrayList<Integer>> matrix) {
        for(int i=0;i<matrix.size();i++) {
            for(int j=0;j<matrix.get(i).size();j++) {
                if(matrix.get(i).get(j)<0) {
                    matrix.get(i).set(j, 0);
                }
            }
        }
    }


    /**
     * Brute Force Appraach
     * @param matrix
     * @return
     */
    public static ArrayList<ArrayList<Integer>> bruteForce(ArrayList<ArrayList<Integer>> matrix) {
        for(int i=0;i<matrix.size();i++) {
            for(int j=0;j<matrix.get(i).size();j++) {
                if(matrix.get(i).get(j)==0) {
                    mark(matrix, i,j);
                }
            }
        }
        printMatrix(matrix);
        markZero(matrix);
        printMatrix(matrix);
        return matrix;
    }

    private static void mark(ArrayList<ArrayList<Integer>> matrix, int i, int j) {
        //Mark Horizantal

        for(int cols=0;cols<matrix.get(i).size();cols++) {
            if(matrix.get(i).get(cols)>0) {
                matrix.get(i).set(cols, matrix.get(i).get(cols)*-1);
            }
        }

        //Mark vartical
        for(int rows=0;rows<matrix.size();rows++) {
            if(matrix.get(rows).get(j)>0) {
                matrix.get(rows).set(j, matrix.get(rows).get(j)*-1);
            }
        }
    }

    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix){
        System.out.print("\n\nMatrix - \n");
        for(int i=0;i<matrix.size();i++) {
            for(int j=0;j<matrix.get(i).size();j++) {
                System.out.print(matrix.get(i).get(j)+"\t");
            }
            System.out.println();
        }
    }
}
