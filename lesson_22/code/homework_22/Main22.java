package homework_22;

public class Main22 {
    public static void main(String[] args) {
        PassengerAirplane passengerAirplane = new PassengerAirplane("Boeing 660", 988, 2500, 13000,103);
        CargoAirplane cargoAirplane = new CargoAirplane("Airbus 318", 840, 5950, 12000, 78000);

        System.out.println("========== Данные по самолетам =============");
        System.out.println(passengerAirplane.toString());
        System.out.println(cargoAirplane.toString());

        System.out.println("========== Полет пассажирского самолета =============");
        passengerAirplane.takeOff();
        passengerAirplane.fly();
        passengerAirplane.land();
        System.out.println();

        System.out.println("=========== Полет грузового самолета ================");
        cargoAirplane.takeOff();
        cargoAirplane.fly();
        cargoAirplane.land();
        System.out.println();

        System.out.println("Количество пассажиров: " + passengerAirplane.getPassengerCapacity());
        System.out.println("Вес доставленого груза в Кг.: " + cargoAirplane.getCarryingCapacity());

    }
}
