package com.programe.datastructure.assignments.nov27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinXORValue {
    public static void main(String[] args) {
        /**
         * Q1. Min XOR value
         *
         * Problem Description
         * Given an integer array A of N integers, find the pair of integers in the array which have minimum
         * XOR value. Report the minimum XOR value.
         *
         * Problem Constraints
         * 2 <= length of the array <= 100000
         * 0 <= A[i] <= 10^9
         *
         * Example Input -
         * A = [0, 2, 5, 7]
         * Output - 2
         * Explanation -
         * 0 xor 2 = 2
         */
        List<Integer> list = Arrays.asList(1, 2, 3, 7);
        System.out.print("\n Brute Force Solution - " + bruteForceSolution(list));
        System.out.print("\n Brute Force Solution - " + optimizedSolution(list));

    }

    public static int optimizedSolution(List<Integer> list) {
        /**
         * 1. sort the array  (why sorting - in most of cases XOR value will be depends on its difference between two
         * integers) example - 4^6 always will be less then 4^7
         * 2. now find the minimum difference between 2 Integers
         * 3. return the XOR value of both
         *
         * NOte - this is not 100% solution just observation for most of the cases (still some case are in numeric
         * where no matter of differences example 1^2=3 and 1^3=2 ) which is conflict this solution
         */
        Collections.sort(list);
        int minimumXOR = Integer.MAX_VALUE;
        int n = list.size();
        for (int i = 0; i < n-1; i++) {
            int xorInt = list.get(i)^list.get(i+1);
            if(xorInt<minimumXOR) {
                minimumXOR = xorInt;
            }
        }
        return minimumXOR;
    }

    /**
     * TC - O(N^2)
     *
     * @param list
     * @return
     */
    public static int bruteForceSolution(List<Integer> list) {
        /**
         * 1. find all the combination of 2 size sub array -
         * 2. find the XOR value for all the combination
         * 3. compare each combination and put minimum value
         * 4. return this minimum value
         */
        int minimumXOR = Integer.MAX_VALUE;
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int iValue = list.get(i);
            for (int j = i + 1; j < n; j++) {
                int currentXOR = iValue ^ list.get(j);
                if (minimumXOR > currentXOR) {
                    minimumXOR = currentXOR;
                }
            }
        }
        return minimumXOR;
    }
}
