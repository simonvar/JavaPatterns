package xyz.tritin.strategy;

/**
 * @author Simon
 * @since 16.06.17
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
