package com.brainacad.oop._2_16._2_18_4;

/**
 * Created by KrevSaa on 14.10.2016.
 * •	Student should create class Animal and extends from him create class Dog and extends from him create class Puppy.
 •	Student should create class Main which has two methods foo(Animal a), foo(Dog d), foo(Puppy p). This methods print to console “Animal”, “Dog” or “Puppy” respectively.
 •	Student should create and provide all necessary code in a method main() to show how does overload resolution works when we put null to method foo
 */
class Animal {}

class Dog extends Animal {}

class Puppy extends Dog{}

public class Main {
    static void foo(Animal a){
        System.out.println(a.getClass());
    }

    static void foo(Dog d){
        System.out.println(d.getClass());
    }

    static void foo(Puppy p){
        System.out.println(p.getClass());
    }

    public static void main(String[] args) {
        foo(null);
    }
}
