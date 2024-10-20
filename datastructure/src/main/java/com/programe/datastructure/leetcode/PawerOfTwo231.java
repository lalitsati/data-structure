package com.programe.datastructure.leetcode;

public class PawerOfTwo231 {

    public static void main(String args[]) {

        /**
         * Given an integer n, return true if it is a power of two. Otherwise, return false.
         * An integer n is a power of two, if there exists an integer x such that n == 2x.
         *
         * Example 1:
         * Input: n = 1
         * Output: true
         *
         * Example 2:
         * Input: n = 16
         * Output: true
         * Explanation: 2^4 = 16
         */
        int n = 256;
       // System.out.printf("Check if two's Power - {%b}",isPowerOfTwo(n));

        System.out.printf("Bit Optimized Output - {%b}",bitApproach(n));
    }

    private static boolean bitApproach(int n) {

        return (n>0 && ((n & (n-1))==0));
    }

    /**
     * Solution will work only for short input, for long input i will be time exceed
     * @param n
     * @return
     */
    public static boolean isPowerOfTwo(int n) {
        int i=1;
        while(i<n) {
            i *=2;
        }

        return i==n?true:false;
    }

}
