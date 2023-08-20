package homework_23;

public class PassengerAirplane extends Airplane{
    private int passengerCapacity;
    public PassengerAirplane(String model, int maxSpeed, int rangeOfFlight, int maxCeiling, int passengerCapacity) {
        super(model, maxSpeed, rangeOfFlight, maxCeiling);
        this.passengerCapacity = passengerCapacity;
    }
    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    public void transferPassengers() {
        System.out.println("Пассажирский самолет доставил пассажиров.");
    }
}
