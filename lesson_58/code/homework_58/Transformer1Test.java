package homework_58;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Transformer1Test {
    private Transformer1 transformer1;
    String input;
    WordsTransformerUpperCase wordsTransformerUpperCase = new WordsTransformerUpperCase();
    WordsTransformerLowerCase wordsTransformerLowerCase = new WordsTransformerLowerCase();
    WordTransformerStar wordTransformerStar = new WordTransformerStar();

    @BeforeEach
    public void setUp(){
        transformer1 = new Transformer1();
        input = "aaa BBBB deF vbghR bbb";
    }

    @Test
    public void test4LowerCase(){
        assertEquals("aaa bbbb deF vbghR bbb",transformer1.transformString1(input,wordsTransformerLowerCase));
    }

    @Test
    public void test3ToUpperCase(){
        assertEquals("AAA BBBB DEF vbghR BBB",transformer1.transformString1(input,wordsTransformerUpperCase));
    }

    @Test
    public void test5Stars(){
        assertEquals("aaa BBBB deF ***** bbb",transformer1.transformString1(input,wordTransformerStar));
    }
}