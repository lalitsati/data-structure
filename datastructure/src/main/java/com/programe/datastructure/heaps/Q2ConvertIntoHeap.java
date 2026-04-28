package com.programe.datastructure.heaps;

/**
 * Q2. Build a Heap
 * Problem Description -
 * Given an array A of N integers, convert that array into a min heap and return the array.
 * NOTE: A min heap is a binary tree where every node has a value less than or equal to its children.
 *
 * Example Input
 * Input:]
 * A = [5, 13, -2, 11, 27, 31, 0, 19]
 *
 * Example Output
 * Output:
 * A = [-2, 5, 0, 13, 11, 19, 27, 31]
 *
 * Explanation -
 * One possible Heap is
 *
 *                 -2
 *                /    \
 *              5       0
 *             / \    /  \
 *           13  11  19   27
 *           /
 *         31
 *
 * It can be seen that each parent has a value smaller than its children. Hence it is a Valid Heap.
 * The Heap in the Array format is [-2, 5, 0, 13, 11, 19, 27, 31].
 * Some more possible heaps are  [-2, 0, 5, 13, 11, 27, 19, 31], [-2, 5, 0, 11, 27, 13, 19, 31], etc.
 * You can return any possible Valid Heap Structure.
 */
public class Q2ConvertIntoHeap {
    public static void main(String[] args) {
        int arr[] = {5, 13, -2, 11, 27, 31, 0, 19};
        convertMinHeap(arr);
        for(int i : arr) {
            System.out.printf("%d,",i);
        }
    }


    private static void convertMinHeap(int[] heap) {
        int n = heap.length;
        int lastParent = ((n-1)-1)/2;
        while(lastParent>=0) {
            extrectMinumum(heap, lastParent);
            lastParent--;
        }
    }

    private static void  extrectMinumum(int[] heap, int i) {
        int size = heap.length;
        while(i*2+1<size) {
            int x = Math.min(heap[i], heap[i*2+1]);
            if(i*2+2<size){
                x = Math.min(x, heap[i*2+2]);
            }
            //now swapping the minimum element -
            if(x==heap[i]) {
                break;
            } else if(x==heap[i*2+1]) {
                heap[i*2+1] =  heap[i];
                heap[i] = x;
                i = i*2+1;
            } else {
                heap[i*2+2] =  heap[i];
                heap[i]=x;
                i = i*2+2;
            }
        }
    }
}
