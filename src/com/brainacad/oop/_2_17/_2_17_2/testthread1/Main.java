package com.brainacad.oop._2_17._2_17_2.testthread1;

public class Main {
    public static void main(String[] args) {
        MyTimeBomb bomb1 = new MyTimeBomb();
        new Thread(bomb1).start();
    }

}
