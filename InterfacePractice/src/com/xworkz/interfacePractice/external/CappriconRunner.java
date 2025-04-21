package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Cappricon;

public class CappriconRunner implements Cappricon {
    @Override
    public void sign() {
        System.out.println("Comes with earth sign");
    }

    @Override
    public void benifits() {
        System.out.println("Comes with good benifits ");
    }

    @Override
    public void personality() {
        System.out.println("Comes with GOod personality");
    }

    @Override
    public void horoScope() {
        System.out.println("see on our website");
    }
}
