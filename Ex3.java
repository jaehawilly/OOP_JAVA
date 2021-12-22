import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.print("x값 : ");
            int x = scan.nextInt();
            System.out.print("y값 : ");
            int y = scan.nextInt();
            System.out.println("x * y = " + mul(x, y));
            System.out.println("x / y = " + div(x, y));
        } catch(InputMismatchException e){
            e.printStackTrace();
        } catch(ArithmeticException e){
            e.printStackTrace();
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
    }
    static int mul(int a, int b) {
        return a*b;
    }
    static double div(int a, int b) {
        return (double) a/b;
    }
}
