package com.company.Stack_Queue_l3.MathExpression;

import com.company.Stack_Queue_l3.Stack;

import java.util.HashSet;
import java.util.Set;

public class WortWithExpression {
    private Stack<String> sign;
    private Stack<Double> numbers;
    Set set;
    private String [] subStr;

    public WortWithExpression(String str) {
       subStr = str.split(" ");
       this.set = new HashSet<String>();
       set.add("(");  set.add(")"); set.add("+"); set.add("-"); set.add("*"); set.add("/");
       this.sign = new Stack<>(10);
       this.numbers = new Stack<>(10);
//        for (String item:subStr) {
//            if(set.contains(item)){
//                sign.push(item);
//            } else {
//                numbers.push(Double.parseDouble(item));
//            }
//        }
    }

    public double math_pars(){
        //String[] subStr = str.split(" ");
        //Set set = new HashSet<String>();
        for (String item:subStr) {
            if(item.equals("(")){
                //sign.push(item);
                continue;
            } else if(!set.contains(item)){
                numbers.push(Double.parseDouble(item));
            } else if (item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/")){
                sign.push(item);
            } else if(item.equals(")")){
                numbers.push(math());
                if(!sign.isEmpty()){
                    numbers.push(math());
                }
            }
        }
        while (!sign.isEmpty()){
            numbers.push(math());
        }
        return numbers.pop();
    }

    private double math() {
        double v2 = numbers.pop();
        double v1 = numbers.pop();
        double result=0;
        String sign_in = sign.pop();
        switch (sign_in){
            case "+":
                result = v1+v2;
                break;
            case "-":
                result = v1-v2;
                break;
            case "*":
                result = v1*v2;
                break;
            case "/":
                result = v1/v2;
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return "WortWithExpression{" +
                "sign=" + sign.toString() +
                ", numbers=" + numbers.toString() +
                '}';
    }
}
