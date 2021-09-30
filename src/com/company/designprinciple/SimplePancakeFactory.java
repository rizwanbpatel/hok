package com.company.designprinciple;

public class SimplePancakeFactory {

    public Pancake createPancake(String type){
        Pancake pancake = null;
        if(type.equalsIgnoreCase("classic")){
            pancake = new ClassicPancake();
        }else if(type.equalsIgnoreCase("blueberry")){
            pancake = new BlueberryPancake();
        }else{
            pancake = new BananaPancake();
        }
        return pancake;
    }
}
