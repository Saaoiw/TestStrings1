package com.brainacad.oop._2_16._2_18_3;

/**
 * Created by KrevSaa on 14.10.2016.
 * •	Student should create a new blank Java Project in IDE.
 •	Student should create his or her own Java classMain with methods
 void foo(int a, int b) which print a anb b to console and void foo(int … a) which print array’s content;
 •	 In a method main() student should put two and three integers to method(foo) and look for result.

 */
public class Main {
    static void foo(int a, int b){
        System.out.println(a + " " + b);
    }

    static void foo(int ... a){
        for (int element: a ) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
        foo(5, 10);
        foo(5, 10 , 25);
    }
}
