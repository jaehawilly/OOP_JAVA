public class Ex4 {
    public static void main(String[] args) {
        Circle c1=new Circle("Pizza",0);
        Circle c2=new Circle("donut",0);
        Circle c3=new Circle("hamburger",0);

        c1.setRad(12);
        c2.setRad(-2);
        c3.setRad(7);

        c1.show();
        c2.show();
        c3.show();
        String maxCircle;
        if(c1.getArea()<c2.getArea()){
            if(c2.getArea()<c3.getArea())
                System.out.println("가장 큰 면적은 " + c3.getName());
            else
                System.out.println("가장 큰 면적은 " + c2.getName());
        }
        else{
            if(c1.getArea()<c3.getArea())
                System.out.println("가장 큰 면적은 " + c3.getName());
            else
                System.out.println("가장 큰 면적은 " + c1.getName());
        }
    }
}
class Circle {
    private double radius;
    private String name;
    public Circle(String n, double r) {
        name=n;
        radius=r;
    }
    void setRad(double rad) {
        this.radius=rad;
    }
    String getName() {
        return name;
    }
    double getArea() {
        if(radius>=0) {
            return radius * radius * 3.14;
        }
        return 0;
    }
    void show() {
        System.out.println(getName() + "넓이 : " + getArea());
    }
}