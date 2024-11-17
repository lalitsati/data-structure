package com.programe.datastructure.assignments.nov12;

public class SubString{
    public static void main(String[] args) {
        /**
         * we have one String and find the all related of Sub-String
         * Example -
         * str = "hello"
         * h
         * he
         * hel
         * hell
         * hello
         * e
         * el
         * ell
         * ello
         * l
         * ll
         * llo
         * l
         * lo
         * o
         *
         * find the total subStrings are - (n*(n+1))/2  where n is the string of length -
         * n = str.length = 5
         * subStringCount = n*(n+1)/2
         *                = 5*(5+1)/2  = 15
         *
         */
        String str = "hello";
        findAllSubSring(str);
    }

    /**
     * TC = O(N^2)
     * @param str
     */
    private static void findAllSubSring(String str) {
        int n = str.length();
        for(int i=0;i<(n*(n+1))/2;i++) {
            for(int j=i+1;j<=n;j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }
}