package com.programe.datastructure.module6.assignment.day50;

/**
 * Problem Description
 *
 * Given a positive integer A, return its corresponding column title as it appears in an Excel sheet.
 * For example:
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *
 *     Example -
 *     A=27   Ans = AB
 *     A=53  Ans = BA
 */
public class ExcelColumnTitle {

    public static void main(String[] args) {
        int num = 943566;

        System.out.println("Brute Froce - "+bruteForceApproach(num));


    }

    private static String bruteForceApproach(int num){

        String result="";
        while(num>0) {
            num = num-1;
            int rem = num%26;
            num/=26;
            char ch = (char)(rem+'A');
            result =ch+result;
        }

        return result;
    }
}
