package com.programe.datastructure.module6.assignment;

/**
 * nCr means - total combination of r out from n (r combination of n)
 *
 * Problem Description -
 * Given three integers A, B, and C, where A represents n, B represents r, and C represents m,
 * find and return the value of nCr % m where
 *                  nCr % m = (n!/((n-r)!*r!))% m.
 *
 *
 *
 *
 *
 * x! means factorial of x i.e. x! = 1 * 2 * 3... * x.
 */
public class ComputenCrMODm {

    //find nCr % m
    public static void main(String args[]) {


        int a = 38;
        int b = 5;
        int c = 81; // modulus

        System.out.println(nCrMod(a, b, c));

    }


   static  int nCrMod(int n, int r, int mod) {
        if (r > n) return 0;

        // Numerator: n * (n-1) * ... * (n-r+1)
        long[] numerator = new long[r];
        for (int i = 0; i < r; i++) {
            numerator[i] = n - i;
        }

        // Denominator: 1 * 2 * ... * r
        long[] denominator = new long[r];
        for (int i = 0; i < r; i++) {
            denominator[i] = i + 1;
        }

        // Cancel common factors using GCD
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                if (denominator[j] > 1) {
                    long g = gcd(numerator[i], denominator[j]);
                    if (g > 1) {
                        numerator[i] /= g;
                        denominator[j] /= g;
                    }
                }
            }
        }

        // Multiply remaining numerator factors under mod
        long result = 1;
        for (long num : numerator) {
            result = (result * (num % mod)) % mod;
        }

        return (int) result;
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }



}
