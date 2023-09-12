package homework_40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main40 {
    public static void main(String[] args) {
        /*
        С помощью множеств реализовать метод, который принимает лист имен и возвращает лист без повторяющихся элементов
        */
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Rob");
        names.add("Kris");
        names.add("John");
        names.add("Bob");
        names.add("Dina");
        names.add("Bob");
        names.add("Lena");
        HashSet<String> newNames = getNewName(names);
        System.out.println(newNames);
    }
    public static HashSet getNewName(List parList) {
        HashSet<String> hashSet = new HashSet<>(parList);
        return hashSet;
    }
}
