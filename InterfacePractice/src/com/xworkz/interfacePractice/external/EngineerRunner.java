package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Engineering;

public class EngineerRunner implements Engineering {
    @Override
    public void jobs() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void averageSalary() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void promotion() {
        System.out.println("Comes with GOod Meterial");
    }
}
