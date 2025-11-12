package org.example.decorator;

import org.example.factory.Meal;

public abstract class ToppingDecorator implements Meal {
    protected Meal meal;
    public ToppingDecorator(Meal meal) {
        this.meal = meal;
    }
    public abstract void prepare();
}