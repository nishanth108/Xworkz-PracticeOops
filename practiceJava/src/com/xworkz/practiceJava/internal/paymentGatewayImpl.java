package com.xworkz.practiceJava.internal;

public class paymentGatewayImpl implements PaymentGateway {
    public paymentGatewayImpl() {
        System.out.println("No arg constructer");
    }

    @Override
    public void resend() {
        System.out.println("Resending payment");
    }
}
