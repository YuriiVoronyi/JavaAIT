package RazborDZ;

public class MainAppl {
        /*
    Задача1
    Создать интерфейс Shape,содержащий методы для подсчета площади и периметра фигуры и
    классы прямоугольник и круг, реализующие этот интерфейс.

    В методе main создать несколько фигур и вывести на печать площадь и периметр каждой.
    Написать метод, вычисляющий общую площадь фигур нескольких видов, т.е.
    если площадь прямоугольника = 100, круга = 50, то общая площадь 150, а также
    вычисляющий общий периметр фигур нескольких видов, т.е.
    если периметр прямоугольника = 150, круга = 100, то общий периметр 250
     */
        public static void main(String[] args) {
            System.out.println("\n=========================================");
            Shape circle = new Circle(10);
            Shape rectangle = new Rectangle(10,10);
            Shape[] shapes = {circle,rectangle};
            ShapeCalculator shapeCalculator = new ShapeCalculator();

            System.out.println("Circle perimeter = " + circle.perimeter());
            System.out.println("Rectangle perimeter = " + rectangle.perimeter());
            System.out.println("totalPerimeter = " + shapeCalculator.totalPerimeter(shapes));
            System.out.println("\n=========================================");
            System.out.println("Circle area = " + circle.area());
            System.out.println("Rectangle area = " + rectangle.area());
            System.out.println("totalSquare = " + shapeCalculator.totalSquare(shapes));

        }
}
