package theory_64.practice_2Dim;

public class MainP2D {
    public static void main(String[] args) {
        //1.Написать метод, находящий сумму всех значений заданного подмассива n двумерного массива целых чисел.

        int[][] table = { {1,4,-5},{-1,-1,-1,2,1},{-1,10}};
        System.out.println("sum of 2 subarray " + findSumOfNsubArray(table,2));

    }
    public static int findSumOfNsubArray( int[][]ints, int n){

        int sum = 0;

        for( int i = 0; i < ints[n].length;i++){

            sum += ints[n][i];
        }
        return sum;
    }
}
