package homework_23;

public class AutoPilotAvia {
    private final int id;
    private String model;

    private final Airplane airplane;

    private boolean isActive; // false

    static int counter;

    public AutoPilotAvia(String model, Airplane airplane) {
        this.model = model;
        this.airplane = airplane;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void driveAirplane() {
        turnOn();
        System.out.println("Автопилот id:" + id + " управляет самолетом id: " + airplane.getId() + ", " + airplane.getModel());
    }
    public void turnOff() {
        isActive = false;
        System.out.println("Автопилот " + id + " выключен");
    }

    public void turnOn() {
        isActive = true;
        System.out.println("Автопилот " + id + " включен");
    }

    public String toString() {
        return "{id:" + id +
                "; model:" + model +
                "; встроен в самолет id:" + airplane.getId()
                + "}";
    }
}
