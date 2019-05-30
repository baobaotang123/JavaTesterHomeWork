package com.cloris;

//实现字符串左右指定字符 trim

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class HomeWork5 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String c = "";
        c.trim();


    }


    public static String dropSpecialChar(String str,char c){

        int st = 0;
        char[] val = str.toCharArray();    /* avoid getfield opcode */
        int len = val.length;

        while ((st < len) && (val[st] <= ' ')) {
            st++;
        }
        while ((st < len) && (val[len - 1] <= ' ')) {
            len--;
        }
        return ((st > 0) || (len < val.length)) ? substring(st, len) : str;


    }
}
