package consultation_27;

public class Girl extends Pupil{
    public Girl(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }
    public void canWork() {
        System.out.println(getFirstName() + " cooks soup");
    }
    public String toString() {
        return super.toString() + ". She is a girl";
    }
}
