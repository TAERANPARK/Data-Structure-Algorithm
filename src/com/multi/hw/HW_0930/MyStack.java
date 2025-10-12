package com.multi.hw.HW_0930;

import java.util.ArrayList;
import java.util.List;

// MyStack - 스택 (LIFO: Last-In First-Out, 후입선출)
// ArrayList<Integer>를 사용하여 맨 뒤를 top으로 간주
// - push: 맨 뒤에 삽입
// - pop: 맨 뒤에서 삭제 (비어있으면 null 반환)
// - contains: 선형 탐색
// - update(a,b): 첫 a를 찾아 b로 변경
// - 비어 있을 때 pop()은 null을 반환

public class MyStack {
    private final List<Integer> list = new ArrayList<>();

    //추가
    public void push(int data){
        list.add(data);
    }
    //삭제
    public Integer pop(){
        if(list.isEmpty()) return null;
        return list.remove(list.size()-1);
    }
    //검색
    public boolean contains(int data){
        return list.contains(data);
    }
    //수정
    public boolean update(int origin, int change){
        int idx=list.indexOf(origin);
        if(idx==-1) return false;
        list.set(idx, change);
        return true;
    }

    //Stack 출력
    @Override
    public String toString() {
        return list.toString();
    }
}
