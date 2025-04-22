package com.xworkz.practiceJava.internal;

public class Gpay {
    private PaymentGateway paymentGateway;

    public Gpay(PaymentGateway paymentGateway) {
        System.out.println("parameter cosntruter of Paymentfateway");
        this.paymentGateway = paymentGateway;
    }

    public void execute() {
        if(this.paymentGateway!=null) {
            this.paymentGateway.resend();
        } else {
            System.out.println("Null pointer exception");
        }
    }

}
