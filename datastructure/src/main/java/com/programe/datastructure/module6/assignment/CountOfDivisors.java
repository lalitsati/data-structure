package com.programe.datastructure.module6.assignment;

/**
 * Problem Description
 *
 * Given an array of integers A, find and return the count of divisors of each element of the array.
 *NOTE: The order of the resultant array should be the same as the input array.
 *
 * Example -
 *  A = [2, 3, 4, 5]
 *  Output - [2, 2, 3, 2]
 *
 *  Example Explanation
 *   The number of divisors of 2 : [1, 2], 3 : [1, 3], 4 : [1, 2, 4], 5 : [1, 5]
 *  So the count will be [2, 2, 3, 2].
 *
 *
 */
public class CountOfDivisors {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5,10};
        int [] result = bruteForceApproach(arr);
        System.out.println("Result after BruteForce Approach - ");
        for(int i=0;i<result.length;i++) {
            System.out.printf("%d, ",result[i]);
        }



    }





    private static int[] bruteForceApproach(int[] arr) {

        int result[] = new int[arr.length];
        for(int i=0;i< arr.length;i++) {
           int count=0;
            result[i]=countFact(arr[i]);
        }
    return result;
    }

    public static int countFact(int A){
        int count =0;
        for(int i=1;i*i<=A;i++) {
            if(A%i==0) {
                if(i*i==A) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }
}
