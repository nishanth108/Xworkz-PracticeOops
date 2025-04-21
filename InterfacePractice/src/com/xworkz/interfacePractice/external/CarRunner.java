package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Car;

public class CarRunner implements Car {
    @Override
    public void engine() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void price() {
        System.out.println("Comes with 200k ");
    }

    @Override
    public void capacity() {
        System.out.println("Comes with GOod capacity");
    }

    @Override
    public void newLunch() {
        System.out.println("launching new Car");
    }
}
