package homework_33;

import homework_35.Animals;

import java.util.Comparator;

public class AnimalsWeightComparator implements Comparator<homework_35.Animals> {
    public int compare(homework_35.Animals a1, Animals a2){
        return Integer.compare(a1.getAnimalsWeight(),a2.getAnimalsWeight());
    }
}
