package com.programe.datastructure.leetcode.section1;

public class PalindromeNumber {
    public static void main(String[] args) {
        /**
         * Given an integer x, return true if x is a palindrome, and false otherwise.
         *
         * Example 1:
         * Input: x = 121
         * Output: true
         * Explanation: 121 reads as 121 from left to right and from right to left.
         *
         * Example 2:
         * Input: x = -121
         * Output: false
         * Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
         * Therefore it is not a palindrome.
         *
         */
        int num=-121;
        System.out.print("is Palin Drom - "+isPalindrome(num));
    }

    /**
     *
     * @param num
     * @return
     */
    public static boolean isPalindrome(int num) {
       return num == reverse(num);
    }

    /**
     *
     * @param num
     * @return
     */
    public static int reverse(int num) {
        int result=0;
        while(num>0) {
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
