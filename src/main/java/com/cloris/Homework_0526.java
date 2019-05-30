package com.cloris;
import java.math.*;
import java.util.*;

public class Homework_0526 {

    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        System.out.println("输入一个表达式，e.g.:1  +  1：");


        BigDecimal a = scan.nextBigDecimal();

        char ch = scan.next().charAt(0);
        BigDecimal b = scan.nextBigDecimal();

        switch(ch){
            case '+':
                plusBigDecimal(a,b);
                break;
            case '*':
                multiplyBigDecimal(a,b);
                break;
            case '-':
                subtractBigDecimal(a,b);
                break;
            case '/':
                divideBigDecimal(a,b);
                break;
        }


    }
    public static void multiplyBigDecimal(BigDecimal a,BigDecimal b){

        BigDecimal result = a.multiply(b);
        System.out.println("两数乘：" +result);

    }

    public static void plusBigDecimal(BigDecimal a,BigDecimal b){

        BigDecimal result = a.add(b);
        System.out.println("两数和：" + result);
    }

    public static void subtractBigDecimal(BigDecimal a,BigDecimal b){

        BigDecimal result = a.subtract(b);
        System.out.println("两数差：" + result);
    }

    public static void divideBigDecimal(BigDecimal a,BigDecimal b){
        if (b.equals(0)){
            System.out.println("除数不能为0！");
        }else{
            BigDecimal result = a.divide(b);
            System.out.println("两数");
        }

    }
}
