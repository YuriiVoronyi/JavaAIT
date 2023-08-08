package homework_12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork_12 {
    public static void main(String[] args) {
        System.out.println("************************** Task 0 ***********************************");
        /*
       Написать метод принимающий целое число и проверяющий является ли число простым.
       Если является, метод должен вернуть true, не является - false
        */
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int userAnsw = scann.nextInt();
        boolean rezIsPrime = isPrimeNumber(userAnsw);
        System.out.println("Число: " + userAnsw + ((rezIsPrime == false) ? " НЕ" : "") + " является простым!");

        System.out.println("************************** Task 1 ***********************************");
        /*
        Написать метод, принимающий массив целых чисел. Метод должен вернуть количество простых чисел в массиве.
        Для проверки на "простоту" числа рекомендуется использовать метод из Task 0
        */
        int[] intArray = new int[10];
        createArray(intArray, 10);//Для создания массива, в функцию передаем массив по ссылке
        System.out.println("Имеем следующий массив: " + Arrays.toString(intArray));
        System.out.println("\nКоличество простых чисел в массиве равно: " + numberOfPrimes(intArray));

        System.out.println("************************** Task 2 ***********************************");
        /*
        Написать метод, принимающий на вход массив строк. Метод должен вернуть массив,
        состоящий из самой короткой и самой длинной строки изначального массива.
        */
        String[] strArray = new String[]{"Some", "fish", "majestically", "wave", "their", "fins", "to", "traverse", "the", "deep"};
        System.out.println("Имеем следующий массив: " + Arrays.toString(strArray));
        System.out.println("массив, состоящий из самой короткой и самой длинной строки изначального массива:");
        System.out.println(Arrays.toString(longShortEl(strArray)));

        System.out.println("************************** Task 3 опционально ***********************************");
        /*
        Написать метод, принимающий на вход массив целых чисел. Метод должен вернуть массив,
        состоящий только из простых чисел, присутствующих в изначальном массиве
        вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
        */
        int[] intgArray = new int[10];
        createArray(intgArray, 100);//Для создания массива, в функцию передаем массив по ссылке
        System.out.println("Имеем изначальный массив: " + Arrays.toString(intgArray));
        System.out.println("Получаем массив, состоящий только из простых чисел, присутствующих в изначальном массиве: ");
        System.out.println(Arrays.toString(arrayOfPrimes(intgArray)));
        System.out.println("");
    }

    public static String[] longShortEl(String[] parArray) {
        String[] rezArray = new String[2];
        rezArray[0] = parArray[0];
        rezArray[1] = parArray[0];
        for (String el : parArray) {
            rezArray[1] = ((rezArray[1].length() < el.length()) ? el : rezArray[1]);//Ищем элемент с макс.длиной
            rezArray[0] = ((el.length() < rezArray[0].length()) ? el : rezArray[0]);//Ищем элемент с мин.длиной
        }
        return rezArray;
    }

    public static int[] arrayOfPrimes(int[] parArray) {
        int numbOfPrimes = numberOfPrimes(parArray);
        if (0 < numbOfPrimes) {
            int[] rezArray = new int[numbOfPrimes];
            int count = 0;
            int indexRezArray = 0;
            while (count <= parArray.length - 1) {
                if (isPrimeNumber(parArray[count])) {
                    rezArray[indexRezArray] = parArray[count];
                    indexRezArray++;
                }
                count++;
            }
            return rezArray;
        }
        int[] errorArray = new int[] {-1};
        return errorArray;
    }

    public static int numberOfPrimes(int[] parArray) {
        int count = 0;
        for (int el : parArray) {
            count += ((isPrimeNumber(el)) ? 1 : 0);
        }
        return count;
    }

    public static boolean isPrimeNumber(int parNum) {
        if (parNum <= 1) {
            return false; // Числа меньше или равные 1 не являются простыми
        }
        // Проверяем делители от 2 до корня из числа
        for (int i = 2; i <= Math.sqrt(parNum); i++) {
            if (parNum % i == 0) {
                return false; // Если нашли делитель, число не является простым
            }
        }
        return true; // Если делителей нет, число простое
    }

    public static void createArray(int[] parArray, int parNumber) {
        Random random = new Random();
        int i = 0;
        while (i <= parArray.length - 1) {
            parArray[i] = random.nextInt(parNumber);
            i++;
        }
    }
}
