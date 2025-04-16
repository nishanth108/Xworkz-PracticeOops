package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Window;

public class WindowRunner implements Window {
    @Override
    public void coloe() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void type() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void price() {
        System.out.println("Comes with GOod Meterial");
    }
}
