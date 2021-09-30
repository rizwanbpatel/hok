package com.company.diamond;

public class Diamond implements Circle, Square {


    public static void main(String[] args) {
        Diamond diamond = new Diamond();
        diamond.style();
    }


    @Override
    public void style() {
        System.out.println("Diamond style");
    }
}
