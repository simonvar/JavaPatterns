package xyz.tritin.decorator;

/**
 * @author Simon
 * @since 18.06.17
 */
public class Espresso extends Beverage{

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
