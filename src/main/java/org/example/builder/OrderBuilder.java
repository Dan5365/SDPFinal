package org.example.builder;

public class OrderBuilder{
    private String mainDish;
    private String drink;
    private boolean extraCheese;

    public OrderBuilder setMainDish(String mainDish){
        this.mainDish = mainDish;
        return this;
    }
    public OrderBuilder setDrink(String drink){
        this.drink = drink;
        return this;
    }
    public OrderBuilder setExtraCheese(boolean extraCheese){
        this.extraCheese = extraCheese;
        return this;
    }
    public String getMainDish(){
        return mainDish;
    }
    public String getDrink(){
        return drink;
    }
    public boolean isExtraCheese(){
        return extraCheese;
    }
    public MealOrder build(){
        return new MealOrder(this);
    }
}

