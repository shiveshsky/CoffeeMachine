package com.coffee.interfaceImpl.ingredients;

public class Chocolate extends IngredientImpl {
    private static Chocolate chocolate;
    private Chocolate(){
        this.name="Chocolate";
        this.totalUnit = 30;
        this.perUnitCost = 5;
    }

    public static Chocolate getIngredient() {
        if (chocolate==null){
            chocolate = new Chocolate();
        }
        return chocolate;
    }
    public static void resetIngredient(){
        chocolate = null;
        getIngredient();
    }
}
