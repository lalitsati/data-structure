package com.programe.datastructure.assignments.Oct18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseRangeInArray {

    public static void main(String[] args) {

        /**
         * Problem Description
         * Given an array A of N integers and also given two integers B and C. Reverse the elements of the
         * array A within the given inclusive range [B, C].
         *
         * Problem Constraints
         * 1 <= N <= 105
         * 1 <= A[i] <= 109
         * 0 <= B <= C <= N - 1
         *
         * Input Format
         * The first argument A is an array of integer.
         * The second and third arguments are integers B and C
         *
         * Output Format
         * Return the array A after reversing in the given range.
         *
         *
         * Example Input
         * Input 1:
         * A = [1, 2, 3, 4]
         * B = 2
         * C = 3
         *
         * Example Output
         * Output 1:
         * [1, 2, 4, 3]
         *
         * Sample Input - [1,2,3,1,1,3,4,6,4,6,3]
         */

        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(1,2,3,1,1,3,4,6,4,6,3));
        int a=3, b=9;
        System.out.print("\n\n\nPrint array before reverse of a part\n");
        printArray(arr);
        ArrayList<Integer> reverseSubArray = solve(arr,a,b);
        System.out.print("\n\n\nPrint array After reverse of a part\n");
        printArray(arr);
    }

    /**
     * Solution the reverse array
     * @param arr
     * @param a
     * @param b
     */
    public static ArrayList<Integer> solve(ArrayList<Integer> arr, int a, int b){

        while(a<b) {
                int tmp=arr.get(a);
                arr.set(a, arr.get(b));
                arr.set(b, tmp);
                a++;b--;

            }
        return arr;
    }

    /**
     * Print the array
     * @param arr
     */
    public static void printArray(List<Integer> arr){

        for(int i:arr) {
            System.out.print(i+",");
        }

    }
}
