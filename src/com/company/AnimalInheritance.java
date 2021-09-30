package com.company;

final class AnimalInheritance {
}


abstract class Animal {
protected boolean isMammal;
protected  boolean isCarnivorous;

    public Animal(boolean isMammal, boolean isCarnivorous) {
        this.isMammal = isMammal;
        this.isCarnivorous = isCarnivorous;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public boolean isCarnivorous() {
        return isCarnivorous;
    }

    abstract public String getGreeting();
}

class Dog extends Animal {
   public Dog(){
        super(true, true);
   }

    @Override
    public String getGreeting() {
        return "ruff";
    }
}

class Cow extends Animal {
    public Cow() {
        super(true, false);
    }

    @Override
    public String getGreeting() {
        return "moo";
    }
}

class Duck extends Animal {
    public Duck() {
        super(false, false);
    }

    @Override
    public String getGreeting() {
        return "quack";
    }
}