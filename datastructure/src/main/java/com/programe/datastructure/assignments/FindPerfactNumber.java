package com.programe.datastructure.assignments;

public class FindPerfactNumber {
    public static void main(String[] args) {

        /**
         *Problem Description
         * You are given an integer A. You have to tell whether it is a perfect number or not.
         * Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
         * A proper divisor of a natural number is the divisor that is strictly less than the number.
         *
         * Example -
         * 6 is a perfact number because its all Devisors sum is 6
         * 6 = 1+2+3 (6)
         *
         * 4 is not a perfact number because
         * 4 = 1+2  (3)
         */

        int a = 4;
        System.out.printf("Is perfact number - {%d}",findPerfactNumber(a));

    }

    /**
     * Time Complexity - O(n/2)
     * Space Complexity - O(1)
     * @param a
     * @return
     */
    private static int findPerfactNumber(int a) {
        int sum=1;
        if(a==1) return 0;
        for(int i=2;i<=a/2;i++) {
                if(a%i==0) {
                    sum += i;
                }
        }
        if(sum==a) return 1;
        return 0;
    }
}
