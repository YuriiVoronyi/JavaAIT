package homework_49;

import java.util.ArrayDeque;
import java.util.List;

public class MainHW49 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        //List<Integer> numbers = List.of(2, 5, 18, 70);
        int N = 20;
        boolean result = findingTheProductOfTwoNumbers(numbers, N);
        System.out.println("Is there a pair of factors whose product is : " + N + " : " + result); //
    }
    public static boolean findingTheProductOfTwoNumbers(List<Integer> numbers, int parNum) {
        ArrayDeque<Integer> deque = new ArrayDeque<>(numbers);

        while (!deque.isEmpty() && deque.size() >= 2) {
            int curRes = deque.getFirst() * deque.getLast();

            if (curRes == parNum) {
                return true;
            } else if (curRes > parNum) {
                // Сдвигаем влево правый указатель, чтобы уменьшить произведение
                System.out.println(""+curRes+", срезал СПРАВА");
                deque.removeLast();
            } else {
                // Сдвигаем в право левый указатель, чтобы увеличить произведение
                System.out.println(""+curRes+", срезал СЛЕВА");
                deque.removeFirst();
            }
        }
        return false;
    }
}
