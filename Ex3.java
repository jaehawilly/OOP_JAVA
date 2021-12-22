import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        Circle[] c={ new Circle("Cup",3), new Circle("Apple",4), new Circle("Doughnut",5),
                new Circle("Pizza",7), new Circle("Ball",2)};
        Arrays.sort(c);
        for(int i=0;i<c.length;i++)
            c[i].show();

        int idx=Arrays.binarySearch(c,new Circle("Apple",4));
        System.out.println("Index of " + c[idx].getTitle() + " : " + idx);
    }
}
class Circle implements Comparable{
    private String title;
    private int n;
    public Circle(String title, int n) {
        this.title=title;
        this.n=n;
    }
    public void show() {
        System.out.println(title + " " + n*n*3.14);
    }
    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Object o) {
        Circle c=(Circle) o;
        return this.n-c.n;
    }
}