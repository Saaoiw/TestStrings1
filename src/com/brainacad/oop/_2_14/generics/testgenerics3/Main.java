package com.brainacad.oop._2_14.generics.testgenerics3;

import java.util.Iterator;

/**
 * Created by Fujitsu on 11.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        TestGenerics3<Integer> integer = new  TestGenerics3<Integer>(new Integer[]{1,2,3,4,5,6,7,8,9});
        TestGenerics3<String> strings = new TestGenerics3<String>(new String[]{"one" , "two" , "three" , "five" ,
                                                                  "four" , "six" , "seven" , "eight" , "nine"});

        integer.shuffle();
        strings.shuffle();

        integer.outArray();
        strings.outArray();


    }
}
