package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Sox;

public class SOxRunner implements Sox {
    @Override
    public void name() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void color() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void wear() {
        System.out.println("Wearing sox");
    }
}
