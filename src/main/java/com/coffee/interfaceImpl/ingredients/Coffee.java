package com.coffee.interfaceImpl.ingredients;

public class Coffee extends IngredientImpl {
    private static Coffee coffee = null;
    private Coffee(){
        this.name="Coffee";
        this.totalUnit = 30;
        this.perUnitCost = 3;
    }

    public static Coffee getIngredient() {
        if (coffee==null){
            coffee = new Coffee();
        }
        return coffee;
    }
    public static void resetIngredient(){
        coffee = null;
        getIngredient();
    }

}
