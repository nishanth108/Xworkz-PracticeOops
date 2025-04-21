package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Bike;

public class BikeRunner implements Bike {
    @Override
    public void engine() {
        System.out.println("Comes with GOod engine");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void cc() {
        System.out.println("Comes with GOod Cc");
    }

    @Override
    public void newModel() {
        System.out.println("Coming up with new model of bike");
    }

}
