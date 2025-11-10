package org.example.factory;

public abstract class MealFactory {
    public abstract Meal createMeal();

    public void OrderMeal(){
        Meal meal = createMeal();
        meal.prepare();
        System.out.println("Order accepted: " + meal.getDescription());
    }
}
