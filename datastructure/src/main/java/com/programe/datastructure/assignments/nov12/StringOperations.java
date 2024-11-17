package com.programe.datastructure.assignments.nov12;

public class StringOperations{
    public static void main(String[] args) {
        /**
         * Q3. String operations
         *
         * Problem Description -
         * Akash likes playing with strings. One day he thought of applying following operations on the string
         * in the given order:
         * 1.  Concatenate the string with itself.
         * 2.  Delete all the uppercase letters.
         * 3. Replace each vowel with '#'.
         * You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.
         *
         * NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
         *
         * Example -
         * Input 1:
         * A="aeiOUz"
         * Output 1:
         * "###z###z"
         *
         */
        String str = "aeiOUz";
        System.out.print("\n After operation string is - "+operation(str));

    }

    public static String operation(String str) {

        char[] charStr = str.toCharArray();
        for(int i=0;i<charStr.length;i++) {
            if(charStr[i]>='A' && charStr[i]<='Z') {
                charStr[i]=32;
                continue;
            } else if(charStr[i]=='a'||charStr[i]=='e'||charStr[i]=='i'||
                    charStr[i]=='o'||charStr[i]=='u') {
                    charStr[i]='#';
            }
        }
        String result = String.valueOf(charStr).replaceAll(" ","");

        //remove all upper case
        return result+result;
    }
}