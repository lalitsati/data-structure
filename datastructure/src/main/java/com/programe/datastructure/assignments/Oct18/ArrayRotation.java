package com.programe.datastructure.assignments.Oct18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayRotation {

    public static void main(String args[]) {

        /**
         * Q3. Array Rotation
         * Problem Description
         * Given an integer array A of size N and an integer B, you have to return the same array after
         * rotating it B times towards the right.
         *
         * Problem Constraints
         * 1 <= N <= 105
         * 1 <= A[i] <=109
         * 1 <= B <= 109
         *
         * Input 1:
         * A = [1, 2, 3, 4]
         * B = 2
         * Output 1:
         * [3, 4, 1, 2]
         *
         * Input 2:
         * A = [2, 5, 6]
         * B = 1
         * Output 2
         * [6, 2, 5]
         *
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2, 5, 6));
        int b = 10;

        System.out.print("\n\nArray Before Rotate - \n");
        printArray(list);
        getRotateArray(list, b);
    }

    /**
     * Rotate Array as per Given Integer b
     * @param list
     * @param b
     */
    private static ArrayList<Integer> getRotateArray(ArrayList<Integer> list, int b) {
        b = b%list.size();
        //first reverse full array -
        reverse(list, 0,list.size()-1);
        System.out.print("\n\nAfter First Reverse - \n");
        printArray(list);

        //reverse from b to list size-1
        reverse(list, b,list.size()-1);
        System.out.print("\n\nAfter Second Reverse - \n");
        printArray(list);

        //reverse from 0 to list b-1
        reverse(list, 0,b-1);
        System.out.print("\n\nAfter Second Reverse - \n");
        printArray(list);

        return list;
    }

    public static void reverse(List<Integer> list, int x, int y)
    {
        while(x<y)  {
            int tmp = list.get(x);
            list.set(x, list.get(y));
            list.set(y, tmp);
            x++; y--;
        }

    }


    /**
     * Print List
     * @param list
     */
    public static void printArray(List<Integer> list){
        for(int i : list) {
            System.out.print(i+",");
        }
    }
}
