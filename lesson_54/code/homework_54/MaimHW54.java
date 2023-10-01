package homework_54;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MaimHW54 {
    /*
    Пусть есть класс Person c полями name и age. Нужно написать метод, записывающий в файл обьекты
    класса Person в виде строк и одновременно выводящий их на экран
    */
    public static void main(String[] args) {
        Person pol = new Person("Pol",20);
        Person bob = new Person("Bob",34);
        Person adel = new Person("Adel",25);
        Person nika = new Person("Nika",18);

        List<Person> personList = new ArrayList<>();

        personList.add(pol);
        personList.add(bob);
        personList.add(adel);
        personList.add(nika);

        RecordingToFileAndDisplayingOnScreen(personList);

    }
    public static void RecordingToFileAndDisplayingOnScreen(List<Person> parPersonList) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("first.txt"))){
            for (Person p : parPersonList) {
                bufferedWriter.write(p.toString());//Можно + "\n"; тогда следующую строку можно убрать
                bufferedWriter.write(System.lineSeparator());
                System.out.println(p.toString());
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
