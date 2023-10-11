package consultation_59;
import java.util.List;
import java.util.stream.Collectors;

public class MainC59 {
    public static void main(String[] args) {
        List<String> names = List.of("Fred", "Semen", "John", "Anna");
        List<Integer> lenghtes = names
                .stream()
                .map(String::length)
                .collect(Collectors.toList());//.toList() заменили на .collect(Collectors.toList());
        System.out.println(lenghtes);
//
        List<Car> cars = List.of(
                new Car("Mercedes", 20_000),
                new Car("Porsche", 50_000),
                new Car("Opel", 15_000),
                new Car("Opel", 15_000)
        );
//    car -> car.getPrice() это то же что Car::getPrice
        List<Double> prices = cars.stream().map(Car::getPrice).collect(Collectors.toList());
        System.out.println(prices);

//    машины до 20000 включительно
        List<Car> cheapCars = cars
                .stream()
                .filter(car -> car.getPrice() < 20_000)
                .collect(Collectors.toList());
        System.out.println(cheapCars);
//    forEach -
        cars.forEach(c -> {
            c.setPrice(c.getPrice() + 2000);
            c.setBrand(c.getBrand().toUpperCase());
        });
        System.out.println(cars);
//    reduce
        Double result = cars
                .stream()
                .map(Car::getPrice)
                .reduce(0.0, (a, b) -> a + b);
        System.out.println(result);

//    limit -
        List<Car> shortListOfCars = cars.stream().limit(2).collect(Collectors.toList());
        System.out.println(shortListOfCars); // первые два
//    skip -
        List<Car> skippedListOfCars = cars.stream().skip(2).collect(Collectors.toList());
        System.out.println(skippedListOfCars); // последний
//    distinct - различающиеся
//    оставляет только уникальные элементы
        List<Car> uniqueCars = cars.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueCars);
//    sorted - отсортированный
        List<Car> sortedCars = cars.stream()
                .sorted((a, b) -> Double.compare(a.getPrice(), b.getPrice()))
                .collect(Collectors.toList());
//    noneMatch - ни одно не удовлетворяет,
//    anyMatch - хотябы одно,
//    allMatch - все удовлетворяют условию
        System.out.println(cars);
        boolean res = cars
                .stream()
                .anyMatch(car -> car.getBrand()
                        .equalsIgnoreCase("Porsche"));

        System.out.println(res);
    }
}
