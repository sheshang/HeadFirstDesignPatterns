package com.pizzeria.pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        name = "Chicago style Deep Dish Cheese Pizza";
        dough = "Extra thick crust";
        sauce = "Plum Tomato sauce";

        toppings.add("Shradded Mozzarella Cheese");
    }

    public void cut(){
        System.out.println("Cutting the pizza in sqaure shape");
    }
}

