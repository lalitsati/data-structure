package com.programe.datastructure.module6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Q3. Generate Subsets
 * Problem Description -
 * Given a set of distinct integers A, return all possible subsets that can be formed from the elements of array A.
 *
 * A = [1, 2, 3]
 *
 * Output -
 * [
 *  []
 *  [1]
 *  [1, 2]
 *  [1, 2, 3]
 *  [1, 3]
 *  [2]
 *  [2, 3]
 *  [3]
 * ]
 */
public class GenerateSubsets {

    private static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3));
        generateSubset(list);
    }

    private static void generateSubset(ArrayList<Integer> list) {

    }
}
