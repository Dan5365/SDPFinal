package org.example.builder;

public class MealOrder {
    private final String mainDish;
    private final String drink;
    private final boolean extraCheese;

    public MealOrder(OrderBuilder builder) {
        this.mainDish = builder.getMainDish();
        this.drink = builder.getDrink();
        this.extraCheese = builder.isExtraCheese();
    }

    public void showOrder() {
        System.out.println("Your order: ");
        System.out.println("Dish: " + mainDish);
        System.out.println("Drink: " + drink);
        System.out.println("Extra Cheese: " + (extraCheese ? "yes" : "no"));

    }
}



