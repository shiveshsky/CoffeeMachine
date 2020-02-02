package com.coffee.interfaceImpl.Drinks;

import com.coffee.interfaceImpl.ingredients.IngredientImpl;

public class IngredientQuantity {
    private IngredientImpl ingredient;
    private int unit;

    public IngredientImpl getIngredient() {
        return ingredient;
    }

    public void setIngredient(IngredientImpl ingredient) {
        this.ingredient = ingredient;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) throws Exception{
        this.unit = unit;
        ingredient.updateTotalUnit(unit);
    }
}
