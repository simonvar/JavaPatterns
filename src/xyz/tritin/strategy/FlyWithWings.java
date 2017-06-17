package xyz.tritin.strategy;

/**
 *
 * @author Simon
 * @since 16.06.2017
 *
 * */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

}
