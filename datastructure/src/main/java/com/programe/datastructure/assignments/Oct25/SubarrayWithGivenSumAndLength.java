package com.programe.datastructure.assignments.Oct25;

import java.util.ArrayList;
import java.util.Arrays;

public class SubarrayWithGivenSumAndLength {
    public static void main(String[] args) {

        /**
         * Q3. Sub-array with given sum and length
         *
         * Problem Description
         * Given an array A of length N. Also given are integers B and C.
         * Return 1 if there exists a subarray with length B having sum C and 0 otherwise
         *
         * Problem Constraints
         * 1 <= N <= 105
         * 1 <= A[i] <= 104
         * 1 <= B <= N
         * 1 <= C <= 109
         *
         * Example Input
         *
         * Input 1:
         * A = [4, 3, 2, 6, 1]
         * B = 3
         * C = 11
         *Example Output
         * Output : 1
         * Explanation 1:
         * The subarray [3, 2, 6] is of length 3 and sum 11.
         *
         * Input 2:
         * A = [4, 2, 2, 5, 1]
         * B = 4
         * C = 6
         * Output : 0
         * Explanation 2:
         * There are no such subarray.
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(4, 3, 2, 6, 1));
        int b=3;
        int c=11;
        System.out.printf("\nis B length of SubArray equal to - C - {%d}",bruteForceApproach(list, b, c));
        System.out.printf("\nis B length of SubArray equal to - C - {%d}",slideWindowTechnique(list, b, c));

    }


    private static int slideWindowTechnique(ArrayList<Integer> list, int b, int c) {
        int i=0;
        int e=b-i-1;
        int n=list.size();
        int sum=0;
        while(e<n) {
            if(i==0) {
                for(int j=i;j<=e;j++) {
                    sum += list.get(j);
                }
            } else {
                sum = sum-list.get(i-1)+list.get(e);
            }
            if(sum==c) {
                return 1;
            }
            e++;i++;
        }
        return 0;
    }


    /**
     * O(N^2)
     * @param list
     * @param b
     * @param c
     * @return
     */
    public static int bruteForceApproach(ArrayList<Integer> list, int b, int c){
        int i=0;
        int e=b-i-1;
        int n=list.size();
        while(e<n) {
            int sum=0;
            for(int j=i;j<=e;j++) {
                sum += list.get(j);
            }
            if(sum==c) {
                return 1;
            }
            i++;e++;
        }
        return 0;
    }
}
