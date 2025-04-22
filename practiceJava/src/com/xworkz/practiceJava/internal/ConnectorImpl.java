package com.xworkz.practiceJava.internal;

public class ConnectorImpl implements Connector {
    public ConnectorImpl() {
        System.out.println("no arg constractor");

    }

    @Override
    public void setConnection() {
        System.out.println("Setting Connections");
    }
}
