package com.programe.datastructure.assignments.nov7;

public class BitManipulation {
    /**
     * Number System -
     * 1. Decimal Number System  (Base 10 - 0-9)
     * 2. Binary Number System (Base 2 - 0-1)
     *
     * Binary to Decimal -
     * 110 - 2^2*1 + 2^1*1 + 2^0 = 4+2+0=6
     *
     * BitWise Operator -
     *-----------------------------------------------------------------------------------
     *  A       B      AND(&)          OR(|)           XOR(^)       Negation(!)
     *  0       0       0               0               0               A!=1, B!=1
     *  0       1       0               1               1               A!=1, B!=0
     *  1       0       0               1               1               A!=0, B!=1
     *  1       1       1               1               0               A!=0, B!=0
     *---------------------------------------------------------------------------------------------
     *Question1 -
     * Substruction of two numbers  (2s Compliment)
     * in computer system every binary number we have to 2's Complement to represent negative number
     * 12-6 = 5 - here 6 is negative number so we have to convert it first in 2's complement
     * 12   -                     1100
     * 6    -                     0110
     * 2's Complement of 6-       1001
     *                              +1
     *                            1010 (2's Complement means negation number + 1)
     * finally addition between 12 + 2's complement of 6
     *      1100
     *      1010
     *     10110  - first 1 digit is MSB (it will represent positive or negative 1-negative, 0-Positive)
     *     final ans is 6
     *---------------------------------------------------------------------------------------------------------------
     *Question 2 -
     * 9-12 = 3
     * we have to convert -12 in 2's Complement -
     * +12                  1100
     * 2's Complement -     0011
     *                        +1
     *                      0100  (-12)
     *
     *  9               1001
     *  -12             0100
     *                = 1101 (-3) (first 1 is MSB) it means it is negative value so we have to change it in positive)
     *  jsut for varification 2's Complement of 1101
     *              1101
     *            ~ 0010
     *                +1
     *             =0011  (-3)
     *
     *
     */
}
