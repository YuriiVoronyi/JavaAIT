package homework_25;

public class Main25 {
    public static void main(String[] args) {
        System.out.println("================ Task1 ===================================");
        /*
        Написать метод, проверяющий заканчивается ли строка содержимым другой строки.
        public boolean strEndsWithAnotherStr ( String str1, str2)
        */
        boolean result = strEndsWithAnotherStr("Hello, world!", "world!");
        System.out.print(result);
        System.out.println("\n================ Task2 ===================================");
        /*
        Написать метод, создающий массив символов из содержимого строки
        public char[] createsCharArray( String str)
        */
        String tmpStr = new String("Thisisaverylongword");
        char[] tmpChar = createsCharArray( tmpStr );
        for(char chr: tmpChar) {
            System.out.print(chr + "  ");
        }
        System.out.println("\n================ Task3 ===================================");
        /*
        Написать метод, удаляющий из строки повторяющиеся символы
        String removeDuplicateChars( String string)
        пример: "abbccccaadb" -> "abcd"
        */
        String input = "abbccccaadb";
        String res = removeDuplicateChars(input);
        System.out.println(res);
    }
    public static boolean strEndsWithAnotherStr(String str1, String str2) {
        return str1.endsWith(str2);
    }
    public static char[] createsCharArray( String str) {
        char[] charr = str.toCharArray();
        return charr;
    }
    public static String removeDuplicateChars(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }
        return result;
    }
}
