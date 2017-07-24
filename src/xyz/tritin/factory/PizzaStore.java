package xyz.tritin.factory;

import xyz.tritin.factory.pizza.Pizza;

/**
 * @author Simon
 * @since 20.06.17
 */
public abstract class PizzaStore {

    public static final String CHEESE = "cheese";
    public static final String VEGGIE = "veggie";
    public static final String CLAM = "clam";
    public static final String PEPPERONI = "pepperoni";

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
