package com.programe.datastructure.arrays;

import java.util.*;

public class MajorityElementProblem {

    public static void main(String[] args) {

        //Given an array. You need to find the majority element in the array
        // Majority element is defined as the element which is appearing more then N/2 time in the array of length n
        // if there is no majority element then return -1
        // Note - only one element can be majority in array
        //Example - N = 10 (size of Array)
        // arr = {2,2,6,6,6,2,2,8,2,2}
        //Output = 2  (because 2 is appearing 6 time which is greater then N/2 = 5)
        int[] arr = {4,1,6,6,6,2,2,8,2,2};
        int n=arr.length;

        System.out.println("OutPut - !! "+bruteForceSolution(arr));
        System.out.println("OutPut - !! "+usingHashMap(arr));
        System.out.println("OutPut - !! "+mooreVotingAlgorithm(arr));



    }

    /**
     * Time Complexity = Tn = O(n)
     * Space Complexity = Sn = O(1)
     * @param arr
     * @return
     */
    private static int mooreVotingAlgorithm(int[] arr) {
        // arr = {2,2,6,6,6,2,2,8,2,2}
        //store arr element(num) and frequence
        // treverse array one by one and check if num==arrElement then increase frequence by 1
        // if num != arrElement then decrease frequence by 1
        // if frequece is 0 then assign num=arrElement
        // at last check what is the value of arrElement and there frequence should be greater then N/2 then return
        // arr element otherwise return -1
        int num=0;
        int freq=0;
        for(int i=0;i<arr.length;i++) {
            //check frequence if 0 then assign arr current element
            if(freq==0) {
                num = arr[i];
            }
            if(num==arr[i]) {
                freq++;
            } else {
                freq--;
            }
        }
        //check num frequence is greater then N/2 or not
        int count=0;
        for(int i=0;i< arr.length;i++) {
            if(arr[i]==num) {
                count++;
            }
        }
        if(count> arr.length/2) {
            return num;
        }
        return -1;
    }

    /**
     * Time Complexity - Tn = O(n)
     * Space Complexity - Sn = O(n)
     * @param arr
     * @return
     */
    private static int usingHashMap(int[] arr) {

        Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
        //Insert all array element in HashMap with there frequences
        for(int i=0;i< arr.length;i++) {
           if(tmp.containsKey(arr[i])) {
               tmp.put(arr[i], tmp.get(arr[i])+1);
           } else {
               tmp.put(arr[i],1);
           }
        }

        int maxValue = 0;
        int maxKey=0;
        //check max frequence of each elements
        for(Map.Entry<Integer, Integer> entry : tmp.entrySet() ) {
            if(entry.getValue()>maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        if(maxValue> arr.length/2) {
            return maxKey;
        }
        return -1;
    }

    /**
     * ------------------------------------------bruteForceSolution-------------
     * Time Complexity - O(n2)
     * Space Complexity - O(1)
     * @param arr
     * @return
     */
    public static int  bruteForceSolution(int[] arr){

        int tmp =-1;
        int count =0;
        int maxCount=0;
        for(int i=0;i<arr.length;i++) {
            count=0;
            if(arr[i]==tmp) continue;
            for(int j=i;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
            if(maxCount<count) {
                maxCount = count;
                tmp = arr[i];
            }
        }
        if(maxCount > arr.length/2) {
            return tmp;
        } else {
            return -1;
        }

    }
}
