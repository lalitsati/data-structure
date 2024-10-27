package com.programe.datastructure.assignments.Oct22;

import java.util.ArrayList;
import java.util.Arrays;

public class QuerySumInArray {

    public static void main(String[] args) {

        /**
         * DS1- Given N size of array & Q is the query, for each query calculate sum of all elements in range [L,R]
         * Note - L & R both are indexes such that L<=R
         * Example - [-3.6,6,2,4,5,2,8,-9,3,4]
         * L=4, R=8 --------> Output - 19
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<ArrayList<Integer>> query = new ArrayList<>();
        ArrayList<Integer> subQuery = new ArrayList<>();
        subQuery.addAll(Arrays.asList(0,3));
        query.add(subQuery);

        subQuery = new ArrayList<>();
        subQuery.addAll(Arrays.asList(1, 2));
        query.add(subQuery);



        bruteForceApproach(list, query);
        System.out.print("\n\nQuery result usiing Commulative sum(Prefix array sum) !!!!");
        commulativeSumApproach(list, query);

    }

    /**
     * Time Complexity - O(N)
     * Commulative sum - while using commulative sum to calcaulate sum from left to right the ans will be sum of
     * right - sum of left (sum[R]-sum[L-1])
     * prefix sum Array - first we have to convert our current array to prefix sum array for example -
     * original array - {-3,6,2,4,5,2,8,-9,3,1}
     * converted prefix array - {-3,3,5,9,14,16,24,15,18,19}
     * @param list
     * @param query
     */
    private static ArrayList<Long> commulativeSumApproach(ArrayList<Integer> list,
                                               ArrayList<ArrayList<Integer>> query) {
        ArrayList<Long> rangeSum = new ArrayList<>();
        ArrayList<Long> prefix = new ArrayList<>();
        //first step to find the commulative sum (prefix sum array -)
        long preFixSum = list.get(0);
        prefix.add(preFixSum);
        for(int i=1;i<list.size();i++) {
            preFixSum += list.get(i);
            prefix.add(preFixSum);
        }

        //after getting prefix sum, now solve the query -
        for(int i=0;i<query.size();i++) {
           long sum=0;
           int l = query.get(i).get(0);
           int r = query.get(i).get(1);
           if(l==0) {
               sum = prefix.get(r);
           } else {
               sum = prefix.get(r) - prefix.get(l-1);
           }
            rangeSum.add(sum);
            //System.out.printf("\nSum of Indexs - [%d][%d] -- {%d}",l,r,sum);
        }
        return rangeSum;
    }

    /**
     * Time Complexity - O(N*Q)   (N is for finding sum in array, and Q is for query)
     * Brute Force Solution
     * @param list
     * @param query
     */
    private static void bruteForceApproach(ArrayList<Integer> list,
                                           ArrayList<ArrayList<Integer>> query) {

        for(int i=0;i<query.size();i++) {
            int x = query.get(i).get(0);
            int y = query.get(i).get(1);
            int sum=0;
            while(x<=y) {
                sum+= list.get(x);
                x++;
            }
            System.out.printf("\nSum of Indexs - [%d][%d] -- {%d}",query.get(i).get(0),y,sum);
        }
    }


    public static void print(int[] arr) {
        for(int i: arr) {
            System.out.print(i+",");
        }
    }
}
