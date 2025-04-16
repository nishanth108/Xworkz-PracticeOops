package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Fabric;

public class FabricRunner implements Fabric {
    @Override
    public void type() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void quality() {
        System.out.println("Comes with GOod Meterial");
    }
}
