package xyz.tritin.factory;

import xyz.tritin.factory.pizza.NYCheesePizza;
import xyz.tritin.factory.pizza.NYPepperoniPizza;
import xyz.tritin.factory.pizza.Pizza;

/**
 * @author Simon
 * @since 20.06.17
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("pepperoni")){
            pizza = new NYPepperoniPizza();
        } else if (type.equals("cheese")){
            pizza = new NYCheesePizza();
        }

        return pizza;
    }
}
