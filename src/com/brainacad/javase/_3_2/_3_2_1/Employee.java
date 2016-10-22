package com.brainacad.javase._3_2._3_2_1;

import java.io.Serializable;

/**
 * Created by Fujitsu on 22.10.2016.
 * Create class Employee with text private fields : String name, String address, int SSN, int number.
 * Add getters and setters to Employee class.  Override the toString() method.
 * Create SerializeDemo program which instantiates an Employee object and serializes it to a file.
 */
public class Employee implements Serializable{
    private String name;
    private String address;
    private int SSN;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SSN=" + SSN +
                ", number=" + number +
                '}';
    }
}
