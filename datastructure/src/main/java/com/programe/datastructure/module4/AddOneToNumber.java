package com.programe.datastructure.module4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Q1. Add One To Number
 * Problem Description
 *
 * Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 * NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
 * For example: for this problem, the following are some good questions to ask :
 *
 * Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
 * A: For the purpose of this question, YES
 * Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
 * A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
 *
 * Example Input -
 * [1, 2, 3]
 * Output -
 * [1, 2, 4]
 *
 * Example Input -
 * [1, 2, 9]
 * Output -
 * [1, 3, 0]
 */
public class AddOneToNumber {
    public static void main(String[] args) {
        int[] arr = {0,3,7,6,4,0,5,5,5};
        int[] result = bruteForce(arr);
       for(int i=0;i<result.length;i++) {
           System.out.printf("%d, ",result[i]);
       }
        System.out.println();
        int[] result2 = bruteForce2(arr);
        for(int i=0;i<result2.length;i++) {
            System.out.printf("%d, ",result2[i]);
        }

    }



    private static int[] bruteForce2(int[] arr){
        boolean flag=false;
       int count=0;
       //remove first 0 element from array -
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>0) {
                break;
            } else {
                count++;
            }
        }
        int[] filterArray=null;
        if(count==arr.length) {
            filterArray= new int[1];
        } else {
            filterArray = new int[arr.length-count];

        }
        for(int i=count, j=0;i<arr.length;i++) {
            filterArray[j++] = arr[i];
        }

        for(int i=filterArray.length-1;i>=0;i--) {
            if(filterArray[i]+1==10) {
                filterArray[i]=0;
            } else {
                filterArray[i]+=1;
                flag=true;
                break;
            }
        }

        if(flag) {
            return filterArray;
        } else {
            int[] arr2 = new int[filterArray.length+1];
            arr2[0]=1;
            return arr2;
        }

    }



    /**
     * it will not work for large number
     * @param arr
     * @return
     */
    private static int[] bruteForce(int[] arr) {
        int num=0;
        for(int i=0;i<arr.length;i++) {
            num=num*10+arr[i];

        }
        num+=1;
       List<Integer> result = new ArrayList<>();
       while(num>0) {
           result.add(num%10);
           num/=10;
       }
       int[] arrResult = new int[result.size()];
       int index=arrResult.length-1;
       for(int i : result) {
           arrResult[index--]=i;
       }
        return arrResult;
    }
}
