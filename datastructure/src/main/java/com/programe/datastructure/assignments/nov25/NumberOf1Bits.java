package com.programe.datastructure.assignments.nov25;

public class NumberOf1Bits {
    public static void main(String[] args) {
        /**
         * Q1. Number of 1 Bits
         * Problem Description
         * Write a function that takes an integer and returns the number of 1 bits present in its binary
         * representation.
         *
         * Problem Constraints
         * 1 <= A <= 109
         *
         * Input 1:
         * 11
         * Output 1:
         * 3
         * Explaination 1:
         * 11 is represented as 1011 in binary. so 1 bits are 3
         *
         *
         */
        int num = 11;
        System.out.print("Number of 1 Bits - "+numSetBits(num));

    }

    public  static int numSetBits(int num) {
        int count=0;
        while(num>0) {
            if((num&1)==1) {
                count++;
            }
            num >>=1;
        }
        return count;
    }
}
