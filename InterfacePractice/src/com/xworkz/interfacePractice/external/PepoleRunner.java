package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Pepole;

public class PepoleRunner implements Pepole {
    @Override
    public void name() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void personality() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void character() {
        System.out.println("Comes with GOod Meterial");
    }
}
