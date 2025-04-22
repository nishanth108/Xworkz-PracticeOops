package com.xworkz.practiceJava.internal;

public class Phone {
    private Password password;

    public Phone(Password password) {
        System.out.println("no arg constructor of Phone");
        this.password = password;

    }
    public void execute() {
        if(this.password!=null) {
            this.password.unlock();
        } else {
            System.out.println("Null pointer exception");
        }
    }

}
