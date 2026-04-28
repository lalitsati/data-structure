package com.programe.datastructure.module6.assignment.day50;

/**
 * Q1. Prime Sum
 *
 * Problem Description
 * Given an even number A ( greater than 2 ), return two prime numbers whose sum will be equal to the given number.
 * If there is more than one solution possible, return the lexicographically smaller solution
 *
 * If [a, b] is one solution with a <= b, and [c,d] is another solution with c <= d, then
 * [a, b] < [c, d], If a < c OR a==c AND b < d.
 *
 * Example Input
 *  4
 *  Output -
 *  [2, 2]
 */
public class PrimeSum {
    public static void main(String[] args) {
        int n=16777214;
        System.out.println("Output - ");
        int[] result = solutionApproach1(n);
        for(int i=0;i<result.length;i++) {
            System.out.printf("%d, ",result[i]);
        }


    }

    private static int[] solutionApproach1(int n) {
        //get the all prime number from 2 to n
        int[] primeArray = new int[n];
        for(int i=2;i<n;i++) {
            primeArray[i]=i;
        }
        //Get the Prime number -
        for(int i=2;i*i<n;i++) {
            if(primeArray[i]==i) {
                for(int j=i+i;j<n;j+=i) {
                    if(j%i==0) {
                        primeArray[j]=0;
                    }
                }
            }
        }

        //Two pointer approach to get the final result -
        int x=0; int y=primeArray.length-1;
        while(x<y) {
            if (primeArray[x] == 0) {
                x++;
                continue;
            }
            if(primeArray[y]==0) {
                y--;
                continue;
            }
           if(primeArray[x]+primeArray[y]==n) {
              return new int[]{primeArray[x],primeArray[y]} ;
           } else if((primeArray[x]+primeArray[y])>n) {
               y--;
           } else {
               x++;
           }
        }
        return new int[]{n/2,n/2};
    }
}
