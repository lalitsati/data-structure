package com.programe.datastructure.heaps.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * GET sort the Array with complexity O(nLogn)
 * Space - O(n)
 */
public class HeapSortApproach1 {
    public static void main(String[] args) {
        List<Integer> inputHeap = Arrays.asList(5, 13, -2, 11, 27, 31, 0, 19);
        List<Integer> heap = new ArrayList<>();
        heap.addAll(inputHeap);
        //Create Min Heap -
        convertMinHeap(heap);
        sort(heap);
    }

    private static void sort(List<Integer> heap){
        List<Integer> result = new ArrayList<>();
        while(heap.size()>0) {
            result.add(getAndRemoveMinimum(heap));
        }
        System.out.println(result);
    }



    private static void convertMinHeap( List<Integer> heap) {
        int n = heap.size();
        int lastParent = ((n-1)-1)/2;
        while(lastParent>=0) {
            extrectMinumum(heap, lastParent);
            lastParent--;
        }
    }

    private static void  extrectMinumum( List<Integer> heap, int i) {
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
                heap.set(i,x);
                i = i*2+1;
            } else {
                heap.set(i*2+2, heap.get(i));
                heap.set(i,x);
                i = i*2+2;
            }
        }
    }




    private static int getAndRemoveMinimum(List<Integer> heap) {
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
}
