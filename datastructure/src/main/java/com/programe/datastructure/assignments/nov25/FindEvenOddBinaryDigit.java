package com.programe.datastructure.assignments.nov25;

public class FindEvenOddBinaryDigit {
    public static void main(String[] args) {
        /**
         * Question 1 - Find the even and odd number binary number
         *          * Solution - suppose we have one binary number -
         *          * 20 - 00010100
         *          * we want to find out is 20 even or odd
         *          * just we need to use & operator
         */

        int num=19;
        if((num&1)==0) {
            System.out.printf("%d is even!!",num);
        } else {
            System.out.printf("%d is odd",num);
        }
    }
}
