package org.example.factory;

public class Pizza implements Meal{
    @Override
    public void prepare(){
        System.out.println("Preparing Pizza");

    }
    @Override
    public String getDescription(){
        return "Pizza";
    }
}
