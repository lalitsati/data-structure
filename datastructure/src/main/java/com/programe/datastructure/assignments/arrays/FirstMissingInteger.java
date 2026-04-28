package com.programe.datastructure.assignments.arrays;

import java.util.*;

/**
 * Q1. First Missing Integer
 * Problem Description -
 * Given an unsorted integer array, A of size N. Find the first missing positive integer.
 * Note: Your algorithm should run in O(n) time and use constant space.
 * Example Input
 * Input 1:
 * [1, 2, 0]
 * output -
 * 3
 * Explanation 1:
 * A = [1, 2, 0]
 * First positive integer missing from the array is 3.
 *
 * Input 2:
 * [3, 4, -1, 1]
 * Output - 2
 *
 *
 *
 *
 */
public class FirstMissingInteger {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,1,2);
       // System.out.println(bruteForceAppraoch(list));
        System.out.println(optimizedWay(list));

    }

    private static int optimizedWay(List<Integer> list) {
        int n = list.size();
        for(int i=0;i<list.size();i++) {
           int element = list.get(i);
            if(element<0) {
                list.set(i, list.size()+1);
            }else if(element>0 && element<n) {
                list.set(element-1, -1*Math.abs(element));
            }
        }
        for(int i=0;i<list.size();i++) {
            if(list.get(i)>0) return i+1;
        }
        return list.size();
    }

    private static int bruteForceAppraoch(List<Integer> list){
        Collections.sort(list);
        int i=1;
        for(int j=0;j<list.size();j++) {
            if(list.get(j)<i) continue;;
            if(i==list.get(j)) {
                i++;
                continue;
            }
            break;
        }
        return i;
    }
}
