package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Fire;

public class FireRunner implements Fire {
    @Override
    public void sign() {
        System.out.println("Comes with GOod Size");
    }

    @Override
    public void benifits() {
        System.out.println("Comes with 2k ");
    }

    @Override
    public void todaysHoroscope() {
        System.out.println("Comes with GOod Meterial");
    }

    @Override
    public void soulmate() {
        System.out.println("The soulmate suits is of fire sign");
    }
}
