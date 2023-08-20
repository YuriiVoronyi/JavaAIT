package theory_23;

public class Main23 {
    public static void main(String[] args) {
        Bus bus = new Bus("Sprinter", 20);
        System.out.println(bus.toString());

        BusDriver driver = new BusDriver("Bob", 35);

        System.out.println(driver.toString());


        BusDriver driver1 = new BusDriver("John", 28);

        bus.setDriver(driver1);
        System.out.println(bus.toString());

        Bus bus1 = new Bus("Vito", 12, driver);
        System.out.println(bus1.toString());
//        bus1.setDriver(driver);
        System.out.println(bus1.toString());

        bus.moveByDriver();
        bus1.moveByDriver();

        System.out.println();
        System.out.println("==================");
        System.out.println(bus.getAutoPilotInfo());


        System.out.println(bus.toString());

        System.out.println();
        System.out.println("========================");
        bus.moveByAutopilot();
        bus.moveByDriver();

        bus1.moveByDriver();
        bus1.moveByAutopilot();
        System.out.println("========88888888888888888888888888888888888888888888");
        System.out.println(driver.toString());
        driver.addCategories("C");
        System.out.println(driver.toString());
        driver.addCategories("QQ");
        System.out.println(driver.toString());
        driver.addCategories("SSS");
        System.out.println(driver.toString());
        driver.removeCategory("yt");
        System.out.println(driver.toString());
        driver.removeCategory("QQ");
        System.out.println(driver.toString());
        driver.removeAllCategories();
        System.out.println(driver.toString());
    }
}
