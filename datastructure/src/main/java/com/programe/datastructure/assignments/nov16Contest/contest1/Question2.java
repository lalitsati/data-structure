package com.programe.datastructure.assignments.nov16Contest.contest1;

import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        /**
         * Samantha is a teacher, who is teaching a group of students about divisibility of 7, to make the lesson more
         * interesting she gives them an array A of size N and asks then Q queries given by B.
         * in each query she gives then a range from L To R, given by B[i][0] to B[i][1] and asks them to find the
         * count of number divisibility by 7 in subarray A[L], A[L+1].....A[R]
         * since some students are struggling to solve the problem, Samantha asks for your help to come up with solution
         *
         * Problem Constraints -
         * 1<=N<=10^5
         * 1<=Q<=10^6
         * 1<=A[i]<=10^9
         *
         * Example -
         * A = [2,7,14,5,7]
         * B = [
         *      [1,2]
         *      [2,4]
         *
         * ]
         *Output - [2,2]
         * Explanation -
         * The subarray for the first query is [2,7,14] - divisibility by 7 counts are 2
         * the subarray for the second query is [14,5,7] - divisibility by 7 counts are 2
         */
        ArrayList<Integer> list = new ArrayList<>(List.of(2,7,14,5,7));
        ArrayList<ArrayList<Integer>> queries = new ArrayList<>();
        queries.add(new ArrayList<>(List.of(1,2)));
        queries.add(new ArrayList<>(List.of(2,4)));
        queries.add(new ArrayList<>(List.of(3,4)));
        printResult(solve(list, queries));

    }

    /**
     * TC - O(N)
     * @param list
     * @param queries
     * @return
     */
    public static ArrayList<Integer> solve( ArrayList<Integer> list,
                             ArrayList<ArrayList<Integer>> queries){

        int n = list.size();
        int count=0;
        //create one prefix array first
        for(int i=0;i<n;i++) {
            if(list.get(i)%7==0) {
                count++;
            }
            list.set(i, count);
        }
        //find the queries -
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<queries.size();i++) {
            int left=queries.get(i).get(0);
            int right = queries.get(i).get(1);
            if(left==0) {
                result.add(list.get(right));
            } else {
                result.add(list.get(right)-list.get(left-1));
            }
        }
        return result;
    }

    public static void  printResult( ArrayList<Integer> list){
        System.out.print("\nList - [");
        for(int i:list) {
            System.out.print(i+",");
        }
        System.out.print("]\n");
    }
}
