package com.brainacad.oop._2_11.testexcp2;

/**
 * Created by KrevSaa on 28.09.2016.
 * Create class Person with fields firstName (of String type), lastName (String), age (int).
 Add to class Person setters and getters for each field.
 Create InvalidAgeException class  that is subclass of RuntimeException.
 Setter in class Person which will modify age (setAge(int )) should throw InvalidAgeException when age out of range 1-120.
 Add code to method main() to create one Pearson object and invoke setAge() method with exception handling using try-catch statement
 Execute the program.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException{
        if ( age<120 & age>1 )  this.age = age;
        else throw new InvalidAgeException();
    }
}
