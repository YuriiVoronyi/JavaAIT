package homework_16;

public class Bike {
    String type;
    String color;
    int numbersOfSpeed;

    public Bike(String type, String color, int numbersOfSpeed) {
        this.type = type;
        this.color = color;
        this.numbersOfSpeed = numbersOfSpeed;
    }
    public Bike() {
    }
    void riding() {
        System.out.println("Bicycle rides");//Велосипед едет
    }
    void braking() {
        System.out.println("Bike slows down");//Велосипед тормозит
    }
    void switchingSpeed() {
        System.out.println("Speeds of bike is switched");//Скорости переключены
    }
}

