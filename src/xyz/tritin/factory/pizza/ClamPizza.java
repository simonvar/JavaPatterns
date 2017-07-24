package xyz.tritin.factory.pizza;

import xyz.tritin.factory.ingredients.factory.PizzaIngredientFactory;

/**
 * @author Simon
 * @since 24.07.17
 */
public class ClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
