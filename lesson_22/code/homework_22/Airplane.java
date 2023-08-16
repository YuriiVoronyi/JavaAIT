package homework_22;

public class Airplane {
    private String model;
    private int maxSpeed;
    private int rangeOfFlight;//Дальность полета
    private int maxCeiling;//Максимальный потолок (метры)
    private final int id;
    static private int globCounter;
    public Airplane (String model, int maxSpeed, int RangeOfFlight, int maxCeiling) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.rangeOfFlight = RangeOfFlight;
        this.maxCeiling = maxCeiling;
        this.id = globCounter++;
    }
    //*********** get *************************************
    public int getId() {
        return id;
    }
    public String getModel() {
        return model;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getRangeOfFlight() {
        return rangeOfFlight;
    }
    public int getMaxCeiling() {
        return maxCeiling;
    }
    //*********** set *************************************
    public void setModel(String model) {
        this.model = model;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setRangeOfFlight(int rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }
    public void setMaxCeiling(int maxCeiling) {
        this.maxCeiling = maxCeiling;
    }
    //*********** metods *************************************
    public String toString() {
        return "{id: " + id + "; Model: " + model + "; maxSpeed: " + maxSpeed + "; rangeOfFlight: " + rangeOfFlight + "; maxCeiling: " + maxCeiling + "}";
    }
    public void takeOff() {
        System.out.println("Я взлетел");
    }
    public void fly() {
        System.out.println("Я лечу");
    }
    public void land() {
        System.out.println("Я приземлился");
    }
}
