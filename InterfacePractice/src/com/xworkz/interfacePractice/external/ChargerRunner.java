package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Charger;

public class ChargerRunner implements Charger {
    @Override
    public void plugIn() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void plugOut() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void capacity() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void type() {
        System.out.println("C type or more");
    }
}
