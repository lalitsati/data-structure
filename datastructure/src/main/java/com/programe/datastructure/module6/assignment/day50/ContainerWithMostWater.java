package com.programe.datastructure.module6.assignment.day50;

/**
 * Q2. Container With Most Water
 * Problem Description
 * Given N non-negative integers A[0], A[1], ..., A[N-1] , where each represents a point at coordinate (i, A[i]).
 * N vertical lines are drawn such that the two endpoints of line i is at (i, A[i]) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * You need to return this maximum area.
 * Note: You may not slant the container. It is guaranteed that the answer will fit in integer limits.
 *
 * Example Input -
 * A = [1, 5, 4, 3]
 * Output - 6
 * Example Explanation -
 * 5 and 3 are distance 2 apart. So size of the base = 2. Height of container = min(5, 3) = 3.
 * So total area = 3 * 2 = 6
 *
 */
public class ContainerWithMostWater {

    public static void main(String[] args ) {

        int[] arr = {1, 5, 4, 3};
        System.out.println("Container Size - "+bruteForceApprach(arr));
        System.out.println("Container Size Two pointer  - "+twoPointerApproach(arr));


    }


    private static int  twoPointerApproach(int[] arr) {
        int x=0;
        int y=arr.length-1;
        int ans=0;
        while(x<y) {
            int continerSize = (y-x)*Math.min(arr[x], arr[y]);
            if(ans<continerSize){
                ans = continerSize;
            }
            if(arr[x]<arr[y]) {
                x++;
            } else {
                y--;
            }

        }
        return ans;
    }

    private static int bruteForceApprach(int[] arr){

        int result=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                int containerSize = (j-i)*Math.min(arr[i],arr[j]);
                if(containerSize>result) {
                    result = containerSize;
                }
            }
        }
        return result;
    }

}
