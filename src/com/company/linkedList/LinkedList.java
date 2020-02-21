package com.company.linkedList;

import java.util.Iterator;

public class LinkedList <T> implements Iterable{

    private Node first;
    private Node last;
    private int count;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.count =0;
    }

    public void addLast(T value){
        Node newNode = new Node(value);

        if(this.first == null && this.last == null){
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        count++;
    }

    public void addFirst(T value){
        Node newNode = new Node(value);

        if(this.first == null && this.last == null){
            first = last = newNode;
        } else {
            newNode.next = first;
            //first.next = newNode;
            first = newNode;
        }
        count++;
    }

    public void deleteFirst(){
        if(this.first == null && this.last == null){
            return;
        } else if (this.first == last){
            this.first = this.last = null;
        } else {
            this.first = this.first.next;
        }
        count--;
    }

    public void deleteLast(){
        if(this.first == null && this.last == null){
            return;
        } else if (this.first.next == null) {
            this.first = this.last = null;
        } else {
            Node pred = searchPrev();
            pred.next = null;
        }
        count--;
    }

    private Node searchPrev() {
        Node pred = this.first;
        Node tmp = this.first.next;
        while (tmp.next != null){
            pred = tmp;
            tmp = pred.next;
        }
        return pred;
    }

    private Node searchPrev(int number) {
        Node pred = this.first;
        Node tmp = this.first.next;
        int i =0;
        while (i != number){
                pred = tmp;
                tmp = pred.next;
                i++;
        }
        return pred;
    }

    public void insertIn(int number, T value){
        Node newNode = new Node(value);

        //System.out.println("kkk " + tmp.value + " " + tmp.next.value);
        if(number == 0){
            this.addFirst(value);
        } else if(number == count-1){
            this.addLast(value);
        } else if(number >= count){
            return;
        } else {
            Node tmp = searchPrev(number);
            newNode.next = tmp.next;
            tmp.next = newNode;
        }
        count++;
    }

    public void deleteIn(int number){
        if(number == 0){
            this.deleteFirst();
        } else if(number == count-1){
            this.deleteLast();
        } else if(number >= count){
            return;
        } else {
            Node tmp = searchPrev(number-1);
            tmp.next = tmp.next.next;
        }
    }

    public void push(T value) {
        this.addLast(value);
        //count++;
    }

    public T pop() {
        T popOut= (T) this.last.value;
        this.deleteLast();
        return popOut;
    }

    public T peek() {
        return (T) this.last.value;
    }

    public void enqueue(T value) {
        this.addFirst(value);
    }

    public T dequeue() {
        T popOut= (T) this.last.value;
        this.deleteLast();
        return popOut;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {

            Node<T> curr = first;

            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public Object next() {
                T value = curr.value;
                curr = curr.next;
                return value;
            }
        };
    }


    private static class Node<T>{
        T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }


}
