package homework_35;

import java.util.Comparator;

public class ReversNameComparator implements Comparator<Animals> {
    public int compare(Animals a1, Animals a2){

        StringBuilder builder1 = new StringBuilder(a1.getAnimalsName());
        StringBuilder builder2 = new StringBuilder(a2.getAnimalsName());

        builder1.reverse();
        builder2.reverse();

        return builder1.toString().compareTo(builder2.toString());
    }
}
