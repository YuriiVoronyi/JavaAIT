package consultation_27;

public class MinCons_27 {
    public static void main(String[] args) {
        Pupil boy = new Boy("Jack","Burns",15);
        Pupil girl = new Girl("Kate","Brown",13);
        Pupil[] pupils = {boy,girl};
        for(Pupil pupil : pupils) {
            System.out.println(pupil);
            pupil.canWork();
            System.out.println("-------------------------------------------");
        }
    }
}
