package com.brainacad.oop._2_16._2_18_2;

/**
 * Created by KrevSaa on 14.10.2016.
 * •	Student should create his or her own Java classMain with methods void foo(int i) which print “int” to console and void foo(Byte b) which print “Byte”;
 •	 In a method main() student should create variable (byte b) and put it to method (foo) and look what will be output.

 */
public class Main {
    static void foo(int i){
        System.out.println("int");
    }

    static void foo(Byte b){
        System.out.println("Byte");
    }

    public static void main(String[] args) {
        byte b = 5;
        foo(b);
    }
}
