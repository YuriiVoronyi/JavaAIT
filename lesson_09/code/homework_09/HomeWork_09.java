package homework_09;
import java.util.Arrays;
import java.util.Random;

public class HomeWork_09 {
    public static void main(String[] args) {
        System.out.println("************************** Task 0 ***********************************");
        /*
        Дан массив целых чисел. *Выберите произвольную длину. Заполните случайными значениями.
        Вывести на экран:
        минимальное значение, хранящееся в массиве максимальное
        среднее арифметическое всех значений в массиве
        */
        int[] origArray = new int[6];
        createArray(origArray);//Для создания массива, в функцию передаем массив по ссылке
        System.out.println("Имеем следующий массив: " + Arrays.toString(origArray));
        int[] copyOfArray = Arrays.copyOf(origArray,origArray.length);
        Arrays.sort(copyOfArray);
        System.out.println("Минимальное значение массива: " + copyOfArray[0] + ", максимальное : " + copyOfArray[5]);
        int ii = 0;
        double summ = 0;
        while (ii <= 5) {
            summ += copyOfArray[ii];
            ii++;
        }
        System.out.println("Сумма всех элементов массива = " + summ);
        //Выводим среднее арифметическое и округляем до двух знаков после запятой.
        System.out.println("Среднее арифмемтическое всех значений массива = " + roundToTwoDecimalPlaces(summ/6));

        System.out.println("*********************************** Task 1 *********************************");
        /*
        Дан массив целых чисел. Поменять местами элемент с максимальным и минимальным значением
        Пример: { 5, 6, -25, 0, 31, -15 }  ->  { 5, 6, 31, 0, -25, -15}
        */
        int[] intArray = new int[8];
        createArray(intArray);//Для создания массива, в функцию передаем массив по ссылке
        System.out.println("Имеем следующий массив до обработки: " + Arrays.toString(intArray));
        int maxVal = intArray[0];
        int minVal = intArray[0];
        int indexOfMaxVal = 0;
        int indexOfMinVal = 0;
        int iii = 0;
        while (iii <= intArray.length-1) {
            //Ищем максимальный элемент массива и его индекс
            if (maxVal < intArray[iii]) {
                maxVal = intArray[iii];
                indexOfMaxVal = iii;
            }
            //Ищем минимальный элемент массива и его индекс
            if (intArray[iii] < minVal) {
                minVal = intArray[iii];
                indexOfMinVal = iii;
            }
            iii++;
        }
        System.out.println("Под индексом: " + indexOfMinVal + " находится минимальное значение: " + minVal + " массива!");
        System.out.println("Под индексом: " + indexOfMaxVal + " находится максимальное значение: " + maxVal + " массива!");
        //Выполняем замену в массиве
        intArray[indexOfMaxVal] = minVal;
        intArray[indexOfMinVal] = maxVal;
        System.out.println("После обмена имеем массив: " + Arrays.toString(intArray));

        System.out.println("*********************************** Task 2 *********************************");
        /*
        Дан массив строк. Вывести на экран все символы из самой длинной строки массива
        { “One”, “Two”, “Twenty” } -->
            T
            w
            e
            n
            t
            y
        */
        String[] origStrArray = { "One", "Two", "Twenty" };
        System.out.println("Имеем следующий массив: " + Arrays.toString(origStrArray));
        String valOfStr = "";
        int currLen = 0;
        int maxLen = 0;
        int currIndex = 0;
        while (currIndex <= origStrArray.length-1) { //Перебираем в цикле элементы массива
            currLen = origStrArray[currIndex].length(); //Берем длину текущего элемента массива
            if (maxLen < currLen) {                  //По условию ищем элемент массива с наибольшей длинной
                valOfStr = origStrArray[currIndex];  //В переменную valOfStr попадет значение элемента, у которого мах.длина
                maxLen = currLen;                    //В переменную maxLen попадет значение максимальной длины
            }
            currIndex++;
        }
        System.out.println("Самый длинный элемент массива: ");
        int indx = 0;
        while (indx  <=  valOfStr.length()-1) {
//            System.out.println(valOfStr.substring(indx, indx+1));
            System.out.println(valOfStr.charAt(indx));   //Вместо substring() используем charAt()
            indx++;
        }
    }
    public static void createArray(int[] parArray) {
        Random random = new Random();
        int i = 0;
        int currVal;
        while (i <= parArray.length-1) {
            currVal = random.nextInt(1000);
            currVal *= (currVal % 2 ==0) ? (-1) : 1;//Разнообразим массив, добавляем минуса если из рандома пришло четное
            parArray[i] = currVal;
            i++;
        }
    }
    public static double roundToTwoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }
}
