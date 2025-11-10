package org.example.bridge;

public abstract class OrderPayment {
    protected PaymentSystem paymentSystem;

    protected OrderPayment(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public abstract void pay(double amount);
}
