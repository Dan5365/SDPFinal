package org.example.factory;

public class Burger implements Meal{
    @Override
    public void prepare() {
        System.out.println("Preparing Burger");
    }
    @Override
    public String getDescription() {
        return "Burger";
    }

}
