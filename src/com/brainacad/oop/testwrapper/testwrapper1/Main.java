package com.brainacad.oop.testwrapper.testwrapper1;

/**
 * Created by Fujitsu on 29.09.2016.
 * Create class Main with method main(). In main() method declare few xN local variable of Integer class and initialize
 * it with same value (lower then 128), but in different manner.
 For example:
 Integer x1 = 10;
 Integer x2 = new Integer(10);
 Integer x4 = Integer.valueOf(10);
 Integer x5 = Integer.parseInt(“10”);
 Compare it to each other using “==” and equals(), print result to console.
 Do the same, but for value higher than 128.

 */
public class Main {
    public static void main(String[] args) {

        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x4 = Integer.valueOf(10);
        Integer x5 = Integer.parseInt("10");

        Integer x11 = 4444;
        Integer x22 = new Integer(4444);
        Integer x44 = Integer.valueOf(4444);
        Integer x55 = Integer.parseInt("4444");

        System.out.println("Compare x1 & x2: " + "equals - " + x1.equals(x2) + ", == - " + (x1 == x2));
        System.out.println("Compare x1 & x4: " + "equals - " + x1.equals(x4) + ", == - " + (x1 == x4));
        System.out.println("Compare x1 & x5: " + "equals - " + x1.equals(x5) + ", == - " + (x1 == x5));

        System.out.println("Compare x11 & x22: " + "equals - " + x11.equals(x22) + ", == - " + (x11 == x22));
        System.out.println("Compare x11 & x44: " + "equals - " + x11.equals(x44) + ", == - " + (x11 == x44));
        System.out.println("Compare x11 & x55: " + "equals - " + x11.equals(x55) + ", == - " + (x11 == x55));
    }



}
