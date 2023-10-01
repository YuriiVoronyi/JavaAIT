package theory_54.homework54;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class MainHMW54Test {
    @Test
    public void testReadIntoString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb = sb.append("aaa")
                .append(System.lineSeparator())
                .append("bbbbbbbbbb")
                .append(System.lineSeparator())
                .append("cc")
                .append(System.lineSeparator());
        String expected = new String(sb);
        assertEquals(expected,MainHMW54.readIntoString("input.txt"));

    }

}