package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Poco;

public class PocoRunner implements Poco {
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
    public void version() {
        System.out.println("The version is old");
    }
}
