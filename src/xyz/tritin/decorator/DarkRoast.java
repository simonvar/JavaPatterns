package xyz.tritin.decorator;

/**
 * @author Simon
 * @since 18.06.17
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
