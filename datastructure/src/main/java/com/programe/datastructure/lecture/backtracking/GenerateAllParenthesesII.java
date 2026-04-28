package com.programe.datastructure.lecture.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Q2. Generate all Parentheses II
 * Problem Description -
 * Given an integer A pairs of parentheses, write a function to generate all combinations of well-formed
 * parentheses of length 2*A.
 *
 * Example Input =
 * A = 3
 * Output - [ "((()))", "(()())", "(())()", "()(())", "()()()" ]
 */
public class GenerateAllParenthesesII {
    public static void main(String[] args) {
        int n=2;
        ArrayList<String> result = new ArrayList<>();
        System.out.println( backTracingApproach("",n,0,0, result));



    }

    private static ArrayList<String>  backTracingApproach(String str, int n, int opening, int closing, ArrayList<String> result) {

        if(str.length()==2*n) {
           result.add(str);
            return result;
        }
        if(opening<n) {
            backTracingApproach(str+"(", n, opening+1, closing, result);
        }
        if(closing<opening) {
            backTracingApproach(str+")", n, opening, closing+1, result);
        }
        return result;
    }
}
