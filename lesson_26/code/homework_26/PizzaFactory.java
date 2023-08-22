package homework_26;

public class PizzaFactory {
    static Pizza createPizza(String type) {
        switch (type) {
            case "Hawaii":
                return new PizzaHawaii();
            case "Salami":
                return new PizzaSalami();
            case "Mozzarella":
                return new PizzaMozzarella();
            default:
                throw new IllegalArgumentException("Invalid pizza type");
        }
    }
}
