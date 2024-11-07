package com.programe.datastructure.assignments.nov5;


import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort{

    public static void main(String[] args) {
        /**
         * Selection Sort - to pick one element and placed it his right position (selection integer and placed it
         * at right location)
         * for example suppose we need to arrange data in ascending order then pick smaller number and placed it first
         * position of an array and so on.....
         *
         * [5,2,3,1,8,6,0,-10]   - selection integer is -10 and placed it at first position and so on
         *    [-10,2,3,1,8,6,0,5]  - select next smallest integer - 0
         *       [-10,0,3,1,8,6,2,5]  - select next smallest integer - 1
         *         [-10,0,1,3,8,6,2,5] - select next smallest integer - 2
         *           [-10,0,1,2,8,6,3,5] - select next smallest integer - 3
         *              [-10,0,1,2,3,6,8,5] - select next smallest integer - 5
         *                 [-10,0,1,2,3,5,8,6] - select next smallest integer - 6
         *                    [-10,0,1,2,3,5,6,8] - whooop now my array is sorted
         *
         *  TC - O(N^2)
         *  SC - O(1)
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(5,2,3,1,8,6,0,-10));
        System.out.print("\nBefore Sorting !!!");
        printArr(list);
        selectionSort(list);
        System.out.print("\nAfter Sorting !!!");
        printArr(list);
    }

    private static void selectionSort(ArrayList<Integer> list) {
        //traverse array from first element to nth element
        //find every time of loop minimum element from array
        //pick it and swap with ith element
        System.out.print("\n---------------------");
        int n = list.size();
        for(int i=0;i<n-1;i++) {
            int minIndex=i;
            for(int j=i+1;j<n;j++) {
                if(list.get(j)<list.get(minIndex)) {
                    minIndex = j;
                }
            }
            int tmp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, tmp);
            printArr(list);
        }
        System.out.print("\n-------------------------");
    }

    public static void printArr(ArrayList<Integer> list){
        System.out.print("\n[");
        for(int i : list) {
            System.out.print(i+",");
        }
        System.out.print("]");
    }
}

