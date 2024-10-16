package com.programe.datastructure.assignments;

public class CountsOfPrimes {
    public static void main(String[] args) {

        /**
         * Problem Description'
         * You will be given an integer n. You need to return the count of prime numbers less than or equal to n.
         */
        int a = 19;
        System.out.printf("count of prime number in the range - {%d}",countPrimeNumbers(a));

    }

    private static int countPrimeNumbers(int a) {
       int count=0;
        while(a>1) {
            boolean flag=true;
            for(int i=2;i*i<=a;i++) {
                if(a%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag) count++;
            a--;
        }
        return count;
    }
}
