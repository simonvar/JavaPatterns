package xyz.tritin.factory.ingredients.factory;

import xyz.tritin.factory.ingredients.cheese.Cheese;
import xyz.tritin.factory.ingredients.cheese.Mozzarella;
import xyz.tritin.factory.ingredients.clams.Clams;
import xyz.tritin.factory.ingredients.clams.FrozenClams;
import xyz.tritin.factory.ingredients.dough.Dough;
import xyz.tritin.factory.ingredients.dough.ThickCrustDough;
import xyz.tritin.factory.ingredients.pepperoni.Pepperoni;
import xyz.tritin.factory.ingredients.pepperoni.SlicedPepperoni;
import xyz.tritin.factory.ingredients.sauce.PlumTomatoSauce;
import xyz.tritin.factory.ingredients.sauce.Sauce;
import xyz.tritin.factory.ingredients.veggies.BlackOlives;
import xyz.tritin.factory.ingredients.veggies.EggPlant;
import xyz.tritin.factory.ingredients.veggies.Spinach;
import xyz.tritin.factory.ingredients.veggies.Veggies;

/**
 * @author Simon
 * @since 24.07.17
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new BlackOlives(), new Spinach(), new EggPlant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
