package com.programe.datastructure.module6.assignment.day50;

/**
 * Q4. Subarray with given sum
 * Problem Description
 * Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
 * If the answer does not exist return an array with a single integer "-1".
 * First sub-array means the sub-array for which starting index in minimum.
 *
 * Example Input
 * Input 1:
 *  A = [1, 2, 3, 4, 5]
 *  B = 5
 *
 *  Output 1:
 *  [2, 3]
 *
 *  Explanation -
 *   [2, 3] sums up to 5.
 */
public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1,1000000000};
        int n=1000000000;
        int[] result = bruteForceSolution(arr, n);
        for(int i=0;i<result.length;i++) {
            System.out.printf("%d, ",result[i]);
        }
        System.out.println();
        //two pointer approach
        int[] result1 = twoPointerApproach(arr,n);
        for(int i=0;i<result1.length;i++) {
            System.out.printf("%d, ",result1[i]);
        }

    }

    private static int[] twoPointerApproach(int[] arr, int n) {

        int x=0;int y=0;
        int sum=arr[x];
        boolean flag=false;
        while(y<arr.length) {
            //if array single integer is eques to n
            if(sum==n) {
                int[] result = new int[y-x+1];
                for(int i=0;i<result.length;i++) {
                    result[i] = arr[x++];
                }
                return result;
            } else if(sum<n) {
                y++;
                if(y<arr.length) {
                    sum+=arr[y];
                }
            } else {
                sum-=arr[x++];
            }
        }
            return new int[]{-1};
    }


    private static int[] bruteForceSolution(int[] arr, int n){

        int i=0; int j=0;
        boolean flag = false;
        while(i<arr.length) {
            //if ith element is equal to n then
            if(arr[i]==n) {
                flag=true;
                j=i;
                break;
            } else {
                j=i+1;
            }
            int sum=arr[i];
            while(j<arr.length) {
                sum+= arr[j];
                if(sum>=n) {
                    if(sum==n) flag = true;
                    break;
                }
                j++;
            }
            if(flag) break;
            i++;
        }
        int[] result = new int[j-i+1];
        if(flag) {
           for(int k=0;k<result.length;k++) {
               result[k] = arr[i++];
           }
        } else {
             result[0] = -1;
        }
        return result;
    }


}
