package com.pizzeria.store;

import com.pizzeria.ingredient.NYPizzaIngredientFactory;
import com.pizzeria.ingredient.PizzaIngredientFactory;
import com.pizzeria.pizza.CheesePizza;
import com.pizzeria.pizza.ClamPizza;
import com.pizzeria.pizza.Pizza;
import com.pizzeria.util.PizzaType;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (type){
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York styled cheese pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York styled clam pizza");
                break;
            default:
                break;
        }
        return pizza;
    }
}
