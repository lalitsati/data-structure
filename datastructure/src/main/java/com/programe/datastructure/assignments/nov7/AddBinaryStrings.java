package com.programe.datastructure.assignments.nov7;

public class AddBinaryStrings {
    public static void main(String[] args) {

        /**
         * Q7. Add Binary Strings
         * Problem Description
         * Given two binary strings A and B. Return their sum (also a binary string).
         *
         * Problem Constraints
         * 1 <= length of A <= 105
         * 1 <= length of B <= 105
         * A and B are binary strings
         *
         * Example Input
         * Input 1:
         * A = "100"
         * B = "11"
         * Output - 111
         *
         * Input 2 -
         * A = "110"
         * B = "10"
         * Output - 1000
         *
         */
        String str1="110";
        String str2="10";
        System.out.printf("Addition of two binary digits are - {%s}",addBinary(str1,str2));


    }

    public static String addBinary(String str1, String str2) {
        int n1 = str1.length()-1;
        int n2 = str2.length()-1;
        int n3 = Math.max(n1, n2);
        int carry=0;
        String resultStr="";
        while(n3-->=0) {
            int bit1 = (n1>=0?str1.charAt(n1--):48)-48;
            int bit2 = (n2 >=0?str2.charAt(n2--):48)-48;
            int bit = bit1+bit2+carry;
            resultStr = bit%2+resultStr;
            carry = bit/2;
        }
        if(carry>0) {
            resultStr = carry+resultStr;
        }
        return resultStr;
    }
}
