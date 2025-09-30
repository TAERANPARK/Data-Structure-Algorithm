package com.multi.basic.doublelinkedlist;

public class DoubleLinkedList {
    class Node {
        int data;
        Node prev, next;

        public Node(int data) {
            this.data = data;
            prev = null;
            next = null;
        }// constructor
    }// innerClass Node

    private Node head; //리스트의 시작, 첫 노드
    private Node tail; //리스트의 끝, 마지막 노드

    public DoubleLinkedList() {
        head = null;
        tail = null;
    }//constructor

    //추가(Update)
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode; //head가 null이란 첫번째 노드이며, 첫번째 노드란 (head|tail)동시발생
        }else {//첫번째 아닌 그 다음 노드들인 경우
            tail.next = newNode; //newNode는 tailNode안의 next에 다음 Node로 들어간다
            newNode.prev = tail; //방금 만들어진 newNode의 이전은 tail이 된다
            tail = newNode; //tail은 새로 만들어진 newNode가 된다
        }//else
    }//addlist

    //조회(Read)
    public void printList(){ //List출력
        Node current = head;
        System.out.println("LIST");
        while(current!=null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

    //삭제(Delete)
    public void delete(int value){
        Node current = head;
        while (current !=null){
            if (current.data == value){ //삭제 할 data를 찾았을 때..
                if(current == head){ //삭제할 노드가 head인 경우
                    head = head.next; //head는 다음 노드가 된다
                    if(head != null) //head가 된 다음 노드가 null이 아니면
                        head.prev = null; //head기 된 다음 노드의 prev는 null이 된다

                } //if
                else if (current == tail) {//삭제할 노드가 tail인 경우
                    tail = current.prev; //현재 노드의 prev가 tail이 됨
                    if(tail !=null) //tail이 된 이전 노드가 null이 아니면
                        tail.next = null; //tail이 된 이전노드의 next는 null이 된다
                } //else if
                else{ //현재 data가 중간 노드인 경우
                    current.prev.next = current.next; //현재 노드 prev 노드의 next는 현재 노드의 next 노드가 된다
                    current.next.prev = current.prev; //현재 노드 next 노드의 prev는 현재 노드의 prev가 된다
                } //else
                System.out.println("노드 "+value+"가 삭제되었습니다.");
                return;
            } //if
            current = current.next;
        } //while
        System.out.println("노드 " + value + "를 찾을 수 없습니다.");
    }

    //수정(Update)
    public void update(int oldValue, int newValue){
        Node current = head;
        while (current != null){
            if (current.data == oldValue){
                current.data=newValue; //현재 노드의 data에 newValue를 넣어줌
                System.out.println("oldValue= "+oldValue+"는 "+newValue+"로 변경되었습니다." );
            }//if
            current = current.next; // 현재는 현재의 next로 한다

        }//while
        System.out.println("노드 "+oldValue+"를 찾을 수 없습니다.");
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.printList();
        list.delete(20);
        list.printList();
        list.update(40,300);
        list.printList();
    }

}
