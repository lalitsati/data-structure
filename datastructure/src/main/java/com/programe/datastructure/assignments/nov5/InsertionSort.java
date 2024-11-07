package com.programe.datastructure.assignments.nov5;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        /**
         * Insertion Sort - Insert element in his right position for example if we have an array and selected element
         * is i'th element, before i'th elements are already sorting so we have to insert i'th element at his correct
         * location
         * [5,2,3,1,8,6,0,-10]  - i=0 and arr[i] = 5; before i index place 5 at his correct postion
         *    [5,2,3,1,8,6,0,-10]  - i=1 and arr[i] = 2; before i index place 2 at his correct position and so on
         *       [2,5,3,1,8,6,0,-10] - i=2 and arr[i] = 3;
         *          [2,3,5,1,8,6,0,-10] - i=3 and arr[i] = 1;
         *             [1,2,3,5,8,6,0,-10] - i=4 and arr[i] = 8;
         *                [1,2,3,5,8,6,0,-10] - i=5 and arr[i] = 6;
         *                   [1,2,3,5,6,8,0,-10] - i=6 and arr[i] = 0;
         *                      [0,1,2,3,5,6,8,-10] - i=7 and arr[i] = -10;
         *                         [-10,0,1,2,3,5,6,8 ]   - after Nth element traverse array now sorted
         *
         * TC - O(N^2)
         * SC - O(1)
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(5,2,3,1,8,6,0,-10));
        System.out.print("\nBefore Sorting !!!");
        printArr(list);
        insertionSort(list);
        System.out.print("\nAfter Sorting !!!");
        printArr(list);

    }

    /**
     *
     * @param list
     */
    private static void insertionSort(ArrayList<Integer> list ) {
        //traverse array form 0 to n-1
        //pick i'th element and compare it in his previous element till right position
        int n = list.size();
        for(int i=1;i<n;i++) {
            int j=i-1;
            int currentElement = list.get(i);
            while(j>=0 && list.get(j)>currentElement) {
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, currentElement);
        }
    }


    public static void printArr(ArrayList<Integer> list){
        System.out.print("\n[");
        for(int i : list) {
            System.out.print(i+",");
        }
        System.out.print("]");
    }
}
