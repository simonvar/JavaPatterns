package xyz.tritin.factory.pizza;

/**
 * @author Simon
 * @since 20.06.17
 */
public class ChicagoCheesePizza extends Pizza {

    public void prepare(){
        System.out.println("Preparing Chicago Cheese...");
    }

    public void bake(){
        System.out.println("Baking Chicago Cheese...");
    }

    public void cut(){
        System.out.println("Cutting Chicago Cheese...");
    }

    public void box(){
        System.out.println("Boxed Chicago Cheese!");
    }
}
