package com.programe.datastructure.leetcode.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class AddTwoNumbers2 {
    public static void main(String[] args) {
        /**
         * 2. Add Two Numbers
         * You are given two non-empty linked lists representing two non-negative integers.
         * The digits are stored in reverse order, and each of their nodes contains a single digit. Add the
         * two numbers and return the sum as a linked list.
         * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
         *
         * Input: l1 = [2,4,3], l2 = [5,6,4]
         * Output: [7,0,8]
         * Explanation: 342 (reverse store in l1 node) + 465 (reverse store in l2 node) = 807 (result reverse sore
         * in result node).
         *
         * Example 2:
         * Input: l1 = [0], l2 = [0]
         * Output: [0]
         *
         * Example 3:
         * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
         * Output: [8,9,9,9,0,0,0,1]
         *
         * Constraints:
         * The number of nodes in each linked list is in the range [1, 100].
         * 0 <= Node.val <= 9
         * It is guaranteed that the list represents a number that does not have leading zeros.
         */
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.addAll(Arrays.asList(0));

        LinkedList<Integer> l2 = new LinkedList<>();
        l2.addAll(Arrays.asList(0));
        printArr(addTwoNumbers(l1,l2));

    }

    public static LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
        int n = l1.size()>l2.size()?l1.size(): l2.size();
        int n1=l1.size(), n2= l2.size();
        int i=0;
        int carry=0;
        LinkedList<Integer> l3 = new LinkedList<>();
        while(i<n){
            int element1=0,element2=0;
            if(i<n1) {
                element1 = (int)l1.get(n1-i-1);
            }
            if(i<n2) {
                element2 = (int)l2.get(n2-i-1);
            }
            int add = element2+element1+carry;
            l3.add((add%10));
            carry = add/10;
            i++;
        }
        if(carry>0) {
            l3.add(carry);
        }
        return l3;
    }

    private static void printArr(LinkedList l3) {
        System.out.print("\n[");
        for(int i=0;i<l3.size();i++) {
            System.out.print(l3.get(i)+",");
        }
        System.out.print("]");
    }
}
