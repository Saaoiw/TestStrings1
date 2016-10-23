package com.brainacad.oop._2_17._2_17_6.testthread5;

/**
 * Created by KrevSaa on 23.10.2016.
 */
public class Storage extends Thread {
    private int[] num;

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }
}
