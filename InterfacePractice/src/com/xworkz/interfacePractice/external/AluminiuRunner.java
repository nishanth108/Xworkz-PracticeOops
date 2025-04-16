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
    public void price() {
        System.out.println("good Price");
    }
}
