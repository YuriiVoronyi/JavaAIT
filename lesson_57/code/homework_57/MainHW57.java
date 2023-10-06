package homework_57;

import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MainHW57 {
    public static void main(String[] args) {
    /*
    1. Решить задачу: Конкатинировать числа  a  и  b
    с использованием стандартных функциональных интерфейсов
    */
        System.out.println("=============== Number concatenation =================");
        BiFunction<Integer, Integer, String> numberConcat = (a, b) -> Integer.toString(a) + b;
        System.out.println(numberConcat.apply(9, 5));
    /*
    2. Решить задачу: Если длина строки  = 3  вернуть true  иначе false
    с использованием стандартных функциональных интерфейсов
    */
        System.out.println("=============== Line length equal to three =================");
        Predicate<String> lineLengthEqualToThree = str -> str.length() == 3;
        System.out.println(lineLengthEqualToThree.test("sdfgd"));//false
        System.out.println(lineLengthEqualToThree.test("gfh"));//true

    /*
    3. Решить задачу: Если длина строки четная  вернуть true иначе false
    с использованием стандартных функциональных интерфейсов
    */
        System.out.println("=============== Line length even ============================");
        Predicate<String> lineLengthEven = str -> str.length() % 2 == 0;
        System.out.println(lineLengthEven.test("sdfg"));//true
        System.out.println(lineLengthEven.test("gfh"));//false

    /*
    4. Решить задачу: Вернуть строку в верхнем регистре
    с использованием стандартных функциональных интерфейсов
    */
        System.out.println("=============== Get string in upper case ===================");
        UnaryOperator<String> getStringInUpperCase = str -> str.toUpperCase();
        System.out.println(getStringInUpperCase.apply("Sdfg sdfadf dfgsdfg"));

    /*
    5. Решить задачу: Если длина строки = 4 вернуть четыре звездочки **** иначе вернуть строку без изменений
    с использованием стандартных функциональных интерфейсов
    */
        System.out.println("=============== Get stars or string ===================");
        UnaryOperator<String> getStarsOrString = str -> str.length() == 4 ? "****" : str;
        System.out.println(getStarsOrString.apply("Sdfg sdfadf dfgsdfg"));//Sdfg sdfadf dfgsdfg
        System.out.println(getStarsOrString.apply("Sdfg"));//****
    /*
    6. Решить задачу: Распечатать строку в виде !строка!
    с использованием стандартных функциональных интерфейсов
    */
        System.out.println("=============== Print a string in a specific form ===================");
        UnaryOperator<String> printStringInSpecificForm = str -> "!" + str + "!";
        System.out.println(printStringInSpecificForm.apply("Sdfg sdfadf dfgsdfg"));//!Sdfg sdfadf dfgsdfg!
        System.out.println(printStringInSpecificForm.apply("Sdfg"));//!Sdfg!

    /*
    7. Решить задачу: возвращает  "Hello World"
    с использованием стандартных функциональных интерфейсов
    */
        System.out.println("=============== Get string \"Hello World\" ===================");
        Supplier<String> getString = () -> "Hello World";
        System.out.println(getString.get());

    }
}
