package com.programe.datastructure.module6.assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Pairs with Given Difference
 * Problem Description
 * Given an one-dimensional integer array A of size N and an integer B.
 * Count all distinct pairs with difference equal to B.
 * Here a pair is defined as an integer pair (x, y), where x and y are both numbers in the array and their absolute difference is B.
 *
 * Example Input
 * A = [1, 5, 3, 4, 2]
 *  B = 3
 *
 *  output = 2
 *  Example Explanation
 *  There are 2 unique pairs with difference 3, the pairs are {1, 4} and {5, 2}
 */
//1|, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 8,
// 8, 8, 8, 8, 9, 9, 9, 9, 10, 10, |10
public class PairsWithGivenDifference {

    public static void main(String[] args) {

        int[] arr = {1,2};
        int b = 0;
        System.out.println(twoPointerApproach(arr, b));

        System.out.println(usingHashSet(arr, b));

    }

    private static int twoPointerApproach(int[] A, int B) {

        Arrays.sort(A);
        int i = 0, j = 1, count = 0;
        int n = A.length;

        while (j < n) {
            int diff = A[j] - A[i];

            if (diff == B) {
                count++;
                i++;
                j++;
                // Skip duplicates
                while (j < n && A[j] == A[j - 1]) j++;
                while (i < n && A[i] == A[i - 1]) i++;
            } else if (diff < B) {
                j++;
            } else {
                i++;
                if (i == j) j++;
            }
        }
        return count;

    }


    //working partailly success
    private static int usingHashSet(int[] arr, int b) {
        Set<Integer> set = new HashSet<>();
        Set<String> seenPairs = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        for (int num : arr) {
            int target = num + b;
            if (set.contains(target)) {
                // Always store smaller first to avoid duplicates
                int x = Math.min(num, target);
                int y = Math.max(num, target);
                seenPairs.add(x + "," + y);
            }
        }
        return seenPairs.size();
    }


}
