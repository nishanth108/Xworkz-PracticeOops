package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Bench;

public class BenchRunner implements Bench {
    @Override
    public void meterial() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void price() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void lifeSpan() {
        System.out.println("Comes with GOod lifeSpan");
    }

    @Override
    public void sit() {
        System.out.println("Building a awesome bences");
    }
}
