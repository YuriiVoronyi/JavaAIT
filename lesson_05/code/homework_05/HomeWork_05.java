package homework_05;
import java.util.Random;

public class HomeWork_05 {
    public static void main(String[] args) {
        System.out.println("=============== Task 00 =======================");
        /*
        Создайте 10 переменных типа int.
        Присвойте каждой случайное значение от 0 до 20
        Для каждой переменной выведите строку в формате:
        Число: 6 четное: true, кратно 3: true, четное и кратное 3: true
        Число: 3 четное: false, кратно 3: true, четное и кратное 3: false
        (опционально) - учесть, что случайное число может оказаться 0
        */
        Random  random = new Random();
        int var1  = random.nextInt(20);
        int var2  = random.nextInt(20);
        int var3  = random.nextInt(20);
        int var4  = random.nextInt(20);
        int var5  = random.nextInt(20);
        int var6  = random.nextInt(20);
        int var7  = random.nextInt(20);
        int var8  = random.nextInt(20);
        int var9  = random.nextInt(20);
        int var10 = random.nextInt(20);
        System.out.println(outRezult(var1));
        System.out.println(outRezult(var2));
        System.out.println(outRezult(var3));
        System.out.println(outRezult(var4));
        System.out.println(outRezult(var5));
        System.out.println(outRezult(var6));
        System.out.println(outRezult(var7));
        System.out.println(outRezult(var8));
        System.out.println(outRezult(var9));
        System.out.println(outRezult(var10));
        System.out.println("-----------------------------------------");

        System.out.println("=============== Task 01 =======================");
        //Построчно сократить логическое выражения (соблюдая приоритетность операций)
        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println((true | false) | (45 < 70) & false ^ (6 == 5));
        System.out.println((true | false) | false ^ (6 == 5));
        System.out.println((true | false) | false);
        System.out.println(true | false);
        System.out.println(true);
    }
    public static String outRezult(int parVar) {
        String rez = "";
        if (parVar == 0) {
            return "Случайное число равно 0 !!!!!!!!!!!";
        }
        int evenNumber    = parVar % 2;
        int multipleThree = parVar % 3;
        boolean evenNumberYesNo = (0 == evenNumber);
        boolean multipleThreeYesNo = (0 == multipleThree);
        boolean evenNumberAndMultipleThreeYesNo = (evenNumberYesNo && multipleThreeYesNo);
        rez = "Число : " + parVar + " четное : " + evenNumberYesNo + ", кратно 3 : " + multipleThreeYesNo + ", четное и кратное 3 : " + evenNumberAndMultipleThreeYesNo;
        return rez;
    }
}
