package com.programe.datastructure.module6.assignment;

/**
 * Given the value of N and find the no of factor from 1 to n
 */
public class GetNumberOfFactorTillGivenN {

    public static void main(String[] args) {

        int n =24;
        //Get the smallest prime factor (spf)

       int[] result = getNoOfFactor(n);
       System.out.println("Count Factor from 1 to N - ");
       for(int i=0;i<=n;i++) {
           System.out.printf("%d, ",result[i]);
       }

    }


    private static int[] getNoOfFactor(int n){
        int spf[] = getSPF(n+1);
        int result[] = new int[n+1];
        result[1]=1;
        for(int i=2;i<=n;i++) {
            int ans=1;
            int j = i;
            while(j>1) {
                int count=0;
                int s = spf[j];
                while(j%s==0) {
                    count++;
                    j/=s;
                }
                ans *=(count+1);
            }
            result[i]=ans;

        }
        return result;
    }


    private static int[] getSPF(int n) {

        int spf[] = new int[n];
        //initialize array -
        for(int i=0;i<n;i++) {
            spf[i]=i;
        }
        for(int i=2;i*i<n;i++) {
            if(spf[i]==i) {
                for(int j=i+1;j<n;j++) {
                    if(spf[j]%i==0) {
                        spf[j]=i;
                    }
                }
            }
        }
    return spf;
    }


}
