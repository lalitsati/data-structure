package com.programe.datastructure.assignments.Oct22;

import java.util.ArrayList;
import java.util.Arrays;

public class SpecialIndex {

    public static void main(String[] args) {

        /**
         * Problem Description
         * Given an array, arr[] of size N, the task is to find the count of array indices such that removing
         * an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
         *
         * Problem Constraints
         * 1 <= N <= 105
         * -105 <= A[i] <= 105
         * Sum of all elements of A <= 109
         *
         * Example Input
         * Input 1:
         * A = [2, 1, 6, 4]
         * Output : 1
         *Explanation 1:
         * Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1].
         * Therefore, the required output is 1.
         *
         *
         * Input 2:
         * A = [1, 1, 1]
         *Output : 3
         * Explanation 2:
         * Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
         * Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
         * Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
         * Therefore, the required output is 3.
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 1));
        System.out.printf("\n\nCount for even or odd equal - {%d}",solve(list));
        //Optimized solution -
        System.out.printf("\n\nCount for specail Indexes - {%d}",optimizedSolution(list));

    }

    private static int optimizedSolution(ArrayList<Integer> list) {
        //first find out  prefixEven and prefixOdd;
        ArrayList<Integer> prefixEven = new ArrayList<>();
        prefixEven.add(list.get(0));
        for(int i=1;i<list.size();i++) {
            if(i%2==0) {
                prefixEven.add(prefixEven.get(i-1)+list.get(i));
            } else {
                prefixEven.add(prefixEven.get(i-1));
            }
        }

        //Get prefixOdd array from list
        ArrayList<Integer> prefixOdd = new ArrayList<>();
        prefixOdd.add(0);
        for(int i=1;i<list.size();i++) {
            if(i%2!=0) {
                prefixOdd.add(prefixOdd.get(i-1)+list.get(i));
            } else {
                prefixOdd.add(prefixOdd.get(i-1));
            }
        }

        //find the special indexes -
        int count=0;
        int n = list.size();
        for(int i=0;i<list.size();i++) {
            int evenSum=0;
            int oddSum=0;

            if(i==0) {
                evenSum = prefixOdd.get(n-1)-prefixOdd.get(i);
                oddSum = prefixEven.get(n-1)-prefixEven.get(i);

            } else {
                evenSum= prefixEven.get(i-1)+(prefixOdd.get(n-1)-prefixOdd.get(i));
                oddSum = prefixOdd.get(i-1)+(prefixEven.get(n-1)-prefixEven.get(i));
            }
            if(evenSum==oddSum) {
                count++;
            }
        }
        return count;
    }





    /**
     * Brute fore solution (O(N^2))
     * @param list
     * @return
     */
    public static int solve(ArrayList<Integer> list) {

        int count=0;
        for(int i=0;i<list.size();i++) {
            int j=0;
            int k=0;
            int sumEven=0, sumOdd=0;
            while(j<list.size()) {
                if(j==i) {
                    j++;continue;
                }
                if(k%2==0) {
                    sumEven += list.get(j);
                }  else {
                    sumOdd += list.get(j);
                }
                j++;
                k++;

            }
            if(sumEven==sumOdd) {
                count++;
            }
        }
    return count;
    }
}
