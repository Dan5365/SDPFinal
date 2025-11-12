package org.example.observer;

public class CustomerObserver implements OrderObserver {
    @Override
    public void update(String status) {
        System.out.println("Customer notified: Order is now " + status);
    }
}
