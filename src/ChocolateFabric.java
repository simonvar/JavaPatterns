import xyz.tritin.singleton.ChocolateBoiler;

/**
 * @author Simon
 * @since 24.07.17
 *
 * Паттерн "одиночка" нарантирует, что класс имеет
 * только один экземпляр, и предоставляет глобальную точку
 * доступа к этому экземпляру
 *
 */
public class ChocolateFabric {

    public static void main(String[] args){
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        System.out.println(boiler.toString());

        /*-- another code --*/

        ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
        System.out.println(boiler.toString());

    }

}
