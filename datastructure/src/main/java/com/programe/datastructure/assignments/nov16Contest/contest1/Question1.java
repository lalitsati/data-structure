package com.programe.datastructure.assignments.nov16Contest.contest1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        /**
         * Given an Integer array A, find if an Integer p exists in the array such that the number of Integers greater
         * then p in the array equals p.
         * Note - P is a noable integer, if the count of integer P is equal to P
         * Problem constant -
         * 1<=|A|<=2*10^5
         * -10^8<=A[i]<=10^8
         *
         * Example -
         * Input1 - A- [1,0,-3,8]
         * Output - 1
         * Explaination -
         * 1 - in array having only one element is greater then of 1  (count=1)
         * 0 - in array having two elements is greater then of 0  (count=0)
         * -3 - in array having 3 element is greater then of -3 so it is not equal to of -3 (count=0)
         * 8 - there is no any elements are present in array which are greater then of 8 hence (count=0)
         * So finally output is - 1
         *
         */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,-3,1,2,2,77,88));
        /*System.out.print("Count of Nobal integers - "+
                findCountOfNobalInteger(list));*/

        System.out.print("Count of Nobal integers - "+
                handleDistinctInteger(list));

    }


    /**
     * TC- (O(N))
     * @param list
     * @return
     */
    public static int handleDistinctInteger(ArrayList<Integer> list){
        Collections.sort(list);
        int gc = 0, count=0;
        int n = list.size();
        if(list.get(n-1)==0) {
            count++;
        }
        for(int i=n-2;i>=0;i--) {
            if(list.get(i)!=list.get(i+1)) {
                gc=n-1-i;
            }
            if(gc==list.get(i)) {
                count++;
            }
        }
    return count;
    }

    /**
     * this approach will not handled distinct integer
     * TC- (O(n))
     * @param list
     * @return
     */
    private static int findCountOfNobalInteger(ArrayList<Integer> list) {
        Collections.sort(list);
        int n = list.size();
        int count=0;
        for(int i=0;i<n;i++) {
            if(list.get(i)==(n-1)-i){
                count++;
            }
        }
        return count;
    }
}
