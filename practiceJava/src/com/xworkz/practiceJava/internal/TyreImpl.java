package com.xworkz.practiceJava.internal;

public class TyreImpl implements Tyre {

    public TyreImpl() {
        System.out.println("No arg constructer");
    }

    @Override
    public void brand() {
        System.out.println("its Mrf");
    }
}
