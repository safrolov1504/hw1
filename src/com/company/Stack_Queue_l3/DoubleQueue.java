package com.company.Stack_Queue_l3;

import java.util.Arrays;

public class DoubleQueue <T>{
    private T [] dQueue;
    private int rear;
    private int front;
    private int size;

    public DoubleQueue(int size) {
        this.dQueue = (T[]) new Object[size];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void pushFront(T item){
        if(this.isFull()){
            throw new MyExeption("Queue is full");
        } else {
            if(rear == dQueue.length - 1){
                rear = -1;
            }
            dQueue [++rear] = item;
            size++;
        }
    }

    public void pushBack(T item){
        if(this.isFull()){
            throw new MyExeption("Queue is full");
        } else {
            if(front == 0){
                front =dQueue.length-1;
            }
            dQueue [front--] = item;
            size++;
        }
    }

    public T popBack(){
        T tmp = null;
        if(this.isEmpty()){
            throw new MyExeption("Queue is empty");
        } else {
            tmp = dQueue[++front];
            dQueue [front] = null;
            size--;
        }
        return tmp;
    }

    public T popFront(){
        T tmp = null;
        if(this.isEmpty()){
            throw new MyExeption("Queue is empty");
        } else {
            tmp = dQueue[rear];
            dQueue[rear] = null;
            rear --;
            size --;
        }
        return tmp;
    }

    public boolean isFull(){
        return size == dQueue.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        return "DoubleQueue{" +
                "dQueue=" + Arrays.toString(dQueue) +
                '}';
    }
}
