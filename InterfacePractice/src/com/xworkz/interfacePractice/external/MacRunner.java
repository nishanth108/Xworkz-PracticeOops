package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Mac;

public class MacRunner implements Mac {
    @Override
    public void putCharge() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void processor() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void Launch() {
        System.out.println("Running Launch on Mac");
    }
}
