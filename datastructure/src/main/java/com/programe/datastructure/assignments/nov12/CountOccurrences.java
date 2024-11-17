package com.programe.datastructure.assignments.nov12;

public class CountOccurrences {
    public static void main(String[] args) {
        /**
         * Q2. Count Occurrences
         *
         * Problem Description
         * Find the number of occurrences of bob in string A consisting of lowercase English alphabets.
         *
         * Problem Constraints
         * 1 <= |A| <= 1000
         *
         * Input 1: "abobc"
         * Ouput 1 - 1
         * Explanation -   The only occurrence is at second position.
         */
        String str = "abobc";
        String searchKey = "bob";
        System.out.print("Occurence of string is - "+solve(str, searchKey));
    }

    public  static int solve(String str, String searchKey) {
        int count=0;
        int n = searchKey.length();
        int i=0;
        while(i+n<=str.length()) {
            if(str.substring(i,i+n).equals(searchKey)){
                count++;
            }
            i++;
        }
        return count;
    }
}
