package com.programe.datastructure.module6;
//----------Combinatorics Basics & Prime numbers
/**
 *
 * ============================= Lecture | DSA: Maths: Combinatorics Basics & Prime Numbers ==================
 * Factorial Notation:
 *
 *  Let n be a positive integer. Then, factorial n, denoted n! is defined as:
 *
 *  n! = n(n - 1)(n - 2) ... 3.2.1.
 *
 *  Examples:
 *
 *  We define 0! = 1.
 *
 *  4! = (4 x 3 x 2 x 1) = 24.
 *
 *  5! = (5 x 4 x 3 x 2 x 1) = 120.
 *
 *  Permutations:
 *
 *  The different arrangements of a given number of things by taking some or all at a time, are called permutations.
 *
 *  Examples:
 *
 *  All permutations (or arrangements) made with the letters a, b, c by taking two at a time are (ab, ba, ac, ca, bc, cb).
 *
 *  All permutations made with the letters a, b, c taking all at a time are:
 *  (abc, acb, bac, bca, cab, cba)
 *
 *  Number of Permutations:
 *
 *  Number of all permutations of n things, taken r at a time, is given by:
 *
 *  nPr = n(n - 1)(n - 2) ... (n - r + 1) =	n!
 *  (n - r)!
 *  Examples:
 *
 *  6P2 = (6 x 5) = 30.
 *
 *  7P3 = (7 x 6 x 5) = 210.
 *
 *  Cor. number of all permutations of n things, taken all at a time = n!.
 *
 *  An Important Result:
 *
 *  If there are n subjects of which p1 are alike of one kind; p2 are alike of another kind; p3 are alike of third kind and so on and pr are alike of rth kind,
 *  such that (p1 + p2 + ... pr) = n.
 *
 *  Then, number of permutations of these n objects is =	n!
 *  (p1!).(p2)!.....(pr!)
 *  Combinations:
 *
 *  Each of the different groups or selections which can be formed by taking some or all of a number of objects is called a combination.
 *
 *  Examples:
 *
 *  Suppose we want to select two out of three boys A, B, C. Then, possible selections are AB, BC and CA.
 *
 *  Note: AB and BA represent the same selection.
 *
 *  All the combinations formed by a, b, c taking ab, bc, ca.
 *
 *  The only combination that can be formed of three letters a, b, c taken all at a time is abc.
 *
 *  Various groups of 2 out of four persons A, B, C, D are:
 *
 *  AB, AC, AD, BC, BD, CD.
 *
 *  Note that ab ba are two different permutations but they represent the same combination.
 *
 *  Number of Combinations:
 *
 *  The number of all combinations of n things, taken r at a time is:
 *
 *  nCr =	n!	=	n(n - 1)(n - 2) ... to r factors	.
 *  (r!)(n - r)!	r!
 *  Note:
 *
 *  nCn = 1 and nC0 = 1.
 *
 *  nCr = nC(n - r)
 *
 *  Examples:
 *
 *  i.   11C4 =	(11 x 10 x 9 x 8)	= 330.
 *  (4 x 3 x 2 x 1)
 *  ii.   16C13 = 16C(16 - 13) = 16C3 =	16 x 15 x 14	=	16 x 15 x 14	= 560
 */

//============================= Example ==================

/**
 * problema1 ..
 * Given 3 true /false questions, every questions has to be answered, in how many ways can you ans all the questions
 *
 * Solution - 8 ways, = 2^3 ways
 */
/**
 * problema2 ..
 * Given 10 girls and 7 boys, how many different pairs can we form?
 *
 * /
/*

 */

/**   Permutation     ------------  where P means Permutation
 * 1. how many ways we can arrange n distinct character =  n! ways
 * 2. if we have n character and we need to arrange r char then the ways = n * (n-1) * (n-2).....*n-(r-1) ways
 * means n ^ P $ r  = n! / (n-r)!
 *
 * */

/** Combination - No of ways to select something     ---------  where C means Combination
 *Given n element and select r element
 *      NOTE  -----      nCr = (n! / r!*(n-r)!)
 *      NOTE  ------     nCr = nCn-r
 *
 * suppose we have n items and we need to select r distinct item then
 *          nCr = (n-1)C(r-1) + (n-1)C(r)
 *
 *
 */

import java.util.ArrayList;
import java.util.List;

/** Prime Number - no having only 2 factor (1 and itself)
 *
 *
 */


public class DSAMaths {

    /**
     * question - Find the prime no from 1 to n
     */
    public static void main(String args[]) {
        int n =49;
        findNPrimeNumberApproach1(n);
        //using Sieve of Eratosthenes Algorithm
        findNPrimeNumberApproach2(n);
    }

    /**
     *
     * @param n
     * //using Sieve of Eratosthenes Algorithm
     */
    private static void findNPrimeNumberApproach2(int n) {
        boolean arr[] = new boolean[n+1];
        for(int i=2;i*i<=n;i++) {
            int j=i*2;
            while(j<=n) {
                arr[j]=true;
                j+=i;
            }
        }
        System.out.printf("\nPrime number from 1 to 50 = ");
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            if(!arr[i]) {
                result.add(i);
                System.out.printf("%d, ", i);
            }
        }
    }




    private static void findNPrimeNumberApproach1(int n) {
        System.out.printf("Prime number from 1 to %d = %d, %d, ",n, 1,2 );
        boolean isPrime=false;
        for(int i=3;i<=n;i++) {
            int j=2;
            isPrime=false;
            while(j*j<=i) {
                if(i%j==0) {
                    isPrime=true;
                    break;
                }
                j++;
            }
            if(!isPrime) {
                System.out.printf("%d, ",i);
            }
        }
    }


}
