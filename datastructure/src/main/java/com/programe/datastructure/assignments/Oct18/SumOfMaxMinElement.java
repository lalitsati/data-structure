package com.programe.datastructure.assignments.Oct18;

import java.util.Arrays;
import java.util.List;

public class SumOfMaxMinElement {

    public static void main(String[] args) {

        /**
         * Q5. Max Min of an Array
         * Problem Description
         * Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
         *
         * Problem Constraints
         * 1 <= N <= 105
         * -109 <= A[i] <= 109
         *
         * Example Input
         * Input 1:
         * A = [-2, 1, -4, 5, 3]
         * Output - 1
         * Explanation 1:
         * Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.
         *
         * Input 2:
         * A = [1, 3, 4, 1]
         * Output - 5
         *
         */

        Integer[] arr = {1, 3, 4, 1};
        List<Integer> list = Arrays.asList(arr);
        System.out.printf("Find sum of Min and Max value - {%d}",findMaxAndMinSum(list));


    }

    /**
     *
     * @param list
     * @return
     */
    private static int  findMaxAndMinSum(List<Integer> list) {
        int min=list.get(0),max=list.get(0);
        for(int i=0;i<list.size();i++) {
            int currentNum = list.get(i);
            if(currentNum>max) {
                max =currentNum;
            } else if(currentNum<min) {
                min = currentNum;
            }
        }
        return max+min;
    }
}
