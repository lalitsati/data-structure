package com.programe.datastructure.leetcode.section1;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        /**
         * 3.Longest Substring Without Repeating Characters
         * Given a string s, find the length of the longest substring without repeating characters.
         *
         * Example 1:
         * Input: s = "abcabcbb"
         * Output: 3
         * Explanation: The answer is "abc", with the length of 3.
         *
         * Example 2:
         * Input: s = "bbbbb"
         * Output: 1
         * Explanation: The answer is "b", with the length of 1.
         *
         * Example 3:
         * Input: s = "pwwkew"
         * Output: 3
         * Explanation: The answer is "wke", with the length of 3.
         * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
         */
         String s = "bpfbhmipx";
         System.out.printf("SubArray length - {%d}",lengthOfLongestSubstring(s));
    }

    /**
     * Brute Fore approach
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Map<Character, Integer> tmp = new HashMap<>();
        int maxSubStr = Integer.MIN_VALUE;
        int k=0;
        for(int i=0;i<n;i++) {
            int l=0;
            char currentChar = s.charAt(i);
            if(tmp.containsKey(currentChar)) {
                if(maxSubStr<tmp.size()) {
                    maxSubStr = tmp.size();
                }
                for(int j=tmp.get(currentChar);j>=k;j--) {
                    tmp.remove(s.charAt(j));
                    l++;
                }
                k+=l;
            }
            tmp.put(currentChar, i);
        }
        return maxSubStr<tmp.size()?tmp.size():maxSubStr;
    }
}
