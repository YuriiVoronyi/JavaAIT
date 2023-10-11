package homework_60;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MainHW60 {

    public static void main(String[] args) {
        /*
    Task2
    Написать метод, принимающий лист имен и возвращающий лист этих имен без повторений.
    В решении необходимо использовать стримы.
         */
        List<String> names = List.of("Fred", "Semen", "Bob", "John", "Anna", "Nikol", "Bob", "Anna", "Fred");
        System.out.println(getListOfUniqueNames(names));

        /*
    Task3
    Написать метод, принимающий список Person ( Person - класс из задачи 1) и возвращающий мапу,
    где возраст является ключом, а лист людей этого возраста значением.
    В решении необходимо использовать стримы.
         */
        Address adr1 = new Address("Вокзальная",20);
        Address adr2 = new Address("Набережная",18);
        Address adr3 = new Address("Колхозная",88);
        Address adr4 = new Address("Почтовая",14);
        Address adr5 = new Address("Луговая",73);
        Address adr6 = new Address("Ореховая",5);

        Person pers1 = new Person("Николай",23,adr1);
        Person pers2 = new Person("Виктор",12,adr2);
        Person pers3 = new Person("Сергей",36,adr3);
        Person pers4 = new Person("Виталий",12,adr4);
        Person pers5 = new Person("Антон",36,adr5);
        Person pers6 = new Person("Геннадий",23,adr6);

        List<Person> persons = List.of(pers1, pers2, pers3, pers4, pers5, pers6);
        System.out.println(namesByAge(persons));
    }

    public static List<String> getListOfUniqueNames(List<String> parNames) {
        return parNames.stream()
                .distinct() //возвращаем уникальные элементы
                .collect(Collectors.toList());
    }
    public static Map<Integer, Set<Person>> namesByAge(List<Person> parPersons) {
        return parPersons.stream()
                .collect(Collectors.groupingBy(Person::getAge,Collectors.toSet()));//группируем по возрасту
    }
}
