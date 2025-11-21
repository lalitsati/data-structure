package com.programe.datastructure.module6.assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * Find the Factor -
 */
public class FindFactor {
    public static void main(String[] args) {

        int n = 48;
        List<Integer> result = new ArrayList<>();
        for(int i=1;i*i<=n;i++) {
            if(n%i==0) {
                System.out.println("test");
                result.add(i);
                result.add(n/i);
            }
        }
        System.out.println("Factor - "+result);
    }
}
