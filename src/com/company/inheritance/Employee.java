package com.company.inheritance;

public class Employee {

    {
        System.out.println("Block Employee");
    }

    static {
        System.out.println("Static block Employee ");
    }
    public Employee() {
        System.out.println("Employee Constructor");
    }
}

class Manager extends Employee {

    {
        System.out.println("Block Manager");
    }
    static{
        System.out.println("STatic block manager");
    }
    public Manager() {
        System.out.println("Manager constructor");
    }
}

class Demo {
    public static void main(String[] args) {
        Employee e = new Manager();

    }
}