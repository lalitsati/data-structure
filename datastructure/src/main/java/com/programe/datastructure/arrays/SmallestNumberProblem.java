package com.programe.datastructure.arrays;
import java.util.*;

public class SmallestNumberProblem {
    public static void main(String[] args) {

        //Smallest Number whose products of digits is N
        //Example -
        // N = 1000   Output = 5558 = 5*5*5*8 = 1000
        // N = 81000   Output = 555899 =  5*5*5*8*9*9 = 81000
        // N = 13      Output = -1  because 13 factors are 1,13 so 13 is not acceptable because it is >10
        //Solution = N = 81000 ,  N/9 = 9000, N/9 = 1000
        // N/8 = 125, N/7!=0 then continue, N/6!=0 then continue, N/5=25, N/5=5, N/5=0
        // Arrange number from lowest to highest = 555899

        int n=100;
        System.out.println("Result - : "+bruteForceSolution(n));

    }

    /**
     * Time Complexity - Tn = O(logN)
     * Space Complexity - Sn = O(1)
     * @param n
     * @return
     */
    private static int bruteForceSolution(int n) {
        int result=0;
        int j=9;
        int tmp=1;
        while(j>1 && n>1){
            if(n%j==0) {
                result = (j*tmp) + result;
                n /=j;
                tmp *=10;
            } else {
                j--;
            }
        }
        if(n==1){
            return result;
        } else {
            return -1;
        }

    }
}