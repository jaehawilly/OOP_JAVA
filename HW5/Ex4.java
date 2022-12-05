public class Ex4 {
    public static void main(String[] args) {
        Circle a=new Circle(2,3,30);
        Circle b=new Circle(5);
        Circle c=new Circle(2,3);

        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        System.out.println("원 c : " + c);

        if(a.equals(b))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
        if(a.equals(c))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
    }
}

class Circle {
    private int x, y, rad;

    Circle(int x, int y, int rad) {
        this.x=x;
        this.y=y;
        this.rad=rad;
    }
    Circle(int rad) {
        this.rad=rad;
        this.x=0;
        this.y=0;
    }
    Circle(int x, int y) {
        this.x=x;
        this.y=y;
        this.rad=5;
    }
    public String toString() {
        return "Circle(" + x + "," + y + ") 반지름" + rad;
    }
    public boolean equals(Circle c) {
        if(x==c.x && y==c.y) return true;
        else return false;
    }
}
