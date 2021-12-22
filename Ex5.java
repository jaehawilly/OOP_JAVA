public class Ex5 {
    public static void main(String[] args) {
        Calc c=new Calc();
        c.setValue(2,5,'+');
        c.result();
        c.setValue(2,5,'$');
        c.result();
        c.setValue(2,5,'-');
        c.result();
        c.setValue(2,5,'*');
        c.result();
        c.setValue(2,5,'/');
        c.result();
    }
}
class Calc {
    int a,b;
    char c;
    void setValue(int n1, int n2, char op) {
        a=n1;
        b=n2;
        c=op;
    }
    void result() {
        switch (c){
            case '+':System.out.println("result = " + add());break;
            case '-':System.out.println("result = " + sub());break;
            case '*':System.out.println("result = " + mul());break;
            case '/':System.out.println("result = " + div());break;
            default:System.out.println("잘못된 연산자입니다.");
        }
    }
    int add() {
        return a+b;
    }
    int sub() {
        return a-b;
    }
    int mul() {
        return a*b;
    }
    int div() {
        return a/b;
    }
}