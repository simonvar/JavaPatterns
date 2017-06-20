package xyz.tritin.factory.pizza;

/**
 * @author Simon
 * @since 20.06.17
 */
public abstract class Pizza {

    public void prepare(){
        System.out.println("Preparing...");
    }

    public void bake(){
        System.out.println("Baking...");
    }

    public void cut(){
        System.out.println("Cutting...");
    }

    public void box(){
        System.out.println("Boxed!");
    }

}
