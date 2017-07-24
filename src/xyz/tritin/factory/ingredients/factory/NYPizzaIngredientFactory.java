package xyz.tritin.factory.ingredients.factory;

import xyz.tritin.factory.ingredients.cheese.Cheese;
import xyz.tritin.factory.ingredients.cheese.ReggianoCheese;
import xyz.tritin.factory.ingredients.clams.Clams;
import xyz.tritin.factory.ingredients.clams.FreshClam;
import xyz.tritin.factory.ingredients.dough.Dough;
import xyz.tritin.factory.ingredients.dough.ThinCrustDough;
import xyz.tritin.factory.ingredients.pepperoni.Pepperoni;
import xyz.tritin.factory.ingredients.pepperoni.SlicedPepperoni;
import xyz.tritin.factory.ingredients.sauce.MarinaraSauce;
import xyz.tritin.factory.ingredients.sauce.Sauce;
import xyz.tritin.factory.ingredients.veggies.*;

/**
 * @author Simon
 * @since 24.07.17
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClam();
    }
}
