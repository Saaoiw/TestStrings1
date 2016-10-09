package com.brainacad.oop._2_15.testcollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Fujitsu on 08.10.2016.
 * Add to method main() code to create both an ArrayList and a LinkedList (of String parameter type),
 * and fill each in loop with string values like: “num_” and number of current iteration (from 0 to 10).
 Print each list using an ordinary Iterator, then insert one list into the other by using a ListIterator,
 inserting at every other location.
 Now perform the insertion starting at the end of the first list and moving backward.
 Write a static method “printElements” that uses an Iterator to step through a Collection and print the each element
 value in the container.
 Execute the program.

 */
public class Testcollection3 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i <= 10; i++) {
            list.add("num_" + i);
            arrayList.add("num_" + i);
        }

        printElements(list);
        printElements(arrayList);

        for (int i = list.size()-1 ; i > 0 ; i--) {
            arrayList.add(list.get(i));
        }

        printElements(arrayList);
    }
    private static void printElements(Collection collection){
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
