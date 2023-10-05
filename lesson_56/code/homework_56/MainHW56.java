package homework_56;

public class MainHW56 {
    /*
    Используя наши интерфейсы написать такие лямбда- выражения:
    1. Конкатинировть числа  a  и  b
           пример  1 и 2 -> 12

     2. Если длина строки  = 3  вернуть true  иначе false
     3. Если длина строки четная  вернуть true  иначе false
     4. Вернуть строку в верхнем регистре
     5. Если длина строки = 4 вернуть четыре звездочки **** иначе вернуть строку без изменений
     6. Распечатать строку в виде !строка!
     7. возвращает  "Hello World"

     */
    public static void main(String[] args) {
        /*
        3. Если длина строки четная  вернуть true  иначе false
        */
        Checkable checkable = str -> str.length() % 2 == 0;
        System.out.println(checkable.check("abc"));// false
        System.out.println(checkable.check("abcd"));// true

        /*
        4. Вернуть строку в верхнем регистре
        */
        Transformable transformable = str -> str.toUpperCase();
        System.out.println(transformable.modify("asdc vfbg gnhb"));

        /*
        5. Если длина строки = 4 вернуть четыре звездочки **** иначе вернуть строку без изменений
        */
        Transformable transform = strr -> strr.length() == 4 ? "****" : strr;
        System.out.println(transform.modify("asdc"));
        System.out.println(transform.modify("asdcr ertert"));

        /*
        6. Распечатать строку в виде !строка!
        */
        Transformable tran = strrr -> "!" + strrr + "!";
        System.out.println(tran.modify("asdc"));

        /*
        7. возвращает  "Hello World"
        */
        Printable prin = st -> System.out.println("Hello World");
        prin.print("");

    }
}
