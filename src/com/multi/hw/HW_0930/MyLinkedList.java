package com.multi.hw.HW_0930;

// MyLinkedList - 단일 연결 리스트
// - Node(data, next)로 구성
// - addFirst: 맨 앞 삽입
// - addLast: 맨 뒤 삽입(끝까지 순회)
// - addAt: 인덱스 i 위치 삽입(0=맨 앞, size=맨 뒤) 유효하지 않은 i는 false 반환
// - delete: 값이 x인 첫 노드 삭제, 성공/실패 boolean
// - contains: 선형 탐색
// - update(a,b): 첫 a를 찾아 b로 변경
// - 빈 리스트에서의 삭제/검색/수정 → false 반환
// - addAt에서 인덱스 음수/범위 초과 → false 반환

public class MyLinkedList {

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }//constructor
    }//innerClass
    private Node head;

    public  MyLinkedList(){
        head = null;
    }

    //맨 앞 삽입
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //맨 뒤 삽입
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }temp.next = newNode;
        }
    }

    //특정위치 삽입
    public boolean addAt(int index,int data){
        if (index < 0) return false;
        Node newNode = new Node(data);

        if(index == 0){ //첫번째 위치에 추가
            newNode.next = head;
            head = newNode;
            return true;
        }
        Node temp = head;
            for(int i = 0;i < index-1;i++){
                if(temp == null) return false;
                temp = temp.next;
            }
            if (temp == null) return false;

            newNode.next = temp.next;
            temp.next = newNode;
            return true;
    }

    //삭제
    public boolean delete(int data){
        if(head == null) return false;
        if(head.data == data){ //입력된 data가 head의 data와 같으면 head를 다음 노드로 옮긴다
            head = head.next;
            return true;
        }
        Node temp = head;
        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }
        if(temp.next == null) return false;
        temp.next = temp.next.next; // 요소 제거
        return true;
    }

    //검색
    public boolean contains(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data) return true;
            temp = temp.next;
        }
        return false;
    }

    //수정
    public boolean update(int origin, int change){
        Node temp = head;
        while(temp != null){
            if(temp.data == origin){
                temp.data = change;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //출력
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("[");
        Node temp = head;
        while(temp != null){
            sb.append(temp.data);
            temp = temp.next;
            if(temp != null) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
