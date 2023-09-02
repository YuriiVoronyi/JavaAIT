package homework_33;

import java.util.Comparator;

public class AnimalsWeightComparator implements Comparator<Animals> {
    public int compare(Animals a1, Animals a2){
        return Integer.compare(a1.getAnimalsWeight(),a2.getAnimalsWeight());
    }
}
