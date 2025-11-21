package com.programe.datastructure.module6.assignment;

//Given n and count the factor from 1 to n and return array
public class ContFactorFrom1ToN {
    public static void main(String[] args) {

        int n =10;
        int result[] = bruteForceApproach(n);
        System.out.println("Result - ");
        for(int i=0;i<n;i++) {
            System.out.printf("%d, ",result[i]);
        }

    }

    /**
     * this approach is partially correct
     * @param n
     * @return
     */
    public static int[] bruteForceApproach(int n) {

        int[] result = new int[n];
        for(int i=1;i<=n;i++) {
            int count=1;
            for(int j=i-1;j>=1;j--) {
                if(i%j==0) {
                    count+=result[j-1];
                    break;
                }
            }

            result[i-1]=count;
        }
        return result;
    }
}
