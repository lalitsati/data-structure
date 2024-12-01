package com.programe.datastructure.assignments.nov25;

public class CheckBit {
    public static void main(String[] args) {
        /**
         * Q5. Check bit
         *
         * Problem Description
         * You are given two integers A and B.
         * Return 1 if B-th bit in A is set
         * Return 0 if B-th bit in A is unset
         *
         * Note:
         * The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
         *
         * Problem Constraints
         * 1 <= A <= 10^9
         * 0 <= B <= 30
         *
         * Example Input1 -
         * A = 4
         * B = 1
         * Output - 0
         * Explanation -
         * Given N = 4 which is 100 in binary. The 1-st bit is unset
         * so we return 0
         *
         *
         */
        int a=4;
        int b=2;
        System.out.print(solve(a,b));
    }

    public static int solve(int a, int b) {
        return (a&(1<<b))>0?1:0;
    }
}
