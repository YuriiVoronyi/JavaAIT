package RazborDZ;

public class ShapeCalculator {
    public double totalSquare( Shape[] shapes){
        double res = 0;

        for(Shape s: shapes){
            res += s.area();
        }

        return res;
    }
    public double totalPerimeter( Shape[] shapes){
        double res = 0;

        for(Shape s: shapes){
            res += s.perimeter();
        }

        return res;
    }
}
