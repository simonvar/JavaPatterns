package xyz.tritin.strategy;

/**
 *
 * @author Simon
 * @since 16.06.2017
 *
 * */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
