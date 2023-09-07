package homework_37;
import java.util.Arrays;
import java.util.List;

public class Main37 {
    public static void main(String[] args) {
        /*
        Написать метод, принимающий не пустой лист строк и возвращающий строку,
        которая встречается раньше в листе - самую короткую или самую длинную.
        Все строки в листе разной длины
        */
        List<String> strings = Arrays.asList("Побольше стр", "Чуть-чуть", "Еще больше строка", "Сааамая большая строка");

        Result rezShort = findShortLongStr(strings, 0);
        Result rezLong = findShortLongStr(strings, 1);

        if(rezShort.getIntValue() < rezLong.getIntValue()) {
            System.out.println("Встретилась первой самая короткая строка: " + rezShort.getStringValue());
        } else {
            System.out.println("Встретилась первой самая длинная строка: " + rezLong.getStringValue());
        }
    }

    public static Result findShortLongStr(List<String> strings, int flag) {

        if (strings.isEmpty()) {
            Result rez = new Result("Список строк не должен быть пустым",0);
            return rez;
        }
        int index = 0;
        String res = strings.get(0); // Исходно устанавливаем первую строку как результат
        int length = res.length();

        for (int i = 0; i < strings.size(); i++) {
            int currLength = strings.get(i).length();
            if ((flag == 0 && currLength < length) || (flag == 1 && currLength > length)) {
                res = strings.get(i);
                length = currLength;
                index = i;
            }
        }
        Result rez = new Result(res,index);
        return rez;
    }
    public static class Result {
        private String stringValue;
        private int intValue;

        public Result(String stringValue, int intValue) {
            this.stringValue = stringValue;
            this.intValue = intValue;
        }

        public String getStringValue() {
            return stringValue;
        }

        public int getIntValue() {
            return intValue;
        }
    }

}
