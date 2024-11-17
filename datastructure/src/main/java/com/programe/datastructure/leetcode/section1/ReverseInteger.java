package com.programe.datastructure.leetcode.section1;

public class ReverseInteger {
    public static void main(String[] args) {
        /**
         * 7. Reverse Integer
         * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to
         * go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
         *
         * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
         * Example 1:
         * Input: x = 123
         * Output: 321
         *
         * Example 2:
         * Input: x = -123
         * Output: -321
         *
         * Example 3:
         * Input: x = 120
         * Output: 21
         *
         * Constraints:
         * -2^31 <= x <= 2^31 - 1
         *
         * 1534236469
         *
         */
        int num=1534236469;
        System.out.printf("{%d} Reverse string is - {%d}",num,reverse(num));
    }

    /**
     *
     * @param num
     * @return
     */
    public static int reverse(int num) {
        int result=0;
        while(num!=0) {
            int digit=num%10;
            int prev_result=result;
            result =(result*10)+digit;
            int prev_num = num;
            num /=10;
            if((result-digit)/10!=prev_result) {
                return 0;
            }
        }
        return result;
    }
}
