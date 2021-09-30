package com.company.designprinciple;

/**
 * Always look for code that changes with every new requirements
 * Alter or extend the code that varies without affecting code that doesnt
 * Basis of almost all design pattern
 * Pay attention to how each pattern makes use of this.
 *
 */
public class EncapsulateWhatVaries {

    public Pancake orderPancake(String type){
        Pancake pancake;

        /**OLD**/
        /*
        if(type.equalsIgnoreCase("classic")){
            pancake = new ClassicPancake();
        }else if(type.equalsIgnoreCase("blueberry")){
            pancake = new BlueberryPancake();
        }else{
            pancake = new BananaPancake();
        }*/

        /**New**/

        SimplePancakeFactory simplePancakeFactory = new SimplePancakeFactory();
        pancake = simplePancakeFactory.createPancake(type);

        pancake.cook();
        pancake.plate();
        pancake.addButter();
        return pancake;
    }
}


