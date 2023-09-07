package homework_36;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Main36 {
    public static void main(String[] args) {
        /*
        Задача 1
        Написать метод, принимающий два листа целых чисел одинаковой длины и возвращающий лист,
        содержащий элементы Yes или No, где значения на i-м месте зависит от того, равны ли элементы
        этих двух листов под номером i.
        Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
        Протестировать
     */
        List<Integer> list1 = Arrays.asList(1,2,128,4,14,204,54,63,23);
        //List<Integer>list2 = List.of(5,2,128,8,9,204,20,63,12);
        List<Integer>list2 = Arrays.asList(5,2,128,8,9,204,20,63,12);

        ListProcessing listProcessing = new ListProcessing();
        System.out.println(listProcessing.yesOrNo(list1, list2));
        System.out.println("\n=====================================================");
        /*
        Задача 2
        Написать метод, принимающий лист целых чисел и целое число и возвращающий лист без элементов
        больших этого числа.
        Протестировать.
        */
        System.out.println(listProcessing.withoutEltsMoreThanN(list1, 100));
        System.out.println("\n=====================================================");
        System.out.println(listProcessing.withoutEltsMoteThanNIterator(list2, 50));

    }
}
