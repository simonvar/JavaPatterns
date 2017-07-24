package xyz.tritin.singleton;

/**
 * @author Simon
 * @since 24.07.17
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private volatile static ChocolateBoiler instance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if (instance == null){
            synchronized (ChocolateBoiler.class){
                if (instance == null){
                    instance = new ChocolateBoiler();
                }
            }
        }
        return instance;
    }

    public void fill(){
        if (isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Chocolate Boiler ");
        if (isEmpty()){
            builder.append("is Empty ");
        } else {
            builder.append("is Fill ");
        }

        if (isBoiled()){
            builder.append("and is Boiled.\n");
        } else {
            builder.append("and is not Boiled.\n");
        }

        return builder.toString();
    }
}
