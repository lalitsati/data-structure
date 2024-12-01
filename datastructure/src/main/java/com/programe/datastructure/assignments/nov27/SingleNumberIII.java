package com.programe.datastructure.assignments.nov27;

import java.util.*;

public class SingleNumberIII {
    public static void main(String[] args) {
        /**
         * Q1. Single Number III
         *
         * Problem Description
         * Given an array of integers, every element appears thrice except for one, which occurs once.
         * Find that element that does not appear thrice.
         * NOTE: Your algorithm should have a linear runtime complexity.
         * Could you implement it without using extra memory?
         *
         *
         * Problem Constraints
         * 2 <= A <= 5*10^6
         * 0 <= A <= INTMAX
         *
         * Example -
         * Input 1:
         *  A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
         *Output - 4
         * Explanation -
         * 4 occurs exactly once in Input 1.
         *
         */
       List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 3, 3, 2, 2, 3, 1, 1));
        System.out.print("\n Brute Force 1 - "+bruteForce(list));
        System.out.print("\n optimizedApproachUsingBitM - "+optimizedApproachUsingBitM(list));

    }

    /**
     *
     * @param list
     * @return
     */
    private static int optimizedApproachUsingBitM(List<Integer> list) {

        /**
         *          [5,7,5,9,7,11,11,7,5,11]
         *          5   -   0   0   0   1   0   1
         *          7   -   0   0   0   1   1   1
         *          5   -   0   0   0   1   0   1
         *          9   -   0   0   1   0   0   1
         *          7   -   0   0   0   1   1   1
         *          11  -   0   0   1   0   1   1
         *          11  -   0   0   1   0   1   1
         *          7   -   0   0   0   1   1   1
         *          5   -   0   0   0   1   0   1
         *          11  -   0   0   1   0   1   1
         * ---------------------------------------------------------------------------
         *                 (0   0   4   6   6   10)%3
         * ---------------------------------------------------------------------------
         *                  0   0   1   0   0   1  =  ANS = 9  (Unique number is 9)
         * ----------------------------------------------------------------------------
         *
         */

        int i=0, n=list.size();
        int result=0;

        while(i<32) {

            int sum=0;
            for(int j : list) {
                if((j&(1<<i))>0) {
                    sum +=1;
                }
            }
            result |= (sum%3<<i);
            i++;
        }
        return result;
    }




    /**
     * we will store count of each element in map and then check the map value is it equal to 1
     * TC = N
     * @param list
     * @return
     */
    public static int bruteForce(final List<Integer> list) {
        Map<Integer, Integer> existence = new HashMap<>();
        int n = list.size();
        for(var current : list) {
            existence.put(current, existence.getOrDefault(current, 0) + 1);
        }

       //find the count 1 element -
        for (var entry : existence.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
