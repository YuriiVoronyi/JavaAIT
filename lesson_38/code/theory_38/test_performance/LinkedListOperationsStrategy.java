package theory_38.test_performance;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListOperationsStrategy implements ListOperationsStrategy{
    //Будем тестировать скорость выполнения методов добавления и вызова элементов коллкеции LinkedList
    //append и get, getFilledList это технический метод - промежуточный, вспомогательный метод для обеспечения работы теста
    private static final Object object = 10;
    private Random rnd = new Random();//Генератор случайных чисел
    @Override
    public void append(int nTimes) {//Метод используемый для тестирования
        List list = new LinkedList();

        for (int i = 0; i < nTimes; i++) {//В лист добавляется в цикле nTimes количество раз объект
            list.add(object);
        }
    }

    @Override
    public List getFilledList(int length) {//Возвращает лист, заполненный объектами в цикле length количество раз
        List list = new LinkedList();      //используется в работе метода get, это технический метода

        for (int i = 0; i < length; i++) {
            list.add(object);
        }
        return list;
    }

    @Override
    public void get(int nTimes, List list) {//Вызывается в поустоту nTimes количество раз по рандомным индексам элементы списка лист
        int length = list.size();

        for (int i = 0; i < nTimes; i++) {
            list.get(rnd.nextInt(length));//рандом от нуля до значения = length - 1
        }
    }
}
