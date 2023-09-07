package homework_33;

import homework_35.Animals;
import homework_35.AnimalsWeightComparator;
import homework_35.ReversNameComparator;

import java.util.Arrays;

public class Main33 {
    public static void main(String[] args) {
        homework_35.Animals animal1 = new homework_35.Animals("Wolf",30,"Grey");
        homework_35.Animals animal2 = new homework_35.Animals("Bear",100,"Brown");
        homework_35.Animals animal3 = new homework_35.Animals("Fox",10,"Ginger");
        homework_35.Animals animal4 = new homework_35.Animals("Elephant",1500,"Green");
        homework_35.Animals animal5 = new homework_35.Animals("Anakonda",100,"Yellow");

        homework_35.Animals[] animals = {animal1,animal2,animal3,animal4,animal5};
        System.out.println("Before sort");
        for (homework_35.Animals animal: animals) {
            System.out.println(animal);
        }
        System.out.println();
        System.out.println("Sort by animal's name:");
        Arrays.sort(animals);
        for (homework_35.Animals animal: animals) {
            System.out.println(animal);
        }
        System.out.println();
        System.out.println("Sort by animal's weight:");
        Arrays.sort(animals,new AnimalsWeightComparator());
        for (homework_35.Animals animal: animals) {
            System.out.println(animal);
        }
        System.out.println();
        System.out.println("Sort by last letter in animal's name:");
        Arrays.sort(animals,new ReversNameComparator());
        for (Animals animal: animals) {
            System.out.println(animal);
        }
    }
}
