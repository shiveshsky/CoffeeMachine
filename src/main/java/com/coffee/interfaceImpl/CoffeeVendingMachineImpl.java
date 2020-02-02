package com.coffee.interfaceImpl;

import com.coffee.interfaceImpl.Drinks.Drink;
import com.coffee.interfaceImpl.Drinks.LatteCoffee;
import com.coffee.interfaceImpl.Drinks.Mocha;
import com.coffee.interfaceImpl.ingredients.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeVendingMachineImpl {
    ArrayList<IngredientImpl> ingredients;
    ArrayList<Drink> drinks;

    public void setIngredients(){
        Chocolate chocolate = Chocolate.getIngredient();
        Milk milk = Milk.getIngredient();
        Sugar sugar = Sugar.getIngredient();
        Coffee coffee = Coffee.getIngredient();
        this.ingredients = new ArrayList<>();
        this.ingredients.add(milk);
        this.ingredients.add(coffee);
        this.ingredients.add(sugar);
        this.ingredients.add(chocolate);
    }
    public void initDrinks(){
        Drink latte = new LatteCoffee();
        Drink mocha = new Mocha();
        this.drinks = new ArrayList<>();
        drinks.add(latte);
        drinks.add(mocha);
    }
    public void getIngredientsStock(){
        ingredients.sort((IngredientImpl ingredient1, IngredientImpl ingredient2)->{
            return ingredient1.getName().compareTo(ingredient2.getName());
        });
        for(IngredientImpl ingredient: ingredients){
            System.out.println(ingredient.getName()+"::"+ingredient.getTotalUnit());

        }
    }
    public void refillIngredients(){
       Chocolate.resetIngredient();
        Milk.resetIngredient();
        Sugar.resetIngredient();
        Coffee.resetIngredient();
    }
    public void displayMenu(){
        System.out.println("Machine Initialized");
        setIngredients();
        getIngredientsStock();
        initDrinks();
        printMenu();

    }
    public void printMenu(){
        System.out.println("###########  MENU ##########");

        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        do{
            System.out.println("Input 1 for Latte");
            System.out.println("Input 2 for Mocha");
            System.out.println("Input q to quit");
            System.out.println("Input r to refill");
            String choice = sc.next();
            Drink drink=null;
            switch (choice){
                case "1":{
                    try{
                        drink=drinks.get(0);
                        drink.setIngredients();
                        dispenseDrink(drink);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case "2":
                {
                    try{
                        drink=drinks.get(1);
                        drink.setIngredients();
                        dispenseDrink(drink);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case "R":
                case "r":
                {
                    refillIngredients();
                    break;
                }
                case "Q":
                case "q":
                {
                    quit = true;
                    break;
                }

                default:
                    System.out.println("Invalid Choice");

            }
        }while (!quit);

    }
    public void dispenseDrink(Drink d){
        System.out.println("have "+d.getName());
        System.out.println("bill "+d.getCost());
    }

    public static void main(String[] args) {
        CoffeeVendingMachineImpl coffeeVendingMachine= new CoffeeVendingMachineImpl();
        coffeeVendingMachine.displayMenu();
    }
}
