package homework_32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import theory_32.Calculator;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.*;

class ShapeCalculatorTest {
    ShapeCalculator shapeCalculator;

    @BeforeEach    // этот метод будет выполняться перед каждым тестовым методом
    public void setUp(){
        shapeCalculator = new ShapeCalculator();
    }

    @Test // это тестовый метод
    @DisplayName("given RWL EqualOne when Result Pi+1 then Return Pi+1") // (RWL -> Radius, Width, Length)
    void totalSquareTest(){
        Shape circle = new Circle(1);
        Shape rectangle = new Rectangle(1,1);

        Shape[] shapes = {circle,rectangle};

        double pi = Math.PI;
        DecimalFormat df = new DecimalFormat("#.00");

        String expected = df.format(pi + 1);
        String actual = df.format(shapeCalculator.totalSquare(shapes));

        assertEquals(expected, actual);// выражение, которое и определяет равенство
        // ожидаемого и фактического значений
    }
}