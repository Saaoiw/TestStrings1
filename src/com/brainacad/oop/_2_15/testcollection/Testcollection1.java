package com.brainacad.oop._2_15.testcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Fujitsu on 08.10.2016.
 */
public class Testcollection1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add("number_" + i);
        }

        Iterator<String> element = list.iterator();
        while (element.hasNext()){
            System.out.println(element.next());
        }
     }
}
