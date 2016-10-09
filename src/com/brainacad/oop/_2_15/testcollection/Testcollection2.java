package com.brainacad.oop._2_15.testcollection;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Fujitsu on 08.10.2016.
 * Create a class Main with a main( ) method.
 Add to method main() code that declares “list” variable (of LinkedList type) of string objects as LinkedList<String>.
 Write code to fill this “list” in loop with string values like: “num_” and number of current iteration (from 0 to 10).
 But element insertion point must be generated randomly (from 0 to current collection length).
 Add code which iterates over list and print current element value to console.
 Execute the program.
 The program output must be like next example:
 number_5
 number_2
 number_7
 …
 number_3

 */
public class Testcollection2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        for (int i = 0; i <= 10; i++) {
            list.add("num_" + (int)(Math.random()  * (10 - 0)));
        }

        Iterator<String> element = list.iterator();
        while (element.hasNext()){
            System.out.println(element.next());
        }

    }
}
