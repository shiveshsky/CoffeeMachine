package com.coffee.interfaceImpl.ingredients;

public class Milk extends IngredientImpl{
    private static Milk milk;
    private Milk(){
        this.name="Milk";
        this.totalUnit = 30;
        this.perUnitCost = 4;
    }

    public static Milk getIngredient() {
        if (milk==null){
            milk = new Milk();
        }
        return milk;
    }
    public static void resetIngredient(){
        milk = null;
        getIngredient();
    }
}
