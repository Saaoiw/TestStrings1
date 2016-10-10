package com.brainacad.oop._2_15.testcollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fujitsu on 08.10.2016.
 * Create class MyNumGenerator with two fields: numOfElm and maxNumb of int type,
 * constructor with two parameters and method “generate()” which return new collection (of List type)
 * with numOfElm length,  filled with numbers from 0 to  maxNumb .
 Create a class Main with a main( ) method.
 Add to method main() code to create instance of MyNumGenerator (for example with 5,64 parameters)
 and print result of invoking generate() method to console.
 Execute the program.
 The program output must be like next example:
 [43,15,60,2,5]

 */


public class TestMyGenerator {
    private int numOfElm;
    private int maxNumb;

    public TestMyGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public List generate(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numOfElm; i++) {
            arrayList.add((int)(Math.random()  * (maxNumb - 0)));
        }
        return arrayList;
    }
}

class Main{
    public static void main(String[] args) {
        TestMyGenerator testMyGenerator = new TestMyGenerator(5, 64);

        System.out.println(testMyGenerator.generate());
    }
}