package com.programe.datastructure.assignments.Oct18;

import java.util.ArrayList;
import java.util.Arrays;

public class AtleastOneElementGreater {

    public static void main(String[] args) {

        /**
         * Problem Description
         * Given an array A of N integers.
         * Count the number of elements that have at least 1 elements greater than itself.
         *
         * Problem Constraints
         * 1 <= N <= 105
         * 1 <= A[i] <= 109
         *
         * Example Input
         * Input 1:
         * A = [3, 1, 2]
         * Output 1:
         * 2
         *
         * Explanation 1:
         * The elements that have at least 1 element greater than itself are 1 and 2
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(6));
        System.out.printf("Count atleast one greater element - {%d}",solve(list));

    }

    public static  int solve(ArrayList<Integer> list) {
        int count=0;
        int max = getMax(list);
        for(int i=0;i<list.size();i++) {
            if(max==list.get(i)) {
                count++;
            }
        }
        return list.size()-count;
    }

    public static int getMax(ArrayList<Integer> list){
        int x=0, y=list.size()-1;
        int max=list.get(0);
        int n = list.size()-1;
        while(x<y) {
            if(list.get(x)>=list.get(y) && list.get(x)>max) {
                max = list.get(x);
            } else if(list.get(y)>=list.get(x) && list.get(y)>max) {
                max = list.get(y);
            }
            x++;y--;
        }
        return max;
    }
}
