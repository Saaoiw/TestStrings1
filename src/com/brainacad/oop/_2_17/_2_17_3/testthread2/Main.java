package com.brainacad.oop._2_17._2_17_3.testthread2;

import java.util.Random;

/**
 * Created by KrevSaa on 22.10.2016.
 * Create a class Main with a main( ) method.
 Add to method main() code that declares local variable “myArray” as array of integer type (of 1000 size), and create two instancees ofMySumCount.
 Add code to fill all elements of myArray with random integer values generated from 0 to 1000 range.
 Add code to calculates sum of myArray elements in two separate thread and then print result to console.
 Execute the program.
 The program output must be like next example:
 [324,234,523,…,643]
 Sum of array elements: 123457
 */
public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[1000];
        MySumCount mySumCount1 = new MySumCount();
        MySumCount mySumCount2 = new MySumCount();
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(1000);
        }

        mySumCount1.setarray(myArray);
        mySumCount1.setStartIndex(10);
        mySumCount1.setStopIndex(500);

        mySumCount2.setarray(myArray);
        mySumCount2.setStartIndex(10);
        mySumCount2.setStopIndex(100);

        mySumCount1.start();
        mySumCount2.start();

        System.out.println(mySumCount1.getResultSum());
        System.out.println(mySumCount2.getResultSum());

    }
}
