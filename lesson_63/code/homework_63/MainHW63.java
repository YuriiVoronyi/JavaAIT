package homework_63;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MainHW63 {
    public static void main(String[] args) {

        System.out.println("============== Task 1 =================");
        /*
        1. Пусть есть класс BankAccount с полем String IBAN и класс Person c полями name и List< BankAccount >.
        Нужно написать метод, который вернет список IBANs с числами замененными звездочками после 3 третьего
        символа (см. код занятия, practice)
        */
        BankAccount bankAcc1 = new BankAccount("DE71234562457854123");
        BankAccount bankAcc2 = new BankAccount("DE43309569872309456");
        BankAccount bankAcc3 = new BankAccount("DE98764250982734659");
        BankAccount bankAcc4 = new BankAccount("DE08906578906598743");
        BankAccount bankAcc5 = new BankAccount("DE09823987435690879");
        BankAccount bankAcc6 = new BankAccount("DE11234853872345533");
        BankAccount bankAcc7 = new BankAccount("DE09837249756529476");
        BankAccount bankAcc8 = new BankAccount("DE459887562935547982");

        List<BankAccount> bankAccList1 = List.of(bankAcc1,bankAcc2,bankAcc3);
        List<BankAccount> bankAccList2 = List.of(bankAcc4,bankAcc5,bankAcc6);
        List<BankAccount> bankAccList3 = List.of(bankAcc7,bankAcc8);

        Person p1 = new Person("Jhon",bankAccList1);
        Person p2 = new Person("Bob",bankAccList2);
        Person p3 = new Person("Dick",bankAccList3);

        List<Person> personList = new ArrayList<>();
        Collections.addAll(personList,p1,p2,p3);

        List<String> listBankAccStars = getListBankAccStars(personList);
        listBankAccStars.stream()
                .forEach(System.out::println);

        System.out.println("============== Task 2.1 =================");
       /*
        Пусть есть класс Person с полями String name и int age.
        2.1 Написать метод, принимающий лист Persons и возвращающий суммарный возраст тех, кто старше 17 лет
        */
        Person2 pers1  = new Person2("James",2);
        Person2 pers2  = new Person2("Mary",12);
        Person2 pers3  = new Person2("John",17);
        Person2 pers4  = new Person2("Elizabeth",22);
        Person2 pers5  = new Person2("Robert",6);
        Person2 pers6  = new Person2("Jennifer",15);
        Person2 pers7  = new Person2("William",50);
        Person2 pers8  = new Person2("Susan",3);
        Person2 pers9  = new Person2("David",4);
        Person2 pers10 = new Person2("Patricia",36);
        List<Person2>person2s = new LinkedList<>();
        Collections.addAll(person2s,pers1,pers2,pers3,pers4,pers5,pers6,pers7,pers8,pers9,pers10);
        System.out.println(sumOfAgesOlderThan17years(person2s));
        System.out.println("============== Task 2.2 =================");
        /*
        Пусть есть класс Person с полями String name и int age.
        2.2 Написать метод, принимающий лист Persons и возвращающий имена тех, кто старше 17 лет в виде строки.
        Должна быть возвращена строка примерно такого вида:
        In this list John and Peter and Ann are older than 17 (В этом списке Джон и Питер и Анн старше 17 лет)
        */
        System.out.println(getStringsOfNames(person2s));
    }
    public static String getStringsOfNames(List<Person2> parList) {
        List<String> listOfNames = parList.stream()
                .filter(p->17 < p.getAge())
                .map(Person2::getName)
                .collect(Collectors.toList());
        StringBuilder tmpStr = new StringBuilder();
        for (int i = 0; i < listOfNames.size(); i++) {
            tmpStr.append(listOfNames.get(i)).append((i == listOfNames.size() - 1) ? "" : " and ");
        }
        return "In this list " + tmpStr + " are older than 17";
    }
    public static int sumOfAgesOlderThan17years(List<Person2> parList) {
        return parList.stream()
                .map(Person2::getAge)
                .filter(age -> 17 < age)
                .reduce(0, Integer::sum);
    }
    public static List<String> getListBankAccStars(List<Person> listPersons) {
        return listPersons.stream()
                .flatMap(p->p.getBankAccounts().stream().map(ac->replaceWithStars(ac.getIBAN())))
                .collect(Collectors.toList());
    }
    private static String replaceWithStars(String input){
        char[] chars = input.toCharArray();
        for( int i = 3; i < input.length();i++)
            chars[i] = '*';
        return new String(chars);
    }
}
