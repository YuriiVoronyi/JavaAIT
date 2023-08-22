package homework_26;

public class PizzaMozzarella extends Pizza{
    private static String TYPE = "Pizza Mozzarella";

    public PizzaMozzarella(){
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing Pizza with mozzarella cheese");
    }
}
