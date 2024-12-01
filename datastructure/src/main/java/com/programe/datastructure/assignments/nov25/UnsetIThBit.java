package com.programe.datastructure.assignments.nov25;

public class UnsetIThBit {
    public static void main(String[] args) {
        /**
         * Q3. Unset i-th bit
         *
         * Problem Description
         *
         * You are given two integers A and B.
         * If B-th bit in A is set, make it unset.
         * If B-th bit in A is unset, leave as it is.
         * Return the updated A value.
         *
         * Note:
         * The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.Problem Constraints
         *
         * 1 <= A <= 109
         * 0 <= B <= 30
         *
         * Example Input 1 -
         * A = 4
         * B = 1
         *Output - 4
         * Explanation -
         * Given N = 4 which is 100 in binary. The 1-st bit is already unset
         *
         * Input 2 -
         * A = 5
         * B = 2
         * Output - 1
         * Explanation -
         * Given N = 5 which is 101 in binary. We unset the 2-nd bit
         * It becomes 001 which is 1 in Decimal.
         *
         *
         */
        int a=20;
        int b=3;
        System.out.println(1<<b);
        System.out.println(a&(1<<b));

        if((a&(1<<b))>0) {
            System.out.print(a^(1<<b));
        } else {
            System.out.print(a);
        }

    }
}
