package xyz.tritin.factory.pizza;

/**
 * @author Simon
 * @since 20.06.17
 */
public class NYPepperoniPizza extends Pizza {
    public void prepare(){
        System.out.println("Preparing NY Pepperoni...");
    }

    public void bake(){
        System.out.println("Baking NY Pepperoni...");
    }

    public void cut(){
        System.out.println("Cutting NY Pepperoni...");
    }

    public void box(){
        System.out.println("Boxed NY Pepperoni!");
    }
}
