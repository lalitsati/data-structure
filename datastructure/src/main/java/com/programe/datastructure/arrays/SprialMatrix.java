package com.programe.datastructure.arrays;

public class SprialMatrix {
    public static void main(String[] args) {
        int m = 6;
        int n = 4;
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20},
                {21, 22, 23, 24}

        };
        printMatrix(arr,m,n);
        printSprialMatrix(arr,m,n);
    }

    /**
     *
     * @param arr
     * @param m
     * @param n
     */
    private static void printSprialMatrix(int[][] arr, int m, int n) {

        int rMin=0, rMax=m-1, cMin=0, cMax=n-1, count=0;

        while(count<m*n) {
            //print upper boundary
            for(int i=cMin; i<=cMax; i++) {
                System.out.print(arr[rMin][i]+" ");
                count++;
            }
            rMin++;
            //print right Boundary --
            for(int i=rMin; i<=rMax; i++) {
                System.out.print(arr[i][cMax]+" ");
                count++;
            }
            cMax--;
            //print Lower Boundary --
             for(int i=cMax; i>=cMin; i--) {
                System.out.print(arr[rMax][i]+" ");
                count++;
            }
            rMax--;
            //print Left Boundary
            for(int i=rMax; i>=rMin; i--) {
                System.out.print(arr[i][cMin]+" ");
                count++;
            }
            cMin++;
        }

    }


    /**
     *
     * @param arr
     * @param m
     * @param n
     */
    private static void printMatrix(int[][] arr, int m, int n) {
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}