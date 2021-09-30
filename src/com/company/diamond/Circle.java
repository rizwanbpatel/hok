package com.company.diamond;

public interface Circle extends Shape{

    default void style(){
        System.out.println("Circle style");
    }
}
