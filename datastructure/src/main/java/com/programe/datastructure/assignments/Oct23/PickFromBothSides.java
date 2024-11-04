package com.programe.datastructure.assignments.Oct23;

import java.util.ArrayList;
import java.util.Arrays;

public class PickFromBothSides {

    public static void main(String[] args) {

        /**
         * Q1. Pick from both sides!
         * Problem Descriptio
         * You are given an integer array A of size N.
         * You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost
         * element of the array A.
         * Find and return the maximum possible sum of the B elements that were removed after the B operations.
         * NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
         * Remove 3 elements from front and 0 elements from the back, OR
         * Remove 2 elements from front and 1 element from the back, OR
         * Remove 1 element from front and 2 elements from the back, OR
         * Remove 0 elements from front and 3 elements from the back.
         *
         * Problem Constraints
         * 1 <= N <= 105
         * 1 <= B <= N
         * -103 <= A[i] <= 103
         *
         * Example -
         *Input 1:
         *  A = [5, -2, 3 , 1, 2]
         *  B = 3
         *  Output - 8
         *  Explanation  -
         *  Remove element 5 from front and element (1, 2) from back so we get 5 + 1 + 2 = 8
         *
         *  Input 2:
         *  A = [ 2, 3, -1, 4, 2, 1 ]
         *  B = 4
         *  Output - 9
         *  Explanation -
         *  Remove the first element and the last 3 elements. So we get 2 + 4 + 2 + 1 = 9
         *
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(-969,-948,350,150,-59,724,966,430,107,-809,-993,337,457,-713,753,-617,-55,-91,-791,758,-779,-412,-578,-54,506,30,-587,168,-100,-409,-238,655,410,-641,624,-463,548,-517,595,-959,602,-650,-709,-164,374,20,-404,-979,348,199,668,-516,-719,-266,-947,999,-582,938,-100,788,-873,-533,728,-107,-352,-517,807,-579,-690,-383,-187,514,-691,616,-65,451,-400,249,-481,556,-202,-697,-776,8,844,-391,-11,-298,195,-515,93,-657,-477,587));
        int b= 81;
        System.out.printf("maximum sum of array - {%d}",solve(list, b));
    }


    public  static int solve(ArrayList<Integer> list, int b) {
        //first get the front sum for b elements -
        int frontSum =0;
        int n = list.size();
        for(int i =0 ;i<b;i++) {
            frontSum+=list.get(i);
        }

        //find the left growing sum and right growing and compare both with maxSum and assign maxSum if lesser then
        //both growing sum
        int rightGrowingSum=0;
        int frontGrowingSUm=0;
        int maxSum=frontSum;
        for(int i=0;i<b;i++) {
            rightGrowingSum += list.get(n-1-i);
            frontGrowingSUm += list.get(b-i-1);
            int sum = frontSum-frontGrowingSUm+rightGrowingSum;
            if(sum>maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
