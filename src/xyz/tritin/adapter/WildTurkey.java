package xyz.tritin.adapter;

/**
 * <p>Date: 16.08.17 </p>
 *
 * @author Simon Tritin
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
