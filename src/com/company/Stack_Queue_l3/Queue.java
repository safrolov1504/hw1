package com.company.Stack_Queue_l3;


import java.util.Arrays;

public class Queue <T> {
    private T[] queue;
    private int front = 0;
    private int rear = -1;
    private int size = 0;

    public Queue(int size) {
        this.queue = (T[]) new Object[size];
    }

    public void enqueue(T item){
        if(this.isFull()){
            throw new MyExeption("Queue is full");
        } else {
            if (rear == queue.length - 1) {
                rear = -1;
            }
            queue[++rear] = item;
            size++;
        }
        //System.out.println("rear: " + rear + "front: "+front);
    }

    public T dequeue(){
        T tmp = null;
        if(this.isEmpty()){
            throw new MyExeption("Queue is empty");
        } else {
            tmp = queue[front];
            queue[front++] = null;
            if(front == queue.length){
                front =0;
            }
            size --;
        }

        //System.out.println("rear: " + rear + "front: "+front);
        return tmp;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size>=queue.length;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "queue=" + Arrays.toString(queue) +
                '}';
    }
}
