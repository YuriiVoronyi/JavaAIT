package homework_33;

import homework_35.Animals;
import homework_35.AnimalsWeightComparator;
import homework_35.ReversNameComparator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {
    homework_35.Animals animal1 = new homework_35.Animals("Wolf",30,"Grey");
    homework_35.Animals animal2 = new homework_35.Animals("Bear",200,"Brown");
    homework_35.Animals animal3 = new homework_35.Animals("Fox",10,"Ginger");
    homework_35.Animals animal4 = new homework_35.Animals("Elephant",1500,"Green");
    homework_35.Animals animal5 = new homework_35.Animals("Anakonda",100,"Yellow");

    @Test
    void testSortedNames() {
        homework_35.Animals[] actual = {animal1, animal2, animal3, animal4, animal5};
        homework_35.Animals[] expected = {animal5, animal2, animal4, animal3, animal1};

        Arrays.sort(actual);
        assertArrayEquals(expected,actual);
    }

    @Test
    void testSortedRevers() {
        homework_35.Animals[] actual1 = {animal1, animal2, animal3, animal4, animal5};//  Wolf    ,Bear,Fox ,Elephant,Anakonda
        homework_35.Animals[] expected1 = {animal5, animal1, animal2, animal4, animal3};//Anakonda,Wolf,Bear,Elephant,Fox

        Arrays.sort(actual1,new ReversNameComparator());
        assertArrayEquals(expected1,actual1);
    }

    @Test
    void testSortedWeight() {
        homework_35.Animals[] actual2 = {animal1, animal2, animal3, animal4, animal5};//
        Animals[] expected2 = {animal3, animal1, animal5, animal2, animal4};//10,30,100,200,1500

        Arrays.sort(actual2,new AnimalsWeightComparator());
        assertArrayEquals(expected2,actual2);
    }

    @Test
    void testCompareTo() { assertTrue(animal1.compareTo(animal2) > 0);}
    @Test
    void testCompareToFalse() { assertFalse(animal2.compareTo(animal1) > 0);}
}