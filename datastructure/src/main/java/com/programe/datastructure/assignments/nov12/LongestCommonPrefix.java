package com.programe.datastructure.assignments.nov12;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        /**
         * Q1. Longest Common Prefix
         *
         * Problem Description
         *
         * Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the
         * strings in the array.
         * The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix
         * of both S1 and S2.
         * Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
         *
         * Problem Constraints
         * 0 <= sum of length of all strings <= 1000000
         *
         * Input 1:
         * A = ["abcdefgh", "aefghijk", "abcefgh"]
         * Output 1: "a"
         * Explanation - Longest common prefix of all the strings is "a".
         *
         * Example 2 -
         * Input 2:
         * A = ["abab", "ab", "abcd"];
         * Output - "ab"
         * Explanation 2:
         * Longest common prefix of all the strings is "ab".
         *
         *
         */
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("abcd", "abcd", "abc"));
        System.out.print("Longest Common Prefix - "+longestCommonPrefix(list));

    }


    public static String longestCommonPrefix(ArrayList<String> list) {
        String commonString=list.get(0);
        int n = list.size();
        for(int i=1;i<n;i++) {
            commonString = findCommonString(commonString, list.get(i));
        }
    return commonString;
    }

    private static String findCommonString(String str1, String str2) {
        int n = Math.min(str1.length(), str2.length());
        int i=0;
        while(i<n) {
            if(str1.charAt(i)!=str2.charAt(i)) {
                return str1.substring(0,i);
            }
            i++;
        }
        return str1.length()>str2.length()?str1.substring(0,i):str2.substring(0,i);
    }
}
