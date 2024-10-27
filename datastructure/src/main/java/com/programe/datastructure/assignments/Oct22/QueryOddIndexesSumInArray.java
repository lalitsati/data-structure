package com.programe.datastructure.assignments.Oct22;

import java.util.ArrayList;
import java.util.Arrays;

public class QueryOddIndexesSumInArray {

    public static void main(String[] args) {

        /**
         * Given an array, of size N, & Q query, return sum of all odd indexes element form L to R
         * Example - [2,3,1,6,4,5]
         * L    R
         * 1    3
         * 2    5
         * 0    4
         * 3    3
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,3,1,6,4,5));
        System.out.print("\nActual Array -\n");
        printArr(list);
        ArrayList<ArrayList<Integer>> query = new ArrayList<>();
        ArrayList<Integer> subQuery = new ArrayList<>();
        subQuery.addAll(Arrays.asList(1,3));
        query.add(subQuery);
        subQuery = new ArrayList<>();
        subQuery.addAll(Arrays.asList(2, 5));
        query.add(subQuery);
        subQuery = new ArrayList<>();
        subQuery.addAll(Arrays.asList(0, 4));
        query.add(subQuery);
        subQuery = new ArrayList<>();
        subQuery.addAll(Arrays.asList(3, 3));
        query.add(subQuery);
        calculateOddIndeexQuery(list, query);
    }

    private static void calculateOddIndeexQuery(ArrayList<Integer> list,
                                                ArrayList<ArrayList<Integer>> query) {

        //Find oddPrefix array first
        ArrayList<Integer> oddPrefix = new ArrayList<>();
        oddPrefix.add(0);
        for(int i=1;i<list.size();i++) {
            if(i%2!=0) {
                oddPrefix.add(oddPrefix.get(i-1)+list.get(i));
            } else {
                oddPrefix.add(oddPrefix.get(i-1));
            }
        }

        //find the Range sum for odd indexes -
        for(int i=0;i<query.size();i++) {

            int l = query.get(i).get(0);
            int r = query.get(i).get(1);
            int sum=0;
            if(l==0) {
                sum = oddPrefix.get(r);
            } else {
                sum = oddPrefix.get(r) - oddPrefix.get(l-1);
            }
            System.out.printf("\nSum of Odd Indexes - [%d][%d] --- {%d}", l,r,sum);
        }
    }


    /**
     * Print Array
     * @param list
     */
    public static void printArr(ArrayList<Integer> list){
        for(int i:list) {
            System.out.print(i+",");
        }
    }
}
