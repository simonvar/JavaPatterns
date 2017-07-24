import xyz.tritin.factory.ChicagoPizzaStore;
import xyz.tritin.factory.NYPizzaStore;
import xyz.tritin.factory.PizzaStore;

/**
 * @author Simon
 * @since 20.06.17
 */
public class FreePizza {

    public static void main(String[] args){
        PizzaStore store = new NYPizzaStore();
        store.orderPizza(PizzaStore.CHEESE);

        System.out.println();
        store = new ChicagoPizzaStore();
        store.orderPizza(PizzaStore.VEGGIE);
    }

}
