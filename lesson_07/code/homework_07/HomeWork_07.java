package homework_07;
import java.util.Scanner;
import java.util.Random;

public class HomeWork_07 {
    public static void main(String[] args) {
        System.out.println("=============== Task 0 =======================");
        /*
        Перепишите решение задачи с использованием switch вместо if-else:
        Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
        а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на выбор: 1, 2 или 3");
        int userInputInt = scanner.nextInt();

        switch (userInputInt) {
            case 1: {
                System.out.println("Вы ввели число: 1");
                break;
            }
            case 2: {
                System.out.println("Вы ввели число: 2");
                break;
            }
            case 3: {
                System.out.println("Вы ввели число: 3");
                break;
            }
            default: {
                System.out.println("Вы ввели число: " + userInputInt + ", но это НЕ то, что нужно!!!");
            }
       }

        System.out.println("=============== Task 1 =======================");
        /*
       (Использовать оператор switch)
        Программа просит пользователя ввести число от 1 до 7 Если число равно 1,
        выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.
        */
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int usrInputInt = scann.nextInt();

        switch (usrInputInt) {
            case 1: {
                System.out.println("Понедельник");
                break;
            }
            case 2: {
                System.out.println("Вторник");
                break;
            }
            case 3: {
                System.out.println("Среда");
                break;
            }
            case 4: {
                System.out.println("Четверг");
                break;
            }
            case 5: {
                System.out.println("Пятница");
                break;
            }
            case 6:
            case 7: {
                System.out.println("Выходной");
                break;
            }
            default: {
                System.out.println("Вы ввели что-то НЕ то, что нужно!!!");
            }
        }

        System.out.println("=============== Task 2 =======================");
        /*
        Реализовать с использованием switch Ваш ребенок принес оценку за контрольную работу по математике.
        В школе 12 бальная система. Запишите в переменную случайное число от 0 до 12. Вы разрешаете ребенку
        смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут. (записать в переменную)
        Если оценка от 10 до 12 баллов -> Скажите ему, как вы рады и добавьте к оставшемуся на сегодня
        времени 1 час от 7 до 9 -> Слова похвалы на экран + ко времени 45 минут от 4 до 6 -> Нейтральные
        слова + ко времени 15 минут 3 -> Огорчитесь. Минус 30 минут ко времени оценка меньше -> Трагедия.
        Сегодня ТВ смотреть запрещено. Выведите на экран оставшееся на сегодня время для просмотра ТВ
        P.S. Реализовать с использованием switch
        */
        int timeForTV = 45;
        Random random = new Random();
        int schoolGrade  = random.nextInt(12); // Оценка со школы
        System.out.println("Сегодня в школе мы получили оценку: " + schoolGrade);

        switch (schoolGrade) {
            case 10:
            case 11:
            case 12: {
                timeForTV += 60;
                System.out.println("Я очень рад за тебя! Ты сегодня молодец!!!");
                break;
            }
            case 7:
            case 8:
            case 9: {
                timeForTV += 45;
                System.out.println("Сегодня хорошо!");
                break;
            }
            case 4:
            case 5:
            case 6: {
                timeForTV += 15;
                System.out.println("Ну что ж....надеюсь завтра будет лучьше!!");
                break;
            }
            case 3:  {
                timeForTV -= 30;
                System.out.println("Что случилось? Ты ведь можешь лучьше! Я знаю!!!");
                break;
            }
            case 0:
            case 1:
            case 2: {
                timeForTV = 0;
                System.out.println("Жаль! Подводишь нас...!!!");
                break;
            }
            default: {
            }
        }
        System.out.println("На сегодня время для просмотра ТВ: " + timeForTV + " минут !");
    }
}
