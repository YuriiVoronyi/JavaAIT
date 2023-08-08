package homework_06;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_06 {
    public static void main(String[] args) {
        System.out.println("=============== Task 0 =======================");

        /*
        Необходимо написать программу, где бы пользователю предлагалось ввести число
        на выбор: 1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на выбор: 1, 2 или 3");
        int userInputInt = scanner.nextInt();
        System.out.println(outRezult(userInputInt));

        System.out.println("=============== Task 1 =======================");

        /*
        Запишите в 4 переменные случайные числа от 0 до 100
        Выведите все 4 на экран
        Программа должна определить максимальное из этих четырех чисел
        Результат вывести на экран
        */
        int max = 0;
        Random  random = new Random();

        int var1  = random.nextInt(100);
        int var2  = random.nextInt(100);
        int var3  = random.nextInt(100);
        int var4  = random.nextInt(100);

        System.out.println("var1 is: " + var1 + ", var2 is: " + var2 + ", var3 is: " + var3 + ", var4 is: " + var4);

        max = (max < var1) ? var1 : max;
        max = (max < var2) ? var2 : max;
        max = (max < var3) ? var3 : max;
        max = (max < var4) ? var4 : max;

        System.out.println("Maximum Value is: "+max);

        System.out.println("=============== Task 2 =======================");

        /*
        программа предлагает пользователю ввести четырехзначное число
        Причем: мы можем получать от пользователя ТОЛЬКО строки. Данные в формате String
        Если число не четырехзначное, должно вывестись на экран сообщение об ошибке и работа программы завершается
        Проверить, является ли число "счастливым билетом". Т.е. совпадает ли сумма цифр первых двух цифр числа с суммой
        5третьей и четвертой цифры
        */
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        String strInpStr = scann.nextLine();
        if (strInpStr.length() != 4) {
            System.out.println("Вы ввели НЕ четырехзначное число !!!");
        }
        else {
            happyBile(strInpStr);
        }
    }
    public static String outRezult(int parVar) {
        if ((parVar != 1) && (parVar != 2) && (parVar != 3)) {
            return "Вы ввели что-то не то !!!!!!!!!!!";
        }
        return "Вы ввели : " + parVar;
    }
    public static void happyBile(String parVar) {
        int var1 = Integer.parseInt(parVar.substring(0, 1));
        int var2 = Integer.parseInt(parVar.substring(1, 2));
        int var3 = Integer.parseInt(parVar.substring(2, 3));
        int var4 = Integer.parseInt(parVar.substring(3, 4));
        if (( var1 + var2 ) == ( var3 + var4 )) {
            System.out.println(parVar + " - ЭТО СЧАСТЛИВЫЙ БИЛЕТ !!!");
        }
        else {
            System.out.println(parVar + " - число НЕ является счастливым.");
        }
    }
}
