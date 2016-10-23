package com.brainacad.oop._2_17._2_17_2.testthread1;

public class MyTimeBomb implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("Boom!!!");
    }
}
