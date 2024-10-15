package com.programe.datastructure.tree.recursion;

import java.util.*;

public class Permutations {
    public static void main(String[] args) {

        /**
         * ================== Print All Permutations ====
         * Givn an array of size N which contains distinct integers. You have to print all the possible
         * permutations.
         *
         * Sample Input -
         * arr = {1,2,3}
         * Sample Output -
         * 123
         * 132
         * 213
         * 231
         * 312
         * 321
         *
         *Note - the total no of permutations = N!
         *
         */
        int[] arr = {1,2,3};
        backTrackingApproach(arr);

    }

    private static void backTrackingApproach(int[] arr) {

        printPermutations(arr, 0, new boolean[arr.length], new ArrayList<Integer>());

    }

    /**
     * TimeComplexity - O(n! * n)
     * Space Complexity - O(n)
     * @param arr
     * @param pos
     * @param selected
     * @param ans
     */
    private static void printPermutations(int[] arr, int pos, boolean[] selected,
                                          ArrayList<Integer> ans) {

        //boolean[3] -
        //ans -
        //pos

        if(pos==arr.length) {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<arr.length;i++) {
              if(selected[i]==false) {
                  selected[i] = true;
                  ans.add(arr[i]);
                  printPermutations(arr, pos+1, selected, ans);
                  selected[i] = false;
                  ans.remove(ans.size()-1);
              }
        }
    }


}