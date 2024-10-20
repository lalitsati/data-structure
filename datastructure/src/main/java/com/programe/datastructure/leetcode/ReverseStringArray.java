package com.programe.datastructure.leetcode;

public class ReverseStringArray {

    public static void main(String[] args) {

        /**
         * 344 -  Write a function that reverses a string. The input string is given as an array of characters s.
         * You must do this by modifying the input array in-place with O(1) extra memory.
         *
         * Example 1:
         * Input: s = ["h","e","l","l","o"]
         * Output: ["o","l","l","e","h"]
         *
         * Constraints:
         * 1 <= s.length <= 10^5
         * s[i] is a printable ascii character.
         *
         */
        char[] s = {'h','e','l','l','o', 'a'};
        System.out.print("\n\nBefore reverse\n\n");
        printArr(s);
        reverseString(s);
        System.out.print("\n\nAfter reverse\n\n");
        printArr(s);
    }

    public static void reverseString(char[] s) {

        int x=0,y=s.length-1;
        while(x<y) {
            char tmp = s[x];
            s[x] = s[y];
            s[y] = tmp;
            x++;
            y--;
        }

    }


    public static void printArr(char[] s) {
        for(char c : s) {
            System.out.print(c+",");
        }
    }
}
