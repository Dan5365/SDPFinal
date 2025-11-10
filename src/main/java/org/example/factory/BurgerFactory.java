package org.example.factory;

public class BurgerFactory extends MealFactory{
    @Override
    public Meal createMeal(){
        return new Burger();
    }


}
