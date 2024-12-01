package com.programe.datastructure.assignments.Nov14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class RepeatNumberInGivenCondition {
    public static void main(String[] args) {
        /**
         * Q1. N/3 Repeat Number
         * Problem Description
         * You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in
         * the array in linear time and constant additional space.
         * If so, return the integer. If not, return -1.
         * If there are multiple solutions, return any one.
         * Note: Read-only array means that the input array should not be modified in the process of solving the
         * problem
         *
         * Problem Constraints
         * 1 <= N <= 7*105
         * 1 <= A[i] <= 109
         *
         * Example Input -
         * Input 1:
         * [1,2,3,1,1]
         * Output1 - 1
         * Explanation -
         * 1 occurs 3 times which is more than 5/3 times.
         *
         * Input 2 -
         * [1 2 3]
         * Output 2 - -1
         * Explanation -
         * No element occurs more than 3 / 3 = 1 times in the array.
         *
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList( 1000441, 1000441, 1000994));
        System.out.print("\nRequired Number is - "+bruteForceApproach(list));
        System.out.print("\nRequired Number is - "+ optimizedSolution(list));

    }

    public static int optimizedSolution(ArrayList<Integer> list){
        //sort array
        //compare next element with current element and increse count
        Collections.sort(list);
        int count=0;
        int query = list.size()/3;
        int n = list.size();
        for(int i=0;i<list.size();i++) {
            count++;
            if(count>query) {
                return list.get(i);
            }
            if(i<n-1 && !Objects.equals(list.get(i), list.get(i + 1))) {
                count=0;
            }

        }
        return -1;
    }


    /**
     * in Brute force approach Time will be exceed for long array
     * @param list
     * @return
     */
    public static int bruteForceApproach(ArrayList<Integer> list){
        //Get value of n which is constant as per question n/3;
        int n = list.size()/3;
        for(int i=0;i<list.size();i++) {
                //search each element count and set its value negative -
            if(list.get(i)<0) {
                continue;
            }
            if(countElement(list, i+1,list.size())>n) {
                return list.get(i);
            }
        }
        return -1;
    }

    public static int countElement(ArrayList<Integer> list, int x, int y){
        int count=1;
        int n = list.get(x-1);
        while(x<y) {
            if(list.get(x)==n) {
                count++;
            }
            x++;
        }
        return count;
    }
}
