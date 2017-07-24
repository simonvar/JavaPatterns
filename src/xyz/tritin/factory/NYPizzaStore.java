package xyz.tritin.factory;

import xyz.tritin.factory.ingredients.factory.NYPizzaIngredientFactory;
import xyz.tritin.factory.ingredients.factory.PizzaIngredientFactory;
import xyz.tritin.factory.pizza.*;

/**
 * @author Simon
 * @since 20.06.17
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (type){
            case CHEESE:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
        }


        return pizza;
    }
}
