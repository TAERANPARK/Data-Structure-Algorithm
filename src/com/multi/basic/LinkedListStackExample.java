package com.multi.basic;

class Node{
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
    }
}

class LinkedListStack{
    private Node top;

    public LinkedListStack() {
        top=null; //안써도 top은 null
    }
    //stack기반 추가
    public void push(int value){
        Node newNode=new Node(value);
        newNode.next=top;
        top=newNode;
    }
    //stack기반 삭제
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int value=top.data;
        top=top.next;
        return  value;
    }
    //stack기반 top data반환
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top==null;
    }
}


public class LinkedListStackExample {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(5);
        stack.push(10);
        stack.push(25);

        System.out.println("Peek: " + stack.peek()); // 출력: 25
        System.out.println("Pop: " + stack.pop()); // 출력: 25
        System.out.println("Peek: " + stack.peek()); // 출력: 15

        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }

        System.out.println("Pop on empty stack: " + stack.pop()); // 스택 비었을 때
    }
}
