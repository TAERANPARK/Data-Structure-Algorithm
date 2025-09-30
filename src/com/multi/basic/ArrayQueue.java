package com.multi.basic;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;
    private int count;

    public ArrayQueue() {
        super();
    }

    public ArrayQueue(int size) {
        queue = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int item) { //삽입
        if (isFull()) {
            System.out.println("is full");
            return;
        }
        queue[++rear] = item;
        count++;
    }

    public int dequeue() { //삭제
        if (isEmpty()) {
            System.out.println("is empty");
            return -1;
        }
        int item = queue[front++];
        count--;
        return item;
    }

    boolean isFull() {
        return count == capacity || (rear == capacity);
    }

    boolean isEmpty() {
        return count == 0 || (front == 0 && rear == -1);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("is empty");
        } else {
            int i = front;
            for (int c = 0; c < count; c++) {
                System.out.print(queue[i] + " ");
                i = (i + 1) % capacity;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
}
