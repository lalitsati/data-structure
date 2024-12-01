package com.programe.datastructure.assignments.nov27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoIntegersI {
    public static void main(String[] args) {
        /**
         * Q2. Single Number III
         *
         * Problem Description
         * Given an array of positive integers A, two integers appear only once, and all the other
         * integers appear twice.
         * Find the two integers that appear only once.
         * Note: Return the two numbers in ascending order.
         *
         * Problem Constraints
         * 2 <= |A| <= 100000
         * 1 <= A[i] <= 109
         *
         * Example Input 1 -
         * A = [1, 2, 3, 1, 2, 4]
         * Output -
         * [3, 4]
         * Explanation -
         * 3 and 4 appear only once.
         */
        List<Integer> list = Arrays.asList(2308,1447,1918,1391,2308,216,1391,410,1021,537,1825,1021,1729,669,216,1825,537,1995,805,410,805,602,1918,1447,90,1995,90,1540,1161,1540,2160,1235,1161,602,880,2160,1235,669);
        System.out.print("Both Unique Integers are - "+solve(list));
        solve(list);
    }


    public static ArrayList<Integer> solve(List<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        /**
         * [1,2,3,1,2,4]
         * 1. find sum of all XOR - as per question all element should be appear twice except two so XOR will be
         * those both number only
         * 3^4= 111
         * 2. find the set bit position in sumXOR value
         * pos = 0; (111 the 0th position is lest set bit)
         * 3. we will divide list in two parts as per position which having set bit one group and unset bit will
         * be another group
         * 4. take XOR for both individual group and find out both unique number
         *
         *
         *
         */
        int sumXOR = 0;
        for (int i : list) {
            sumXOR ^=i;
        }
        int pos=0;
        while(pos<32) {
            if((sumXOR&(1<<pos))>0) {
                break;
            }
        pos++;
        }

        int group1=0, group2=0;
        for(int i : list) {
            if((i&(1<<pos))>0){
                group1 ^=i;
            } else {
                group2 ^=i;
            }
        }

        result.add(Math.min(group2, group1)); result.add(Math.max(group2, group1));
        return result;
    }
}
