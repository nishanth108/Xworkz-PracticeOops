package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Zip;

public class ZipRunner implements Zip {
    @Override
    public void name() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void extract() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void makeZip() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void rename() {
        System.out.println("renaming the zip");
    }
}
