package com.company.recursion;

public class Exponent {

    public static int exponentRecur(int number, int expon){
        if(expon == 0){
            return 1;
        } else {
            return exponentRecur(number,expon-1) * number;
        }
    }

    public static int exponentDen(int number, int expon){
        int result=1;
        if(expon == 0)
            return result;
        for (int i = 1; i < expon+1; i++) {
            result*=number;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(exponentRecur(5,7));
        System.out.println(exponentDen(5,7));
        System.out.println(5*5*5*5*5*5*5);
    }
}
