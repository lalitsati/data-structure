package com.programe.datastructure.assignments.Oct23;

import java.util.ArrayList;
import java.util.Arrays;

public class LeadersInAnArray {
    public static void main(String[] args) {

        /**
         * Q2. Leaders in an array
         * Problem Description
         * Given an integer array A containing N distinct integers, you have to find all the leaders in array A.
         * An element is a leader if it is strictly greater than all the elements to its right side.
         * NOTE: The rightmost element is always a leader
         *
         * Problem Constraints
         * 1 <= N <= 105
         * 1 <= A[i] <= 108
         *
         * Example Input
         * Input 1:
         *  A = [16, 17, 4, 3, 5, 2]
         *  Output 1:
         * [17, 2, 5]
         *Exaplanation -
         *  Element 17 is strictly greater than all the elements on the right side to it.
         *  Element 2 is strictly greater than all the elements on the right side to it.
         *  Element 5 is strictly greater than all the elements on the right side to it.
         *  So we will return these three elements i.e [17, 2, 5], we can also return [2, 5, 17] or [5, 2, 17] or any
         *  other ordering.
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(16, 17, 4, 3, 5, 2));
        printArr(solve(list));
        printArr(optiMizedSolution(list));

    }



    private static ArrayList<Integer> optiMizedSolution(ArrayList<Integer> list) {

        ArrayList<Integer> result = new ArrayList<>();
        int maxElement=0;
        for(int i=list.size()-1;i>=0;i--) {
            int ithElement= list.get(i);
            if(maxElement<ithElement) {
                maxElement=ithElement;
                result.add(ithElement);
            }
        }
        return result;
    }

    /**
     * O(N^2)
     * @param list
     * @return
     */
    public static ArrayList<Integer> solve(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = list.size();
        for(int i=0;i<n;i++) {
            int iThElement = list.get(i);
            for(int j=i;j<n;j++) {
                if(iThElement<list.get(j)) {
                    break;
                }
                if(j==n-1) {
                    result.add(iThElement);
                }
            }
        }
        return result;
    }

    public static void printArr(ArrayList<Integer> list){
        System.out.print("\n\nLeader Elements are - [");
        for(int i : list) {
            System.out.print(i+",");
        }
        System.out.print("]");
    }
}
