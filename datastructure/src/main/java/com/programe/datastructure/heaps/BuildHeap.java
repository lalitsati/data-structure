package com.programe.datastructure.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an array and we have to convert it in min Heap
public class BuildHeap {
    public static void main(String[] args) {
        List<Integer> heap = Arrays.asList(5, 13, -2, 11, 27, 31, 0, 19);
        convertMinHeap(heap);
        System.out.println(heap);
    }

    private static void convertMinHeap(List<Integer> heap) {
        int n = heap.size();
        int lastParent = ((n-1)-1)/2;
        while(lastParent>=0) {
            extrectMinumum(heap, lastParent);
            lastParent--;
        }
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
}
