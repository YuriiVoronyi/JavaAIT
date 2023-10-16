package homework_64;

public class MainHW64 {
    public static void main(String[] args) {
        System.out.println("============= Task 2 ====================");
        /*
        2. Написать метод, принимающий двумерный массив целых чисел и
        выводящий на экран номер строки (подмассива), сумма всех элементов которого рана нулю
        int[][] table = { {1,4,-5},{-1,-1,-1,2,1},{-1,10}} -> 0,1
        */
        int[][] table = { {1,4,-5},{-1,-1,-1,2,1},{-1,10}};
        System.out.println(getLineNumber(table));

        System.out.println("============= Task 3 ====================");
        /*
        3. Написать метод, принимающий двумерный массив целых чисел и возвращающий
        количество строк( подмассивов), в которых нет отрицательных элементов
        int[][] table = { {1,4,5},{-1,-1,-1,2,1},{-1,10}} -> 1
        */
        int[][] table2 = { {1,4,5},{-1,-1,-1,2,1},{1,10}};
        System.out.println(getNumberOfRows(table2));

        System.out.println("============= Task 4 ====================");
        /*
        4. Написать метод, принимающий двумерный массив целых чисел и возвращающий
        количество четных чисел в нем int[][] table = { {3,4,5},{6,7},{3,10}} -> 3
        */
        int[][] table3 = { {3,4,5},{6,7},{3,10}};
        System.out.println(getTheNumberOfEvenNumbers(table3));
    }
    public static String getLineNumber(int [][] parArr) {
        String resStr = "";
        int count = 0;
        for (int i = 0; i < parArr.length; i++) {
            int sum = 0;
            for (int j = 0; j < parArr[i].length; j++) {
                sum += parArr[i][j];
            }
            resStr = resStr + ((sum == 0) ? ((i == 0) ? "" : ",") + i : "");
        }
        return resStr;
    }
    public static int getNumberOfRows(int [][] parArr) {
        int count = parArr.length;
        for (int i = 0; i < parArr.length; i++) {
            int marker = 0;
            for (int j = 0; j < parArr[i].length; j++) {
                marker = (parArr[i][j] < 0) ? 1 : marker;
            }
            count = count - marker;
        }
        return count;
    }
    public static int getTheNumberOfEvenNumbers(int [][] parArr) {
        int amount = 0;
        for (int i = 0; i < parArr.length; i++) {
            for (int j = 0; j < parArr[i].length; j++) {
                amount += (parArr[i][j] % 2 == 0) ? 1 : 0;
            }
        }
        return amount;
    }
}
