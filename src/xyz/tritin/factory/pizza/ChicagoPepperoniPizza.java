package xyz.tritin.factory.pizza;

/**
 * @author Simon
 * @since 20.06.17
 */
public class ChicagoPepperoniPizza extends Pizza {

    public void prepare(){
        System.out.println("Preparing Chicago Pepperoni...");
    }

    public void bake(){
        System.out.println("Baking Chicago Pepperoni...");
    }

    public void cut(){
        System.out.println("Cutting Chicago Pepperoni...");
    }

    public void box(){
        System.out.println("Boxed Chicago Pepperoni!");
    }

}
