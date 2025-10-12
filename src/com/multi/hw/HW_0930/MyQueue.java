package com.multi.hw.HW_0930;

import java.util.ArrayList;
import java.util.List;

// MyQueue - 큐 (FIFO: First-In First-Out, 선입선출)
// - ArrayList<Integer> 사용 (맨 앞이 front, 맨 뒤가 rear)
// - enQueue: 맨 뒤에 삽입
// - deQueue: 맨 앞에서 삭제
// - contains: 선형 탐색
// - update(a,b): 첫 a를 찾아 b로 변경
// - 비어 있을 때 deQueue()는 null 반환

public class MyQueue {
    private final List<Integer> list=new ArrayList<>();

    //추가 enqueue
    public void enQueue(int data){
        list.add(data);
    }

    //삭제 dequeue
    public Integer deQueue(){
        if(list.isEmpty())
            return null;
        return list.remove(0);
    }

    //검색
    public boolean contains(int data){
        return list.contains(data);
    }

    //수정
    public boolean update(int origin, int change){
        int index=list.indexOf(origin);
        if(index==-1)return false;
        list.set(index,change);
        return true;
    }

    //queue 출력
    @Override
    public String toString() {
        return list.toString();
    }
}
