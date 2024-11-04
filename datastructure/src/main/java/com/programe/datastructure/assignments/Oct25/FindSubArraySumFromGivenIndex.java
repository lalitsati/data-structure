package com.programe.datastructure.assignments.Oct25;

import java.util.ArrayList;
import java.util.Arrays;

public class FindSubArraySumFromGivenIndex {
    public static void main(String[] args) {

        /**
         * Ginen an array size of N, Print sum array sums starting from index no 3
         * Example -
         * [3,8,4,7,9,4,3,2]
         * index no 3 is [7]
         * All SubArray will be from 7 are with sums -
         * {7}              ----> 7
         * {7,9}            ----> 16
         * {7,9,4}          ----> 20
         * {7,9,4,3}        ----> 23
         * {7,9,4,3,2}      ----> 25
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,8,4,7,9,4,3,2));
        int b = 3;
        findAllSums(list, b);
    }

    /**
     * O(N)
     * Prefix array approach -
     * @param list
     * @param b
     */
    private static void findAllSums(ArrayList<Integer> list, int b) {
        ArrayList<Integer> preFixSumList = new ArrayList<>();
        //Get the preFix array -
        int n = list.size();
        preFixSumList.add(list.get(b));
        int k=0;
        for(int i=b+1;i<n;i++) {
            preFixSumList.add(preFixSumList.get(++k-1)+list.get(i));
        }
       for(int i:preFixSumList) {
           System.out.printf("\n{%d}",i);
       }

    }
}
