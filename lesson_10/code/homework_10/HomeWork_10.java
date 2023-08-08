package homework_10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_10 {
    public static void main(String[] args) {
        System.out.println("************************** Task 0 ***********************************");
        /*
        Заполните массив 20 случайными целыми числами. Программа должна вывести на экран массив, количество четных чисел в массиве и сумму всех четных чисел.
        */
        int[] intArray = new int[20];
        int summ = 0;
        int countChet = 0;
        createArray(intArray,1000);//Для создания массива, в функцию передаем массив по ссылке
        System.out.println("Имеем следующий массив: " + Arrays.toString(intArray));
        for (int i = 0 ; i < 20 ; i++) {
            summ += (intArray[i] % 2 == 0) ? intArray[i] : 0;//Находим сумму всех четных чисел
            countChet += (intArray[i] % 2 == 0) ? 1 : 0;//Находим количество четных чисел
        }
        System.out.println("Количество четных чисел в массиве: " + countChet + ", и их сумма равна: " + summ);

        System.out.println("************************** Task 1 ***********************************");
        /*
        За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите консольную программу,
        в которую пользователь вводит сумму вклада и количество месяцев. А банк вычисляет конечную сумму вклада
        с учетом начисления процентов за каждый месяц. Для вычисления суммы с учетом процентов используйте цикл for.
        Введите сумму вклада: 100
        Введите срок вклада в месяцах: 1
        После 1 месяцев сумма вклада составит 107,00
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите сумму вклада: ");
        double userDepositAmount = scanner.nextInt();
        System.out.println("Пожалуйста, введите срок вклада в месяцах: ");
        int userNumberOfMonths = scanner.nextInt();
        double Percent = 0;
        for (int i = 1; i <= userNumberOfMonths ; i++) {
            Percent = userDepositAmount * 0.07;
            userDepositAmount += Percent;
        }
        System.out.printf("Считаем сложный процент. После " +  userNumberOfMonths + " месяцев сумма вклада составит: %.2f", userDepositAmount);
        System.out.println("");

        System.out.println("************************** Task 2 ***********************************");
        /*
        Заполните массив 50 случайными числами от 1 до 100. Программа должна найти, и вывести на экран все простые числа.
        Посчитайте сколько получилось таких чисел в массиве. Простое число - число, которое делится на цело только на 1 и само себя.
        Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
        */
        int[] myArray = new int[50];
        int pNum = 0;//Флаг - это простое число или нет
        String strRezPNum = "";//Строка вывода всех простых чисел через запятую
        int countPrimNum = 0;  //Счетчик количества простых чисел в массиве
        createArray(myArray,100);//Для создания массива, в функцию передаем массив по ссылке
        System.out.println("Имеем следующий массив: " + Arrays.toString(myArray));
        for (int i = 0; i <= myArray.length-1; i++) {
            pNum = primeNumber(myArray[i]);
            if (pNum == 1) {
                strRezPNum = strRezPNum + myArray[i] + ((i == myArray.length-1) ? "." : ", ");
                countPrimNum++;
            }
        }
        System.out.println("Простые числа массива : " +  strRezPNum);
        System.out.println("Общее количество простых чисел в массиве : " +  countPrimNum);

        System.out.println("************************** Task 3 ***********************************");
        /*
         *опционально Написать программу, выводящую на экран треугольник, состоящий из цифр от 1 до 6 такого вида:
            1
            12
            123
            1234
            12345
            123456
        */

        String strRezult = "";
        for (int i = 1; i <= 6; i++) {  // Способ 1
            strRezult += i;
            System.out.println(strRezult);
        }
        String strB = "";
        for (int i = 1; i <= 6; i++) {  // Способ 2
            strB = "";
            for (int b = 1; b <= i; b++) {
                strB += b;
            }
            System.out.println(strB);
        }
    }
    public static void createArray(int[] parArray, int parNumber) {
        Random random = new Random();
        int i = 0;
        int currVal;
        while (i <= parArray.length-1) {
            currVal = random.nextInt(parNumber);
            parArray[i] = currVal;
            i++;
        }
    }
    public static int primeNumber(int parNum) {
        if (parNum <= 1) {
            return 0; // Числа меньше или равные 1 не являются простыми
        }
        // Проверяем делители от 2 до корня из числа
        for (int i = 2; i <= Math.sqrt(parNum); i++) {
            if (parNum % i == 0) {
                return 0; // Если нашли делитель, число не является простым
            }
        }
        return 1; // Если делителей нет, число простое
    }
}
