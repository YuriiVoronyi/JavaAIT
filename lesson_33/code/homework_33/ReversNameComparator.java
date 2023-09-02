package homework_33;

import java.util.Comparator;

public class ReversNameComparator implements Comparator<Animals> {
    public int compare(Animals a1, Animals a2){

        String reversName1 = a1.getAnimalsName();
        String reversName2 = a2.getAnimalsName();

        StringBuilder builder1 = new StringBuilder(reversName1);
        StringBuilder builder2 = new StringBuilder(reversName2);

        builder1.reverse();
        builder2.reverse();

        String str1 = builder1.toString();
        String str2 = builder2.toString();

        return str1.compareTo(str2);
    }
}
