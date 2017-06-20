import xyz.tritin.factory.NYStylePizzaStore;
import xyz.tritin.factory.PizzaStore;
import xyz.tritin.factory.pizza.Pizza;

/**
 * @author Simon
 * @since 20.06.17
 */
public class FreePizza {

    public static void main(String[] args){
        PizzaStore store = new NYStylePizzaStore();
        Pizza pizza = store.orderPizza("cheese");
    }

}
