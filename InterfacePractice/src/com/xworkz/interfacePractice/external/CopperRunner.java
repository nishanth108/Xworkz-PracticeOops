package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Copper;

public class CopperRunner implements Copper {
    @Override
    public void quantity() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void usage() {
        System.out.println("Comes with GOod Meterial");
    }
}
