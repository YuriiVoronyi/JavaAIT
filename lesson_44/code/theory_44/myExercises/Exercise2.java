package theory_44.myExercises;
/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Map;*/
import java.util.*;

public class Exercise2 {
    /*
    Пусть есть лист имен и их анаграмм. Написать метод, принимающий лист имен и лист анаграм,
    по которому он возвращает мапу, в которой ключь - это имя, а значение - список анаграм по этому имени
    взятых из списка анаграм.
    Решение с помощью мапы.
    */
    public static void main(String[] args) {
        List<String> str   = List.of("emily", "limey", "meily", "ymile", "jacob", "cabjo", "bocja", "cojab", "olivia", "violai", "ivoila", "ailivo", "ethan", "thane", "neath", "hante", "ava", "vaa", "aav", "aav");
        List<String> names = List.of("emily", "jacob", "olivia", "ethan", "ava");
        Map<String, List<String>> resultMap = findResult(str, names);

        // Вывод результата
        for (Map.Entry<String, List<String>> entry : resultMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public static Map<String, List<String>> findResult(List<String> parStr, List<String> parNames) {
        Map<String, List<String>> resMap = new HashMap<>();
        for (String name : parNames) {
            String sortName = sortString(name);
            List<String> anagrams = new ArrayList<>();
            for (String anagram : parStr) {
                String sortAnagram = sortString(anagram);
                if(sortName.equals(sortAnagram)) {
                     anagrams.add(anagram);
                }
            }
            resMap.put(name,anagrams);
        }
        return resMap;
    }

    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }


}
