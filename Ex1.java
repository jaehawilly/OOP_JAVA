public class Ex1 {
    public static void main(String[] args) {
        int n1=0, n2=0;
        for(int i=1;i<=100;i++){
            if(i%8==0 && i%9==0) break;
            else if(i%8==0) n1++;
            else if(i%9==0) n2++;
        }
        System.out.println("8의 배수 :" + n1 + "개");
        System.out.println("9의 배수 :" + n2 + "개");
    }
}