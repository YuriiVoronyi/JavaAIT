package homework_59;

import java.util.ArrayList;
import java.util.List;

public class MainHW59 {
    /*
    Есть класс Address с полями String street и int houseNumber и класс Person
    с полями String name, int age , Address address. Написать метод,принимающий
    лист Persons и печатающий адреса тех из них, кто старше 17 лет
    */
    public static void main(String[] args) {

        MainHW59 myObject = new MainHW59();

        Address adr1 = new Address("Вокзальная",20);
        Address adr2 = new Address("Набережная",13);
        Address adr3 = new Address("Колхозная",88);
        Address adr4 = new Address("Почтовая",14);
        Address adr5 = new Address("Луговая",73);
        Address adr6 = new Address("Ореховая",5);

        Person pers1 = new Person("Николай",23,adr1);
        Person pers2 = new Person("Виктор",14,adr2);
        Person pers3 = new Person("Сергей",36,adr3);
        Person pers4 = new Person("Виталий",12,adr4);
        Person pers5 = new Person("Антон",45,adr5);
        Person pers6 = new Person("Геннадий",10,adr6);

        List<Person> persons = new ArrayList<>();
        persons.add(pers1);
        persons.add(pers2);
        persons.add(pers3);
        persons.add(pers4);
        persons.add(pers5);
        persons.add(pers6);

        myObject.printByAgeFilter(persons);
    }
    public void printByAgeFilter(List<Person> pers) {
        pers.stream()
                .filter(Person -> Person.age > 17)
                .forEach(System.out::println);
    }
}
