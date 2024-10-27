package com.programe.datastructure.assignments.Oct18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoodPair {

    public static void main(String args[]) {

        /**
         * Problem Description
         *
         * Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and
         * (A[i] + A[j] == B). Check if any good pair exist or not.
         *
         * Problem Constraints
         * 1 <= A.size() <= 104
         * 1 <= A[i] <= 109
         * 1 <= B <= 109
         *
         *
         * Example Input
         *
         * Input 1:
         * A = [1,2,3,4]
         * B = 7
         * Input 2:
         *
         * A = [1,2,4]
         * B = 4
         *
         * Input 3:
         * A = [1,2,2]
         * B = 4
         *
         */
        Integer[] arr = {510827,351151,96897,925335,299818,192489,456948,44720,510589,598577};
        List<Integer> list = Arrays.asList(arr);
        int b=808099;

        System.out.printf("Good Pair Logic - {%d}",bruteForceApproach(list,  b));

    }

    private static int  bruteForceApproach(List<Integer> list, int b) {

        for(int i=0;i<list.size();i++) {
            for(int j=i+1;j<list.size();j++) {
                int sum = list.get(i)+list.get(j);
                if(sum==b) {
                    return 1;
                }
            }
        }
        return 0;
    }


    /**
     * will convert it optimized solution
     * @param list
     * @param b
     * @return
     */
    public  static int solve(List<Integer> list, int b) {

        for(int i=0;i<list.size()-1;i++) {
            int sum = (list.get(i)+ list.get(i+1));
            if(sum==b) {
                return 1;
            }
        }
        return 0;
    }
}
