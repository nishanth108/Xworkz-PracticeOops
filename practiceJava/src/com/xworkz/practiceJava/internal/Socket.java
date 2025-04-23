package com.xworkz.practiceJava.internal;

public class Socket {
    Connector connector;

    public Socket(Connector connector) {
        System.out.println("RUnning parameterizedd constructor in SOcket");
        this.connector = connector;
    }


    public void execute() {
        if(connector!=null) {
            connector.setConnection();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
