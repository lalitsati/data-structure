package com.programe.datastructure.leetcode;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        /**
         * ========== Container with Most Water =======
         *You are given an integer array height of length n. There are n vertical lines drawn such that
         *  the two endpoints of the ith line are (i, 0) and (i, height[i]).
         * Find two lines that together with the x-axis form a container, such that the
         * container contains the most water.
         * Return the maximum amount of water a container can store.
         * Notice that you may not slant the container.
         * ================
         * Example -
         * Input: height = [1,8,6,2,5,4,8,3,7]
         * Output: 49
         * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
         * In this case, the max area of water (blue section) the container can contain is 49.
         */

        int[] arr = {1,8,6,2,5,4,8,3,9};
        System.out.printf("Max Container size - {%d}",maxArea(arr));
    }


    public  static int maxArea(int[] arr) {
        //set two pointer left and right
        int left=0, right=arr.length-1;
        int maxContainer =0;

        while(left<right) {
            int containerSize=0;
            if(arr[left]<arr[right]) {
                 containerSize = (right-left)*arr[left];
                if(containerSize>maxContainer) {
                    maxContainer=containerSize;
                }
                left++;
            } else {
                containerSize = (right-left)*arr[right];
                if(containerSize>maxContainer) {
                    maxContainer=containerSize;
                }
                right--;
            }
        }

        return maxContainer;
    }
}