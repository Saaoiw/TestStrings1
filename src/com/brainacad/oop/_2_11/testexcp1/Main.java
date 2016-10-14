package com.brainacad.oop._2_11.testexcp1;

import static com.brainacad.oop._2_11.testexcp1.MyException.outException;

/**
 * Created by KrevSaa on 28.09.2016.
 * Create a class Main with a main() that throws an object of class Exception inside a try block. Give the constructor for Exception a String argument.
 Catch the exception inside a catch clause and print the String argument.
 Add a finally clause and print a message to prove you were there.
 Execute the program.

 1) Create your own exception class MyException using the extends keyword.
 Write a constructor for this class that takes a String argument and stores it inside the object with a String reference.
 Write a method that prints out the stored string.
 Add to method main() a try-catch clause to exercise your new exception.
 2) Write a class MyTest with a method test() that throws an exception of the MyException type.
 Try compiling it without an exception specification to see what the compiler says. Add the appropriate exception specification (throws).
 Try out your class and its exception inside a try-catch clause.
 Execute the program.
 3) Define an MyTest object reference and initialize it to null. Try to call a method through this reference.
 Now wrap the code in a try-catch clause to catch the exception.
 Execute the program


 */
class MyException extends Exception{
    private static String myException;

    public MyException(String e){
        super(e);
    }

    public static void outException(){
        System.out.println(myException);
    }
}

public class Main {
    public static void main(String[] args) throws Exception{
        try {
           /* int n = -1;
            System.out.println(n);
            double k = Math.sqrt(n);
            System.out.println(k);*/
            System.out.println("Try block");
            throw new MyException("My Exception");

        } catch (Exception e) {
            System.out.print("Some exception: " + e.getMessage());

        }
        finally {
            System.out.println("Some finally block");
        }

    }
}
