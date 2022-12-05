public class Ex3 {
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
class Shape {
    private String name;
    private int x, y;
    public Shape(String name, int x) {
        this.name=name;
        this.x=x;
        this.y=x;
    }
    public Shape(String name, int x, int y) {
        this.name=name;
        this.x=x;
        this.y=y;
    }
    public String getName() {
        return name;
    }
    public double getArea() {
        return x*y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
class Circle extends Shape {
    public Circle(String name, int x) {
        super(name,x);
    }

    @Override
    public double getArea() {
        return getX()*getY()*3.14;
    }
}
class Rectangle extends Shape {
    public Rectangle(String name, int x, int y) {
        super(name,x,y);
    }

    @Override
    public double getArea() {
        return getX()*getY();
    }
}
class Triangle extends Shape {
    public Triangle(String name, int x, int y) {
        super(name,x,y);
    }

    @Override
    public double getArea() {
        return (double) getX()*getY()/2;
    }
}