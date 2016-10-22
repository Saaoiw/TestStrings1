package com.brainacad.javase._3_2._3_2_1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Fujitsu on 22.10.2016.
 */
public class SerializeDemo {
    public static void main(String[] args) throws IOException {

        Employee employee = new Employee();
        employee.setAddress("address");
        employee.setName("Ivan");
        employee.setNumber(123);
        employee.setSSN(1);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Fujitsu\\IdeaProjects\\SerializeDemo.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        try {
            oos.writeObject(employee);
        } catch (IOException e){
            e.printStackTrace();
        }
        finally {
            oos.close();
        }
    }

}
