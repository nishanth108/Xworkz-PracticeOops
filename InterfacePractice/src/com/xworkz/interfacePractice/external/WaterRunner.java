package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Water;

public class WaterRunner implements Water {
    @Override
    public void name() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void ml() {
        System.out.println("Comes with GOod Meterial");
    }
}
