package com.brainacad.oop._2_11.testexcp2;

/**
 * Created by KrevSaa on 28.09.2016.
 * Create class Main with method main().
 Create class Person with fields firstName (of String type), lastName (String), age (int).
 Add to class Person setters and getters for each field.
 Create InvalidAgeException class  that is subclass of RuntimeException.
 Setter in class Person which will modify age (setAge(int )) should throw InvalidAgeException when age out of range 1-120.
 Add code to method main() to create one Pearson object and invoke setAge() method with exception handling using try-catch statement
 Execute the program.

 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        try {
            System.out.println("try block");
            person.setAge(150);
        }
        catch (InvalidAgeException e){
            System.out.println("Sorry, but Person's Age must be 1 - 120 years");
        }
        finally {
            System.out.println("Some finally block");
        }

    }
}
