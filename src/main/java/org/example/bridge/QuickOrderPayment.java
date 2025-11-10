package org.example.bridge;

public class QuickOrderPayment extends OrderPayment {
    public QuickOrderPayment(PaymentSystem paymentSystem) {
        super(paymentSystem);
    }

    @Override
    public void pay(double amount) {
        // to be implemented
    }
}