package com.programe.datastructure.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Q1. Connect ropes
 * Problem Description
 *
 * You are given an array A of integers that represent the lengths of ropes.
 * You need to connect these ropes into one rope. The cost of joining two ropes equals the sum of their lengths.
 * Find and return the minimum cost to connect these ropes into one rope.
 *
 * Example Input -
 *  A = [1, 2, 3, 4, 5]
 *  Output = 33
 *  explanation -
 *   Given array A = [1, 2, 3, 4, 5].
 *  Connect the ropes in the following manner:
 *  1 + 2 = 3
 *  3 + 3 = 6
 *  4 + 5 = 9
 *  6 + 9 = 15
 *  So, total cost  to connect the ropes into one is 3 + 6 + 9 + 15 = 33.
 *
 *  Example Input2 -
 *   A = [5, 17, 100, 11]
 *   Output -  182
 *   Explanation -
 *   Given array A = [5, 17, 100, 11].
 *  Connect the ropes in the following manner:
 *  5 + 11 = 16
 *  16 + 17 = 33
 *  33 + 100 = 133
 *  So, total cost  to connect the ropes into one is 16 + 33 + 133 = 182.
 *
 *
 */
public class ConnectRopes {
    public static void main (String[] args) {
        List<Integer> heap = new ArrayList<>();
        List<Integer> asList = Arrays.asList(16,7,3,5,9,8,6,15);
        heap.addAll(asList);
        //System.out.print(bruteForceAppraoch(heap));
        System.out.println(usingHeap(heap));


    }



    private static int usingHeap(List<Integer> heap){
        //convert min heap -

        int lastParent = ((heap.size()-1)-1)/2;
        while(lastParent>=0) {
            extrectMinumum(heap, lastParent);
            lastParent--;
        }
        System.out.println(heap);
        int total = 0;
        while(heap.size()>1) {
            int n = heapMinCost(heap)+heapMinCost(heap);
            total += n;
            insertIntoHeap(heap, n);
        }
        return total;
    }

    private static void insertIntoHeap(List<Integer> heap, int num) {
        heap.add(num);
        int i = heap.size()-1;
        while(i>0) {
            int parent = (i-1)/2;
            if(heap.get(i)<heap.get(parent)) {
                int tmp = heap.get(i);
                heap.set(i, heap.get(parent));
                heap.set(parent, tmp);
                i=parent;
            } else {
                break;
            }
        }

    }

    private static int heapMinCost(List<Integer> heap){
        int size = heap.size();
        int n = heap.get(0);
        heap.set(0, heap.get(size-1));
        heap.remove(size-1);
        //check if the property is not voliated
        int i=0;
        size = heap.size();
        while(i*2+1<size) {
            int x = Math.min(heap.get(i), heap.get(i * 2 + 1));
            if (i * 2 + 2 < size) {
                x = Math.min(x, heap.get(i * 2 + 2));
            }
            //now swapping the minimum element -
            if (x == heap.get(i)) {
                break;
            } else if (x == heap.get(i * 2 + 1)) {
                heap.set(i * 2 + 1, heap.get(i));
                heap.set(i, x);
                i = i * 2 + 1;
            } else {
                heap.set(i * 2 + 2, heap.get(i));
                heap.set(i, x);
                i = i * 2 + 2;
            }
        }
        System.out.println(heap);
    return n;
    }

    private static void  extrectMinumum(List<Integer> heap, int i) {
        int size = heap.size();
        while(i*2+1<size) {
            int x = Math.min(heap.get(i), heap.get(i*2+1));
            if(i*2+2<size){
                x = Math.min(x, heap.get(i*2+2));
            }
            //now swapping the minimum element -
            if(x==heap.get(i)) {
                break;
            } else if(x==heap.get(i*2+1)) {
                heap.set(i*2+1, heap.get(i));
                heap.set(i, x);
                i = i*2+1;
            } else {
                heap.set(i*2+2, heap.get(i));
                heap.set(i, x);
                i = i*2+2;
            }
        }
    }



    private static int bruteForceAppraoch(List<Integer> heap){
        int total = 0;
        while (heap.size()>1) {
            Collections.sort(heap);
            int minimalCost = heap.get(0)+heap.get(1);
            heap.remove(0);
            heap.remove(0);
            heap.add(minimalCost);
            total+=minimalCost;
        }
       return total;
    }
}
