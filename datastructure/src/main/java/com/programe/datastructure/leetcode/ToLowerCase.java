package com.programe.datastructure.leetcode;

public class ToLowerCase {
    public static void main(String args[]) {

        /**
         * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
         *
         * Example 1:
         * Input: s = "Hello"
         * Output: "hello"
         *
         * Example 3:
         * Input: s = "LOVELY"
         * Output: "lovely"
         *
         */

        String s = "HEllo";
        System.out.printf("Converted String - {%s}",toLowerCase(s));

    }


    public static String toLowerCase(String s) {
        String result = "";
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i)>=65 && s.charAt(i)<=90) {
                    result = result+(char) (s.charAt(i)+32);
                } else {
                    result = result+s.charAt(i);
                }
            }
            return result;
    }
}
