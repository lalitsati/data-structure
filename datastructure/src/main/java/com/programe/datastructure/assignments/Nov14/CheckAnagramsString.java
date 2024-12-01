package com.programe.datastructure.assignments.Nov14;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckAnagramsString {
    public static void main(String[] args){
        /**
         * Q2. Check anagrams
         *
         * Problem Description
         * You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other
         * and 0 if not.
         * Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the
         * letters of B.
         *
         * Problem Constraints
         * 1 <= N <= 105
         * A and B are lowercase strings
         *
         * Example Input -
         * Input 1:
         * A = "cat"
         * B = "bat"
         * Output 1: 0
         * Explanation -
         * The words cannot be rearranged to form the same word. So, they are not anagrams.
         *
         * Input 2 -
         * A = "secure"
         * B = "rescue"
         * Output - 1
         * Explanation -
         * They are an anagram.
         *
         */
        String str1 = "aabb";
        String str2 = "abaa";
        System.out.print("\nIs Anagrams - "+isAnagrams(str1, str2));
        System.out.print("\nIs Anagrams - "+arrayApproah(str1, str2));
        System.out.print("\nIs Anagrams - "+ optimizedSolution(str1, str2));
       ;

    }

    /**
     * O(N)
     * @param str1
     * @param str2
     * @return
     */
    private static int optimizedSolution(String str1, String str2) {
        int[] arr = new int[26];
        //first string increment the value of array -
        for(int i=0;i<str1.length();i++) {
            arr[str1.charAt(i)-97] = arr[str1.charAt(i)-97]+1;
        }

        //for second string just decrementing values from array -
        for(int i=0;i<str2.length();i++) {
            arr[str2.charAt(i)-97] = arr[str2.charAt(i)-97]-1;
        }

        //now check the anagrams -
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0) {
                return 0;
            }
        }
        return 1;
    }


    private static int  arrayApproah(String str1, String str2) {
        char[] str1Char1 = str1.toCharArray();
        char[] str1Char2 = str2.toCharArray();

        //sort both array -
        Arrays.sort(str1Char1);
        Arrays.sort(str1Char2);

        //compare both array now -
        for(int i=0;i<str1Char1.length;i++) {
            if(str1Char1[i]!=str1Char2[i]) {
                return 0;
            }
        }
        return 1;
    }



    /**
     * Can you think of a way to track the frequency of characters in both strings?
     * this method will not work in terms of frequency !!!
     * @param str1
     * @param str2
     * @return
     */
    public static int isAnagrams(String str1, String str2){
        for(int i=0;i<str2.length();i++) {
            if(!findChar(str1, str2.charAt(i))){
                return 0;
            }
        }
        return 1;
    }

    public static boolean findChar(String str1, char ch) {
        int x = 0;
        while(x<str1.length()) {
            if(str1.charAt(x)==ch) {
                return true;
            }
            x++;
        }
        return false;
    }
}
