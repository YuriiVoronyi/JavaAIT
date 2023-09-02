package homework_33;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AnimalsTest {
    Animals animal1 = new Animals("Wolf",30,"Grey");
    Animals animal2 = new Animals("Bear",200,"Brown");
    Animals animal3 = new Animals("Fox",10,"Ginger");
    Animals animal4 = new Animals("Elephant",1500,"Green");
    Animals animal5 = new Animals("Anakonda",100,"Yellow");

    @Test
    void testSortedNames() {
        Animals[] actual = {animal1, animal2, animal3, animal4, animal5};
        Animals[] expected = {animal5, animal2, animal4, animal3, animal1};

        Arrays.sort(actual);
        assertArrayEquals(expected,actual);
    }

    @Test
    void testSortedRevers() {
        Animals[] actual1 = {animal1, animal2, animal3, animal4, animal5};//  Wolf    ,Bear,Fox ,Elephant,Anakonda
        Animals[] expected1 = {animal5, animal1, animal2, animal4, animal3};//Anakonda,Wolf,Bear,Elephant,Fox

        Arrays.sort(actual1,new ReversNameComparator());
        assertArrayEquals(expected1,actual1);
    }

    @Test
    void testSortedWeight() {
        Animals[] actual2 = {animal1, animal2, animal3, animal4, animal5};//
        Animals[] expected2 = {animal3, animal1, animal5, animal2, animal4};//10,30,100,200,1500

        Arrays.sort(actual2,new AnimalsWeightComparator());
        assertArrayEquals(expected2,actual2);
    }

    @Test
    void testCompareTo() { assertTrue(animal1.compareTo(animal2) > 0);}
    @Test
    void testCompareToFalse() { assertFalse(animal2.compareTo(animal1) > 0);}
}