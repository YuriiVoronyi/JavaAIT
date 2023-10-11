package timur.gui;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CustomCollectorExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Используем собственный Collector для суммирования элементов
        int sum = numbers.stream().collect(new SumCollector());
        System.out.println("Sum: " + sum);
    }

    // Собственный Collector для суммирования элементов
    static class SumCollector implements Collector<Integer, Integer, Integer> {
        @Override
        public Supplier<Integer> supplier() {
            return () -> 0;
        }

        @Override
        public BiConsumer<Integer, Integer> accumulator() {
            return (sum, element) -> {
                sum = sum + element; // Суммирование элементов
            };
        }

        @Override
        public BinaryOperator<Integer> combiner() {
            return (sum1, sum2) -> sum1 + sum2; // Комбинирование сумм
        }

        @Override
        public Function<Integer, Integer> finisher() {
            return Function.identity();// Окончательное преобразование
        }

        @Override
        public Set<Characteristics> characteristics() {
            return Collections.emptySet();
        }
    }
}
