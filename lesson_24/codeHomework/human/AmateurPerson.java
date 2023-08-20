package human;

public class AmateurPerson extends Person{

    @Override
    public void run() {
        System.out.println("Любитель бега бежит со скоростью: 15 км/час");
    }
    @Override
    public void timeToRest() {
        System.out.println("Любителю бега нужно отдохнуть после пробежки - 10 мин.");
    }
}
