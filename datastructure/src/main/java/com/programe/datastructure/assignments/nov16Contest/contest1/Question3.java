package com.programe.datastructure.assignments.nov16Contest.contest1;

import java.util.ArrayList;
import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        /**
         * You have just been hired as a network engineer at SupperStream, a leading video streaming service, one of
         * your first task is to optimized the video data packets sent to user based on their internet connectivity
         * when a user hits play video data is transmitted in packets, if their device acknowledges these packets
         * quickly, it means they have a strong connection and can receive more packets, simultaneously for smoother
         * streaming if acknowledgement lag, fewer packets should be sent to prevent buffering
         *
         * Given an array A, where each entry represent the acknowledgement time(in milliseconds) for individual packets
         * and two integers B and C, can you determine if there's continuous sequence of B packets with an average
         * acknowledgement time less then or equal to C milliseconds? if so, it's a green signal(integer 1) to send
         * more packets otherwise it's time to throttle back (integer 0)
         *
         * Note - for average, take the floor of (sum/total numbers of elements )
         *
         * Problem Constraints -
         * 1<=N<=10^5
         * 1<=A[i]<=10^9
         * 1<=B<=N
         * 1<=C<=10^9
         *
         * Example -
         * A= [30,25,40,35,20,45,50,55,22,18,15]
         * B=3
         * C=30
         * Output = 1
         * Explanation -
         * Average of [30,25,40] = 31.5 milliseconds
         * Average of [25,40,35] = 33.5 milliseconds
         * Average of [40,35,20] = 31.5 milliseconds
         * Average of [35,20,45] = 33.5 milliseconds
         * Average of [20,45,50] = 38.5 milliseconds
         * Average of [45,50,55] = 50.90 milliseconds
         * Average of [50,55,22] = 42.90 milliseconds
         * Average of [55,22,18] = 32.90 milliseconds
         * Average of [22,18,15] = 18.90 milliseconds
         *
         * From the data, we see that the sequence [22,18,15] has an average acknowledgement time of 18.33 milliseconds
         * which is less then C =30, thus, Jake's device meets the criteria, and superStream's server can ramp up the
         * data packets to Jake's device fon an enhance stream experience. hace the ans is 1
         *
         */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(30,25,40,35,20,45,50,55,22,18,15));
        int b=3;
        int c=30;
        System.out.print("\nTransmitted packets below of average count - "+bruteforceSolution(list,b,c));
        System.out.print("\nOptimized solution find the  count - "+optimizedSolution(list,b,c));

    }

    public static int optimizedSolution(ArrayList<Integer> list, int b, int c) {

        int sum=0;
        int count=0;
        int n = list.size();
        for(int i=0;i<=n-b;i++) {
            if(i==0) {
                for(int j=0;j<b;j++) {
                    sum+=list.get(j);
                }
            } else {
                sum = (sum-list.get(i-1))+list.get(i+b-1);
            }
           // System.out.println(sum);
            if(sum/b<c) {
                count++;
            }
        }
        return count;
    }

    /**
     * TC = O(N)
     * @param list
     * @param b
     * @param c
     * @return
     */
    private static int bruteforceSolution(ArrayList<Integer> list, int b, int c) {
        int count=0;
        int n=list.size();
        for(int i=0;i<=n-b;i++) {
            int sum=0;
            for(int j=i;j<i+b;j++) {
                sum+=list.get(j);
            }
            if(sum/b<c) {
                count++;
            }
        }
        return count;
    }
}
