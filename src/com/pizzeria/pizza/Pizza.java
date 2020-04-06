package com.pizzeria.pizza;

import com.pizzeria.ingredient.core.*;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggie veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clams;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 mins at 350 degree");
    }

    public void cut(){
        System.out.println("Cutting the pizza");
    }

    public void box(){
        System.out.println("Pack the pizza in box");
    }

    public void setName(String name){ this.name = name; }

    public String getName(){
        return name;
    }

    public String toString(){
        return "This is a "+this.name+ " with "+ this.veggies.toString() + " toppings.";
    }

}
