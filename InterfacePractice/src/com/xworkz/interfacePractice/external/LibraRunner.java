package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Libra;

public class LibraRunner implements Libra {
    @Override
    public void todaysHoroScope() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void luckyNumber() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void luckyColor() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void horoScope() {
        System.out.println("having a better horoscope");
    }
}
