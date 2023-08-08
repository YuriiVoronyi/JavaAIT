package homework_11;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class HomeWork_11 {
    public static void main(String[] args) {
        System.out.println("************************** Task 0 ***********************************");
        /*
        Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.
        {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]
        Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается
        в обычном порядке, а начиная с этого индекса в обратном:
        {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
        Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в обратном
        порядке Если флаг == false -> печатает массив в прямом порядке
        */
        int[] intArray = new int[7];
        boolean argTrue = true;
        boolean argFalse = false;
        createArray(intArray, 10);//Для создания массива, в функцию передаем массив по ссылке
        System.out.println("Имеем следующий массив: " + Arrays.toString(intArray));
        System.out.println("Печатаем массив в обратном порядке, по НЕ перегруженному методу: ");
        reverseOrder(intArray);
        System.out.println("Печатаем массив по флагу true - в обратном порядке: ");
        reverseOrder(intArray, argTrue);
        System.out.println("Возвращаем массив в первоначальное состояние: ");
        reverseOrder(intArray, argTrue);
        System.out.println("Печатаем массив по флагу false - в прямом первоначальном порядке: ");
        reverseOrder(intArray, argFalse);
        System.out.println("Обратный порядок начинается с третьего элемента массива: ");
        reverseOrder(intArray, 2);

        System.out.println("************************** Task 1 ***********************************");
        /*
        Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло
        класс Math для нахождения степени числа использовать нельзя ;)
        */
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите целое число от 0 до 10!");
        int userAnsw = scann.nextInt();
        if (0 <= userAnsw && userAnsw <= 10) {
            myExponentiation(userAnsw);
        } else {
            System.out.println("Вы ввели не корректное число!!!");
        }
    }
    public static void myExponentiation(int expo) {
        if (expo == 0) {
            System.out.println("2 в степени " + expo + " = 1");
            return;
        }
        if (expo == 1) {
            System.out.println("2 в степени " + expo + " = 2");
            return;
        }
        int[] intArray = new int[expo];
        int i = 0;
        while (i <= intArray.length-1) {
            intArray[i] = 2;
            i++;
        }
        int rez = 1;
        i = 0;
        do {
            rez *= intArray[i];
            i++;
        } while (i <= intArray.length-1);
        System.out.println("2 в степени " + expo + " = " + rez);
    }

    public static void reverseOrder(int[] parArray, int indx) {
        int count = indx;
        String tmpStr = "";
        while (count <= parArray.length - 1) {
            tmpStr += parArray[count];
            count++;
        }
        int i = parArray.length - 1;
        int index = indx;
        int indStr = tmpStr.length() - 1;
        while (indx <= i) {
            parArray[index] = Character.getNumericValue(tmpStr.charAt(indStr));
            index++;
            i--;
            indStr--;
        }
        System.out.println("" + Arrays.toString(parArray));
    }

    public static void reverseOrder(int[] parArray) {
        int i = 0;
        String tmpStr = "";
        while (i <= parArray.length - 1) {
            tmpStr += parArray[i];
            i++;
        }
        i = tmpStr.length() - 1;
        while (0 <= i) {
            parArray[tmpStr.length() - 1 - i] = Character.getNumericValue(tmpStr.charAt(i));
            i--;
        }
        System.out.println("" + Arrays.toString(parArray));
    }

    public static void reverseOrder(int[] parArray, boolean flag) {
        int i = 0;
        String tmpStr = "";
        if (flag == true) {
            while (i <= parArray.length - 1) {
                tmpStr += parArray[i];
                i++;
            }
            i = tmpStr.length() - 1;
            while (0 <= i) {
                parArray[tmpStr.length() - 1 - i] = Character.getNumericValue(tmpStr.charAt(i));
                i--;
            }
        }
        System.out.println("" + Arrays.toString(parArray));
    }

    public static void createArray(int[] parArray, int parNumber) {
        Random random = new Random();
        int i = 0;
        int currVal;
        while (i <= parArray.length - 1) {
            currVal = random.nextInt(parNumber);
            parArray[i] = currVal;
            i++;
        }
    }
}
