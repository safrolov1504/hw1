package com.company.Stack_Queue_l3.hunter;

public class main_hunter {
    public static void main(String[] args) {
        Birds [] birds = {
                new Birds(1,2),
                new Birds(2,4),
                new Birds(-3,-9),
                new Birds(-4,-12),
                new Birds(3,6),
                new Birds(1,3),
                new Birds(-1,-3),
                new Birds(-2,-6),

        };

        int maxBirds = 0;
        Birds turn = new Birds(0,0);
        int tmp = 0;
        for (int i = 0; i < birds.length; i++) {
            for (int j = i+1; j < birds.length; j++) {
                if(birds[i].compareTo(birds[j]) == 0){
                    tmp++;
                }
                if(tmp >= maxBirds){
                   maxBirds = tmp;
                   turn = birds[i];
                }
            }
            System.out.println(tmp);
            tmp =0;
        }
        System.out.println(turn);

    }
}
