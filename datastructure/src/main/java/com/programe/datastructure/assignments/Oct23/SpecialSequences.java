package com.programe.datastructure.assignments.Oct23;

public class SpecialSequences {

    public static void main(String[] args) {

        /**
         * Q6. Special Subsequences "AG" - 2
         *
         * Problem Description
         * You have given a string A having Uppercase English letters.
         * You have to find the number of pairs (i, j) such that A[i] = 'A', A[j] = 'G' and i < j.
         *
         * Problem Constraints
         * 1 <= length(A) <= 105
         *
         * Example Input
         * Input :
         *  A = "ABCGAG"
         *  Output :
         *  3
         *  Explanation 1:
         *  Subsequence "AG" is 3 times in given string, the pairs are (0, 3), (0, 5) and (4, 5).
         *
         *
         *  Input 2:
         *  A = "GAB"
         *  Output 2:
         *  0
         *  Explanation 2:
         *  There is no subsequence "AG" in the given string.
         */

        String str = "GAB";
        System.out.printf("Count of Special Sequences AG - {%d}",carryForwardTech(str));

    }

    /**
     * This technique is called carry forward
     * @param str
     * @return
     */
    public static Long carryForwardTech(String str) {
        long countA=0, count=0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='A') {
                countA++;
            } else if(str.charAt(i)=='G') {
                count += countA;
            }
        }
        return count;
    }
}
