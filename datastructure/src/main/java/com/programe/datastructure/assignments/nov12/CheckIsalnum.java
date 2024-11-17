package com.programe.datastructure.assignments.nov12;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckIsalnum {
    public static void main(String[] args) {
        /**
         * Q4. Isalnum()
         *
         * Problem Description
         * You are given a function isalpha() consisting of a character array A.
         * Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.
         *
         * Problem Constraints
         * 1 <= |A| <= 105
         *
         * Input 1:
         *  A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
         *  Output - 1
         *
         *  Input 2:
         *  A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']
         *  Output 2 - 0
         *  Explanation -  All the characters are NOT alphabets i.e ('#'). that's the reason returning 0
         *
         */
        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('S', '#', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'));
        System.out.print("is Valid array - "+solve(list));

    }

    public static int solve(ArrayList<Character> list) {
        for(char ch : list) {
            if(!((ch>=48 && ch<=57) ||  (ch>=65 && ch<=90) || (ch>=97 && ch<=122))) {
                return 0;
            }
        }
        return 1;
    }
}
