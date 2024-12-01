package com.programe.datastructure.assignments.Nov14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ColorfulNumbe {
    public static void main(String[] args) {
        /**
         * Q3. Colorful Number
         * Problem Description
         * Given a number A, find if it is COLORFUL number or not.
         * If number A is a COLORFUL number return 1 else, return 0.
         * What is a COLORFUL Number:
         * A number can be broken into different consecutive sequence of digits.
         * The number 3245 can be broken into sequences like 3, 2, 4, 5, 32, 24, 45, 324, 245 and 3245.
         * This number is a COLORFUL number, since the product of every consecutive sequence of digits is different
         *
         * Problem Constraints
         * 1 <= A <= 2 * 10^9
         *
         * Example Input -
         * Input 1 -
         * A=23
         * Output 1 - 1
         * Explanation 1 -
         * Possible Sub-sequences: [2, 3, 23] where
         *  2 -> 2
         *  3 -> 3
         *  23 -> 6  (product of digits)
         *  This number is a COLORFUL number since product of every digit of a sub-sequence are different.
         *
         *  Input 2 -
         *  A = 236
         *  Output - 0
         *  Explanation  -
         *  Possible Sub-sequences: [2, 3, 6, 23, 36, 236] where
         *  2 -> 2
         *  3 -> 3
         *  6 -> 6
         *  23 -> 6  (product of digits)
         *  36 -> 18  (product of digits)
         *  236 -> 36  (product of digits)
         *  This number is not a COLORFUL number since the product sequence 23  and sequence 6 is same.
         *
         *
         */
        int num =3245;
        System.out.print("Result - "+colorful(num));

    }

    /**
     * Brute Force Solution -
     * @param num
     * @return
     */
    public static int colorful(int num) {

        //store all the digits inside array
        List<Integer> numArr = new ArrayList<>();
        while(num>0) {
            numArr.add(num%10);
            num /=10;
        }

        //now check all the sub array with its product
        Map<Integer, Integer> productList = new HashMap<>();
        int n = numArr.size();
        for(int i=n-1;i>=0;i--) {
            int product=1;
            for(int j=i;j>=0;j--) {
                product*=numArr.get(j);
                if(productList.containsKey(product)) {
                    return 0;
                } else {
                    productList.put(product, 1);
                }
                /*for(int k=i;k>=j;k--) {
                    product*=numArr.get(k);
                }*/

            }
        }
        return 1;
    }
}
