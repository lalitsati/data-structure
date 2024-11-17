package com.programe.datastructure.assignments.nov12;

public class StringExample {

    public static void main(String[] args) {
        /**
         * String - Sequence of character / Array of characters
         * Character - single symbol that represent a letter,number or other symbols in computer's character set
         * they are represented it with its ASCII value
         * For Example -
         * A to Z - 65-90
         * a to z - 97-122
         * 0 to 9 - 48-57
         * --
         * --
         * So On....
         *
         *
         * Question - Given a String which containing only alphabets,(this can be upper case or lower case ), print all
         * the character of the String, convert lower case character to upper case character and upper case character
         * to lower case character
         * Example -
         * String str = "hEElLO"
         * Output - "HeeLlo"
         *
         */
        String str = "HeeLLo";
        //System.out.print("\nToggle case using String object - "+creatingMultipleObjectOfString(str));
        System.out.print("\nToggle case using charArray -"+charArrayApproach(str));

    }


    public static String charArrayApproach(String str){

        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++) {
            int num = ch[i]>='a' && ch[i]<='z'?-32:32;
            ch[i] +=num;
        }
        return String.valueOf(ch);
    }


    /**
     * Time costing and space costing code becasue every time new String object will be created due to String
     * Immutabality
     * @param str
     * @return
     */
    public static String creatingMultipleObjectOfString(String str) {
        int n = str.length();
        for(int i=0;i<n;i++) {
            char current = str.charAt(i);
            int num = current>='a' && current<='z'?-32:32;
            current +=num;
            str = str.substring(0,i)+current+str.substring(i+1,n);
        }
        return str;
    }



}