package com.coffee.interfaceImpl.Drinks;

import com.coffee.interfaceImpl.ingredients.Coffee;
import com.coffee.interfaceImpl.ingredients.Milk;
import com.coffee.interfaceImpl.ingredients.Sugar;

import java.util.ArrayList;

public class Mocha extends Drink{
    public Mocha(){
        this.name="Mocha";
    }

    @Override
    public void setIngredients() throws Exception{
        IngredientQuantity coffee = new IngredientQuantity();
        coffee.setIngredient(Coffee.getIngredient());
        coffee.setUnit(2);
        IngredientQuantity milk = new IngredientQuantity();
        milk.setIngredient(Milk.getIngredient());
        milk.setUnit(2);
        IngredientQuantity sugar = new IngredientQuantity();
        sugar.setIngredient(Sugar.getIngredient());
        sugar.setUnit(1);
        this.ingredients = new ArrayList<>();
        this.ingredients.add(coffee);
        this.ingredients.add(milk);
        this.ingredients.add(sugar);
    }
}
