package com.company.recursion;
/**
 *
 * F(n) = F(n-1) + F(n-2);
 * F(0) = 0;
 * F(1) = 1;
 *
 * Example: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
 */
public class Fibonacci {
    public static long fibonacciRecursion(int n){
        if(n == 1){
            return 1;
        }
        if(n == 0){
            return 0;
        }

        return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
    }

    public static long fibonacciDinamik(int n){
        long [] resultArray = new long[n+1];
        resultArray[0] = 0;
        resultArray[1] = 1;
        for (int i = 2; i <= n; i++) {
            resultArray[i] = resultArray[i-1]+resultArray[i-2];
        }

        return resultArray[n];
    }

    public static void main(String[] args){
        System.out.println(fibonacciRecursion(13));
        System.out.println(fibonacciDinamik(13));
    }
}
