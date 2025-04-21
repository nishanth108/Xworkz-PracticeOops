package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Vivo;

public class VivoRunner implements Vivo {
    @Override
    public void ram() {
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
    public void launch() {
        System.out.println("Launching the vivo pro ultimate");
    }
}
