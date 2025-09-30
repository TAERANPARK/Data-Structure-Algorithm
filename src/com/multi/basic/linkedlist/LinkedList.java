package com.multi.basic.linkedlist;
class Node{ //new Node() data|next
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

//
public class LinkedList {
    private Node head; //값이 없는 노드(더미노드)

    public LinkedList() {
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){//리스트가 비어있을 때..
            head = newNode;
        }else {//두번째 이상 노드가 추가되었을 때..
            Node current = head;
            while(current.next != null){
                current = current.next;//다음 노드를 현재 노드로 이관한다..
            }//while
            current.next = newNode;
        }//else
    }//add
    public boolean isEmpty(){
        return (head == null);
    }//is Empty
    public void display(){
        //[HEAD(data(10)|next)] [NODE(data(20)|next)] [NODE(data(30)|next)]
        Node current = head;
//        System.out.println(current.data);//10
//        System.out.println(current.next.data);//20
//        System.out.println(current.next.next.data);//30
//        System.out.println(current.next.next.next.data);//40
//        System.out.println(current.next.next.next.next.data);//50
        while (current != null){
            System.out.println(current.data + "\t");
            current = current.next;
        }
        System.out.println();
    }

    public void addAt(int index, int data){
        Node newNode = new Node(data); //새로운 노드
        if(index == 0){
            newNode.next = head;
            head = newNode;
        }else {
            Node current = head;
            for(int i = 0; i < index - 1; i++){
                if(current.next == null){
                    throw new IndexOutOfBoundsException();
                }
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int get(int index){
        Node current = head;
        for(int i = 0; i < index; i++){
            if(current==null){
                throw new IndexOutOfBoundsException();
            }//current가 null이면 예외 발생
            current = current.next;
        }
        return current.data;
    }

    public void remove(int data){//삭제
        if(isEmpty()){//연결리스트가 비어있으면 메시지 주고 return
            System.out.println("is Empty");
            return;
        }
        if(head.data == data){//삭제 할 data가 head와 같으면
            head = head.next;//head 다음 node가 head가 된다
        }
        // 삭제 할 data가 첫번째가 아니면 traversal(순회)
        Node current = head;
        while(current.next !=null && current.data != data){
            current = current.next; //순회
        }
        if(current.next == null){
            System.out.println("is Empty");
        }else {
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.display();
        System.out.println(list.get(2));
//        list.addAt(1,100);
//        list.display();
    }
}
