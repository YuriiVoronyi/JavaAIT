package homework_23;
public class Pilot {
    private final int id;
    private String name;
    private int age;

    static private int counter;

    public Pilot(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "{Pilot: id:" + id + "; name: " + name + "}";
    }

    // метод запускающий у пилота функцию "управление самолетом"
    // в параметры метода приходит ссылка
    // на конкретный самолет, которым управляет сейчас пилот
    public void driveAirplane(Airplane airplane) {
        System.out.println("Пилот id:" + id + ", имя пилота: " + name +
                " управляет самолетом id:" + airplane.getId() + " " + airplane.getModel());
    }
}
