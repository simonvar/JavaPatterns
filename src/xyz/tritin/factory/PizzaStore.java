package xyz.tritin.factory;

import xyz.tritin.factory.pizza.Pizza;

/**
 * @author Simon
 * @since 20.06.17
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);

}
