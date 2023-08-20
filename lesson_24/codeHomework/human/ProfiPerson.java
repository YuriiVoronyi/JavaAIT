package human;

public class ProfiPerson extends AmateurPerson {
    @Override
    public void run() {
        System.out.println("Профи по бегу бежит со скоростью: 25 км/час");
    }
    @Override
    public void timeToRest() {
        System.out.println("Профи по бегу нужно отдохнуть после пробежки - 5 мин.");
    }
}
