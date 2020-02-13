package com.company.Stack_Queue_l3;

public class main_addTask {
    public static void main(String[] args) {

        //переварачиваем слово
        String str = "Привет мир!";

        Stack<Character> str_stack = new Stack<>(str.length()+1);
        char[] str_char = str.toCharArray();
        for (int i = 0; i < str_char.length; i++) {
            str_stack.push(str_char[i]);
        }
        while (!str_stack.isEmpty()){
            System.out.print(str_stack.pop());
        }


    }
}
