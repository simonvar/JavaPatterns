package xyz.tritin.factory;

import xyz.tritin.factory.pizza.ChicagoCheesePizza;
import xyz.tritin.factory.pizza.ChicagoPepperoniPizza;
import xyz.tritin.factory.pizza.Pizza;

/**
 * @author Simon
 * @since 20.06.17
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("pepperoni")){
            pizza = new ChicagoPepperoniPizza();
        } else if (type.equals("cheese")){
            pizza = new ChicagoCheesePizza();
        }

        return pizza;
    }
}
