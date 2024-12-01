package com.programe.datastructure.assignments.nov25;

public class ToggleIThBit {
    public static void main(String[] args) {
        /**
         * Q4. Toggle i-th bit
         *
         * Problem Description -
         * You are given two integers A and B.
         * If B-th bit in A is set, make it unset
         * If B-th bit in A is unset, make it set
         * Return the updated A value
         *
         * Problem Constraints
         * 1 <= A <= 10^9
         * 0 <= B <= 30
         *
         * Example Input -
         * Input 1:
         * A = 4
         * B = 1
         * Output - 6
         * Explanation -
         * Given N = 4 which is 100 in binary. The 1-st bit is unset
         * so we make it set
         *
         * Input 2 -
         * A = 5
         * B = 2
         * Output - 1
         * Explanation -
         * Given N = 5 which is 101 in binary. The 2-nd bit is set
         * so we make it unset
         *
         */
        int a= 4;
        int b= 1;
        System.out.print("Result - "+solve(a,b));
    }


    public static int solve(int a, int b) {
        return a^(1<<b);
    }
}
