package com.programe.datastructure.leetcode;

public class DecodeWays91 {

    public static void main(String[] args) {

        /**
         * You have intercepted a secret message encoded as a string of numbers.
         * The message is decoded via the following mapping:
         *
         * "1" -> 'A'
         * "2" -> 'B'
         * ......
         * ......
         * "26" -> 'Z'
         *
         * However, while decoding the message, you realize that there are many different ways you can
         * decode the message because some codes are contained in other codes ("2" and "5" vs "25").
         *
         * Example 1 -
         * For example, "11106" can be decoded into:
         * "AAJF" with the grouping (1, 1, 10, 6)
         * "KJF" with the grouping (11, 10, 6)
         * The grouping (1, 11, 06) is invalid because "06" is not a valid code (only "6" is valid).
         *
         * Note: there may be strings that are impossible to decode.
         *
         * Given a string s containing only digits, return the number of ways to decode it. If the entire string
         * cannot be decoded in any valid way, return 0.
         *
         *The test cases are generated so that the answer fits in a 32-bit integer.
         *
         * Example 1:
         * Input: s = "12"
         * Output: 2
         * Explanation:
         * "12" could be decoded as "AB" (1 2) or "L" (12).
         *
         * Example 2:
         * Input: s = "226"
         * Output: 3
         * Explanation:
         * "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
         *
         * Example 3:
         * Input: s = "06"
         * Output: 0
         * Explanation:
         * "06" cannot be mapped to "F" because of the leading zero ("6" is different from "06").
         * In this case, the string is not a valid encoding, so return 0.
         *
         */
        String str = "2101";
        System.out.printf("Ways of Decode Methods - {%d}",bruteForceApproach(str));


    }

    public static int bruteForceApproach(String str){
        if(str.startsWith("0")) {
            return 0;
        }
        int count =1;
        if(str.endsWith("0")) {
            count=0;
        }
        for(int i=1;i<str.length();i++) {
            char currentChar = str.charAt(i);
            String combinationOfChar = ""+str.charAt(i-1)+currentChar;
            if(Integer.parseInt(combinationOfChar)>=10 && Integer.parseInt(combinationOfChar)<=20)
            {
                count++;
                continue;
            } else if(combinationOfChar.startsWith("0")) {
                return count;
            }
            if(Integer.parseInt(combinationOfChar)<=26) {
                count++;
            }
        }
        return count;
    }

}
