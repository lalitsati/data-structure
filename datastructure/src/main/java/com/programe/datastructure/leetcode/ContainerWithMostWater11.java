package com.programe.datastructure.leetcode;

public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        /**
         * 11. Container With Most Water
         * You are given an integer array height of length n. There are n vertical lines drawn such
         * that the two endpoints of the ith line are (i, 0) and (i, height[i]).
         * Find two lines that together with the x-axis form a container, such that the container
         * contains the most water.
         * Return the maximum amount of water a container can store.
         * Notice that you may not slant the container.
         *
         * Input: height = [1,8,6,2,5,4,8,3,7]
         * Output: 49
         * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case,
         * the max area of water (blue section) the container can contain is 49.
         *
         */
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.printf("Maximum Container size - {%d}",findMaxContanerSize(arr));

    }

    private static int  findMaxContanerSize(int[] arr) {
        int x=0,y=arr.length-1;
        int max=0;
        while(x<y) {
            int currentX=x, currentY=y;
            int lesserElement = arr[x]<arr[y]?arr[x++]:arr[y--];
            int containerSize = lesserElement*(currentY-currentX);
            if(containerSize>max) {
                max = containerSize;
            }

        }
        return max;
    }
}
