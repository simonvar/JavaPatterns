package xyz.tritin.factory.pizza;

import xyz.tritin.factory.ingredients.cheese.Cheese;
import xyz.tritin.factory.ingredients.clams.Clams;
import xyz.tritin.factory.ingredients.dough.Dough;
import xyz.tritin.factory.ingredients.pepperoni.Pepperoni;
import xyz.tritin.factory.ingredients.sauce.Sauce;
import xyz.tritin.factory.ingredients.veggies.Veggies;

import java.util.ArrayList;

/**
 * @author Simon
 * @since 20.06.17
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box!");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza?";
    }
}
