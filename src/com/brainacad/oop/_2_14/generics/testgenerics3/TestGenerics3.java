package com.brainacad.oop._2_14.generics.testgenerics3;

import java.util.Random;

/**
 * Created by Fujitsu on 11.10.2016.
 */
class TestGenerics3<T> {
    private T[] array;

    public TestGenerics3(T[] array) {
        this.array = array;
    }

    public  void outArray() {
        for (T element: array) {
            System.out.print(element + " ");
        }
        System.out.println();
     }

    public T[] shuffle(){
        Random rnd = new Random();
        for (int i = 1; i < array.length; i++) {
            int j = rnd.nextInt(i);
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
