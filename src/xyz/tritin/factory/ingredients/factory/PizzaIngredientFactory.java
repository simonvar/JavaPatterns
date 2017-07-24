package xyz.tritin.factory.ingredients.factory;

import xyz.tritin.factory.ingredients.cheese.Cheese;
import xyz.tritin.factory.ingredients.clams.Clams;
import xyz.tritin.factory.ingredients.dough.Dough;
import xyz.tritin.factory.ingredients.pepperoni.Pepperoni;
import xyz.tritin.factory.ingredients.sauce.Sauce;
import xyz.tritin.factory.ingredients.veggies.Veggies;

/**
 * @author Simon
 * @since 24.07.17
 */
public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();

}
