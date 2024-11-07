package com.programe.datastructure.assignments.Oct25;

import java.util.ArrayList;
import java.util.Arrays;

public class CountingSubarraysAsPerCriterea {
    public static void main(String args[]) {
        /**
         * Q3. Counting Subarrays Easy
         * Problem Description
         * Given an array A of N non-negative numbers and a non-negative number B,
         * you need to find the number of subarrays in A with a sum less than B.
         * We may assume that there is no overflow.
         *
         * Problem Constraints
         * 1 <= N <= 5 x 103
         * 1 <= A[i] <= 1000
         * 1 <= B <= 107
         *
         * Input 1:
         *  A = [2, 5, 6]
         *  B = 10
         *  Output 1: 4
         *  Explanation 1:
         *  The subarrays with sum less than B are {2}, {5}, {6} and {2, 5},
         *
         *  Input 2:
         *  A = [1, 11, 2, 3, 15]
         *  B = 10
         *  Output 2:  4
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(15,8,16));
        int b = 242;
        System.out.printf("Count of subarray which having sum less then given b - {%d}",
                solve(list, b));

    }

    /**
     *
     * @param list
     * @param b
     * @return
     */
    public static int solve(ArrayList<Integer> list, int b) {
        int count=0;
        int n=list.size();
        for(int i=1;i<=n;i++) {
            int e = i-0-1;
            int j=0;
            Long sum=0l;
            while(e<n) {
                if(j==0) {
                    for(int k=0;k<=e;k++) {
                        sum += list.get(k);
                    }
                } else {
                    sum = sum-list.get(j-1)+list.get(e);
                }
                if(sum<b) {
                    count++;
                }
                e++;j++;
            }
        }
        return count;
    }
}
