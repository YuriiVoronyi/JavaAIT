package homework_23;

public class Airplane {
    private String model;
    private int maxSpeed;
    private int rangeOfFlight;//Дальность полета
    private int maxCeiling;//Максимальный потолок (метры)
    private final int id;
    static private int globCounter;
    private Pilot pilot; //null
    private final AutoPilotAvia autoPilot;
    public Airplane (String model, int maxSpeed, int RangeOfFlight, int maxCeiling) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.rangeOfFlight = RangeOfFlight;
        this.maxCeiling = maxCeiling;
        this.autoPilot = new AutoPilotAvia("AP-2023", this);
        this.id = globCounter++;
    }
    public Airplane(String model, int maxSpeed, int RangeOfFlight, int maxCeiling, Pilot pilot) {
        this(model, maxSpeed, RangeOfFlight, maxCeiling);
        this.pilot = pilot;
    }

    public String getAutoPilotInfo() {
        return autoPilot.toString();
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) { //назначить пилота этого самолета
        this.pilot = pilot;
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
        return "{id: " + id + "; Model: " + model + "; maxSpeed: " + maxSpeed + "; rangeOfFlight: " + rangeOfFlight +
                "; maxCeiling: " + maxCeiling + "; pilot: " + (pilot == null ? "{no pilot}" : pilot.toString()) +
                " autopilot: " + autoPilot.toString() + "}";
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

    public void flyByPilot() { // самолет начинает полет
        //проверяем, включен ли автопилот
        if (autoPilot.isActive()) {
            autoPilot.turnOff();
        }
        // Пилоту передается команда начать управление самолетом
        pilot.driveAirplane(this); // в методе пилоту передается ссылка на текущий объект самолета
    }
    public void flyByAutopilot() {
        autoPilot.driveAirplane();
    }
}
