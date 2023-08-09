package homework_17;

public class Phone {
    long number;
    String model;
    double weight;

    public Phone(long number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(long number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {
    }

    void receiveCall(String parName) {
        System.out.println("звонит: " + parName);
    }
    void receiveCall(String parName, long parNumber) {
        System.out.println("звонит: " + parName + ", исходящий номер телефона: " + parNumber);
    }
    long getNumber() {
        return number;
    }

}
