package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Aluminium;

public class AluminiuRunner implements Aluminium {
    @Override
    public void strength() {
        System.out.println("Good Strength");
    }

    @Override
    public void quallty() {
        System.out.println("Good Quality");
    }

    @Override
    public void makePlate() {
        System.out.println("making a best plate");
    }

    public void breateAir() {
        System.out.println("Breate air of premium");
    }

}
