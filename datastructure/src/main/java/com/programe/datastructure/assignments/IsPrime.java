package com.programe.datastructure.assignments;

public class IsPrime {
    public static void main(String[] args) {
        /**
         * Problem Description
         * Given a number A. Return 1 if A is prime and return 0 if not.
         * Note :
         * The value of A can cross the range of Integer.
         *Input Format
         * The first argument is a single integer A.
         *Output Format
         * Return 1 if A is prime else return 0.
         *
         * Example Input
         * A = 5
         * Output - 1
         *
         * if A=10
         * Output - 0
         *
         **/
        int a=1;
        System.out.printf("{%d} is {%d} a prime number",a,solve(a));


    }

    public static int solve(int a) {
        if(a==1) {
            return 0;
        }
        for(int i=2;i*i<=a;i++) {
            if(a%i==0) {
                return 0;
            }
        }
        return 1;
    }

}
