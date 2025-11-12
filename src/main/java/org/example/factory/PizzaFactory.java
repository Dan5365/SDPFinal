package org.example.factory;

public class PizzaFactory extends MealFactory{
    @Override
    public Meal createMeal(){
        return new Pizza();
    }
}
