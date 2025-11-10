package org.example.decorator;

public abstract class ToppingDecorator implements Meal {
    protected Meal meal;
    public ToppingDecorator(Meal meal) {
        this.meal = meal;
    }
    public abstract void prepare();
}