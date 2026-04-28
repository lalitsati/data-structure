package com.programe.datastructure.assignments.arrays;
/**
 * Q1. Implement Power Function
 * Problem Description
 * Implement pow(A, B) % C.
 * In other words, given A, B and C, Find (AB % C).
 * Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.
 *
 * Example Input -
 * A = 2
 * B = 3
 * C = 3
 *Output -
 * 2
 * Explanation -
 * 2^3 % 3 = 8 % 3 = 2
 *
 */
public class ImplementPowerFunction {
    public static void main(String[] args) {
        int a=71045970;
        int b = 41535484;
        int c=64735492;
        System.out.printf(" output - {%d}",bruteForce(a,b,c));

    }

   private static int  bruteForce(int a, int b, int c){
           long result=1;
           if(a<0) {
               a = a%c+c;
           }
            a%=c;
           for(int i=1;i<=b;i++) {
            result = (result%c * a%c)%c   ;
            result %=c;

           }
           return (int)result%c;
    }


}
