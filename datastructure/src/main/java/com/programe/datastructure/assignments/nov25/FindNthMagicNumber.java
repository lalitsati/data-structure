package com.programe.datastructure.assignments.nov25;

public class FindNthMagicNumber {
    public static void main(String[] args) {
        /**
         * Q1. Find nth Magic Number
         * Problem Description -
         * Given an integer A, find and return the Ath magic number.
         * A magic number is defined as a number that can be expressed as a power of 5 or a sum of
         * unique powers of 5.
         * First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
         *
         * Problem Constraints -
         * 1 <= A <= 5000
         *
         * Example Input -
         * A = 3
         * Example Output - 30
         * Explanation -
         *  Magic Numbers in increasing order are [5, 25, 30, 125, 130, ...]
         *  3rd element in this is 30
         *
         */
        int a = 10;
        System.out.print("magic number is - "+bruteForceSolution(a));
    }

    /**
     * BruteForce Solution
     *
     * @param a
     * @return
     */
    public static int bruteForceSolution(int a) {
        int powerOf5 = 5;
        int sum = 0;
        for(int i=2;i<=a;i++) {

          if(i%2==0) {
              powerOf5 *=5;
              sum += powerOf5;
          } else {
             sum +=5;
          }
        }
        return a!=1?sum:5;
    }
}
