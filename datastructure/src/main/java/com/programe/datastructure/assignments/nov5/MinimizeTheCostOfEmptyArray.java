package com.programe.datastructure.assignments.nov5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimizeTheCostOfEmptyArray {
    public static void main(String[] args) {
        /**
         * Problem - Given an array of N integers, minimize the cost to empty the given array where cost of
         * removing an element is equal to sum if all the elelment which are presenting before romove that element
         * (at the time of removal)
         *
         * Example1 -
         * [2,1,4]
         * Find the minimum cost of removal - first we will remove highest cost of  element
         * removing 4 - {2+4+1 = 7}    now array will be - [2,1]
         * removing 2 - {2+1 = 3}  now array will be [1]
         * removing 1 - {1 = 1}  now array will be []
         * Total minimum cost is - 7+3+1 = 11
         *
         * Example 2 -
         * [3,5,1,-3]
         * removing 5 - {3+5+1-3 = 6}  - now array will be - [3,1,-3]
         * removing 3 - {3+1-3 = 1}   - now array will be - [1,-3]
         * removing 1 - {1-3 = -2}  - now array will be - [-3]
         * removing 3 -  {-3 = -3}  - now array will be - []
         * Total minimum cose is - 6+1-2-3 = 2
         *
         *
         * Observation -
         * [a,b,c,d]  = {a+b+c+d}
         * [b,c,d]  = {b+c+d}
         * [c,d] = {c+d}
         * [d] = {d}
         * as per above filter - a+2b+3c+4d
         * if our ask will be find minimum cost - a should be largest element of array and d should be smallest
         * element of array
         * if our ask will be find maximum cost - a should be smallest element of array and d should be largest
         * element of array
         *
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,1,4));
        System.out.printf("Minimum Cost of an elements - {%d}", findMinimumCost(list));

    }

    private static int findMinimumCost(ArrayList<Integer> list) {
        Collections.sort(list);
        Collections.reverse(list);
        int n = list.size();
        int seqSum=0;

        for(int i=0;i<n;i++) {
             seqSum += list.get(i);
        }
        int minumumCost = seqSum;
        for(int i=1;i<n;i++) {
            seqSum = seqSum-list.get(i-1);
            minumumCost += seqSum;
        }
        return minumumCost;
    }

}
