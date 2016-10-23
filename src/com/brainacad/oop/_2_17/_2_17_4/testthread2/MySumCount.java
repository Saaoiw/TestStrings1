package com.brainacad.oop._2_17._2_17_4.testthread2;

/**
 * Created by KrevSaa on 22.10.2016.
 *

 */
public class MySumCount implements Runnable{
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
