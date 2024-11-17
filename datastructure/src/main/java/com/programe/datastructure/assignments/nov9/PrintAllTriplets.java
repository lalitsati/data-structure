package com.programe.datastructure.assignments.nov9;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllTriplets {
    public static void main(String[] args) {
        /**
         * Q1. - Print the the triplets
         * Example -
         * Input: nums = [-1,2,1,-4]
         * Output -
         * [
         * -1,2,1
         * -1,2,-4
         * 2,1,-4
         * ]
         *
         * Input2 - nums = [1, 2, 4, 3]
         * Output -
         * [
         * 1,2,4
         * 1,2,3
         * 2,4,3
         * ]
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 4, 3));
        bruteForce(list);
    }

    /**
     * TC - O(N^3)
     * @param list
     */
    public static void bruteForce(ArrayList<Integer> list) {
        //find all the Triplets -
        int n=list.size();
        System.out.print("\n[");
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    System.out.println(list.get(i)+","+list.get(j)+","+list.get(k));
                }
            }
        }
        System.out.print("]");
    }
}
