package com.programe.datastructure.arrays;
import java.util.*;

public class ThreeSumProblems {

    public static void main(String[] args) {

        //Three sum problems means we have to find out three elements from Array which having sum is equal to value of N
        //where N is given an +Integer
        //Examplae - int[] arr = {8,2,6,9,3,4,5,7,9};
        //N=13
        // i+j+k = N   (i+j=N-k) OR (k=N-(i+j))
        int[] arr = {8,2,6,9,3,4,5,7,9};
        int n=13;
        twoForLoopWithHashMapSolution(arr, n);
        bruteForceApproach(arr, n);
        twoPointerApproach(arr, n);
    }

    /**
     * Tn = O(n2)
     * Sn = O(1)
     * @param arr
     * @param n
     */
    private static void twoPointerApproach(int[] arr, int n) {
        //Sort An array
        //set two pointer pointer1 = i+1, pointer2=arr.length-1
        //check three sum
        //if 3Sum==NUm - return value, of i,pointer1,pointer2
        //pointer1++ and pointer2--

        //if 3Sum>n then pointer2--
        //if 3Sum<n then pointer1++

        //this inner loop will rum till pointer2>pointer1
        Arrays.sort(arr);
        System.out.print("Output Through Two Pointer Approach !!- ");
        for(int i=0;i< arr.length;i++){
            int pointer1 = i+1;
            int pointer2 = arr.length-1;
            while(pointer2 > pointer1) {
                int _3Sum = arr[i]+arr[pointer1]+arr[pointer2];
                if(_3Sum==n) {
                    System.out.print(arr[i]+"-"+arr[pointer1]+"-"+arr[pointer2]+" , ");
                    pointer2--;
                    pointer1++;
                } else if(_3Sum>n) {
                    pointer2--;
                } else {
                    pointer1++;
                }
            }
        }

    }

    /**
     * Tn = On(3)
     * Sn = O(n)
     * @param arr
     * @param n
     */
    private static void bruteForceApproach(int[] arr, int n) {
        //Without using HashMap -
        List<String> result = new ArrayList<String>();
        for(int i=0;i< arr.length;i++) {
            for(int j=i+1;j< arr.length;j++) {
                for(int k=j+1;k< arr.length;k++) {
                    if((arr[i]+arr[j]+arr[k])==n) {
                        result.add(arr[i]+"-"+arr[j]+"-"+arr[k]);
                    }
                }
            }
        }
        System.out.println("Output Through Brute Force !!- "+result);
    }

    /**
     * Tn = On(2)
     * Sn = O(n+m)
     * @param arr
     * @param n
     */
    private static void twoForLoopWithHashMapSolution(int[] arr, int n) {

        Map<Integer, Integer> tmpMap = new HashMap<Integer, Integer>();
        List<String> result = new ArrayList<String>();
        //Traversing inside array
        for(int i=0;i<arr.length;i++) {
            //Traversing inside array to get second pair with combination of I
            resetHashMap(tmpMap, arr,i);
            for(int j=i+1;j<arr.length;j++) {
                tmpMap.put(arr[j],tmpMap.get(arr[j])-1);
                int k = n-(arr[i]+arr[j]);
                //find is this K exist in HashMap -
                if(tmpMap.containsKey(k) && tmpMap.get(k)>0) {
                    result.add(arr[i]+"-"+arr[j]+"-"+k);
                    tmpMap.put(k,tmpMap.get(k)-1);
                }
            }
        }
        //print find combination of elements -
        System.out.println("Combination of 3 Sum -"+result);

    }

    private static void resetHashMap(Map<Integer, Integer> tmpMap, int[] arr, int i) {
        tmpMap.clear();
        for(i=i+1;i< arr.length;i++) {
            if(tmpMap.containsKey(arr[i])) {
                tmpMap.put(arr[i],(tmpMap.get(arr[i])+1));
            } else {
                tmpMap.put(arr[i],1);
            }
        }

    }
}