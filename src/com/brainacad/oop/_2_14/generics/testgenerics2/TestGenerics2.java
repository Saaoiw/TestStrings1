package com.brainacad.oop._2_14.generics.testgenerics2;

/**
 * Created by Fujitsu on 11.10.2016.
 */
public class TestGenerics2 {
    public static <T extends Comparable<T>> int calcNum(T[] o, T maxelm){
        int count = 0;
        for (int i = 0; i < o.length; i++) {
            if (o[i].compareTo(maxelm) > 0) {count++; }
        }
        return count;
    }

    public static <T extends Number & Comparable<T>> double calcSum(T[] o, T maxval){
        double count = 0;
        for (int i = 0; i < o.length; i++) {
            if (o[i].compareTo(maxval) > 0) {count += o[i].doubleValue(); }
        }
        return count;
    }
}
