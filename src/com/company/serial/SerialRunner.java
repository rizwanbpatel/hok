package com.company.serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialRunner {

    private static String filename="employee.ser";

    public static void main(String[] args) {

        Employee employee = Employee.getEmployee(1,"Rizwan");
        System.out.println("Serialized : "+ employee.toString()+"|"+employee.hashCode());
        serialize(employee);

        Employee desEmployee = deserialize();
        System.out.println("Deserialise : "+employee.toString()+"|"+ desEmployee.hashCode());


    }

    private static Employee deserialize() {
        Employee emp = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            emp = (Employee) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return emp;
    }

    private static void serialize(Object object) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
