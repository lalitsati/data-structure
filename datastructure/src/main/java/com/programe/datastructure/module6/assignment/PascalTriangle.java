package com.programe.datastructure.module6.assignment;

import java.util.ArrayList;

/** Pascal Triangle  - is the tringle which is combination of martrix row with cols (row C cols)
 * 0C0
 * 1C0  1C1
 * 2C0  2C1  2C2
 * 3C0  3C1  3C2  3C3
 * 4C0  4C1  4C2  4C3  4C4
 *
 * Example after calculate value - n = 5
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 */
public class PascalTriangle {
    public static void main(String args[]) {
        int n =7;
        int[][] result =  printPascalTrangle(n);
        System.out.println();
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++){
                System.out.printf("%d  ",result[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Complexity - O(n^2)
     * @param n
     * @return
     */
    public static int[][]  printPascalTrangle(int n) {
        int[][]  result = new int[n][n];
        for(int i =0 ;i<n;i++) {
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i){
                    result[i][j]=1;
                } else {
                    result[i][j]=result[i-1][j]+result[i-1][j-1];
                }
            }
        }
        return result;
    }
}
