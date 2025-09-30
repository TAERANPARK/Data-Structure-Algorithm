package com.multi.basic.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(20);
        System.out.println(maxHeap.poll());
        System.out.println("현재 최댓값: "+maxHeap.peek());
//        System.out.println(maxHeap.poll());
//        System.out.println(maxHeap.poll());
    }
}
