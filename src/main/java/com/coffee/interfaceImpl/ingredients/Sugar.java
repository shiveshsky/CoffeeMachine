package com.coffee.interfaceImpl.ingredients;

public class Sugar extends IngredientImpl{
    private static Sugar sugar;
    private Sugar(){
        this.name="Sugar";
        this.totalUnit = 30;
        this.perUnitCost = 2;
    }

    public static Sugar getIngredient() {
        if (sugar==null){
            sugar = new Sugar();
        }
        return sugar;
    }
    public static void resetIngredient(){
        sugar = null;
        getIngredient();
    }
}
