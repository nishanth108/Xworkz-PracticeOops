package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Iron;
import com.xworkz.interfacePractice.internal.IronBox;

public class IronBoxRunner implements IronBox {
    @Override
    public void size() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void watt() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void matchBox() {
        System.out.println("Using the matchbox section");
    }
}
