package com.company.serial;

import java.io.Serializable;

public class Employee extends Person implements Serializable{

    private static final long serialVersionUID = 1L;
    private static Employee employee;
    private int id;
    private String name;

    private Employee(int id, String name) {
        super("");
        this.id = id;
        this.name = name;
        System.out.println("Constructor....");
    }

    private Employee(String gender){
        super(gender);
    }

    public static Employee getEmployee(int id, String name) {
        if (employee == null) {
            synchronized (Employee.class) {
                if (employee == null) {
                    employee = new Employee(id, name);
                }
            }

        }
        return employee;
    }

    protected Object readResolve() {
        return employee;
    }
}
