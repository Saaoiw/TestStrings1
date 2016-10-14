package com.brainacad.oop._2_14.generics.testgenerics2;



/**
 * Created by Fujitsu on 11.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Integer arrInt[] = new Integer[]{1,2,3,4,5,6,7,8,9};
        Double arrDoud[] = new Double[]{1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};

        System.out.println(TestGenerics2.calcNum(arrInt, 3) );
        System.out.println(TestGenerics2.calcNum(arrDoud, 3D));

        System.out.println(TestGenerics2.calcSum(arrInt, 3));
        System.out.println(TestGenerics2.calcSum(arrDoud, 3D));
    }
}
