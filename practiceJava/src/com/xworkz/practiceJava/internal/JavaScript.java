package com.xworkz.practiceJava.internal;

public class JavaScript {
    Let let;

    public JavaScript(Let let) {
        System.out.println("Patameterized constructer in JavaScriptd");
        this.let = let;
    }

    public void execute() {
        if(let!=null) {
            let.keyword();
        } else {
            System.out.println("Null pointer exception");
        }
    }
}
