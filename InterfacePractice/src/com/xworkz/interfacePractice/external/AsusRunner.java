package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Asus;

public class AsusRunner implements Asus {
    @Override
    public void price() {
        System.out.println("Price is 100000");
    }

    @Override
    public void ram() {
        System.out.println("Provides 8gbRam");
    }

    @Override
    public void processor() {
        System.out.println("SnapDragon Processing");
    }
}
