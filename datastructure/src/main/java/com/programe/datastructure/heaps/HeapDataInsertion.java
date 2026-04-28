package com.programe.datastructure.heaps;

import java.util.ArrayList;
import java.util.List;

/**
 * How a Heap Store Data - in form of complete binary tree (high form of binary tree or low form of binary tree)
 * two charactics should be follow
 *      1. it should be complete binary tree
 *      2. parent element should be greater then or less then of its child for complete binary tree
 *
 *                         5
 *                   12         20
 *                25    13   24   22
 *          35
 *
 *  in form of Array -
 *  5, 12, 20, 25, 13, 24, 22, 35
 *  Get the child node for every parent - child1 = i*2+1, child2 = i*2+2
 *  Get parent node for every child - (i-1)/2
 *
 */
public class HeapDataInsertion {
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        insertIntoHeap(heap, 5);
        insertIntoHeap(heap, 12);
        insertIntoHeap(heap, 4);
        insertIntoHeap(heap, 2);
        insertIntoHeap(heap, -2);
        insertIntoHeap(heap, 10);
        System.out.println(heap);
        extrectMinumum(heap);
        System.out.println(heap);
    }

    private static void extrectMinumum(List<Integer> heap) {
        int size = heap.size();
        heap.set(0, heap.get(size-1));
        heap.remove(size-1);

        //check if the property is not voliated
        int i=0;
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


