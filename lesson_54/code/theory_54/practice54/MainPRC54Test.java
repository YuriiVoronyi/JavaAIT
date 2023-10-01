package theory_54.practice54;
import org.junit.jupiter.api.Test;

import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

class MainPRC54Test {
    @Test
    public void testSum(){
        assertEquals(15,MainPRC54.findSum("inputInt.txt"));
    }

    @Test
    public void testLongest(){
        File fileName = new File("input.txt");
        assertEquals("bbbbbbbbbb",MainPRC54.findLongestLine(fileName));
    }
}