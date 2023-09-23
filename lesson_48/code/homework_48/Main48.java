package homework_48;

import java.util.Scanner;

public class Main48 {
    /*
    Написать программу, которая при вводе с клавиатуры дня недели отвечает на вопрос является ли этот день выходным
    ( для выходного дня - ответ true,  для рабочего false). Использовать ENUM. Вам может понадобиться метод valueOf
    1. Нужно создать Enum, состоящий из дней недели DayOfWeek
    2. Создать класс DayOfWeekResolver,  содержащий методы для решения задачи:
        -  метод для чтения  значения с экрана
        -  метод, преобразующий введенную строку в enum
        -  метод, определяющий является ли день выходным
        - метод start() - в котором вызываеются  все предыдущие приватные методы и который вызывается в методе main
    3. вызвать метод в методе main класса Main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DayOfWeekResolver day = DayOfWeekResolver.MONDAY;//Требуется инициализация
        char digit;
        int asciiCode;
        do {
            System.out.println("=================================================");
            System.out.println("Enter the day of the week number: ");
            System.out.println("Monday: " + 1);
            System.out.println("Tuesday: " + 2);
            System.out.println("Wednesday: " + 3);
            System.out.println("Thursday: " + 4);
            System.out.println("Friday: " + 5);
            System.out.println("Saturday: " + 6);
            System.out.println("Sunday: " + 7);
            System.out.println("Or 0 (zero) to exit");

            String input = scanner.nextLine();

            if (input.length() == 1 && Character.isDigit(input.charAt(0))) {
                digit = input.charAt(0);
                asciiCode = (int) digit;

                if (asciiCode >= 48 && asciiCode <= 55) {
                    if (asciiCode == 48) {//Выход из программы если ввели 0
                        System.out.println("Thank you for your attention. Bye!");
                        break;
                    }
                    // Введена корректная цифра в диапазоне от 1 до 7 - обрабатываем данные со сканера
                    System.out.println(day.typeOfDay(Integer.parseInt(input)));
                } else {
                    System.out.println("Incorrect input, please re-enter");
                }
            } else {
                System.out.println("Incorrect input, please re-enter");
            }
        } while (true);
        // Закрываем Scanner
        scanner.close();
    }
}
