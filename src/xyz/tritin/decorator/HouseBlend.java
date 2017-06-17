package xyz.tritin.decorator;

/**
 * @author Simon
 * @since 18.06.17
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
