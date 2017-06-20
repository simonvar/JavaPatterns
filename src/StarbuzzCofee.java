import xyz.tritin.decorator.*;

/**
 * @author Simon
 * @since 18.06.17
 */
public class StarbuzzCofee {

    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());


        Beverage beverage3 = new Espresso();
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());


        Beverage beverage4 = new Espresso();
        beverage4 = new Soy(beverage4);
        beverage4 = new Soy(beverage4);
        System.out.println(beverage4.getDescription() + " $" + beverage4.cost());

    }

}
