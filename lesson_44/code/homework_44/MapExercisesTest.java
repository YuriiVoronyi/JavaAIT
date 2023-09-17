package homework_44;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapExercisesTest {
    private MapExercises mapExercises;

    @BeforeEach
    public void init() {
        mapExercises = new MapExercises();
    }

    @Test
    public void returnsListOfAnagrams() {
        List<String> stringList = Arrays.asList("tsarinki", "sanktiri", "kristian", "nikitras", "kristina", "pyfnc", "kmduvvwq", "yagmowxt", "listen");
        String name = "kristina";
        List<String> res = mapExercises.findAnagrams(name, stringList);

        assertEquals(5,res.size());

        assertFalse(res.contains("listen"));
        assertFalse(res.contains("yagmowxt"));
        assertFalse(res.contains("kmduvvwq"));
        assertFalse(res.contains("pyfnc"));

        assertTrue(res.contains("kristina"));
        assertTrue(res.contains("nikitras"));
        assertTrue(res.contains("kristian"));
        assertTrue(res.contains("sanktiri"));
        assertTrue(res.contains("tsarinki"));
    }
    @Test
    public void returnsAnEmptyListOfAnagrams() {
        List<String> stringList = Arrays.asList("pyfnc", "kmduvvwq", "yagmowxt", "listen");
        String name = "kristina";
        List<String> res = mapExercises.findAnagrams(name, stringList);
        assertTrue(res.isEmpty());
    }
    @Test
    public void testWithDifferentRegisters() {
        List<String> stringList = Arrays.asList("kriStina", "nikitraS", "kRistian", "sAnktiri","tsariNki");
        String name = "kristina";
        List<String> res = mapExercises.findAnagrams(name, stringList);

        assertFalse(res.contains("kriStina"));
        assertFalse(res.contains("nikitraS"));
        assertFalse(res.contains("kRistian"));
        assertFalse(res.contains("sAnktiri"));
        assertFalse(res.contains("tsariNki"));
    }
}