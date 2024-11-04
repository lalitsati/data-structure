package com.programe.datastructure.assignments.Oct25;

import java.util.ArrayList;
import java.util.Arrays;

public class CountSubArrayLengthOfK {
    public static void main(String[] args) {
        /**
         * Given an array length of N print start and end indexes of subArray with length of K
         * Input -
         * arr = [3,4,7,2,8]
         * Output -
         * 0,2
         * 1,3
         * 2,4
         *
         * Observation -
         * Starting index = i
         * Ending index -
         * e = [i,k]
         * e = k-i-1
         * loop will run till ending index (e) lest then N
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,4,7,2,8));
        int k=3;
        solve(list, k);



    }

    public static void solve(ArrayList<Integer> list, int k) {

        int e=k-0-1;
        int i=0;
        int n = list.size();
        while(e<n) {
            System.out.printf("\n"+i+" -- "+e);
            i++;
            e++;
        }
    }

}
