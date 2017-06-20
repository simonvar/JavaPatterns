package xyz.tritin.factory.pizza;

/**
 * @author Simon
 * @since 20.06.17
 */
public class NYCheesePizza extends Pizza {

    public void prepare(){
        System.out.println("Preparing NY Cheese...");
    }

    public void bake(){
        System.out.println("Baking NY Cheese...");
    }

    public void cut(){
        System.out.println("Cutting NY Cheese...");
    }

    public void box(){
        System.out.println("Boxed NY Cheese!");
    }

}
