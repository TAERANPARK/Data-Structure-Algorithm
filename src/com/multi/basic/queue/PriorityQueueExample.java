package com.multi.basic.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        //PriorityQueue 우선순위 높은 순서대로 정렬 | Comparator.reverseOrder()내림차순으로 정렬
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(90);
        pq.add(4);
        pq.add(5);
        System.out.println("priority queue contents: "+pq);

        while (!pq.isEmpty()) { //정렬된 결과를 얻고자 하면 poll함수를 이용해서 꺼낸다.
            System.out.println(pq.poll()); //poll은 정렬해서 끄집어내니까 삭제와 같은 효과
        }
        System.out.println("priority queue contents: "+pq);

    }
}
