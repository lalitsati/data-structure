package com.programe.datastructure.arrays;

public class RotateMatrix90Digree {
    public static void main(String[] args) {
        int m=4;
        int n=4;
        int[][] arr =   {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                        };
        printMatrix(arr,m,n);
         rotateOneDigree(arr,m,n);
        System.out.println("After Rotate One Digree!!!!");
        printMatrix(arr,m,n);
       rotate90Digree(arr,m,n);
        System.out.println("After Rotate 90 Digree!!!!");
        printMatrix(arr,m,n);

    }

    /**
     * Time Complexity - O(n2)
     * Space Complexity - O(1)
     * @param arr
     * @param m
     * @param n
     */
    private static void rotate90Digree(int[][] arr, int m, int n) {

        int left=0, right = arr[0].length-1;
        while(left<right) {
            for(int i=0;i<arr.length;i++) {
                int tmp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = tmp;
            }
            left++;
            right--;
        }

        /*int r=0;
        int c=n-1;
        int tmp=0;
        for(int i=0;i<m/2;i++) {
            for(int j=0;j<n;j++) {
                tmp = arr[j][r];
                arr[j][r] = arr[j][c];
                arr[j][c] = tmp;
            }
            r++;
            c--;
        }*/

    }

    /**
     *
     * @param arr
     * @param m
     * @param n
     */
    private static void rotateOneDigree(int[][] arr, int m, int n) {
        int tmp=0;
        for(int i=0;i<m;i++) {
            for(int j=i;j<n;j++) {
                tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
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
