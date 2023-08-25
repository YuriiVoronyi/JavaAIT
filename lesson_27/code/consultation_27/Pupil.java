package consultation_27;

public abstract class Pupil {
    private String firstName;
    private String secondName;
    private int age;

    public Pupil(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public int getAge() {
        return age;
    }
    public abstract void canWork();
    public String toString() {
        return "FirstName = " + firstName + ", SecondName = " + secondName + ", age = " + age;
    }
}
