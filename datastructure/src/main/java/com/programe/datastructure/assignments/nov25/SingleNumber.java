package com.programe.datastructure.assignments.nov25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleNumber {
    public static void main(String[] args) {
        /**
         * Q2. Single Number
         * Problem Description--
         * Given an array of integers A, every element appears twice except for one. Find that integer that
         * occurs once.
         *
         * NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using
         * extra memory?
         *
         * Problem Constraints
         * 1 <= |A| <= 2000000
         * 0 <= A[i] <= INTMAX
         *
         * Example Input -
         * Input 1:
         *  A = [1, 2, 2, 3, 1]
         *  Output1 - 3
         *  Explanation 1: 3 occurs once.
         *
         */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1));
        System.out.print("unique number in list - "+singleNumber(list));
    }

    public static int singleNumber(final List<Integer> list) {
        int n=list.size();
        int result=0;
        for(int i=0;i<n;i++) {
            result ^=list.get(i);
        }
        return result;
    }
}
