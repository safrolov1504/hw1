package com.company.Stack_Queue_l3;

import java.util.Arrays;

public class Stack<T>  {
    private T [] stack;
    private int top = 0;

    public Stack(int size) {
        this.stack =  (T[]) new Object[size];
    }

    public  void push(T item){
        if(this.isFull()){
           throw new MyExeption("Stack is full");
        } else {
            stack[top++] = item;
        }
    }

    public T  pop(){
        if(this.isEmpty()){
            throw new MyExeption("Stack is empty");
        } else {
            T tmp = stack[--top];
            stack[top] = null;
            return tmp;
        }
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public boolean isFull(){
        return top>=stack.length;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }
}
