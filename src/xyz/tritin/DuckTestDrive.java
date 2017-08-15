package xyz.tritin;

import xyz.tritin.adapter.Duck;
import xyz.tritin.adapter.MallardDuck;
import xyz.tritin.adapter.TurkeyAdapter;
import xyz.tritin.adapter.WildTurkey;

/**
 * <p>Date: 16.08.17 </p>
 *
 * @author Simon Tritin
 */
public class DuckTestDrive {

    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("It is duck: ");
        testDuck(duck);

        System.out.println("\nAnd.. is it duck?");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

}
