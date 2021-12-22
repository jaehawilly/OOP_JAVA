public class Ex2 {
    public static void main(String[] args) {
        Shape[] arr = { new Circle("Circle", 5),
                new Rectangle("Rectangle", 3, 4),
                new Triangle("Triangle", 5, 5)
        };

        double sum = 0;
        for (Shape a : arr) {
            System.out.println(a.getName() + "면적 : " + a.getArea());
            sum += a.getArea();
        }
        System.out.println("면적의 합 : " + sum);
    }
}
abstract class Shape {
    private String shape;
    Shape(String shape) {
        this.shape=shape;
    }
    public String getName() { return shape; }
    public abstract double getArea();
}
class Circle extends Shape {
    private int x;
    Circle(String shape, int x) {
        super(shape);
        this.x=x;
    }
    @Override
    public double getArea() { return x*x*3.14; }
}
class Rectangle extends Shape {
    private int x, y;
    Rectangle(String shape, int x, int y) {
        super(shape);
        this.x=x;
        this.y=y;
    }
    @Override
    public double getArea() { return x*y; }
}
class Triangle extends Shape {
    private int x, y;
    Triangle(String shape, int x, int y) {
        super(shape);
        this.x=x;
        this.y=y;
    }
    @Override
    public double getArea() { return (double) x*y/2; }
}