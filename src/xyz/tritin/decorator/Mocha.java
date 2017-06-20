package xyz.tritin.decorator;

/**
 * @author Simon
 * @since 18.06.17
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        String description = beverage.getDescription() + ", Mocha";
        return description;
    }


    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
