package com.pizzeria.pizza;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList<String>();

    public void prepare(){
        System.out.println("Preparing "+ name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce..");
        for (Object topping : toppings) {
            System.out.println(topping.toString());
        }
    }

    public void bake(){
        System.out.println("Bake for 25 mins at 350 degree");
    }

    public void cut(){
        System.out.println("Cutting the pizza");
    }

    public void box(){
        System.out.println("Pack the pizza in box");
    }

    public String getName(){
        return name;
    }

}
