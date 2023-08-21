package vehicles_Serg;

public class Motorcycle extends Vehicle{
    public Motorcycle(String title) {
        super(title);
    }

    @Override
    public String toString() {
        return "Motorcycle {" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", engine=" + getEngine() +
                '}';
    }
}
