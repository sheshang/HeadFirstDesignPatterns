package com.chocoholic;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler chocolateBoiler;
    
    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }
    
    public static ChocolateBoiler getChocolateBoilerInstance(){
        if(chocolateBoiler == null){
            chocolateBoiler = new ChocolateBoiler();
        }
        return chocolateBoiler;
    }
    
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }
    
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && !isBoiled()){
            boiled = false;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
