package homework_43;
import java.util.HashMap;
import java.util.Map;
public class Main43 {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "apple", "cherry", "banana"};

        Map<String, Boolean> result = findDuplicates(strings);

        // Вывод результата
        for (Map.Entry<String, Boolean> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<String, Boolean> findDuplicates(String[] strings) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Подсчитываем количество вхождений каждой строки
        for (String str : strings) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        // Создаем Map для хранения результата
        Map<String, Boolean> resultMap = new HashMap<>();

        // Заполняем результат на основе количества вхождений
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                resultMap.put(entry.getKey(), true); // Больше одного вхождения
            } else {
                resultMap.put(entry.getKey(), false); // Только одно вхождение
            }
        }

        return resultMap;
    }
}
