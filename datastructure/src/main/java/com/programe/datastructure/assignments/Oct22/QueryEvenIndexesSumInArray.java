package com.programe.datastructure.assignments.Oct22;

import java.util.ArrayList;
import java.util.Arrays;

public class QueryEvenIndexesSumInArray {

    public static void main(String[] args) {

        /**
         * Given an array, of size N, & Q query, return sum of all even indexes element form L to R
         * Example - [2,3,1,6,4,5]
         * L    R
         * 1    3
         * 2    5
         * 0    4
         * 3    3
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
        calculateEvenIndeexQuery(list, query);
    }

    public static void calculateEvenIndeexQuery(ArrayList<Integer> list,
                             ArrayList<ArrayList<Integer>> query) {
        //create even prefix array
        ArrayList<Integer> evenPrefix = new ArrayList<>();
        evenPrefix.add(list.get(0));
        for(int i=1;i<list.size();i++) {
            if(i%2==0) {
                evenPrefix.add(evenPrefix.get(i-1)+list.get(i));
            } else {
                evenPrefix.add(evenPrefix.get(i-1));
            }
        }

        //Find even element sum as per given query -
        for(int i=0;i<query.size();i++) {
            int l = query.get(i).get(0);
            int r = query.get(i).get(1);
            int sum=0;
            if(l==0) {
                sum = evenPrefix.get(r);
            } else {
                sum = evenPrefix.get(r)-evenPrefix.get(l-1);
            }
            System.out.printf("\nSum of Indexes - [%d][%d] --- {%d}",l, r
            ,sum);
        }

    }



    public static void printArr(ArrayList<Integer> list){
        for(int i:list) {
            System.out.print(i+",");
        }
    }
}
