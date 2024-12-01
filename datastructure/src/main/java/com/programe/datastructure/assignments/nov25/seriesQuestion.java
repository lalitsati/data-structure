package com.programe.datastructure.assignments.nov25;

public class seriesQuestion {
    public static void main(String[] args) {
        /**
         * Q2. Help From Sam
         * Problem Description
         * Alex and Sam are good friends. Alex is doing a lot of programming these days. He has set a target
         * score of A for himself.
         * Initially, Alex's score was zero. Alex can double his score by doing a question, or Alex can seek
         * help from Sam for doing questions that will contribute 1 to Alex's score. Alex wants his score to be
         * precisely A. Also, he does not want to take much help from Sam.
         *
         * Find and return the minimum number of times Alex needs to take help from Sam to achieve a score of A.
         *
         * Problem Constraints
         * 0 <= A <= 10^9
         *
         * Example Input -
         * A=5
         * Output - 2
         * Explanation -
         * Initial score : 0
         * Takes help from Sam, score : 1
         * Alex solves a question, score : 2
         * Alex solves a question, score : 4
         * Takes help from Sam, score: 5
         *
         */
        int a=5;
        System.out.print("\nBrute force Solution - "+bruteForce(a));
        System.out.print("\n Optimized solution - "+usingBitApproach(a));


    }

    /**
     *
     * @param a
     * @return
     */
    private static int usingBitApproach(int a) {

        //in bit approach we will find only setBit because if lest bit will be set it means it will be not divided by 1
        //if it is not devided by 1 it means alex need help from sem
        int count=0;
        while(a>0) {
            if((a&1)>0) {
                count++;
            }
            a >>=1;
        }
        return count;
    }


    /**
     * Tc = n
     * @param a
     * @return
     */
    private static int bruteForce(int a) {
        int result=0;
        int count=0;
       while(a>0) {
           //we will check if a is even it means no need to take any help from sam
           if(a%2==0) {
               a /=2;
           } else {
               //if a is odd then we have to take a help from sam, in this case we have to increase the count by 1
               count++;
               //then we have to minus it by 1 points as per question sam can take help one point
               a -=1;
           }
       }
       return count;
    }
}
