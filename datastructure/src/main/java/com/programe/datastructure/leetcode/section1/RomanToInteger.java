package com.programe.datastructure.leetcode.section1;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        /**
         * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
         *
         * Symbol       Value
         * I             1
         * V             5
         * X             10
         * L             50
         * C             100
         * D             500
         * M             1000
         *
         * For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII,
         * which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
         *
         * Roman numerals are usually written largest to smallest from left to right. However, the numeral for
         * four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract
         * it making four. The same principle applies to the number nine, which is written as IX. There are six
         * instances where subtraction is used:
         *
         * I can be placed before V (5) and X (10) to make 4 and 9.
         * X can be placed before L (50) and C (100) to make 40 and 90.
         * C can be placed before D (500) and M (1000) to make 400 and 900.
         * Given a roman numeral, convert it to an integer.
         *
         * Example 1:
         * Input: s = "III"
         * Output: 3
         * Explanation: III = 3.
         *
         * Example 2:
         * Input: s = "LVIII"
         * Output: 58
         * Explanation: L = 50, V= 5, III = 3.
         *
         *
         * Constraints:
         * 1 <= s.length <= 15
         * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
         * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
         */
        String str = "MCMXCIV";
        System.out.print("\nRoman to Int -"+romanToInt(str));
        System.out.print("\nRoman to Int -"+optimizingSwitchCase(str));

    }

    /**
     * Optimized solution from 9s to 3s
     * TC = O(N)
     * @param str
     * @return
     */
    private static int optimizingSwitchCase(String str) {
        int n = str.length();
        int result =0;
        for(int i=0;i<n;i++) {
            int current = getRomanValue(str.charAt(i));
            int next=0;
            if(i<n-1) {
                next = getRomanValue(str.charAt(i+1));
            }
            if(current>=next) {
                result +=current;
            } else {
                result -=current;
            }
        }
        return result;
    }

    public static int getRomanValue(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }


    /**
     *TC = O(N)
     * @param str
     * @return
     */
    public static int romanToInt(String str)  {
        Map<String, Integer> roman = setRoman();
        int n = str.length();
        int result =0;
        for(int i=0;i<n;i++) {
            Integer current = roman.get(str.charAt(i)+"");
            Integer next=0;
            if(i<n-1) {
                 next = roman.get(str.charAt(i+1)+"");
            }
            //check if current value is greater then next value then add in subTotal else subtract from current value
            if(current>=next) {
                result +=current;
            } else {
                result -=current;
            }
        }
        return result;
    }


    public static Map<String, Integer>  setRoman(){
            Map<String, Integer> roman = new HashMap<>();
            roman.put("I",1);
            roman.put("V",5);
            roman.put("X",10);
            roman.put("L",50);
            roman.put("C",100);
            roman.put("D",500);
            roman.put("M",1000);
            return roman;
    }
}
