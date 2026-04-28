package com.programe.datastructure.assignments.arrays;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Q2. Merge Sorted Overlapping Intervals - 2
 * Problem Description
 * You are given a collection of intervals A in a 2-D array format, where each interval is represented by a pair of integers `
 * [start, end]`. The intervals are sorted based on their start values.
 *
 * Your task is to merge all overlapping intervals and return the resulting set of non-overlapping intervals.
 *
 * Example Input
 * Input 1:
 * [ [1, 3], [2, 6], [8, 10], [15, 18] [16,17]]
 * Output -
 * [ [1, 6], [8, 10], [15, 18] ]
 * Explanation -
 * Merge intervals [1,3] and [2,6] -> [1,6].
 * so, the required answer after merging is [1,6],[8,10],[15,18].
 * No more overlapping intervals present.
 *
 *
 */
public class MergeSortedOverlappingIntervals2 {
    public static void main(String args[]) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(2, 10)));
        list.add(new ArrayList<>(Arrays.asList(4, 9)));
        list.add(new ArrayList<>(Arrays.asList(6, 7)));
        //list.add(new ArrayList<>(Arrays.asList(15, 18)));
        System.out.println(bruteForce(list));



    }


    private static ArrayList<ArrayList<Integer>> bruteForce(ArrayList<ArrayList<Integer>> list){

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(list.get(0));
        int j=0;
        for(int i=1;i<list.size();i++) {
            if(result.get(j).get(1)>list.get(i).get(0)) {
                if(result.get(j).get(1)<list.get(i).get(1)) {
                    result.get(j).set(1,list.get(i).get(1));
                }
            } else {
                result.add(list.get(i));
                j++;
            }
        }
       return result;
    }
}
