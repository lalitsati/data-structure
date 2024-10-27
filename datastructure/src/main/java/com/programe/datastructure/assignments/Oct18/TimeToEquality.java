package com.programe.datastructure.assignments.Oct18;

import java.util.ArrayList;
import java.util.Arrays;

public class TimeToEquality {

    public static void main(String[] args){

        /**
         * Problem Description
         * Given an integer array A of size N. In one second, you can increase the value of one element by 1.
         * Find the minimum time in seconds to make all elements of the array equal.
         *
         * Problem Constraints
         * 1 <= N <= 1000000
         * 1 <= A[i] <= 1000
         *
         *Example Input
         * A = [2, 4, 1, 3, 2]
         *
         * Example Output
         * 8
         *
         * Example Explanation
         * We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
         *
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2, 4, 1, 3, 2));
        System.out.printf("\n\n\nTotal Time taken in equality- {%d}",solve(list));

    }

    /**
     * Solution for finding Time to Equality
     * @param list
     * @return
     */
    public static int solve(ArrayList<Integer> list) {
        int max = maxElementFromArr(list);
        System.out.printf("maximum value in the array - {%d}",max);

        //calculate the time in second where each step will take minimum 1 second
        int totalTime=0;
        for(int i=0;i<list.size();i++) {
            totalTime += max-list.get(i);
        }

        return totalTime;
    }

    /**
     * find maximum element from the array
     * @param list
     */
    private static int maxElementFromArr(ArrayList<Integer> list) {

        int x=0,y=list.size()-1;
        int max=0;
        while(x<y) {
            if(list.get(x)>=list.get(y) &&
                    list.get(x)>max) {
                max = list.get(x);
            } else if(list.get(y)>list.get(x) &&
                    list.get(y)>max){
                max = list.get(y);
            }
            x++;y--;
        }
        return max;
    }


}
