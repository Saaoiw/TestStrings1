package com.brainacad.oop._2_16._2_18_5;

/**
 * Created by KrevSaa on 14.10.2016.
 * •	Student should create a new blank Java Project in IDE.
 •	Student should create his or her own Java classMain with methods void foo(int i) which print “int” to console and void foo(byte b) which print “byte”;
 •	 In a method main() student should create variable (byte b = 5;) and put it to method (foo) and look what will be output.
    Then he should put simple number(for example 5) directly to method. Explain result.

 */
public class Main {
    static void foo(int i){
        System.out.println("int");
    }

    static void foo(byte b){
        System.out.println("byte");
    }

    public static void main(String[] args) {
        byte b = 5;

        foo(b);
        foo(5);
    }
}
