package com.programe.datastructure.module6.assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * Prime Factorization - number will divide from samllest prime factor till the reminder will be 0
 * example -
 * 48
 * ---------
 *          if 48%2==0 then  result = 24
 *          if 24%2==0 then result = 12
 *          if 12%2==0 then result=6
 *          if 6%2==0 then result = 3
 *          if 3%3==0 then result = 1
 *
 *          so 48 = 2*2*2*2*3 = 2^4 * 3^1  (this is the prime factorization of 48 )
 *
 * No of Factor for 48 = add each power with 1 and mjltiply for get the count
 *                          (4+1) * (3+1) = 10
 *                          48 = 1,2,3,4,6,8,12,16,24,48 = (count=10)
 *
 * Example 2 -
 * 300
 * -------------
 *             if(300%2==0)  then result = 150
 *             if(150%2==0)  then result = 75
 *             if(75%3==0)  then result = 25
 *             if(25%5==0)  then result = 5
 *             if(5%5==0)  then result = 1
 *
 *             so 300 = 2*2*3*5*5 = 2^2 3^1 * 5^2  (this is the prime factorization of 300)
 *
 *
 * No of Factor for 48 = add each power with 1 and mjltiply for get the count
 *  *                          (2+1) * (1+1) * (2+1) = 18
 *  *                          300 = 1,2,3,5,6,10,12,15,20,25,30,50,60,100,150,300
 */
public class PrimeFactorization {

    public static void main(String args[]) {
        int n = 48;
        System.out.println("Prime Factor - "+bruteForce(n));

    }

    public static List<Integer>  bruteForce(int n) {
        int i=2;
        List<Integer> result = new ArrayList<>();
        while(n>1 ) {
            if(n%i==0){
                result.add(i);
                n/=i;
            } else {
                i++;
            }
        }

        return result;
    }

}
