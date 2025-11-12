package org.example.observer;

public class KitchenObserver implements OrderObserver {
    @Override
    public void update(String status) {
        System.out.println("Kitchen notified: Order is now " + status);
    }
}