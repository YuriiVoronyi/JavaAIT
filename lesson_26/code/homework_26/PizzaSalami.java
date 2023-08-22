package homework_26;

public class PizzaSalami extends Pizza{
    private static String TYPE = "Pizza Salami";

    public PizzaSalami(){
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing Pizza with sausage");
    }
}
