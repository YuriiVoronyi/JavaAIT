package homework_22;

public class CargoAirplane extends Airplane{
    private int carryingCapacity;//Грузоподьемность
    public CargoAirplane(String model, int maxSpeed, int rangeOfFlight, int maxCeiling, int carryingCapacity) {
        super(model, maxSpeed, rangeOfFlight, maxCeiling);
        this.carryingCapacity = carryingCapacity;
    }
    public int getCarryingCapacity() {
        return carryingCapacity;
    }
    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void transferCargo() {
        System.out.println("Грузовой самолет доставил груз.");
    }
}
