package theory_44.myExercises;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie","David","Bob","David","Charlie","Alice");

        Map<String, Integer> result = findResult(names);

        // Вывод результата
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Integer> findResult(List<String> parNames) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Подсчитываем количество вхождений каждой строки
        for (String str : parNames) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }
        return frequencyMap;
    }
}
