package homework_30;

import java.util.Arrays;

public class Main30 {
    public static void main(String[] args) {
        /************************** Task 1 **********************************
         Используя принципы отбрасывания констант и оставления только максимально
         быстро растущего элемента найти асимптотики для следующих функций:

         f(n) = 9n +73
         при больших значениях n, 9n будет доминировать над 73, поэтому:
         f(n) = 9n +73 -> f(n) = 9n, ϴ(n) - линейный алгоритм

         f(n) = 235, здесь нет зависимости от входных данных n, поэтому здесь ϴ(1) - алгоритм с константным временем

         f(n) = n^2 + 7n +123
         При больших значениях n, n^2 будет доминировать над 7n и 123, игнорим 7n и 123, поэтому
         f(n) = n^2, т.е. здесь ϴ(n^2) - квадратичный алгоритм

         f(n) = n^3 +2000n +8765
         При больших значениях n, n^3 будет доминировать над 2000n и 8765, игнорим 2000n и 8765, поэтому
         f(n) = n^3, т.е. здесь ϴ(n^3) - кубический алгоритм

         f(n) = n + sqrt(n)
         При больших значениях n, n будет доминировать над sqrt(n), поэтому
         f(n) = n, т.е. здесь линейный алгоритм

         */
        System.out.println("************************** Task 2 ***********************************");
        /*
        Написать метод, проверяющий являются ли две строки анаграммами
        abc - cba  rosa - asor - анаграмма
        abc - dba  - не анаграмма
        boolean isAnagram( String str1, String str2)
        */
        String str1 = "1asdfgh";
        String str2 = "hfsgda1";
        System.out.println(isAnagram(str1, str2));
    }
    public static boolean isAnagram( String str1, String str2){
        if(str1.length() != str2.length()) { return false; }
        String sortString1 = sortString(str1);
        String sortString2 = sortString(str2);
        return sortString1.equals(sortString2);
    }
    public static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
