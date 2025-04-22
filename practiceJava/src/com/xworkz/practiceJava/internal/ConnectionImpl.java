package com.xworkz.practiceJava.internal;

public class ConnectionImpl implements Connection{
    public ConnectionImpl() {
        System.out.println("no arg constructer of Connection");
    }

    @Override
    public void connect() {
        System.out.println("Connecting to the wifi");
    }
}
