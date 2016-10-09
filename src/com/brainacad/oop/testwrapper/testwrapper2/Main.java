package com.brainacad.oop.testwrapper.testwrapper2;

/**
 * Created by Fujitsu on 05.10.2016.
 * Create class Main with method main().
 Add to class Main static method compute( , ) that use as argument s two different numeric wrapper classes,
 adds the values of the two instances together, and then creates a third numeric wrapper instance whose value
 is the sum and return it.
 For example:
 static method compute(Byte, Integer) witch return Long type.
 In method main() write code to invoke compute(,) and print result to console.

 */
public class Main {
    private static Long compute(Byte b, Integer i){
     return Long.valueOf (b + i);
    }

    public static void main(String[] args) {
        System.out.println( compute((byte)1000000001,999999999 ) );
    }
}
