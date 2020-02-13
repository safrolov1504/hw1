package com.company.Stack_Queue_l3.MathExpression;

public class main_mathExpression {
    public static void main(String[] args) {
        //String str = "( ( 7.0 + 5.0 ) * ( 8.0 - 7.0 ) + 3 )";
        String str = "3 * ( 5 + 7 ) * 3 ) + 8";
        WortWithExpression wortWithExpression = new WortWithExpression(str);
        //System.out.println(wortWithExpression.toString());
        //wortWithExpression.math_pars();
        System.out.println("3 * ( 5 + 7 ) * 3 ) + 8 = " + wortWithExpression.math_pars());
        double check = (3*(5+7) * 3 )+8;
        System.out.println("check = " +check);
        System.out.println();

        str = "( 7.0 + 5.0 ) * ( 8.0 - 7.0 ) + 3";
        wortWithExpression = new WortWithExpression(str);
        System.out.println("( 7.0 + 5.0 ) * ( 8.0 - 7.0 ) + 3 = " + wortWithExpression.math_pars());
        //System.out.println(wortWithExpression.toString());
        check = (7+5)*(8-7)+3;
        System.out.println("Check = " + check);

        str = "( 7.0 + 5.0 ) * ( 8.0 - 7.0 ) + 3 * 7";
        wortWithExpression = new WortWithExpression(str);
        System.out.println("( ( 7.0 + 5.0 ) * ( 8.0 - 7.0 ) + 3 * 7 = " + wortWithExpression.math_pars());
        //System.out.println(wortWithExpression.toString());
        check = (7+5)*(8-7)+3*7;
        System.out.println("Check = " + check);
    }
}
