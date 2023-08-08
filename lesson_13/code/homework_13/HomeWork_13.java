package homework_13;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class HomeWork_13 {
    public static void main(String[] args) {
        System.out.println("************************** Task 0 ***********************************");
        /*
       Написать метод по поиску строки в массиве строк. На вход метод принимает массив строк, и строку для поиска.
        */
        String[] strArray = new String[]{"Some", "fish", "majestically", "wave", "their", "fins", "to", "traverse", "deep"};
        System.out.println("Имеем следующий массив: " + Arrays.toString(strArray));
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите строку для поиска в массиве:");
        String strAnsw = scann.nextLine().trim();
        if (strAnsw.length() == 0) {
            System.out.println("Вы ввели пустую строку!");
        } else {
            int index = substringSearch(strArray, strAnsw);
            if (index == -1) {
                System.out.println("Такой строки как: " + strAnsw + ", в массиве не существует!");
            } else {
                System.out.println("Есть такая строка: " + strAnsw + " в массиве под индексом: " + index);
            }
        }

        System.out.println("************************** Task 1 ***********************************");
        /*
        Написать метод, принимающий строку и возвращающий новую строку, состоящую из 2го и 3го символа
        входящей строки, переведенных в верхний регистр. Распечатать полученный результат в методе main
        "Hello" -> "EL"
        "He" -> "E"
        "H" -> ???
        */
        System.out.println("Введите строку для обработки:");
        String strAns = scann.nextLine().trim();
        if (strAns.length() <= 1) {
            System.out.println("Вы ввели или пустую строку, или недостаточное количество букв в строке для обработки!");
        } else {
            String rezStr = returnNewStr(strAns);
            System.out.println("После обработки входящей строки: " + strAns + ", имеем результат: " + rezStr);
        }

        System.out.println("************************** Task 2 ***********************************");
        /*
        Реализуйте метод sumOfArray (сумма элементов массива),
        который получает на вход массив и определяет сумму его элементов.
        */
        int[] intArray = new int[10];
        createArray(intArray, 100);//Для создания массива, в функцию передаем массив по ссылке
        System.out.println("Имеем следующий массив: " + Arrays.toString(intArray));
        System.out.println("Сумма элементов массива равна: " + summaOfArray(intArray));

        System.out.println("************************** Task 3 опционально *******************");
        /*
        Написать метод copyOfArray, возвращающий массив:
        Метод принимает массив целых чисел и возвращает копию этого массива.
        Перегрузка: метод принимает массив строк и возвращает копию массива
        Перегрузка: Метод принимает массив целых чисел и число (newSize) - длину нового массива.
        Новый массив заполняется значениями из входящего массива. Сколько поместится.
        Если чисел не хватило -> остаток массива заполняется 0.
        {1, 2, 3, 4, 5} -> copyOfArray(array, 3) -> {1, 2, 3}
        {1, 2, 3, 4, 5} -> copyOfArray(array, 7) -> {1, 2, 3, 4, 5, 0, 0}
        */
        int[] templeteArray = new int[10];
        createArray(templeteArray, 100);//Для создания массива, в функцию передаем массив по ссылке
        System.out.println("Имеем исходный массив: " + Arrays.toString(templeteArray));
        System.out.println("Получаем копию массива: " + Arrays.toString(copyOfArray(templeteArray)));
    }
    public static int[] copyOfArray(int[] parArray) {
        if (parArray == null) return new int[0];
        int[] rezArray = new int[parArray.length];
        for(int i = 0; i <= parArray.length-1; i++) {
            rezArray[i] = parArray[i];
        }
        return rezArray;
    }
    public static int summaOfArray(int[] parArray) {
        int summ = 0;
        for(int elem : parArray) {
            summ += elem;
        }
        return summ;
    }
    public static void createArray(int[] parArray, int parNumber) {
        Random random = new Random();
        int i = 0;
        while (i <= parArray.length - 1) {
            parArray[i] = random.nextInt(parNumber);
            i++;
        }
    }
    public static String returnNewStr(String parStr) {
        String rezStr = "";
        if (parStr.length() < 2) return "";
        for (int i = 0; i <= parStr.length()-1; i++) {
            rezStr += (i==1||i==2) ? parStr.substring(i, i+1).toUpperCase() : "";
        }
        return rezStr;
    }
    public static int substringSearch(String[] parArray, String parSabstr) {
        String testStr = null;
        for (String str : parArray) { //Пытается найти в массиве не null строку. Т.е. имеющую значение.
            if (str != null) {        //Если нашли хотя бы один не null, то можем сравнить с parSabstr
                testStr = str;        //Флаг, что есть не нулевая ячейка
                break;
            }
        }
        if (testStr == null)
            return -1; //Если в массиве не нашлось ни одной не нулевой строки, возвращаем -1.
        for (int i = 0; i <= parArray.length-1; i++) {
            if ((parArray[i] != null) && (parArray[i].equalsIgnoreCase(parSabstr))) {
                return i;
            }
        }
        return -1;
    }
}
