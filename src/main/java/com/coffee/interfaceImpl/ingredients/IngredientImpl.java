package com.coffee.interfaceImpl.ingredients;

import com.coffee.interfaces.Ingredients;

public class IngredientImpl implements Ingredients {
    String name;
    int totalUnit;
    int perUnitCost;

    public int getTotalUnit() {
        return totalUnit;
    }

    public void setTotalUnit(int totalUnit) {
        this.totalUnit = totalUnit;
    }
    public void updateTotalUnit(int conumedUnit) throws Exception{
        if (conumedUnit<=this.totalUnit){
            this.totalUnit-=conumedUnit;
        }
        else {
            throw new Exception("Insufficient Quantity");
        }
    }


    public String getName() {
        return name;
    }

    public int getPerUnitCost() {
        return perUnitCost;
    }

    public void setPerUnitCost(int perUnitCost) {
        this.perUnitCost = perUnitCost;
    }

    public void setName(String name) {
        this.name = name;
    }

}
