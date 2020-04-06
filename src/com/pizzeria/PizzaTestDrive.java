package com.pizzeria;

import com.pizzeria.pizza.Pizza;
import com.pizzeria.store.ChicagoPizzaStore;
import com.pizzeria.store.NYPizzaStore;
import com.pizzeria.store.PizzaStore;
import com.pizzeria.util.PizzaType;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a "+pizza.getName()+".\n");

        pizza = chicagoStore.orderPizza(PizzaType.CLAM);
        System.out.println("Joel ordered a "+pizza.getName()+".\n");

    }
}