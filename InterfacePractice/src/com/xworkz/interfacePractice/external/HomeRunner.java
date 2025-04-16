package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Home;

public class HomeRunner implements Home {
    @Override
    public void nema() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void members() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void goHome() {
        System.out.println("Comes with GOod Meterial");
    }
}
