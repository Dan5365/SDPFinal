package org.example.factory;

public class Salad implements Meal{
    @Override
    public void prepare() {
        System.out.println("Preparing Salad");
    }
    @Override
    public String getDescription() {
        return "Salad";
    }
}
