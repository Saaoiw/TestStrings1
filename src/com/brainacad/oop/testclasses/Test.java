package com.brainacad.oop.testclasses;

import java.util.*;

/**
 * Created by Fujitsu on 29.09.2016.
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(5);
        a.add(3);
        Collections.sort(a);
        a.add(2);
        Collections.reverse(a);
        System.out.println(a);
    }
}