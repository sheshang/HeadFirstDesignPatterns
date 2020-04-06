package com.pizzeria.store;

import com.pizzeria.ingredient.ChicagoPizzaIngredientFactory;
import com.pizzeria.ingredient.PizzaIngredientFactory;
import com.pizzeria.pizza.CheesePizza;
import com.pizzeria.pizza.ClamPizza;
import com.pizzeria.pizza.Pizza;
import com.pizzeria.util.PizzaType;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type){
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago styled cheese pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago styled clam pizza");
                break;
            default:
                break;
        }
        return pizza;
    }
}
