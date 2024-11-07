package com.programe.datastructure.assignments.nov5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NobleInteger {
    public static void main(String[] args) {
        /**
         * Q2. Noble Integer
         * Problem Description
         *
         * Given an integer array A, find if an integer p exists in the array such that the number of integers
         * greater than p in the array equals p.
         *
         * Problem Constraints
         * 1 <= |A| <= 2*105
         * -108 <= A[i] <= 108
         *
         * Nobal defination as per question - a number will be nobal integer when array's element which having greater
         * then that particualar number count equal to that nnumber
         *
         * Example Input
         * Input 1:
         *  A = [3, 2, 1, 3]
         *  Output 1: 1
         *  Explanation 1:
         *  For integer 2, there are 2 greater elements in the array..
         *
         *  Example 2 -
         *  Input 2:
         *  A = [1, 1, 3, 3]
         *Output 2: -1
         *Explanation 2:
         *  There exist no integer satisfying the required conditions
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 2, 1, 3));
        System.out.printf("Nobal Count = {%d}",solve( list));

    }

    /**
     *
     * @param list
     * @return
     */
    public static int solve(ArrayList<Integer> list) {
        //sort array
        Collections.sort(list);
        Collections.reverse(list);
        int count=0;
        int nobalCount=0;
        int prevElement=Integer.MIN_VALUE;
        int n = list.size();
        for(int i=0;i<n;i++) {
            int currentElement=list.get(i);
            if(prevElement!=currentElement) {
                count++;
                if(list.get(i)==i) {
                    nobalCount++;
                }
                prevElement=currentElement;
            }
        }
        return nobalCount==0?-1:nobalCount;
    }
}
