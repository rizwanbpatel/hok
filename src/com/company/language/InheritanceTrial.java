package com.company.language;

public class InheritanceTrial {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();
        ((Parent)child).print();
    }
}
class Parent {
    public static void print() {
        System.out.println("In parent");
    }
}

class Child extends Parent{
    public static void print() {
        System.out.println("In child");
    }
}
