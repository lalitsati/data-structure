package com.programe.datastructure.module6.assignment.day50;

import java.util.Arrays;

/**
 * Sorted Permutation Rank
 * Problem Description
 * Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.
 * Assume that no characters are repeated.
 * Note: The answer might not fit in an integer, so return your answer % 1000003
 *
 * A = "acb"
 * Output = 2
 * Given A = "acb".
 * The order permutations with letters 'a', 'c', and 'b' :  lexicographically permutation
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 * So, the rank of A is 2.
 */
public class SortedPermutationRank {
    public static void main(String[] args) {
        String str = "ZCSFLVHXRYJQKWABGT";
        System.out.print("Solution1 - "+solution(str));

    }

   private static int solution(String str){

       /**
        * Example - yogi
        * Sorted string
        *       gioy
        *            g_ _ _ 3! (permutation)
        *            i_ _ _ 3! (permutation)
        *            o_ _ _ 3! (permutation)
        *            yg _ _ 2! (permutation)
        *            yi _ _ 2! (permutation)
        *            yogi  1 (permutation)
        *
        *       Total - 6+6+6+2+2+1 = 23 ANS
        *
        */
       char[] arr = str.toCharArray();
       Arrays.sort(arr);
      int ans =1;
       for(int i=0;i<str.length();i++) {
           for(int j=0;j<arr.length;j++) {
               if(arr[j]=='@') continue;
               if(str.charAt(i)==arr[j]){
                   arr[j]='@';
                   break;
               }
               ans+= calFect(str.length()-i-1);
               ans%=1000003;
           }
       }
       return ans;
   }

   private static int calFect(int n){
        int fact = 1;
        while(n>1) {
            fact*=n;
            fact%=1000003;
            n--;
        }
      return fact%1000003;
   }

}
