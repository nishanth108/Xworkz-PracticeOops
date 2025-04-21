package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Cancer;

public class CancerRunner implements Cancer {
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
        System.out.println("Check on our beloved website");
    }
}
