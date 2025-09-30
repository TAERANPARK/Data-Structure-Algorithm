package com.multi.basic;

public class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    //생성자로 배열의 크기와 top 포인터를 -1로 설정합니다
    public ArrayStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    //isFull
    public boolean isFull(){
        return top == stack.length-1;
    }

    //배열 공간을 확장해서 만들고 기존 배열을 복사해서 확장한 배열에 넣어줌
    public void increment(){
        int []imsi=new int[stack.length*2+3]; //*2+3은 엿장수 마음..
        System.arraycopy(stack,0,imsi,0,stack.length);
        stack=imsi;
    }

    public void push(int value) {
        if (isFull()) { //stack이 full인 상태
            increment();
            //System.out.println("Stack is full");
            //return;
        }//if
        stack[++top] = value; //여기서부터 stack에 0번째 value생성
    }

    public boolean isEmpty() {
        return top == -1;
    }

    //현재 currentPoint에 있는 값만 제거
    public int pop() {
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }

    //현재 currentPoint에 있는 값만 반환
    public int peek() {
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top];
    }

    public void disp(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.printf("%3d ", stack[i]);
            //System.out.println();
        }
        System.out.println(); //disp를 여러번 호출 했을 때 결과 값이 일렬이 아닌 분리돼서 나오게 하기 위해 println함
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5); //[][][][][]
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.disp();
        stack.push(70);
        stack.disp();

//        System.out.println("peek"+stack.peek());
//        System.out.println("peek"+stack.peek());
//        System.out.println("pop"+stack.pop());
//        System.out.println("peek"+stack.peek());
//        while(!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
//        System.out.println("Pop on empty stack: "+stack.pop());
    }


}
