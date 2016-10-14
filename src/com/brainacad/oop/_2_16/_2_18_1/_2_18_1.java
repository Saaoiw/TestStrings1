package com.brainacad.oop._2_16._2_18_1;

/**
 * Created by Fujitsu on 13.10.2016.
 */
class Animal {}

class Dog extends Animal {}

public class _2_18_1 {
    static void foo(Animal a){
        System.out.println("Animal");
    }

    static void foo(Dog d){
        System.out.println("Dog");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        foo(a);
    }
}
