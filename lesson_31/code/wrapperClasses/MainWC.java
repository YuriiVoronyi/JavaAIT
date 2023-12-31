package wrapperClasses;

public class MainWC {
    //  классы-обертки Wrapper Classes
    /*
    int,     long, float, double, short, boolean, byte, char
    Integer  Long, Float  Double  Short  Boolean  Byte  Character

    пробразование примитивных типов в обертки:
    1. используя конструктор
     */
    public static void main(String[] args) {
        Integer one = new Integer(1);
        System.out.println(one);

        // 2.  метод valueOf()
        Integer dva = Integer.valueOf(2);
        System.out.println(dva);

        int dvaPrimitive  =  dva.intValue();
        System.out.println(dvaPrimitive);

        // autoboxing and unboxing

        Integer five = 5; // autoboxing

        Integer six = new Integer(6);
        int res = getSquare(six);
        System.out.println(res);

        for( Integer i = 0; i < 10; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println(Integer.parseInt("12345") + 1);

        Integer value = Integer.valueOf(128);
        Integer value1 = Integer.valueOf(128);
        System.out.println(value.equals(value1));

        Integer value2 = Integer.valueOf(127);
        Integer value3 = Integer.valueOf(127);
        System.out.println(value2 == value3);
    }

    public static int getSquare( int i){ //unboxing
        return i*i;
    }

}
