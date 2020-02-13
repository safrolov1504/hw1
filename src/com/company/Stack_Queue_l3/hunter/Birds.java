package com.company.Stack_Queue_l3.hunter;

public class Birds implements Comparable<Birds> {
    private int x;
    private int y;

    public Birds(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Birds o) {
        if(this.y*o.y > 0 && this.x*o.x >0){
            int b = y/x;
            if(o.y == o.x * b){
                return 0;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Birds{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
