package com.programe.datastructure.assignments.nov25;

public class BitwiseOperator {
    public static void main(String[] args) {
        /**
         *------------------------------------------------
         *  a   b       a&b     a|b     a^b     ~a
         *  0   0       0       0       0       1
         *  0   1       0       1       1       1
         *  1   0       0       1       1       0
         *  1   1       1       1       0       0
         *--------------------------------------------------
         *
         * &(AND) operator properties
         * 1. if we want to find out the even or odd we can use &1 and if we will get 0 it means it even and if output
         * is 1 then it means it is odd number
         *
         * a & 0 = 0
         * a & a = a
         *
         *
         * |(OR) Operator properties
         * a | 0 = a
         * a | a = a
         *
         * ^(XOR) Operator properties
         * a ^ 0 = a
         * a ^ a = 0
         *
         *
         * Commutative Properties - the order of operands does not affect the result of a bitwise operator
         * Example - a^b = b^a
         *           a|b = b|a
         *           a^b^c^d = b^a^d^c = c^a^d^b = d^c^b^a         (Group of same operator order also not matter)
         *
         *
         *
         *
         * Left Shift Operator (<<)-  Shift bit at left side
         * .....general formula Left shift = a*2^n  (n is the shift digit)
         *
         * Right Shift Operator (>>) - Shift bit at right side
         * ....general formula Right shift = a/2^n
         *
         *
         *
         */





    }
}
