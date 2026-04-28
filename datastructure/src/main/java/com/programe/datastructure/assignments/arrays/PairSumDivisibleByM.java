package com.programe.datastructure.assignments.arrays;

/**
 * Q3. Pair Sum divisible by M
 * Problem Description -
 * Given an array of integers A and an integer B, find and return the number of pairs in A
 * whose sum is divisible by B.
 * Since the answer may be large, return the answer modulo (109 + 7).
 * Note: Ensure to handle integer overflow when performing the calculations.
 * Input 1:
 *  A = [1, 2, 3, 4, 5]
 *  B = 2
 *Output -
 * 4
 * Explanation -
 * All pairs which are divisible by 2 are (1,3), (1,5), (2,4), (3,5).
 * So total 4 pairs.
 */
public class PairSumDivisibleByM {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int b = 2;
        System.out.printf("Result - {%d}",bruteForce(arr, b));
        System.out.println();
        System.out.printf("Result - {%d}",approach1(arr, b));

    }

    private static int approach1(int[] arr, int b){
        int count=0;
        int[] freq = new int[b+1];
        for(int i=0;i<arr.length;i++) {
            //find the reminder -
            int reminder = arr[i]%b;
            count += freq[b-reminder];
            freq[reminder]++;
        }
        return count;
    }


    private static int bruteForce(int[] arr, int b){
        int count=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if((arr[i]%b+arr[j]%b)%b==0) {
                    count++;
                }
            }
        }
        return count;
    }
}
