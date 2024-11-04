package com.programe.datastructure.assignments.Oct25;

import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayWithLeastAverage {
    public static void main(String[] args) {
        /**
         * Q2. Subarray with least average
         *
         * Problem Description
         * Given an array A of size N, find the subarray of size B with the least average.
         *
         * Problem Constraints
         * 1 <= B <= N <= 105
         * -105 <= A[i] <= 105
         *
         * Output Format
         * Return the index of the first element of the subarray of size B that has least average.
         * Array indexing starts from 0.
         *
         * Example Input
         * Input 1:
         * A = [3, 7, 90, 20, 10, 50, 40]
         * B = 3
         *Output 1: 3
         * Explanation 1:
         * Subarray between indexes 3 and 5
         * The subarray {20, 10, 50} has the least average
         * among all subarrays of size 3.
         *
         * Input 2:
         * A = [3, 7, 5, 20, -10, 0, 12]
         * B = 2
         * Output 2: 4
         * Explanation 2:
         *  Subarray between [4, 5] has minimum average
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(20,3,13,5,10,14,8,5,11,9,1,11));
        int b=9;
        System.out.printf("Least average starting index is = {%d}",slideWindowTechnique(list, b));


    }

    public static int slideWindowTechnique(ArrayList<Integer> list, int b){
        int i=0;
        int e = b-i-1;
        int n = list.size();
        float sum=0;
        float leastAverage=Float.MAX_VALUE;
        int leastAverageIndex=0;
        while(e<n) {
            if(i==0) {
                for(int j=i;j<=e;j++) {
                    sum += list.get(j);
                }
            } else {
                sum = sum-list.get(i-1)+list.get(e);
            }
            float avg = sum/b;
            if(leastAverage>avg) {
                leastAverage = avg;
                leastAverageIndex=i;
            }
            e++;i++;
        }
        return leastAverageIndex;
    }
}
