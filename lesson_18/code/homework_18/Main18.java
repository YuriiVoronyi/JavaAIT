package homework_18;

import java.util.Arrays;

public class Main18 {
    public static void main(String[] args) {
        //        int[] array = new int[2];
//        int var = 10;
//        array[0] = var;
//
//        System.out.println(Arrays.toString(array));
//
//        int var2 = 25;
//        array[1] = 25;
//
//        System.out.println(Arrays.toString(array));
//
//        int var25 = 333;


        // для ДЗ
//        int[] ints = {1, 2, 3, 4, 5};
//        RubberArray rubberArray = new RubberArray(ints);


        RubberArray ra = new RubberArray();


        ra.printArray();
        System.out.println("Min " + ra.min());

        ra.add(10);
        ra.add(25);
        ra.add(-20);

        ra.printArray();

        int raSize = ra.size();
        System.out.println("Сейчас в массиве " + raSize + " элементов");

        System.out.println("Сумма знаний элементов массива " + ra.sumOfValues());

        ra.add(7, 14, -21);

        ra.printArray();

        System.out.println("Min в массиве: " + ra.min());
        System.out.println("Max в массиве: " + ra.max());

        int[] newArray = ra.toArray();

        newArray[0] = 10_000;
        System.out.println(Arrays.toString(newArray));

        ra.printArray();

        ra.deleteByIndex(5);
        ra.printArray();
        System.out.println("**************** ДОМАШНЯЯ РАБОТА ОТ 10.08.23 ************************");
        int[] ints = {1000,222,365,475,541,632,784,874,914,745,965,7845,12,45,3,541,25,88};
        System.out.println("Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими же значениями");
        RubberArray rarr = new RubberArray(ints);
        rarr.printArray();
        System.out.println("удаляем элемент массива по значению 632");
        rarr.deleteByValue(632);
        System.out.println("Получаем массив без 632:");
        rarr.printArray();
        System.out.println("Заменяем элемент массива по индексу 1 числом 3333");
        rarr.replaceValueByIndex(1,3333);
        System.out.println("Получаем массив со значением 3333 по иднексу 1:");
        rarr.printArray();
        System.out.println("Заменяем значение массива 88 на 101:");
        rarr.replaceValueByValue(88, 101);
        rarr.printArray();


    }
}
