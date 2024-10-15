package com.programe.datastructure.assignments;

public class FindFactors {

    public static void main(String[] args) {
        int A = 23232323;
        System.out.printf("\nFactors count of number {%d} is {%d}",A,solve(A));
        System.out.printf("\nFactors count of number {%d} is {%d}",A,solve1(A));
    }

    /**
     * TimeComplexity = O(Root of N)
     * Space Complexity = O(1)
     * @param A
     * @return
     */
    public static int solve(int A) {
        int i=1, j=A;
        int count=0;
        int iterCount=0;
        while(i<=(A/i)) {
            iterCount++; //Just for testing
            if(A%i==0) {
                if(A/i==i) {
                    count++;
                } else {
                    count +=2;
                }
            }
            i++;
        }
        System.out.printf("\n\n{%d}",iterCount);
        return count;
    }

    /**
     * imeComplexity = O(Root of N)
     * @param A
     * @return
     */
    public static int solve1(int A){
        int count =0;
        int iterCount=0;
        for(int i=1;i*i<=A;i++) {
            iterCount++;  //Just for testing
            if(A%i==0) {
                if(i*i==A) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        System.out.printf("\n\n{%d}",iterCount);
        return count;
    }
}
