package com.programe.datastructure.beginners;

public class Pyramid {

    public static void main(String[] args) {
        int n=10;
        //create pyramid1
            pyramid1(n);
            pyramid2(n);

    }

     private static void pyramid2(int n) {
        /**
         *                             *
         *                            ***
         *                           *****
         *                          *******
         *                         *********
         *                        ***********
         *                       *************
         **/
         /**
          *  Use AP formula -
          *  T(i) = a+(i-1)*d
          *       = a (first element of the sequence)
          *       = i (i th terms)
          *       = d (AP difference)
          *       Example -
          *       1,3,5,7.........
          *       required i=10 value - then
          *
          *   T(10) = a+(i-1)*d
          *         = 1+(10-1) * 2
          *         = 1+20-2 = 19
          *
          *   Simplified formula -
          *   T(i) = a+(i-1)*d
          *        = a+di-d
          */
         /**
          * main formula -
          * T(i) = 1+(i-1)*2
          *      = 1+2i-2
          *      = 2i-1
          */
        int i=1;
        while(i<=n){
            for(int j=1;j<=n-i;j++) {
                    System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }

    private static void pyramid1(int n) {

        /**
         *                      *
         *                      **
         *                      ***
         *                      ****
         *                      *****
         *                      ******
         *                      *******
         *                      ********
         **/
        int i=1;
        while(i<=n){
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }


}