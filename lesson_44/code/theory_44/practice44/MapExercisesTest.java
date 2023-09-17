package theory_44.practice44;
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
    public void stringBooleanTestSeveral() {
        String[] words = new String[]{"a", "b", "a", "c", "b"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", true);
        expected.put("c", false);

        assertEquals(expected, mapExercises.findTrueFalse1(words));
        assertEquals(expected, mapExercises.findTrueFalse2(words));
    }

    @Test
    public void stringBooleanTestSame() {
        String[] words = new String[]{"c", "c", "c", "c"};
        Map<String, Boolean> expected = new HashMap<>();

        expected.put("c", true);

        assertEquals(expected, mapExercises.findTrueFalse1(words));
        assertEquals(expected, mapExercises.findTrueFalse2(words));
    }


    @Test
    public void stringBooleanTestAllFalse() {
        String[] words = new String[]{"a", "b", "c"};
        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", false);
        expected.put("b", false);
        expected.put("c", false);

        assertEquals(expected, mapExercises.findTrueFalse1(words));
        assertEquals(expected, mapExercises.findTrueFalse2(words));
    }

    @Test
    public void nameToNumberTest_2() {
        List<String> input = Arrays.asList("John", "Mary", "Peter", "John");

        assertEquals(2, mapExercises.nameToNumberOccurence(input, "John"));
    }


    @Test
    public void nameToNumberTest_1() {
        List<String> input = Arrays.asList("John", "Mary", "Peter", "John");

        assertEquals(1, mapExercises.nameToNumberOccurence(input, "Peter"));
    }


    @Test
    public void nameToNumberTest_0() {
        List<String> input = Arrays.asList("John", "Mary", "Peter", "John");

        assertEquals(0, mapExercises.nameToNumberOccurence(input, "Bill"));
    }

    @Test
    public void nameToNumberTest_onlyTwoJohns() {
        List<String> input = Arrays.asList("John", "John");

        assertEquals(2, mapExercises.nameToNumberOccurence(input, "John"));
    }
    //=================================================
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