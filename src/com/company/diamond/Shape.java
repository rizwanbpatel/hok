package com.company.diamond;

public interface Shape {

    default void style(){
        System.out.println("Shape");
    }
}
