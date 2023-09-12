package theory_38.linkedlist_implementation;

public interface OurList <E> extends Iterable<E>{
    void append(E o);//Добавление объекта типа Е

    E get(int index);//Получение объекта типа Е по индексу

    void set(E o, int index);//Устанавливаем объект типа Е по индексу

    int size();//Получаем размер нашего листа

    boolean contains(E o);//Проверка - содержится ли в нашем листе этот объект

    boolean remove(E o);//Возвращает подтверждение или отрицание удаления объекта из списка

    E removeById(int index);//Удаляет объект по индексу
}
