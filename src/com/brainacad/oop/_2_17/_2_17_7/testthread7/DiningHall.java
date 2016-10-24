package com.brainacad.oop._2_17._2_17_7.testthread7;

/**
 * Created by KrevSaa on 24.10.2016.
 */
public class DiningHall {
    static int pizzaNum;
    static int studentID;

    public void makePizza() {
        pizzaNum++;
    }
    public void servePizza() {
        String result;
        if (pizzaNum>0) {
            result = "Served ";
            pizzaNum--;
        } else result = "Starved ";
        System.out.println(result + studentID);
        studentID++;
    }
    public static void main(String[] args) {
        DiningHall d = new DiningHall();
        for (int i = 0; i<10; i++)
            d.makePizza();
        for (int i = 0; i<20; i++)
            d.servePizza();
    }
}
