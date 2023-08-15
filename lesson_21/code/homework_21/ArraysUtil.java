package homework_21;
public class ArraysUtil {
    // Метод линейного поиска элемента в массиве
    // осуществляется перебором всех элементов и сравниванием с искомым значением
    public static int linearSearch(int[] array, int searchValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                return i;
            }
        }
        return -1;
    }
    // Метод ищет минимальное значения по всему массиву и
    // возвращает индекс min значения
    private static int minIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    // Метод ищет минимальное значения от стартового индекса до конца массива
    // и возвращает индекс min значения
    private static int minIndex(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    // добавление еще большей гибкости в метод поиска минимума.
//    private static int minIndex(int[] arr, int startIndex, int endIndex) {
//        int min = arr[startIndex];
//        int minIndex = startIndex;
//        for (int i = startIndex; i < endIndex; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//                minIndex = i;
//            }
//        }
//        return minIndex;
//    }
    public static void printArray(int[] array) { // Дописать метод для выведения массива в консоль.
        System.out.print("[");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i]);
            System.out.print((i < array.length - 1) ? "; " : "" );
        }
        System.out.println("]");
        System.out.println();
    }
    public static void sortSelection(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int localMin = minIndex(array, i);
            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;
        }
    }
    //Бинарный поиск значения в массиве
    public static int binarySearch(int[] array, int searchValue){
        int startIndex = 0;  // 0
        int endIndex = array.length -1; // 12
        int middleIndex;

        int counter = 0;

        //проверка, что часть массива можно разделить пополам
        while (startIndex <= endIndex) {
            counter++;
            // вычисление индекса середины части массива, в которой производим поиск
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            // сравниваем значение в середине с искомым
            if (array[middleIndex] == searchValue) {
                System.out.println("Найден за " + counter + " шагов");
                return middleIndex;
            }
            // Если значения не равны - определяем какую половину массива мы отбросим
            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex -1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        // если цикл while закончен (не осталось частей массива, которые можно поделить пополам
        // значит искомое значение в массиве отсутствует
        System.out.println("Ничего не найдено! Шагов сделано: " + counter);
        System.out.println("startIdx: " + startIndex + " endIdx: " + endIndex);
        return -1;
    }
}
