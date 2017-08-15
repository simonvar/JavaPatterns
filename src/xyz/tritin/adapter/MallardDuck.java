package xyz.tritin.adapter;

/**
 * <p>Date: 16.08.17 </p>
 *
 * @author Simon Tritin
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
