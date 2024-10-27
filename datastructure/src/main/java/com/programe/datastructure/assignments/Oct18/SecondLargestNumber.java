package com.programe.datastructure.assignments.Oct18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondLargestNumber {

    public static void main(String[] args) {

        /**
         * Problem Description
         * You are given an integer array A. You have to find the second largest element/value in the array
         * or report that no such element exists.
         *
         * Problem Constraints
         * 1 <= |A| <= 105
         * 0 <= A[i] <= 109
         *
         * Example Input
         * Input 1:
         *  A = [2, 1, 2]
         *  Example Output
         * Output : 1
         *
         * Input 2:
         *  A = [2]
         *  Output 2:
         *  -1
         *
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2, 1, 2));
        System.out.printf("Second largest element in array - {%d}",solve(list));

    }

    public  static int solve(ArrayList<Integer> list) {
        //sort the array in ascending order
        Collections.sort(list);
        int n=list.size()-1;
        for(int i=n;i>=0;i--) {
            if(list.get(n)!=list.get(i)) {
                return list.get(i);
            }
        }
        return -1;
    }
}
