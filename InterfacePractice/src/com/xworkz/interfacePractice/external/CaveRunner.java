package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Cave;

public class CaveRunner implements Cave {
    @Override
    public void locatedIn() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void enterCave() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void exitCave() {
        System.out.println("Comes with GOod Meterial");
    }
}
