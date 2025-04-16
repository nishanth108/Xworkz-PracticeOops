package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Bottel;

public class BottelRunner implements Bottel {
    @Override
    public void name() {
        System.out.println("Name is Bislery");
    }

    @Override
    public void liter() {
        System.out.println("Comes with 2Ml ");
    }

    @Override
    public void price() {
        System.out.println("Comes with 10rs");
    }}
