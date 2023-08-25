package homework_28;

public class Main28 {
    public static void main(String[] args) {
        System.out.println("================= Task 1 ==========================");
        /*
         Создать интерфейс Shape,содержащих методы для подсчета площади и периметра фигуры
         и классы прямоугольник и круг, реализующие этот интерфейс.
         В методе main создать несколько фигур и вывести на печать площадь и периметр каждой.
         Написать метод, вычисляющий общую площадь фигур нескольких видов, т.е. если площадь
         прямоугольника = 100, круга = 50, то общая площадь 150
         */
        Circle circle = new Circle(50);
        Rectangle rec = new Rectangle(15, 40);

        System.out.println("Area of circle = " + circle.getArea());
        System.out.println("Area of rectangle = " + rec.getArea());

        System.out.println("Perimeter of circle = " + circle.getPerimeter());
        System.out.println("Perimeter of rectangle = " + rec.getPerimeter());

        System.out.println("Sum of area of circle and rectangle = " + getSum(circle, rec));
    }
    public static double getSum(Circle circle, Rectangle rec) {
        return circle.getArea() + rec.getArea();
    }
}
