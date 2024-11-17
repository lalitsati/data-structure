package com.programe.datastructure.leetcode.section1;

public class LongestPalindromicSubStrng {
    public static void main(String[] args) {
        /**
         * 5. Longest Palindromic Substring
         * Example -
         * Input: s = "babad"
         * Output: "bab"
         * Explanation: "aba" is also a valid answer.
         *
         * Example2-
         * Input: s = "cbbd"
         * Output: "bb"
         *
         * Constraints:
         * 1 <= s.length <= 1000
         * s consist of only digits and English letters.
         */
        String str = "a";
        System.out.print("\nLongest Palindromic SubString is - "+longestPalindromeBruteForce( str) );
       // System.out.print(str.substring(0,0));
    }

    /**
     * Brute Force Apprach
     * Tc - O(N^2 * log(n))
     * @param str
     * @return
     */
    public static String longestPalindromeBruteForce(String str) {

        //find all the subString -
        int n = str.length();
        int max=Integer.MIN_VALUE;
        String result = "";
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<=n;j++) {
                if(findPalinDrom(str.substring(i,j)) &&
                        j-i>max){
                    max = j-i;
                    result = str.substring(i,j);
                }
            }
        }
        return result;
    }

    private static boolean findPalinDrom(String substring) {
        int x=0,y=substring.length()-1;
        while(x<y) {
            if(substring.charAt(x)!=substring.charAt(y)) {
                return false ;
            }
            x++;y--;
        }
        return true;
    }
}
