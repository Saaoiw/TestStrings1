package com.brainacad.oop._2_17._2_17_1.testthread1;

/**
 * Created by KrevSaa on 22.10.2016.
 * Create a class Main with a main( ) method.
 Add to method main() code that declares local variable “bomb1” of MyTimeBomb  type, and create instance of  MyTimeBomb.Add code to invokestart() method.
 Execute the program.
 */
public class Main {
    public static void main(String[] args) {
        MyTimeBomb bomb1 = new MyTimeBomb();
        Thread tr1 = new Thread(bomb1);

        tr1.start();



    }

}
