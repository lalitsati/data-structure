package com.programe.datastructure.assignments.nov5;

import java.util.*;

public class KthSmallestElement {
    public static void main(String[] args) {
        /**
         * Q4. Kth Smallest Element
         * Problem Description
         * Find the Bth smallest element in given array A .
         * NOTE: Users should try to solve it in less than equal to B swaps.
         *
         * Problem Constraints
         * 1 <= |A| <= 100000
         * 1 <= B <= min(|A|, 500)
         * 1 <= A[i] <= 109
         *
         * Example Input
         * Input 1:
         * A = [2, 1, 4, 3, 2]
         * B = 3
         * Output 1: 2
         * Explanation 1:
         *  3rd element after sorting is 2.
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2, 1, 4, 3, 2));
        int b=3;
        System.out.printf("Kth Smallest number in array - {%d}",kthsmallest(list, b));

    }

    public static int kthsmallest(final ArrayList<Integer> list , int b) {
        Collections.sort(list);
        return list.get(b-1);
    }
}
