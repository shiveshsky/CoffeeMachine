package com.coffee.interfaceImpl.Drinks;

import com.coffee.interfaces.Drinks;

import java.util.ArrayList;

public abstract class Drink implements Drinks {
    String name;

    ArrayList<IngredientQuantity> ingredients;
    public String getName() {
        return name;
    }

    public ArrayList<IngredientQuantity> getIngredientQuantity() {
        return ingredients;
    }

    public abstract void setIngredients() throws Exception;

    public double getCost(){
        double total = 0.0;
        for (IngredientQuantity ingredientQuantity: ingredients){
            total += ingredientQuantity.getUnit()*(ingredientQuantity.getIngredient().getPerUnitCost());
        }

        return total;
    }

}
