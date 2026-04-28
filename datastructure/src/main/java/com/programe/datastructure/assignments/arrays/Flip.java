package com.programe.datastructure.assignments.arrays;

/**
 * Q2. Flip
 * Problem Description -
 * You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN.
 * In a single operation, you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR.
 * By flipping, we mean changing character 0 to 1 and vice-versa.
 * Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.
 * If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements
 * denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.
 *
 * NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.
 *
 * Example Input -
 * A = "010"
 * Output - [1, 1]
 * Example Explanation -
 * A = "010"
 * Pair of [L, R] | Final string
 * _______________|_____________
 * [1 1]          | "110"
 * [1 2]          | "100"
 * [1 3]          | "101"
 * [2 2]          | "000"
 * [2 3]          | "001"
 *
 * We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].
 */
public class Flip {

    public static void main(String[] args) {
        String str = "101011011";
        int[] result = bruteForce(str);
        System.out.printf("[%d,%d]",result[0], result[1]);
    }

    private static int[] bruteForce(String str) {
       //check exceptional case
       boolean flag = false;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)=='0') {
                flag=true;
                break;
            }
        }
        if(!flag) {
            return new int[2];
        }

        int max=0;
       int[] result= new int[2];
        for(int i=0;i<str.length();i++) {
            for(int j=i;j<str.length();j++) {
                int count = count1(str,i,j);
                if(max<count) {
                    max=count;
                   result[0]=i+1;
                   result[1]=j+1;
                }
            }
        }
           return result;
    }

    private static int count1(String str, int i, int j) {
            int count=0;
            for(int k=0;k<str.length();k++) {
                if(k>=i && k<=j) {
                    if(str.charAt(k)=='0')  count++;
                    continue;
                }
                if(str.charAt(k)=='1') count++;
            }
    return count;
    }


}
