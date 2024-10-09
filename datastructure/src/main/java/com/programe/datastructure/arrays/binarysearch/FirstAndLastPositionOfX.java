package com.programe.datastructure.arrays.binarysearch;

public class FirstAndLastPositionOfX {

    public static void main(String[] args) {
        /**
         * Given sorted array, and target(X). You need to find the first and last position of that target in the array.
         * Note - if target is not present in the array, return -1
         *
         * Example -
         * N=10 (size of the array)
         * arr = {2,3,3,4,5,5,5,5,5,8}
         * x = 5
         * Sample Output - 4,8
         */
        int[] arr = {2,3,3,4,5,5,5,5,5,8};
        int x = 5;
        System.out.println("Position of First and Last for X :  "+bruteForceSolution(arr, x));
        binarySearchMethod(arr, x);
        usingRecursion(arr, x);

    }



    /**
     * Time Complexity - O(logN)
     * Space Complexity - O(1)
     * @param arr
     * @param x
     */
    private static void binarySearchMethod(int[] arr, int x) {

        int first=-1, left=0, right= arr.length-1, mid=0;
        //find the first position of the element
        while(left<=right) {
            mid = (left+right)/2;
            //if mid == x then check first position of X
            if(arr[mid]==x) {
                first = mid;
                //find the first position because it could be not first position
                right = mid-1;
            } else if(x>arr[mid]) {
                // if mid>x then discard the value of left = mid+1
                left = mid+1;
            } else {
                //if mid < x then discard the value of right = mid-1
                right = mid-1;
            }
        }

        int last=-1;
        left=0;
        right= arr.length-1;
        //find the last position of the element
        while(left<right) {
            mid = (left+right)/2;
            //if mid == x then check first position of X
            if(arr[mid]==x) {
                last = mid;
                //find the last position because it could be not last position
                left = mid+1;
            } else if(arr[mid]>x) {
                // if mid>x then discard the value of left = mid+1
                left = mid+1;
            } else {
                //if mid < x then discard the value of right = mid-1
                right = mid-1;
            }
        }
        System.out.println("First and last position of the x is -  "+first+" "+last);
    }

    /**
     * Time Complexity = O(n)
     * Space Complexity = O(1)
     * @param arr
     * @param x
     * @return
     */
    public static String bruteForceSolution(int[] arr, int x) {

        String result = "";
        boolean searchFlag=false;
        //Traverse an array
        for (int i = 0; i < arr.length; i++) {
            //check if element == x then keep position in result
            if (arr[i] == x) {
                result = i + "";
                searchFlag=true;
                //now check last element
                for (int j = i + 1; j < arr.length; j++) {
                    //if found last element then return result
                    if (arr[j] != x) {
                        result = result+","+ (j-1);
                        return result;
                    }
                }
            }
        }
        //if loop end then return -1 it means x is not present in array
        if(searchFlag) {
            return result;
        } else {
            return "-1";
        }
    }


    /**
     * '
     * @param arr
     * @param x
     */
    private static void usingRecursion(int[] arr, int x) {
        System.out.println("first element - "
                +resursion(arr, 0, arr.length-1,x,true)+" "+
                resursion(arr, 0, arr.length-1,x,false));

    }
    private static int resursion(int[] arr, int left, int right, int x, boolean isFirst) {
        int position=-1;
        int mid = (left+right)/2;
        if(arr[mid]==x) {
            position = mid;
            if(isFirst) {
                right=mid-1;
            } else {
                left = mid+1;
            }
        } else if(x>arr[mid]) {
            left = mid+1;
        } else {
            right = mid-1;
        }

        if(left<right) {
            return resursion(arr, left, right,x,isFirst);
        }
        return position;
    }


}
