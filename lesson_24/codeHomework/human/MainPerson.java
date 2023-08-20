package human;

public class MainPerson {
    public static void main(String[] args) {
        Person ordinaryPerson = new Person();
        ordinaryPerson.run();
        AmateurPerson amateurPerson = new AmateurPerson();
        amateurPerson.run();
        ProfiPerson profiPerson = new ProfiPerson();
        profiPerson.run();
        ordinaryPerson.timeToRest();
        amateurPerson.timeToRest();
        profiPerson.timeToRest();
    }
}
