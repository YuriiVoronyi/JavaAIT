package consultation_27;

public class Boy extends Pupil{
    public Boy(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }
    public void canWork() {
        System.out.println(getFirstName() + " makes stools");
    }
    public String toString() {
        return super.toString() + ". He is a boy";
    }
}
