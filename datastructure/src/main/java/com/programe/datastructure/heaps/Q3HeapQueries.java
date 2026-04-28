package com.programe.datastructure.heaps;

import java.util.ArrayList;
import java.util.List;

/**
 * Q3. Heap Queries
 * Problem Description
 *
 * You have an empty min heap. You are given an array A consisting of N queries.
 * Let P denote A[i][0] and Q denote A[i][1]. There are two types of queries:
 * P = 1, Q = -1 : Pop the minimum element from the heap.
 * P = 2, 1 <= Q <= 109 : Insert Q into the heap.
 * Return an integer array containing the answer for all the extract min operation. If the size of heap is 0,
 * then extract min should return -1.
 *
 * Input - A = [[1, -1], [2, 2], [2, 1], [1, -1]]
 * output -
 * [-1, 1]
 *
 * Explanation -
 * For the first extract operation the heap is empty so it gives -1. For the second extract operation the heap contains
 * the elements 2 and 1. Extract min returns the element 1.
 *
 *
 */
public class Q3HeapQueries {

    public static void main(String[] args) {
        int[][] arr = {{2, 5}, {2, 3}, {2, 1}, {1, -1},{1, -1}};
        int[] result = solution(arr);
        System.out.println();
        for(int i : result) {
            System.out.printf("%d,",i);
        }
    }

    private static int[] solution(int[][] arr) {
      List<Integer> heap = new ArrayList<>();
      List<Integer> result = new ArrayList<>();
       int k=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i][0]==2) {
                insertIntoHeap(heap, arr[i][1]);
            } else {
                if(heap.size()>0) {
                    result.add(extrectMinumum(heap));
                } else {
                    result.add(-1);
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }



    private static int extrectMinumum(List<Integer> heap) {
        int size = heap.size();
        int minElement = heap.get(0);
        heap.set(0, heap.get(size-1));

        heap.remove(size-1);

        //check if the property is not voliated
        int i=0;
        size = heap.size();
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
        return minElement;
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
}
