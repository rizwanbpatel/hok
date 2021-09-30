package com.company.designprinciple;

/**
 * When changes to one affect others is tight coupling. Inverse is Loosecoupling
 *
 * Naturally reduces the dependency between components.
 *
 * OO that can handle change well
 */
public class LooseCoupling {
}

class WeatherApp{
    LCDScreen screen;

    double getTemperature(){
        return 0.0;
    }

    void display(){
        float temp = (float) getTemperature();
        screen.printONDesktop(temp);
    }


}

class LCDScreen {
    void printONDesktop(float temp){

    }
}
