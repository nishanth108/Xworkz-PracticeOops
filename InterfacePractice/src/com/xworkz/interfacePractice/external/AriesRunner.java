package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Aries;

public class AriesRunner implements Aries {
    @Override
    public void benifits() {
        System.out.println("Trying to become a good man");
    }

    @Override
    public void dateOfBirth() {
        System.out.println("on April");
    }

    @Override
    public void signNature() {
        System.out.println("Fire Nature");
    }

    @Override
    public void detailOf2025() {
        System.out.println("Be happy and do  what you like iam with you");
    }
}
