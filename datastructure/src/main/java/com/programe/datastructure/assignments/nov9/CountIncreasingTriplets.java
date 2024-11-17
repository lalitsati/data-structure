package com.programe.datastructure.assignments.nov9;
import java.util.ArrayList;
import java.util.Arrays;

public class CountIncreasingTriplets {
    public static void main(String[] args) {
        /**
         * Q3. Count Increasing Triplets
         *
         * Problem Description
         * You are given an array A of N elements. Find the number of triplets i,j and k
         * such that i<j<k and A[i]<A[j]<A[k]
         *
         * Problem Constraints
         * 1 <= N <= 103
         * 1 <= A[i] <= 109
         *
         * Example Input
         * Input 1:
         * A = [1, 2, 4, 3]
         * Output - 2
         * Explanation -
         * The triplets that satisfy the conditions are [1, 2, 3] and [1, 2, 4].
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 4, 3));
        //System.out.print("\n\n Count of Triplets - "+bruteForceApproach(list));
        System.out.print("\n\n Count of Triplets - "+centerApproach(list));

    }

    /**
     * O(N^2)
     * @param list
     * @return
     */
    public static int centerApproach(ArrayList<Integer> list){
        int i=0;
        int n = list.size();
        int count=0;
        while(i<n){
            int smallerNum=0;
            int greaterNum=0;
            int currentElement = list.get(i);
            //find number of smaller then on its left
            for(int j=i-1;j>=0;j--) {
                if(currentElement>list.get(j)) {
                    smallerNum++;
                }
            }
            //find number of greater then on its right
            for(int j=i+1;j<n;j++) {
                if(currentElement<list.get(j)) {
                    greaterNum++;
                }
            }
            count += smallerNum*greaterNum;
            i++;
        }
        return count;
    }



    /**
     * O(N^3)
     * @param list
     * @return
     */
    public static int bruteForceApproach(ArrayList<Integer> list){
        int count=0;
        int n = list.size();
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    System.out.println(list.get(i)+","+list.get(j)+","+list.get(k));
                    if((list.get(i)<list.get(j)) &&
                    list.get(j)<list.get(k)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}