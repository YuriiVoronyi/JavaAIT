package homework_43;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class Main43Test {
    private Main43 main;

    @BeforeEach
    public void setUp() {
        main = new Main43();
    }

    @Test
    public void testFindDuplicates() {
        String[] strings = {"apple", "banana", "apple", "cherry", "banana"};
        Map<String, Boolean> result = main.findDuplicates(strings);

        assertNotNull(result);
        assertEquals(3, result.size()); // Ожидается, что в результате будет 3 элемента

        // Проверка значений в результирующей Map
        assertTrue(result.get("apple"));
        assertTrue(result.get("banana"));
        assertFalse(result.get("cherry"));
    }

}