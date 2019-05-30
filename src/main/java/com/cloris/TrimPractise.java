package com.cloris;
//实现字符串左空格，如"     abc   "，输出"abc     "

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class TrimPractise {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
//        System.out.println("需要需要去除左空格的字符串：");
//
//        String str = scan.next();
//        System.out.println(leftDrop(str));


        System.out.println("请输入需要去除右空格的字符串：");
        String strRight = scan.nextLine();
        System.out.println(rightDrop(strRight));


    }

    public static String leftDrop(String str){
        char[] stringArray = str.toCharArray();
        int len = stringArray.length;
        int st = 0;
        while ((st < len) && (stringArray[st] <= ' ')) {
            st++;
        }
        return (st > 0) ? substring(st, len) : str;
    }

    public static String rightDrop(String str){

        char[] stringArray = str.toCharArray();
        int len = stringArray.length;
        int st = 0;
        while((st < len) && (stringArray[len-1]<=' ')){
            len--;
        }
        return (len < stringArray.length) ? substring(0,len):str;

    }

 }

