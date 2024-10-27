package com.programe.datastructure.assignments.Oct18;

import java.util.ArrayList;
import java.util.Arrays;

public class MultipleOccurence {

    public static void main(String[] args) {

        /**
         * Q1. Linear Search - Multiple Occurences
         * Problem Description
         * Given an array A and an integer B, find the number of occurrences of B in A.
         *
         * Problem Constraints
         * 1 <= B, Ai <= 109
         * 1 <= length(A) <= 105
         *
         * Example Input
         * Input 1:
         *  A = [1, 2, 2], B = 2
         *Explanation 1:
         * Element at index 2, 3 is equal to 2 hence count is 2.
         *
         *
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2, 1, 2));
        int b=2;
        System.out.printf("Occurence of %d is - {%d}",b,solve(list, b));

    }


    public static int solve(ArrayList<Integer> list, int b) {
        int count=0;
        for(int i=0;i<list.size();i++) {
            if(list.get(i)==b) {
                count++;
            }
        }
        return count;
    }
}
