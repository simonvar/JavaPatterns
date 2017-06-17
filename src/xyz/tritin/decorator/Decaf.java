package xyz.tritin.decorator;

/**
 * @author Simon
 * @since 18.06.17
 */
public class Decaf extends Beverage {
    public Decaf(){
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
