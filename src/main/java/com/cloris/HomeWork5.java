package com.cloris;

//实现字符串左右指定字符 trim

import java.util.Scanner;

public class HomeWork5 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入需要去除指定符号的字符串：");
        String str = scan.nextLine();

        System.out.println("请输入需要去除的");
        char c = scan.nextLine().charAt(0);

        System.out.println(dropSpecialChar(str,c));

    }


    public static String dropSpecialChar(String str,char c){

        int st = 0;
        char[] val = str.toCharArray();    /* avoid getfield opcode */
        int len = val.length;

        while ((st < len) && (val[st] == c)) {
            st++;
        }
        while ((st < len) && (val[len - 1] == c)) {
            len--;
        }
        return ((st > 0) || (len < val.length)) ? str.substring(st, len) : str;

    }
}
