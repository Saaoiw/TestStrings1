package com.brainacad.oop._2_17._2_17_3.testthread2;

/**
 * Created by KrevSaa on 22.10.2016.
 * 1.	Create a class MySumCount which extends the Thread class.
 2.	Add to class  MySumCount two integer fields “startIndex” and “stopIndex” with setters and getters.
 3.	Add to class  MySumCount new field as array of integer type and setter for it;
 4.	Add to class  MySumCount new field “resultSum” of long type and getter for it;
 5. Override the run()  method of Thread. Add code to calculate sum of array elements from startIndex to stopIndex and save result to resultSum field.
 Create a class Main with a main( ) method.
 Add to method main() code that declares local variable “myArray” as array of integer type (of 1000 size), and create twoinstancees ofMySumCount.
 Add code to fill all elements of myArray with random integer values generated from 0 to 1000 range.
 Add code tocalculates sum of myArray elements in two separate thread and then print result to console.
 Execute the program.
 The program output must be like next example:
 [324,234,523,…,643]
 Sum of array elements: 123457

 */
public class MySumCount extends Thread{
    private int startIndex;
    private int stopIndex;
    private int[] array;
    private long resultSum;

    public long getResultSum() {
        return resultSum;
    }

    public void setarray(int[] arrayOfIndex) {
        this.array = arrayOfIndex;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    @Override
    public void run() {
        //need check for the out of range
        if ( startIndex < 0 || startIndex > stopIndex || stopIndex > array.length ) {
            System.out.println("out of range");
            return;
        }

        for (int i = startIndex; i <= stopIndex ; i++) {
            resultSum += array [i];
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(resultSum);
    }
}
