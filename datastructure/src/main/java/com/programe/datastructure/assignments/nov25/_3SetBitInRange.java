package com.programe.datastructure.assignments.nov25;

public class _3SetBitInRange {
    public static void main(String[] args) {
        /**
         * You have given 3 Integer we have to followed it in Zeros binary -
         * Example -
         * a=3, b=4, c=5;
         * Output - {000111100000} = 480
         * Explanation -
         * we found a=3 so we have set unset bit in zero first the b=4 which means we have to set set bits in zero
         * and the as per c value se have to unset in Zero
         *
         */
        int a=3;
        int b=4;
        int c=5;
        //set first a bit -
        int result=0;
        int leftShiftCount=0;
        System.out.print("Result - "+approahc1_On(a,b,c));
        System.out.print("\nResult - "+approahc1_O1(a,b,c));
    }

    /**
     * Tc = Constant
     * Note - as per observation 2^x  means behind one set bit x number of 0 is added
     * 2^1      =   10      ((2 power of 1)-1 = 1) = 1
     * 2^2      =   100     ((2 power of 2)-1 = 11) = 3
     * 2^3      =   1000    ((2 power of 3)-1 = 111) = 7
     * 2^4      =   10000   ((2 power of 4)-1 = 1111) = 15
     * 2^5      =   100000  ((2 power of 5)-1 = 11111) = 31
     * 2^6      =   1000000 ((2 power of 6)-1 = 111111) = 64
     *
     * Again as per observation we can see if we are subtracting 1 from 2's power of x we are getting all the
     * set bits so we can set Bth bit like this (2 power b-1)
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static long approahc1_O1(int a, int b, int c) {
           return ((1<<b)-1)<<c;
    }

    /**
     * TC - O(n)
     * @param a
     * @param b
     * @param c
     * @return
     */
    private static long approahc1_On(int a, int b, int c) {
        long result=0l;
        for(int i=c;i<=b+c-1;i++) {
            result |= (1<<i);
        }
        return result;
    }

}
