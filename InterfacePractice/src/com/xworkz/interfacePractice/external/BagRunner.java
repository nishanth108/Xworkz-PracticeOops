package com.xworkz.interfacePractice.external;

import com.xworkz.interfacePractice.internal.Bag;

public class BagRunner implements Bag {

    @Override
    public void quality() {
        System.out.println("Good quality");
    }

    @Override
    public void capacity() {
        System.out.println("Have Good Quality");
    }

    @Override
    public void size() {
        System.out.println("Comes With Good Quality");
    }
}
