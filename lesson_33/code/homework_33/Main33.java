package homework_33;

import java.util.Arrays;

public class Main33 {
    public static void main(String[] args) {
        Animals animal1 = new Animals("Wolf",30,"Grey");
        Animals animal2 = new Animals("Bear",100,"Brown");
        Animals animal3 = new Animals("Fox",10,"Ginger");
        Animals animal4 = new Animals("Elephant",1500,"Green");
        Animals animal5 = new Animals("Anakonda",100,"Yellow");

        Animals[] animals = {animal1,animal2,animal3,animal4,animal5};
        System.out.println("Before sort");
        for (Animals animal: animals) {
            System.out.println(animal);
        }
        System.out.println();
        System.out.println("Sort by animal's name:");
        Arrays.sort(animals);
        for (Animals animal: animals) {
            System.out.println(animal);
        }
        System.out.println();
        System.out.println("Sort by animal's weight:");
        Arrays.sort(animals,new AnimalsWeightComparator());
        for (Animals animal: animals) {
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
