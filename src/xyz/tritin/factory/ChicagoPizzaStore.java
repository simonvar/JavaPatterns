package xyz.tritin.factory;

import xyz.tritin.factory.ingredients.factory.ChicagoPizzaIngredientFactory;
import xyz.tritin.factory.ingredients.factory.NYPizzaIngredientFactory;
import xyz.tritin.factory.ingredients.factory.PizzaIngredientFactory;
import xyz.tritin.factory.pizza.*;

/**
 * @author Simon
 * @since 20.06.17
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (type){
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
        }


        return pizza;
    }
}
