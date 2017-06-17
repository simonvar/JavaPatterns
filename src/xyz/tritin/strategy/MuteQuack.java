package xyz.tritin.strategy;

/**
 *
 * @author Simon
 * @since 16.06.2017
 *
 * */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("*silence*");
    }
}
