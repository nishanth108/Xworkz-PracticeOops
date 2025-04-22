package com.xworkz.practiceJava.internal;

public class LinkImpl implements Link {

    @Override
    public void use() {
        System.out.println("use Link");
    }

    public LinkImpl() {
        System.out.println("no arg constractor");
    }
}
