package com.company.Stack_Queue_l3;

public class main_stack {
    public static void main(String[] args) {
        //тест стека
        Stack<String> st = new Stack<>(5);
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.push("arr");
        st.push("brr");
        st.push("crr");
        st.push("drr");
        st.push("err");
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

            //тест очереди
//        Queue<String> queue = new Queue<>(5);
//
//        queue.enqueue("aa");
//        queue.enqueue("bb");
//        queue.enqueue("cc");
//        queue.enqueue("dd");
//        queue.enqueue("ee");
//
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());

        //тест двойной очереди
//        DoubleQueue<String> doubleQueue = new DoubleQueue<>(5);
//        System.out.println(doubleQueue.toString());
//        doubleQueue.pushFront("aa");
//        System.out.println(doubleQueue.toString());
//        doubleQueue.pushFront("bb");
//        doubleQueue.pushBack("CC");
//        doubleQueue.pushBack("CC");
//        System.out.println(doubleQueue.toString());
//        System.out.println(doubleQueue.popBack());
//        System.out.println(doubleQueue.popFront());
//        System.out.println(doubleQueue.toString());
    }
}
