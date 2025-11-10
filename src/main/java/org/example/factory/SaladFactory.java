package org.example.factory;

public class SaladFactory extends MealFactory {
    @Override
    public Meal createMeal(){
        return new Salad();
    }
}
