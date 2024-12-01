package com.programe.datastructure.assignments.nov25;

public class SetBit {
    public static void main(String[] args) {
        /**
         * Q6. Set Bit
         * Problem Description -
         * You are given two integers A and B.
         * Set the A-th bit and B-th bit in 0, and return output in decimal Number System.
         * Note:
         * The bit positions are 0-indexed, which means that the least significant bit (LSB) has index 0.
         *
         * Problem Constraints
         * 0 <= A <= 30
         * 0 <= B <= 30
         *
         * Example Input -
         * A = 3
         * B = 5
         * Output - 40
         * Explanation -
         * The binary expression is 101000 which is 40 in decimal.
         *
         *
         */
        int a = 3;
        int b = 5;
        System.out.print("Result - " + solve(a,b));
    }

    public static int solve(int a, int b) {
        return ((1 << a))|(1<<b);
    }
}
