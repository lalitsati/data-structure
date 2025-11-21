package com.programe.datastructure.module6.assignment;

/**
 * Given n, return the samallest prime factor for all no from 2 to n for each number
 */
public class FindSmallestPrimeFactorFromGivenN {

    public static void main(String[] args) {
        int n=10;
        findSmallestPrime(n);
    }

    private static void findSmallestPrime(int n) {

        //create an array of size n
        n+=1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=i;
        }
        //find the smallest prime factor logic -
        for(int i=2;i*i<n;i++) {
            if(arr[i]==i) {
                for(int j=i+1;j<n;j++) {
                    if(arr[j]% arr[i]==0 && arr[j]==j) {
                        arr[j]=i;
                    }
                }
            }

        }
       //print final arr -
       for(int i=0;i<n;i++) {
            System.out.printf("%d, ",arr[i]);
       }
    }
}
