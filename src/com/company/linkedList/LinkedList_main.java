package com.company.linkedList;

public class LinkedList_main {
    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList();

        //добавление
        linkedList.addFirst(5);
        linkedList.addLast(6);
        linkedList.addLast(7);
        linkedList.addFirst(4);
        linkedList.addFirst(3);
        linkedList.addLast(8);
        linkedList.addFirst(3);


        //print(linkedList);

        //вставка в середину
        linkedList.insertIn(2,22);
        //print(linkedList);

        //удаление
        linkedList.deleteFirst();
        //print(linkedList);

        linkedList.deleteLast();
        //print(linkedList);

        //удаление из середины
        linkedList.deleteIn(2);
        //print(linkedList);


        //проверка стека
        linkedList.push(12);
        print(linkedList);

        linkedList.pop();
        print(linkedList);

        //проверка очереди
        linkedList.enqueue(1234);
        print(linkedList);

        linkedList.dequeue();
        print(linkedList);
    }

    static void print(LinkedList<Object> ll){
        for (Object ob:ll) {
            System.out.print(ob +" ");
        }
        System.out.println();
    }
}
