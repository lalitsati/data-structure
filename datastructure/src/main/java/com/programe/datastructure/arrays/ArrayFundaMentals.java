package com.programe.datastructure.arrays;

public class ArrayFundaMentals {

	public static void main(String[] args) {
        int[] num = {3,1,2,10,1,30};
        System.out.println("Sum Of all elements !! "+sumOfArrayElements(num));

        //find max elements from array -
        System.out.println("Maximum Elements of Array !! "+findMaxElementsFromArray(num));

        printReverseArray(num);


	}
	
	 private static void printReverseArray(int[] num) {
	        for(int i=num.length-1;i>=0;i--) {
	            System.out.print(num[i]+" ");
	        }
	    }

	    /**
	     * find sum of all elements from array
	     * @param num
	     * @return
	     */
	    public static int sumOfArrayElements(int[] num){
	        int sum=0;
	        for(int i=0;i<num.length;i++) {
	            sum += num[i];
	        }
	       return sum;
	    }

	    /**
	     * Max elements from array
	     * @param num
	     * @return
	     */
	    public static int  findMaxElementsFromArray(int[] num) {
	        int max=0;
	        for(int i=0;i<num.length;i++) {
	            if(num[i]>max) {
	                max = num[i];
	            }
	        }
	        return max;
	    }

}
