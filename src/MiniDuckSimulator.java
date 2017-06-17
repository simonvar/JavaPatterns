import xyz.tritin.strategy.Duck;
import xyz.tritin.strategy.FlyRocketPowered;
import xyz.tritin.strategy.MallardDuck;
import xyz.tritin.strategy.ModelDuck;

/**
 *
 * @author Simon
 * @since 16.06.2017
 *
 * */
public class MiniDuckSimulator {

    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
