package homework_45;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DominantElementTest {
    private DominantElement dominantElement;

    @BeforeEach
    void setUp() {
       this.dominantElement = new DominantElement();
    }

    @Test
    public void getDominant() {//Тест на наличие доминантного элемента
        int[] array = {7,7,6,6,7};
        int res = dominantElement.findDominantMerge(array);
        assertEquals(7,res);
    }
    @Test
    public void noDominant() {//Тест на отсутствие доминантного элемента
        int[] array = {7,7,6,6,6,7};
        int res = dominantElement.findDominantMerge(array);
        assertEquals(-1,res);
    }
    @Test
    public void oneElement() {//Тест на массив из одного элемента
        int[] array = {7};
        int res = dominantElement.findDominantMerge(array);
        assertEquals(7,res);
    }
    @Test
    public void emptyArray() {//Тест на пустой массив
        int[] array = {};
        int res = dominantElement.findDominantMerge(array);
        assertEquals(-1,res);
    }
    @Test
    public void bigArray() {//Тест на большой массив
        int[] array = {3,4,5,9,8,2,3,4,0,3,8,4,5,9,8,2,4,3,2,3,4,0,5,7,3,4,4,5,9,7,2,3,4,5,3,9,4,8,2,0,5,3,4,5};
        int res = dominantElement.findDominantMerge(array);
        assertEquals(-1,res);
    }
    @Test
    public void bigArrayResultFour() {//Тест на большой массив с результатом равным 4
        int[] array = {4,4,4,5,9,8,2,4,3,3,4,0,5,4,4,5,9,7,2,3,4,5,3,9,4,8,2,0,5,3,4,5,4,4,4,4,4,4,4,4,4,4,4,4,4};
        int res = dominantElement.findDominantMerge(array);
        assertEquals(4,res);
    }
}