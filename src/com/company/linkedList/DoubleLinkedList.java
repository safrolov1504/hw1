package com.company.linkedList;

import org.omg.CORBA.NO_IMPLEMENT;

import java.util.Iterator;

public class DoubleLinkedList<T> implements Iterable {
    private Node<T> first;
    private Node<T> last;
    private int count;

    public DoubleLinkedList() {
        count=0;
        first = null;
        last = null;
//        first.next = last;
//        last.prev = first;
    }

    public void addFirst(T value){
        Node newNode = new Node(value);

        if(this.first == null && this.last ==null){
            first = last = newNode;
        } else {

            newNode.next = first;
            newNode.prev = newNode;
            first = newNode;
        }
        count++;
    }

    public void addLast(T value){
        Node newNode = new Node(value);
        if(this.first == null && this.last ==null){
            first = last = newNode;
        } else {
            newNode.prev = last;
            last.next = newNode;
            last = newNode;
        }
        count++;
    }

    public void deleteLast(){
        if(this.first == null && this.last == null){
            return;
        } else if (this.first == last){
            this.first = this.last = null;
        } else {
            this.last = this.last.prev;
            this.last.next = null;
        }
        count--;
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
        Node<T> prev;

        public Node(T value) {
            this.value = value;
        }
    }


}
