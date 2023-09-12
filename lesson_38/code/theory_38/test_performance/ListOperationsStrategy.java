package theory_38.test_performance;

import java.util.List;

public interface ListOperationsStrategy {//Это наша стратегия
    //Здесь три абстрактных метода
    void append(int nTimes);//Проверяем Метод добавляющий что-то количество раз

    List getFilledList(int length);//Лист из которого нам надо что-то достать

    void get(int nTimes, List list);//Проверяем метод гет сколько раз и откуда
}
