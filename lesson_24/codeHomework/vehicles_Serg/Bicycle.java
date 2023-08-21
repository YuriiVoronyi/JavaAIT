package vehicles_Serg;

public class Bicycle extends Vehicle{
    public Bicycle(String title) {
        super(title);
    }

    @Override
    public void setDefaultValues() {
        // переопределение родительского метода пустотой, чтобы изменить поведение "создать новый двигатель"  this.engine = new Engine();
    }

    @Override
    public void setEngine(Engine engine) {
        // тоже переопределение родительского метода, чтобы велосипеду не добавлялся двигатель
        System.out.println("I don't have space for an engine");
    }

    @Override
    public String toString() {
        return "Bicycle {" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                '}';
    }
}
