package com.company.linkedList;

public class DoubleLinkedList_main {
    public static void main(String[] args) {
        DoubleLinkedList<Object> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.addFirst(6);
        print(doubleLinkedList);

        doubleLinkedList.addFirst(5);
        print(doubleLinkedList);

        doubleLinkedList.addLast(7);
        print(doubleLinkedList);

        doubleLinkedList.addLast(8);
        print(doubleLinkedList);

        //удаление

        doubleLinkedList.deleteLast();
        print(doubleLinkedList);

        doubleLinkedList.deleteFirst();
        print(doubleLinkedList);

    }

    static void print(DoubleLinkedList<Object> ll){
        for (Object ob:ll) {
            System.out.print(ob +" ");
        }
        System.out.println();
    }
}
