package homework_23;

public class Main23 {
    public static void main(String[] args) {
        System.out.println("=============================== Task 1 ===============================");
        /*
        Добавить к классам из предыдущего домашнего задания хотя бы по одному полю имеющему связь HAS-A с классом Лучше пару полей :)
        */
        PassengerAirplane passengerAirplane = new PassengerAirplane("Boeing 660", 988, 2500, 13000,103);
        CargoAirplane cargoAirplane = new CargoAirplane("Airbus 318", 840, 5950, 12000, 78000);

        System.out.println("\n========== Данные по самолетам =============");
        System.out.println(passengerAirplane.toString());
        System.out.println(cargoAirplane.toString());
        System.out.println("\n========== Полет пассажирского самолета =============");
        passengerAirplane.takeOff();
        passengerAirplane.fly();
        passengerAirplane.land();
        System.out.println();
        System.out.println("\n=========== Полет грузового самолета ================");
        cargoAirplane.takeOff();
        cargoAirplane.fly();
        cargoAirplane.land();
        System.out.println();
        System.out.println("Количество пассажиров: " + passengerAirplane.getPassengerCapacity());
        System.out.println("Вес доставленого груза в Кг.: " + cargoAirplane.getCarryingCapacity());

        Pilot pilotBob = new Pilot("Bob",30);//Создали пилота Боб
        Pilot pilotJohn = new Pilot("John",45);//Создали пилота Джон
        passengerAirplane.setPilot(pilotBob);//Боб будет пилотировать пассажирский самолет
        cargoAirplane.setPilot(pilotJohn);//Джон будет пилотировать грузовой самолет
        System.out.println("\n=========== После распределения пилотов по самалетам выводим инфу по самолетам");
        System.out.println(passengerAirplane.toString());
        System.out.println(cargoAirplane.toString());
        System.out.println("\n=========== Переводим управление самолетами на автопилот");
        passengerAirplane.flyByAutopilot();
        cargoAirplane.flyByAutopilot();
        System.out.println("\n=========== Передаем управление пилотам");
        passengerAirplane.flyByPilot();
        cargoAirplane.flyByPilot();
        System.out.println("\n=========== Пересаживаем пилотов местами: Джона на пассажирский Боинг, а Боба на грузовой Эарбас");
        pilotJohn.driveAirplane(passengerAirplane);//Боба убираем садим Джона на пассажирский самолет
        pilotBob.driveAirplane(cargoAirplane);//Джона убираем садми Боба на грузовой самолет
        System.out.println("\n=============================== Task 2 ===============================");
        /*
        Дописать в класс BusDriver реализацию методов по добавлению и удалению водительской категории
        */
        System.out.println("\n==============Создаем автобус бус и выводим по нему инфу");
        Bus bus = new Bus("Sprinter", 20);//Создали автобус бус
        System.out.println(bus.toString());//Вывели инфу по автобусу бус

        System.out.println("\n==============Создаем водителя Боб и выводим по нему инфу");
        BusDriver driver = new BusDriver("Bob", 35);//Создали водителя Боб
        System.out.println(driver.toString());//Вывели инфу по водителю Боб

        System.out.println("\n==============Садим водителя Боб в автобус бус и проверяем, что автобусом бус управляет водитель Боб");
        bus.setDriver(driver);//Посадили водителя Боб в автобус бус
        bus.moveByDriver();//Удостоверяемся, что автобусом бус управляет водитель Боб

        System.out.println("\n==============Создаем водителя Джон и выводим по нему инфу");
        BusDriver driver1 = new BusDriver("John", 28);//Создали водителя Джон
        System.out.println(driver1.toString());//Вывели инфу по водителю Джон

        System.out.println("\n==============Садим водителя Джон в автобус бус вместо Боба и проверяем, что автобусом бус управляет водитель Джон");
        bus.setDriver(driver1);//Посадили водителя Джон в автобус бус вместо Боба
        bus.moveByDriver();//Удостоверяемся, что автобусом бус управляет водитель Джон

        System.out.println("\n==============Вадители имеют следующие категории:");
        System.out.println(driver.getCategories());
        System.out.println(driver1.getCategories());
        driver.addCategories("A");
        driver.addCategories("M");
        driver.addCategories("QQ");
        driver.addCategories("RRR");
        driver1.addCategories("AAAA");
        driver1.addCategories("MKKK");
        driver1.addCategories("QQQQ");
        driver1.addCategories("RRRUUU");
        System.out.println("\n==============После добавления у водителя Боб следующие категории:");
        System.out.println(driver.getCategories());
        System.out.println("\n==============После добавления у водителя Джон следующие категории:");
        System.out.println(driver1.getCategories());
        System.out.println("\n==============Удалим у каждого из них категорию \"B\", результат:");
        driver.removeCategory("B");
        driver1.removeCategory("B");
        System.out.println(driver.getCategories());
        System.out.println(driver1.getCategories());
        System.out.println("\n==============Удалим у них все категории, результат:");
        driver.removeAllCategories();
        driver1.removeAllCategories();
        System.out.println(driver.getCategories());
        System.out.println(driver1.getCategories());
    }
}
