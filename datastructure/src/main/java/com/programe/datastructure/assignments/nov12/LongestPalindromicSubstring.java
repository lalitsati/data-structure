package com.programe.datastructure.assignments.nov12;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        /**
         * Q2. Longest Palindromic Substring
         * Problem Description
         * Given a string A of size N, find and return the longest palindromic substring in A.
         * Substring of string A is A[i...j] where 0 <= i <= j < len(A)
         * Palindrome string:
         * A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
         * Incase of conflict, return the substring which occurs first ( with the least starting index).
         *
         * Problem Constraints
         * 1 <= N <= 6000
         *
         * Example Input -
         * A = "aaaabaaa"
         * Output 1: "aaabaaa"
         * Explanation -
         * We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
         *
         */
        String str = "a";
        System.out.print("\nLongest Substring - "+bruteForceAppraoch(str));
        System.out.print("\nLongest Substring plaindrom - "+twoPointerApproach(str));

    }

    public static String twoPointerApproach(String str) {
        int n = str.length();
        String maxSubString="";
        int maxCount=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            boolean flag=true;
            int j=i,k=i;
            //this is for even count palindrom -
            while(j>=0 && k<n) {
                if(str.charAt(j)!=str.charAt(k)) {
                    flag=false;
                    break;
                }
                j--;k++;
            }
            j++;k--;
            if(maxCount<(k-j+1)) {
                maxCount = (k-j+1);
                maxSubString = str.substring(j,k+1);
            }
            //this is for odd count -
             j=i;
             k=i+1;
             while(j>=0 && k<n) {
                 if(str.charAt(j)!=str.charAt(k)) {
                     break;
                 }
                 j--;k++;
             }
            j++;k--;
            if(maxCount<(k-j+1)) {
                maxCount = (k-j+1);
                maxSubString = str.substring(j,k+1);
            }

        }
        return maxSubString;
    }

    /**
     * O(N^2)
     * @param str
     * @return
     */
    public static String bruteForceAppraoch(String str) {
        int n = str.length();
        int max = Integer.MIN_VALUE;
        String maxSubString = "";
        for(int i=0;i<n*(n+1)/2;i++) {
            for(int j=i+1;j<=n;j++) {
                String tmpString = str.substring(i,j);
                if(isPalinDrom(tmpString)){
                    String subString="";
                    if(max<tmpString.length()) {
                        max = tmpString.length();
                        maxSubString = str.substring(i,j);
                    }
                }
            }
        }
        return maxSubString;
    }

    private static boolean isPalinDrom(String subString) {
        int x=0,y=subString.length()-1;
        while(x<y) {
            if(subString.charAt(x)!=subString.charAt(y)) {
                return false;
            }
            x++;y--;
        }
        return true;
    }
}