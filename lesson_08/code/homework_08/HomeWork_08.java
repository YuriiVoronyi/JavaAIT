package homework_08;
import java.util.Scanner;

public class HomeWork_08 {
    public static void main(String[] args) {
        System.out.println("=============== Task 0 =======================");
        /*
        Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while
        */
        int i = 1;
        while (i <= 10) {
            System.out.println("Task" + i);
            i++;
        }

        System.out.println("=============== Task 1 =======================");
        /*
        Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while
        */
       int count = 1;
       do {
            if (( count % 5 ) == 0) {
                System.out.println("Из диапазона чисел от 1 до 100, без остатка на 5 делится число: " + count);
            }
            count++;
        } while (count <= 100);

        System.out.println("=============== Task 2 =======================");
        /*
        Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while
        */
        int cnt = 1;
        int countRez = 1;
        String strRez = "";
        while (cnt <= 100) {
            if (( cnt % 5 ) == 0) {
                if (countRez <= 7) {
                    strRez = strRez + cnt + ((countRez == 7) ? "." : ", ");
                    countRez++;
                }
            }
            cnt++;
        }
        System.out.println("Первыми 7-ю числами из 100, которые делятся без остатка на 5 являются: " + strRez);

        System.out.println("=============== Task 3 =======================");
        /*
        Программа просит пользователя слово "hello" Если пользователь вводит правильное слово - программа
        распечатывает на экран благодарность и завершает работу Если вводится не верное слово - программа
        просит ввести слово снова. До тех пор, пока не будет введено запрашиваемое слово
        *опционально - считать кол-во попыток, которые потребовались пользователю для введения правильного слова
        По окончанию - вывести число попыток на экран
        */
        String strTemplate = "hello";
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int flag = 0;
        do {
            counter++;
            System.out.println("Пожалуйста, введите слово: hello");
            String answer = scanner.nextLine();
            if (answer.trim().equalsIgnoreCase(strTemplate)) {
                System.out.println("Спасибо, Вы ввели верное слово!");
                flag = 1;
            }
        } while (flag == 0);
        System.out.println("Количество попыток: " + counter);

        System.out.println("=============== Task 4 =======================");
        /*
        Программа просит пользователя ввести произвольное число Вывести сумму цифр этого числа
        */
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите произвольное число!");
        int userAnsw = scann.nextInt();
        String strUserAnsw = "" + userAnsw;
        int strLength = strUserAnsw.length();
        int iter = 1;
        int rez = 0;
        while (iter <= strLength) {
            rez = rez + Integer.parseInt(strUserAnsw.substring(iter-1, iter));
            iter++;
        }
        System.out.println("Вы ввели число: " + userAnsw + " число! Сумма цифр этого числа равна: " + rez);
    }
}
