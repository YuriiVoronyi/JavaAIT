package homework_62;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainHW62 {
    public static void main(String[] args) {
        /*
    1.Получить и вывести на экран:
    -текущую дату
    -текущий год, месяц и день*/
        System.out.println("========== Task 1 =============");
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().getYear());
        System.out.println(LocalDate.now().getMonth());
        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getDayOfMonth());
        /*
   2.Создать дату , например день рождения и вывести на экран
        */
        System.out.println("========== Task 2 =============");
        LocalDate birthdayDate = LocalDate.of(1963, 4, 11);
        System.out.println(birthdayDate);
        /*
   3.Создать две даты и проверить на равенство
        */
        System.out.println("========== Task 3 =============");
        LocalDate date1 = LocalDate.of(1963, 4, 11);
        LocalDate date2 = LocalDate.now();
        System.out.println(date1.isEqual(date2));
        /*
   4.Получить и вывести на экран текущее время
        */
        System.out.println("========== Task 4 =============");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        /*
   5.текущее время + 3 часа
        */
        System.out.println("========== Task 5 =============");
        LocalTime localTime2 = LocalTime.now();
        System.out.println(localTime2.plusHours(3));
         /*
   6.Создать дату на неделю позже сегодняшней
        */
        System.out.println("========== Task 6 =============");
        LocalDate date3 = LocalDate.now();
        System.out.println(date3.plusWeeks(1));
        /*
   7.Создать дату, которая была на год раньше сегодняшней используя метод minus
        */
        System.out.println("========== Task 7 =============");
        LocalDate date4 = LocalDate.now();
        System.out.println(date4.minusYears(1));
        /*
   8.Создать дату на год позже сегодняшней используя plus метод
        */
        System.out.println("========== Task 8 =============");
        LocalDate date5 = LocalDate.now();
        System.out.println(date5.plusYears(1));
        /*
   9.Создать даты tomorrow и yesterday и проверить находятся
   ли они до или после сегодняшней
        */
        System.out.println("========== Task 9 =============");
        LocalDate date6 = LocalDate.now();
        LocalDate yesterday = date6.minusDays(1);
        LocalDate tomorrow = date6.plusDays(1);
        System.out.println(date6.isBefore(tomorrow));
        System.out.println(date6.isAfter(yesterday));
                /*
  10.Написать метод, принимающий лист из нескольких дат типа LocalDate и возвращающий количество
        дней между самой ранней и поздней датами
        */
        System.out.println("========== Task 10 =============");
        List<LocalDate> dates = new ArrayList<>();

        LocalDate d1 = LocalDate.of(1988, 5, 24);
        LocalDate d2 = LocalDate.of(1971, 9, 1);
        LocalDate d3 = LocalDate.of(1968, 4, 11);
        LocalDate d4 = LocalDate.of(1963, 4, 11);
        LocalDate d5 = LocalDate.of(2000, 12, 15);
        LocalDate d6 = LocalDate.of(1974, 9, 21);
        LocalDate d7 = LocalDate.of(2023, 10, 14);

        dates.add(d1);
        dates.add(d2);
        dates.add(d3);
        dates.add(d4);
        dates.add(d5);
        dates.add(d6);
        dates.add(d7);

        System.out.println(amountOfDays(dates));

    }
    public static String amountOfDays(List<LocalDate> parDates) {
        List<LocalDate> sortedDates = parDates.stream()
                .sorted()
                .collect(Collectors.toList());
        LocalDate date1 = sortedDates.get(0);
        LocalDate date2 = sortedDates.get(sortedDates.size()-1);

        return "Amount of days between " + date1 + " and " + date2 + " = " + ChronoUnit.DAYS.between(date1,date2);
    }
}
