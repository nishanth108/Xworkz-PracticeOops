package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Sheet;

public class SheetRunner implements Sheet {
    @Override
    public void name() {
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

    @Override
    public void quantity() {
        System.out.println("Running sheet runner");
    }
}
