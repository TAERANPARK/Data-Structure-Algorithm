package com.multi.hw.HW_0930;

// MyDoubleLinkedList - 이중 연결 리스트
// - Node(data, prev, next)로 구성
// - head(첫 노드), tail(마지막 노드)
// - addFirst: 맨 앞 삽입
// - addLast: 맨 뒤 삽입
// - addMiddle: 인덱스 i 앞에 삽입(0=맨 앞) 유효하지 않은 i는 false 반환
// - delete: 값이 x인 첫 노드 삭제
// - contains: 선형 탐색
// - update(a,b): 첫 a를 찾아 b로 변경
// - 빈 리스트에서의 삭제/검색/수정 → false 반환
// - addMiddle에서 인덱스 음수/범위 초과 → false 반환

public class MyDoubleLinkedList {

    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }//constructor
    }//innerClass
    private Node head;
    private Node tail;

    public MyDoubleLinkedList() {
        head = null;
        tail = null;
    }

    //맨 앞 삽입
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) { //head가 null이면
            head = tail = newNode; //head, tail은 newNode
        }else { //head가 null이 아니면
            head.prev = newNode; //head 의 이전은 newNode
            newNode.next = head; //newNode의 다음은 head
            head = newNode; //맨 앞 삽입이므로 newNode가 head가 됨
        }
    }

    //맨 끝 삽입
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) { //head가 null이면
            head = tail = newNode; //head, tail은 newNode
        }else { //head가 null이 아니면
            tail.next = newNode; //tail의 다음은 newNode
            newNode.prev = tail; //newNode의 이전은 tail
            tail = newNode; //맨 뒤 삽입이므로 newNode가 tail이 됨
        }
    }

    //중간 삽입
    public boolean addMiddle(int index, int data) {
        if (index < 0) return false; //중간 삽입이므로 입력한 index가 0보다 작으면 false 반환
        if (index == 0) { addFirst(data); return true; } //입력한 index가 0이면 맨 앞 삽입 실행 후 true 반환
        if (head == null) return false; //head가 null인 경우 리스트가 없는 것이므로 false반환

        Node temp = head; //현재노드 temp가 head
        for (int i = 0; i < index - 1; i++) { //i가 0부터 마지막 index-1까지 i++
            temp = temp.next; //temp는 다음 노드가 됨
            if (temp == null) return false; // 범위 초과
        }
        Node newNode = new Node(data);
        Node next = temp.next; //노드 next는 현재(temp)노드의 다음 노드

        newNode.prev = temp; //newNode의 이전은 현재 노드가 됨
        newNode.next = next; //newNode의 다음은 현재의 다음 노드가 됨
        temp.next = newNode; //현재 노드의 다음은 newNode가 됨
        if (next != null) next.prev = newNode; //다음 노드가 null이 아니면 다음 노드의 이전은 newNode가 됨
        else tail = newNode;//다음 노드가 null이면 newNode는 tail이 됨
        return true;// 성공
    }

    //삭제
    public boolean delete(int data) {
        if (head == null) { //head가 null이면 리스트가 비어있으니 false반환
            return false;
        }
        Node temp = head; //현재노드(temp)를 head로 두고
        while (temp !=null){ //현재노드가 null이 아닌 동안
            if (temp.data == data) {
                if(temp == head){ //현재가 head이면
                    head = head.next; //head는 다음 노드가 됨
                    if(head != null) head.prev = null; //head가 null이 아니면 head의 이전은 null이고
                    else tail = null; //head가 null이면 tail은 null
                } else if (temp == tail) { //현재가 tail이면
                    tail = temp.prev; //tail은 이전 노드가 됨
                    if(tail != null) tail.next = null; //tail이 null이 아니면 tail의 다음은 null
                } else { //현재 노드가 head도 tail도 아닌 중간 노드이면
                    temp.prev.next = temp.next; //현재의 이전노드의 next는 현재의 다음노드가 됨
                    temp.next.prev = temp.prev; //현재의 다음노드의 prev는 현재의 이전노드가 됨
                }
                return true; //현재노드 삭제
            }
            temp = temp.next; //현재는 다음 노드로 옮겨감
        }
        return false; //현재가 없으면 false반환
    }

    //검색
    public boolean contains(int data) {
        Node left = head; //left는 head(앞)에서 시작
        Node right = tail; //right는 tail(뒤)에서 시작
        while (left != null && right != null && left.prev != right && left != right) {
            //양쪽 다 유효한 노드가 있음 && 포인터가 서로를 건너뛰어 교차하기 직전까지만 && 같은 노드에서 만나는 상황 전까지 조건 충족
            if (left.data == data || right.data == data) {
                return true; //양쪽 어느 한쪽에서라도 찾으면 true
            }
            left = left.next; //한 번 순회마다 앞쪽 포인터는 오른쪽으로
            right = right.prev; //뒤쪽 포인터는 왼쪽으로 한 칸 이동
        }
        // 가운데서 만났을 때(홀수 길이) 마지막 확인
        if (left != null && left.data == data) {
            return true;
        } else {
            return false;
        }
    }

    //수정
    public boolean update(int origin, int change){
        Node temp = head;
        while (temp != null){
            if (temp.data == origin){
                temp.data = change;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node cur = head;
        while (cur != null) {
            sb.append(cur.data);
            cur = cur.next;
            if (cur != null) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
