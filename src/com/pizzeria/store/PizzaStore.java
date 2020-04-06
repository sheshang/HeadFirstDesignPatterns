package com.pizzeria.store;

import com.pizzeria.pizza.Pizza;
import com.pizzeria.util.PizzaType;

public abstract class PizzaStore {
    public Pizza orderPizza(PizzaType type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType type);
}
