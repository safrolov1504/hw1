package com.company.recursion;

public class Factorial {
    public static int factorialRec(int n){
        if(n == 0){
            return 1;
        } else {
            return factorialRec(n-1)*n;
        }
    }

    public static int factorialDinam(int n){
        int result = 1;
        if(n != 0) {
            while (n != 1) {
                result *= n;
                n--;
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(factorialRec(7));
        System.out.println(factorialDinam(7));
    }
}
