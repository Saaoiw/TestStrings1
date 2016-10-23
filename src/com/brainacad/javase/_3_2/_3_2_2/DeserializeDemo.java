package com.brainacad.javase._3_2._3_2_2;

import com.brainacad.javase._3_2._3_2_1.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

/**
 * Created by Fujitsu on 22.10.2016.
 */
public class DeserializeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee;
        FileInputStream fis = new FileInputStream("D:\\SerializeDemo.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            employee = (Employee)ois.readObject();
            System.out.println(employee.getName());
            System.out.println(employee.getNumber());
            System.out.println(employee.getAddress());
            System.out.println(employee.getSSN());
        }
        catch (ClassNotFoundException e){
            System.out.println(e);
        }
        finally {
            ois.close();
        }
    }
}
