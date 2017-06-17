package xyz.tritin.strategy;

/**
 * @author Simon
 * @since 16.06.17
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Yes, I'm the real Mallard Duck!");
    }
}
