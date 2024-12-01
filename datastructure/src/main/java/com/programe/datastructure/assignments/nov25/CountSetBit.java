package com.programe.datastructure.assignments.nov25;

public class CountSetBit {
    public static void main(String[] args) {
        /**
         * Count total number of set bit in N
         * int n = 10
         * Output - 2
         * Explanation -
         * 1010 - set bit count is 2
         */
        int n = 16;

        System.out.print("Count of Set Bit - "+countNoOfSetBit(n));

    }

    public static int countNoOfSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) > 0) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}
