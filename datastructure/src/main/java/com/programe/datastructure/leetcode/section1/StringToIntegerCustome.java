package com.programe.datastructure.leetcode.section1;

public class StringToIntegerCustome {
    public static void main(String[] args) {
        /**
         * 8. String to Integer (atoi)
         *
         * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.
         * The algorithm for myAtoi(string s) is as follows:
         *
         * Whitespace: Ignore any leading whitespace (" ").
         * Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
         * Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
         * Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
         * Return the integer as the final result.
         *
         * Example 1:
         * Input: s = "42"
         * Output: 42
         * Explanation:
         * The underlined characters are what is read in and the caret is the current reader position.
         * Step 1: "42" (no characters read because there is no leading whitespace)
         *          ^
         * Step 2: "42" (no characters read because there is neither a '-' nor '+')
         *          ^
         * Step 3: "42" ("42" is read in)
         *
         *
         * Example 2:
         * Input: s = " -042"
         * Output: -42
         * Explanation:
         * Step 1: "   -042" (leading whitespace is read and ignored)
         *             ^
         * Step 2: "   -042" ('-' is read, so the result should be negative)
         *              ^
         * Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
         */
        String str = "-2147483649";
        //int num = -12;
        //System.out.print(num-1);
        System.out.print("\nmyAtoi method return - "+myAtoi(str));
    }

    /**
     * O(N)
     * @param str
     * @return
     */
    public static int myAtoi(String str) {
        int sign=1;
        boolean signFlag=true;
        int n=str.length();
        int result=0;
        int prev_result=0;
        for(int i=0;i<n;i++) {
            //find the sing bit -
            char ch = str.charAt(i);
            if(ch>=48 && ch<=57) {
                int digit=ch-48;
                signFlag=false;
                prev_result=result;
                result = result*10+digit;

                //check overflow 32-bit Integer-
                if(prev_result>result || (result-digit)/10!=prev_result) {
                    if(sign>0) {
                        return Integer.MAX_VALUE;
                    } else {
                       return Integer.MIN_VALUE;
                    }
                }
            } else  if(ch==32 || ch==95) {
                continue;
            } else if(signFlag && (ch==45||ch==43)) {
                if(ch==45) {
                    sign=-1;
                }
            } else {
               break;
            }
        }
        return result*sign;
    }
}
