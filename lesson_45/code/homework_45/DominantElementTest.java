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
    public void myTest() {
        int[] array = {7,7,6,6,7};
        int res = dominantElement.findDominantMerge(array);
        assertEquals(7,res);
    }
}