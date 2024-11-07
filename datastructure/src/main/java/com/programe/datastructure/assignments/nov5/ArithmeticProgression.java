package com.programe.datastructure.assignments.nov5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArithmeticProgression {
    public static void main(String[] args) {
        /**
         * Q1. Arithmetic Progression?
         * Problem Description
         * Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression,
         * otherwise return 0.
         * AP - A sequence of numbers is called an arithmetic progression if the difference between any two consecutive
         * elements is the same.
         *
         * Problem Constraints
         * 2 <= N <= 105
         * -109 <= A[i] <= 109
         *
         * Input 1:
         *  A = [3, 5, 1]
         *  Output - 1
         *  Explanation
         *   We can reorder the elements as [1, 3, 5] or [5, 3, 1] with differences 2 and -2 respectively, between
         *   each consecutive elements.
         *
         *
         *   Input 2:
         *  A = [2, 4, 1]
         *  Output - 0
         *  Explanation 2:
         *  There is no way to reorder the elements to obtain an arithmetic progression.
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2, 4, 1));
        System.out.printf("Is AP array - {%d}",solve(list));

    }

    public static int solve(ArrayList<Integer> list) {
        Collections.sort(list);
        int n = list.size();
        boolean flag=true;
        int apDigit=0;
        if(n>0){
            apDigit = list.get(1)-list.get(0);
        }
        for(int i=1;i<n-1;i++) {
            if(apDigit!=(list.get(i+1)-list.get(i))) {
                flag=false;
            }
        }
        if(flag) {
            return 1;
        }
        return 0;
    }
}
