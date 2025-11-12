package org.example;


import org.example.builder.MealOrder;
import org.example.builder.OrderBuilder;

public class Main {
    public static void main(String[] args) {
    MealOrder order = new OrderBuilder()
            .setMainDish("Pizza")
            .setDrink("Cola")
            .setExtraCheese(true)
            .build();

    order.showOrder();
    }
}