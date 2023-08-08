package homework_14;

import java.util.Arrays;
import java.util.Random;

public class HomeWork_14 {
    public static void main(String[] args) {
        System.out.println("************************** Task 0 ***********************************\n");
        /*
       Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
       toUpperCase() использовать низзя.
        */
        String str = "Sunrise. Birds sing. Coffee brews. New day. Smiles bloom.";
        System.out.println("Исходная строка:");
        System.out.println(str);
        System.out.println("Итоговая строка:");
        System.out.println(myUpperCase(str));

        System.out.println("\n************************** Task 1 ***********************************\n");
        /*
        Написать метод swap, принимающий на вход массив целых чисел, и два индекса. Метод должен поменять
        местами значения, хранящихся в этих индексах
        {0, 1, 2, 3, 4, 5, 6} -> swap(arr, 1, 5} -> {0, 5, 2, 3, 4, 1, 6}
        Если индексы за пределами массива?
        Перегрузка метода для работы с массивами строк.
        */
        int[] intArray = new int[10];
        createArray(intArray, 100);//Для создания массива интов, в функцию передаем массив по ссылке
        int index1 = 3;
        int index2 = 6;

        System.out.println("Имеем индекс1 = " + index1 + ", индекс2 = " + index2 + " и массив интов:");
        System.out.println(Arrays.toString(intArray));
        System.out.println("После обмена элементами массива интов по индексам получаем:");
        System.out.println(Arrays.toString(getSwapArray(intArray, index1, index2)));

        System.out.println("\n=================== РАБОТАЕМ С МАССИВОМ СТРОК ПО ПЕРЕГРУЖЕННОМУ МЕТОДУ ====\n");
        String[] strArray = new String[10];
        createArray(strArray, 4);//Для создания массива строк, в функцию передаем массив по ссылке
        System.out.println("Имеем индекс1 = " + index1 + ", индекс2 = " + index2 + " и массив строк:");
        System.out.println(Arrays.toString(strArray));
        System.out.println("После обмена элементами массива строк по индексам получаем:");
        System.out.println(Arrays.toString(getSwapArray(strArray, index1, index2)));

        System.out.println("\n************************** Task 2 ***********************************\n");
        /*
        Написать метод, принимающий строку и один или два индекса (перегрузка). Метод должен возвращать
        подстроку начиная с первого индекса (включительно) и заканчивая вторым индексом (не включительно)
        Если индекс 1 - начиная с индекса и до конца строки.
        Функционал повторяет метод String.substring(), так что этот метод использовать не нужно.
        Оригинальный метод ломает программу, если введены не корректные индексы. Наш метод аварийно
        завершать программу не должен.
        */
        String newStr = getNewString(15);
        System.out.println("Имеем индекс1 = " + index1 + ", индекс2 = " + index2 + " и строку:");
        System.out.println(newStr);
        System.out.println("Итоговая подстрока по индексам:");
        System.out.println(mySubString(newStr, index1, index2));

        System.out.println("\n==== РАБОТАЕМ СО СТРОКОЙ ПО ПЕРЕГРУЖЕННОМУ МЕТОДУ С ОДНМИ ИНДЕКСОМ ====\n");
        String newStr2 = getNewString(20);
        System.out.println("Имеем индекс = " + index1 + " и строку:");
        System.out.println(newStr2);
        System.out.println("Итоговая подстрока по одному индексу:");
        System.out.println(mySubString(newStr2, index1));
    }
    public static String mySubString(String parStr, int parIndex1, int parIndex2) {//Возвращаем подстроку по индексам
        if (parStr.trim() == "") return "";
        if (parIndex1 < 0 && parStr.length() < parIndex1) return "";
        if (parIndex2 < 0 && parStr.length() < parIndex2) return "";
        String rezStr = "";
        int startIndex = (parIndex1 < parIndex2) ? parIndex1 : parIndex2;
        int finIndex   = (parIndex1 < parIndex2) ? parIndex2 : parIndex1;
        for (int i = startIndex; i < finIndex; i++) {
            rezStr += parStr.charAt(i);
        }
        return rezStr;
    }
    //Перегруженный метод, возвращаем подстроку по одному индексу
    public static String mySubString(String parStr, int parIndex) {
        if (parStr.trim() == "") return "";
        if (parIndex < 0 && parStr.length() < parIndex) return "";
        String rezStr = "";
        for (int i = parIndex; i <= parStr.length()-1; i++) {
            rezStr += parStr.charAt(i);
        }
        return rezStr;
    }

    public static int[] getSwapArray(int[] parArray, int parIndex1, int parIndex2) {
        if (parArray == null) return null;
        if (parIndex1 < 0 && parArray.length < parIndex1) return null;
        if (parIndex2 < 0 && parArray.length < parIndex2) return null;
        int[] rezArray = new int[parArray.length];
        for (int i = 0; i <= parArray.length - 1; i++) {
            if (i == parIndex1) {
                rezArray[i] = parArray[parIndex2];
            } else if (i == parIndex2) {
                rezArray[i] = parArray[parIndex1];
            } else {
                rezArray[i] = parArray[i];
            }
        }
        return rezArray;
    }

    public static String[] getSwapArray(String[] parArray, int parIndex1, int parIndex2) {//Перегруженный метод - работает с массивом строк
        if (parArray == null) return null;
        if (parIndex1 < 0 && parArray.length < parIndex1) return null;
        if (parIndex2 < 0 && parArray.length < parIndex2) return null;
        String[] rezArray = new String[parArray.length];
        for (int i = 0; i <= parArray.length - 1; i++) {
            if (i == parIndex1) {
                rezArray[i] = parArray[parIndex2];
            } else if (i == parIndex2) {
                rezArray[i] = parArray[parIndex1];
            } else {
                rezArray[i] = parArray[i];
            }
        }
        return rezArray;
    }

    public static void createArray(int[] parArray, int parNumber) {//Создаем массив интов
        Random random = new Random();
        int i = 0;
        while (i <= parArray.length - 1) {
            parArray[i] = random.nextInt(parNumber);
            i++;
        }
    }

    public static void createArray(String[] parArray, int parNumber) {//Перегруженный метод, создаем массив строк
        Random random = new Random();
        for (int i = 0; i <= parArray.length - 1; i++) {
            parArray[i] = getNewString(parNumber);
        }
    }

    public static String getNewString(int parNumber) {//Возвращает строку созданную по рандому
        Random random = new Random();
        String rezString = "";
        int randomInt;
        for (int i = 1; i <= parNumber; i++) {
            randomInt = random.nextInt(25) + 97;//берем любые маленькие латинские буквы
            rezString += (char) randomInt;
        }
        return rezString;
    }

    public static String myUpperCase(String parStr) {
        if (parStr.trim() == "") return "";
        String strRez = "";
        char currChar;
        for (int i = 0; i <= parStr.length() - 1; i++) {
            currChar = parStr.charAt(i);
            if (97 <= (int) currChar && (int) currChar <= 122) {
                currChar = (char) ((int) currChar - 32);
            }
            strRez += currChar;
        }
        return strRez;
    }
}
