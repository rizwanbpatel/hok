package com.company.inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inheritance {
    public static void main(String[] args) {
        Mammal h = new Horse();
        Cattle c = new Horse();
        System.out.println(h + " " + c);
        //h.eat(c);
        List lst = new ArrayList<>();
        lst.add("Riz");lst.add("Niz");lst.add("Nik");
        h.compute(lst);
    }
}


class Mammal {
    void eat(Mammal m) {
        System.out.println("Mammal eats food");
    }

    void compute(List lst){
        System.out.println("Size mammal : "+lst.size());
    }

}

class Cattle extends Mammal {
    void eat(Cattle c) {
        System.out.println("Cattle eats hay");
    }

    void compute(List lst){
        System.out.println("Size Cattle : "+lst.size());
    }

}

class Horse extends Cattle {
    void eat(Horse h) {
        System.out.println("Horse eats hay");
    }

    void compute(LinkedList<String> lst){
        System.out.println("Size Horse : "+lst.size());
    }

}