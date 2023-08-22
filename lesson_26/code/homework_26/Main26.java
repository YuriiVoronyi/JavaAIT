package homework_26;
import java.util.Scanner;

public class Main26 {
    public static void main(String[] args) {
        Pizza pizza;

        Scanner scann = new Scanner(System.in);
        System.out.println("Three types of pizza available:");
        System.out.println("1. Hawaii");
        System.out.println("2. Salami");
        System.out.println("3. Mozzarella");
        System.out.println("Choose your pizza by number!");
        int userChoice = scann.nextInt();
        switch (userChoice) {
            case 1 :
                pizza = PizzaFactory.createPizza("Hawaii");
                pizza.orderPizza();
                break;
            case 2 :
                pizza = PizzaFactory.createPizza("Salami");
                pizza.orderPizza();
                break;
            case 3 :
                pizza = PizzaFactory.createPizza("Mozzarella");
                pizza.orderPizza();
                break;
            default:
                pizza = null;
                //throw new IllegalArgumentException("Invalid pizza type");
                System.out.println("You didn't make the right choice!");
        }
    }
}
