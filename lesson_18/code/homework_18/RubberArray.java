package homework_18;

import java.util.Arrays;
public class RubberArray {
    int[] array;

    public RubberArray() { // конструктор
        this.array = new int[0];
    }
    //*********************************************** ДОМАШНЯЯ РАБОТА ОТ 10.08.23 ********************************
    //Конструктор, принимающий в себя обычный массив и создающий RubberArray с такими де значениями
    public RubberArray(int[] parArray) {
        this.array = new int[parArray.length];
        for (int i = 0; i <= parArray.length - 1; i++ ) {
            this.array[i] = parArray[i];
        }
    }

    public void add(int value) { //добавление 1 элемента
        extractArray();
        array[array.length - 1] = value;
    }

    public void add(int... ints) { // принимает произвольное количество аргументов типа int
        for (int value : ints) {
            add(value);
        }
    }


    public void extractArray() { // расширение массива на 1 ячейку
        array = Arrays.copyOf(array, array.length + 1);
    }

    public void printArray() { // вывести в консоль массив
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print("; ");
            }
        }
        System.out.println("]");
        System.out.println();
    }

    public int size() { // количество элементов в массиве
        return array.length;
    }

    public int sumOfValues() { //сумма значений в массиве
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public int min() { // возвращаем мин значение из массива
        if (array.length == 0) return Integer.MIN_VALUE;

        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public int max() { // возвращаем максимальное значение из массива
        if (array.length == 0) return Integer.MAX_VALUE;

        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public int[] toArray() { // нужно создать КОПИЮ нашего массива и ее вернуть
        int[] result = new int[array.length];

        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }

        return result;
        // return Arrays.copyOf(array, array.length);
    }

    public void deleteByIndex(int index) {
        if (array.length >= 1 && index >=0 && index < array.length) {

            int[] result = new int[array.length - 1];

            for (int i = 0; i < result.length; i++) {

                if (i < index) {
                    result[i] = array[i];
                } else { // if (i >= index) {
                    result[i] = array[i + 1];
                }
            }
//            System.out.println("Result " + Arrays.toString(result));
            array = result;
        }
    }
    //*********************************************** ДОМАШНЯЯ РАБОТА ОТ 10.08.23 ********************************
    public int searchByValue(int parValue) { //Поиск элемента по значению
        for (int i = 0; i <= array.length - 1; i++ ) {
            if (array[i] == parValue) return i;
        }
        return -1;
    }

    public int findingValueByIndex(int parIndex) { //Поиск элемента по индексу
        if ((parIndex < 0) && (array.length-1 < parIndex)) return Integer.MAX_VALUE;
        return array[parIndex];
    }
    public void deleteByValue(int parValue) {//Удаление элемента по значению
        int undexOfVal = searchByValue(parValue);
        if (undexOfVal != -1) {
            deleteByIndex(undexOfVal);
        }
    }
    public void replaceValueByIndex(int parIndex, int parValue) {//Замена значения по индексу
        if (0 <= parIndex || parIndex <= array.length -1) {
            array[parIndex] = parValue;
        }
    }
    public void replaceValueByValue(int parValueOld, int parValueNew) {//Замена старого значения новым
        int undexOfVal = searchByValue(parValueOld);
        if (undexOfVal != -1) {
            replaceValueByIndex(undexOfVal, parValueNew);
        }
    }
}
