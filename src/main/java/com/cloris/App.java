package com.cloris;

import lombok.Getter;
import lombok.Setter;

/**
 * Hello world!
 *
 */
@Setter
@Getter
public class App
{
    private String a;
    private String b;
    private String c;
    private String d;

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.setA("");
        app.getA();
    }
}
