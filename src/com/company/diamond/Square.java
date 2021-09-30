package com.company.diamond;

public interface Square extends Shape{

    default void style(){
        System.out.println("Square style");
    }
}
