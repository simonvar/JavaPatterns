package xyz.tritin.strategy;

/**
 *
 * @author Simon
 * @since 16.06.2017
 *
 * */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
