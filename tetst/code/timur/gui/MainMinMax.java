package timur.gui;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainMinMax {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println(maxElt(integerList));
        System.out.println(minElt(integerList));
    }
    public static int maxElt(List<Integer> intList) {
        return intList
                .stream()
                .collect(Collectors.maxBy(Comparator.naturalOrder())).get();
    }
    public static int minElt(List<Integer> intList) {
        return intList
                .stream()
                .min(Comparator.naturalOrder()).get();
    }

}
