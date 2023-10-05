package theory_55.practice55;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class MainP55Test {
    @Test
    public void testSum(){
        assertEquals(15,MainP55.findSum("inputInt.txt"));
    }

    @Test
    public void testLongest(){
        File fileName = new File("input.txt");
        assertEquals("bbbbbbbbbb",MainP55.findLongestLine(fileName));
    }
}