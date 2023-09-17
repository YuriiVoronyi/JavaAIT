package homework_44;
import java.util.*;

public class MapExercises {

    /*
    3.Пусть есть лист имен и их анаграмм. Написать метод, принимающий этот лист  и имя, по которому он возвращает список
    всех его анаграмм, включая само имя
    [john, ann, bill, nan, nna, llbi, ohnj],ann -> [ann,nan,nna]
    List<String> findAnagrams( String str, List<String>strings).
    Решение с помощью мапы.

     */

    List<String> findAnagrams(String str, List<String> strings) {

        Map<String, List<String>> anagrams = new HashMap<>();

        for (String s : strings) {
            String sortedKey = sortAnagram(s);

            if (anagrams.containsKey(sortedKey)) {
                List<String> value = anagrams.get(sortedKey);
                value.add(s);
                anagrams.put(sortedKey, value);
            } else {
                List<String> value = new ArrayList<>();
                value.add(s);
                anagrams.put(sortedKey, value);
            }
        }
        return anagrams.getOrDefault(sortAnagram(str), List.of());
    }

    private String sortAnagram(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
