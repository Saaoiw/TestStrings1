package com.brainacad.oop._2_14.generics.testgenerics1;

/**
 * Created by Fujitsu on 11.10.2016.
 */
class Main{
    public static void main(String[] args) {
        TestGenerics1<String, Integer, Long> firstOne = new TestGenerics1<String, Integer, Long>("First", 10, 100L);
        TestGenerics1<Double, String, String> secondOne = new TestGenerics1<Double, String, String>(12312.3123, "Second", "Second2");

    }
}