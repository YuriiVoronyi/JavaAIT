package homework_58;

import java.util.function.Function;
import java.util.function.Predicate;

public class MainHMW58 {
    /*
    Task1
    Написать тесты для метода transformString1 класса Transformer1 (см.код занятия)
    Выполенное задание - файл Transformer1Test
    =================================================================================
    Дана строка, состоящая из слов, разделенных пробелом. Написать метод, позволяющий изменять слова в строке
    таким образом:
    1. При длине слова = 3 изменить все буквы этого слова на заглавные и вернуть измененную строку
    Пример: "aaa BBBB deF vbghR bbb" -> "AAA BBBB DEF vbghR BBB"
    2. При длине слова = 4 изменить все буквы этого слова на строчные(маленькие) и вернуть измененную строку
    Пример: "aaa BBBB deF vbghR bbb" -> aaa bbbb deF vbghR bbb
    3. При длине слова = 5 изменить все буквы слова на звездочки  и вернуть измененную строку
    Пример: "aaa BBBB deF vbghR bbb" -> aaa BBBB deF ***** bbb
    Слова состоят только из букв латинского алфавита
    */
    public static void main(String[] args) {
        Predicate<String> lengthOfWordIsThree = parStr -> parStr.length() == 3;
        Predicate<String> lengthOfWordIsFour = parStr -> parStr.length() == 4;
        Predicate<String> lengthOfWordIsFive = parStr -> parStr.length() == 5;
        Function<String, String> strUpperCase = String::toUpperCase;//parStr.toUpperCase()
        Function<String, String> strLowerCase = String::toLowerCase;//parStr.toLowerCase()
        Function<String, String> strStars = parStr -> "*****";

        String str = "aaa BBBB deF vbghR bbb";
        System.out.println(str);
        String[] arrayOfStrings;
        arrayOfStrings = str.split(" ");
        for (int i = 0; i < arrayOfStrings.length; i++) {

            String curRes1 = transformString(arrayOfStrings[i], lengthOfWordIsThree, strUpperCase);
            if (!(curRes1.equals(arrayOfStrings[i]))) {
                arrayOfStrings[i] = curRes1;
                continue;
            }
            String curRes2 = transformString(arrayOfStrings[i], lengthOfWordIsFour, strLowerCase);
            if (!(curRes2.equals(arrayOfStrings[i]))) {
                arrayOfStrings[i] = curRes2;
                continue;
            }
            String curRes3 = transformString(arrayOfStrings[i], lengthOfWordIsFive, strStars);
            if (!(curRes3.equals(arrayOfStrings[i]))) {
                arrayOfStrings[i] = curRes3;
            }
        }
        System.out.println("===================");
        System.out.println(String.join(" ", arrayOfStrings));//Выводим элементы маассива как строку с разделителем - пробел

        /*ЭТУ ЖЕ ЗАДАЧУ С ИСПОЛЬЗОВАНИЕМ ИНТЕРФЕЙСОВ НЕ СМОГ СДЕЛАТЬ - ES IST SCHADE*/

    }

    public static String transformString(String input, Predicate<String> condPred, Function<String, String> condFunc) {
        if (condPred.test(input)) {
            return condFunc.apply(input);
        }
        return input;
    }
}
