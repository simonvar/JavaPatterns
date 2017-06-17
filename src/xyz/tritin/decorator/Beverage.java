package xyz.tritin.decorator;

/**
 * @author Simon
 * @since 18.06.17
 */
public abstract class Beverage {
    String description = "Unknown descriptor";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
