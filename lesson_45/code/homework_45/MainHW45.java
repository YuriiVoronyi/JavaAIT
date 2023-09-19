package homework_45;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainHW45 {
    /*
    Написать метод, принимающий не пустой лист целых чисел , в котором все числа кроме одного имеют пару
    и возвращающий это не парное число. При решении использовать мапу
    Примеры:
    1,3,1 -> 3
    3,3,3 -> 3
    1,1,15,1,1 -> 15
    1,8,8,8,8,8,1,2,2 -> 8
    */
    public static void main(String[] args) {
        List<Integer> intList1 = new ArrayList<>(List.of(1,3,1));
        List<Integer> intList2 = new ArrayList<>(List.of(3,3,3));
        List<Integer> intList3 = new ArrayList<>(List.of(1,1,15,1,1));
        List<Integer> intList4 = new ArrayList<>(List.of(1,8,8,8,8,8,1,2,2));

        System.out.println(returningAnUnmatchedNumber(intList1));
        System.out.println(returningAnUnmatchedNumber(intList2));
        System.out.println(returningAnUnmatchedNumber(intList3));
        System.out.println(returningAnUnmatchedNumber(intList4));
    }
    public static int returningAnUnmatchedNumber(List<Integer> parList) {
        Map<Integer,Integer> searchOfResult = new HashMap<>();
        for (Integer i : parList) {
            searchOfResult.merge(i,1,(oldValue,newValue) -> oldValue + newValue);
        }
        for (int key: searchOfResult.keySet()) {
            if(searchOfResult.get(key) == 1)
                return key;
        }
        return -1;
    }
}
