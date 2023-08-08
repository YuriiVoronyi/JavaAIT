package homework_16;

public class Smartphone {
    String companyManufacturer;
    String operatingSystem;
    String ScreenSize;

    public Smartphone(String companyManufacturer, String operatingSystem, String ScreenSize) {
        this.companyManufacturer = companyManufacturer;
        this.operatingSystem = operatingSystem;
        this.ScreenSize = ScreenSize;
    }
    public Smartphone() {
    }
    void bell() {
        System.out.println("din-don, din-don, din-don");
    }
    void photo() {
        System.out.println("Photo already taken");
    }
    void time() {
        System.out.println("Current time is shown");
    }
}
