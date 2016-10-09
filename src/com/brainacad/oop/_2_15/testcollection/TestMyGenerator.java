package com.brainacad.oop._2_15.testcollection;

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

    public int getNumOfElm() {
        return numOfElm;
    }

    public void setNumOfElm(int numOfElm) {
        this.numOfElm = numOfElm;
    }

    public int getMaxNumb() {
        return maxNumb;
    }

    public void setMaxNumb(int maxNumb) {
        this.maxNumb = maxNumb;
    }
}
