package com.programe.datastructure.module6.assignment;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Problem Description
 *
 * Given a sorted array of integers (not necessarily distinct) A and an integer B, find and return how many pair of
 * integers ( A[i], A[j] ) such that i != j have sum equal to B.
 * Since the number of such pairs can be very large, return number of such pairs modulo (109 + 7).
 *
 * Example Input
 *
 * Input 1:
 * A = [1, 1, 1]
 * B = 2
 *
 * Output -
 * 3
 * Explanation -
 * The pairs of A[i] and A[j] which sum up to 2 are (0, 1), (0, 2) and (1, 2).
 *  There are 3 pairs.
 *
 *
 */
public class PairsWithGivenSumII {

    public static void main(String[] arga) {
        int [] arr = {1,1,1,2,2,3,4,5,6,7,8,9};
        int b=2;
        int count = bruteForceApproach(arr, b);
        System.out.println("After Brute Force Approach - "+count);
         count = usingHashMap(arr, b);
        System.out.println("After HashSet Approach - "+count);

        System.out.println("Two Pointer Approach if the numbers are repeating "+ twoPointerApproach(arr, b));
    }


    private static int twoPointerApproach(int[] arr, int b){
        long count=0;
        int i=0, j=arr.length-1;
        while(i<j) {
            int sum = arr[i]+arr[j];
            if(sum==b) {
                int counti=0;
                if(arr[i]==arr[j]) {
                    long k = (j-i+1)%1000000007;
                    //kC2  = k! / (k-2)! * 2! =  k(k-1)/2    --   formula now 2 Combination of K elements
                    count += ((k*(k-1))/2)%1000000007;
                    break;
                }
                for(int x=i;x<j;x++) {
                    if(arr[i]==arr[x]) {
                        counti++;
                    } else break;
                }
                int countj=0;
                for(int x=j;x>i;x--) {
                    if(arr[j]==arr[x]) {
                        countj++;
                    } else break;
                }
                count += counti*countj;
                count = count % (1000000007);
                i+=counti;
                j-=countj;
            } else if(sum>b) {
                j--;
            } else {
                i++;
            }
        }
        return (int) count;
    }




    /**
     * Time Complexcity - O(n) and space - O(n)
     * @param arr
     * @param b
     * @return
     *
     * Applicable on for Distinct number
     */
    private static int usingHashMap(int[] arr, int b){
        int count=0;
        HashSet<Integer> element = new HashSet<>();
        //Sore all the reminder from b to here
        for(int i=0;i<arr.length;i++) {
            if(element.contains(b-arr[i])) {
                count++;
            } else {
                element.add(arr[i]);
            }
        }
        return count;
    }


    public static int bruteForceApproach(int[] arr, int b){

        int count =0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]+arr[j]==b) {
                    count++;
                }
            }
        }
        return count;
    }



}
