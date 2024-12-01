package com.programe.datastructure.assignments.Nov14;

public class SimpleReverseString {
    public static void main(String[] args) {
        /**
         * Q4. Simple Reverse
         *
         * Problem Description
         * Given a string A, you are asked to reverse the string and return the reversed string.
         *
         * Problem Constraints
         * 1 <= |A| <= 105
         * String A consist only of lowercase characters.
         *
         * Input 1:
         *  A = "scaler"
         *  Output 1: "relacs"
         */
        String str = "cambodia";
        System.out.print("Reverse String - "+reverseString(str));
    }

    public static String reverseString(String str){
         char[] strArr = str.toCharArray();
         int x=0, y=strArr.length-1;
         while(x<y){
             char tmp = strArr[x];
             strArr[x] = strArr[y];
             strArr[y]=tmp;
             x++;y--;
         }
         return String.valueOf(strArr);
    }
}
