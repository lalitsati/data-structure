package com.programe.datastructure.assignments.Nov14;

public class ReverseTheString {
    public static void main(String[] args) {
        /**
         * Q3. Reverse the String
         * Problem Description
         * You are given a string A of size N.
         * Return the string A after reversing the string word by word.
         * NOTE:
         *
         * A sequence of non-space characters constitutes a word.
         * Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
         * If there are multiple spaces between words, reduce them to a single space in the reversed string.
         *
         * Problem Constraints
         * 1 <= N <= 3 * 105
         *
         * Input 1:
         * A = "the sky is blue"
         * Output 1:
         * "blue is sky the"
         *
         * bjwapykfil ymg bsypbqu rp nnvwwx muiapt pfwlcsnkqz mazvb hncn ya qisjiabv wnzjh w eimspekey rfmy bwroafq
         */
        String str= "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv";
        System.out.print("Reverse String word by word is - "+reverseStringWordByWord(str));

    }


    /**
     * TC- O(N)
     * @param str
     * @return
     */
    private static String reverseStringWordByWord(String str) {
        StringBuilder tmpString = new StringBuilder();
        int n = str.length();
        boolean spaceFlag=false;
        for(int i=n-1;i>=0;i--){
            if((str.charAt(i)>='a' && str.charAt(i)<='z') ||
                    (str.charAt(i)>='A' && str.charAt(i)<='Z')) {
                tmpString.append(str.charAt(i));
                spaceFlag=true;
            } else if(str.charAt(i)==' ' && spaceFlag) {
                tmpString.append(" ");
                spaceFlag=false;
            }
        }
        n = tmpString.length();
        //Remove trailling space
        if(tmpString.charAt(0)==' ') {
            tmpString.replace(0,1,"");
        }
        if(tmpString.charAt(tmpString.length()-1)==' '){
            tmpString.replace(n-1, n, "");
        }
        int x=0;
        for(int i=0;i<tmpString.length();i++) {
            if(tmpString.charAt(i)==' ' || i==tmpString.length()-1) {
                if(i==tmpString.length()-1) i++;
                reverseString(tmpString, x, i-1);
                x = i+1;
            }
        }

        return tmpString.toString();
    }

    private static void reverseString(StringBuilder tmpString, int x, int y) {
        while(x<y) {
            char tmp = tmpString.charAt(y);
            tmpString.setCharAt(y, tmpString.charAt(x));
            tmpString.setCharAt(x, tmp);
            x++;y--;
        }
    }
}
