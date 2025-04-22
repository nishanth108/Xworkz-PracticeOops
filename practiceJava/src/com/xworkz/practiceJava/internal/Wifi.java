package com.xworkz.practiceJava.internal;

public class Wifi {
    Connection connection;

    public Wifi(Connection connection) {
        System.out.println("Parameterized Constructor");
        this.connection = connection;
    }
    public void execute() {
        if(connection!=null) {
            connection.connect();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
