package com.programe.datastructure.module4;

/**
 * Q3. Rain Water Trapped
 * Problem Description
 * Imagine a histogram where the bars' heights are given by the array A. Each bar is of uniform width, which is 1 unit.
 * When it rains, water will accumulate in the valleys between the bars.
 * Your task is to calculate the total amount of water that can be trapped in these valleys.
 *
 * Example -
 * The Array A = [5, 4, 1, 4, 3, 2, 7] is visualized as below. The total amount of rain water trapped in A is 11.
 *
 * Example iNput -  A = [0, 1, 0, 2]
 * output - 1
 *
 *
 */
public class RainWaterTrapped {
    public static void main(String[] args) {
        int[] arr = {56,6,52,43,23,47,48,38,96,46,30,66,80,15,62,71,61,12,98,9,28,81,70,59,95,34,9,60,70,81,71,67,58,20,22,3,95,85,20,24,74,5,23,33,75,50,38,75,68,26,46,30,75,18,4,42,51,59,8,77};
        System.out.println("Ans - "+ bruteForceApproach(arr));
        System.out.println("Ans1 - "+ optimizedApproach(arr));

    }

    private static int optimizedApproach(int[] arr){
        int[] maxL = new int[arr.length];
        int[] maxR = new int[arr.length];

        for(int i=1;i<arr.length;i++) {
            maxL[i] = Math.max(arr[i-1], maxL[i-1]);
        }

        for(int i=arr.length-2;i>=0;i--) {
            maxR[i] = Math.max(arr[i+1], maxR[i+1]);
        }
        System.out.print("Processing.....");
        int ans=0;
        for(int i=1;i<arr.length-1;i++) {
            int water= Math.min(maxR[i],maxL[i])-arr[i];
            if(water>0) {
                ans+=water;
            }
        }
        return ans;
    }


    private static int  bruteForceApproach(int[] arr){
        /**
         * 1. we will take x and get the MaxL and MinL
         * 2. minL-arr[i]  = total water trapped between that number
         * 3. ans += minL-arr[i]
         */
        int ans=0;
        for(int i=1;i<arr.length-1;i++) {
            //Get MaxL
            int maxL=0;
            for(int j=i;j>=0;j--) {
                if(maxL<arr[j]) {
                    maxL=arr[j];
                }
            }

            //Get MaxR
            int maxR=0;
            for(int j=i;j<arr.length;j++) {
                if(maxR<arr[j]) {
                    maxR=arr[j];
                }
            }
            ans+= Math.min(maxR,maxL)-arr[i];
        }
        return ans;
    }
}
