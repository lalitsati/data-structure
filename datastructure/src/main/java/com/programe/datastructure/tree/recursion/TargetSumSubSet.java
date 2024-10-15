package com.programe.datastructure.tree.recursion;

import java.util.*;

public class TargetSumSubSet {

    public static void main(String[] args) {

        /**
         * ================ Target Sum SubSet =================
         * Given an integer array of size N and an integer target. Print all the subsets for which the sum is equal to
         * target
         *
         * Sample input
         * arr = {10,20,30,40,50}
         * target = 60
         * Sample Output -
         * 10 20 30
         * 10 50
         * 20 40
         */
        int[] arr={10,20,30,40,50};
        targetSumByBackTracing(arr, 0, 60, new ArrayList<Integer>());

    }

    private static void targetSumByBackTracing(int[] arr, int i, int target,
                                               ArrayList<Integer> ans) {

        if(i==arr.length) {
            if(target==0)
            System.out.println(ans);
            return;
        }


        //select ith element
        ans.add(arr[i]);
        targetSumByBackTracing(arr, i+1, target-arr[i], ans);
        ans.remove(ans.size()-1);

        //reject ith element
        targetSumByBackTracing(arr, i+1, target,ans);
    }


}