public class Ex2 {
    public static void main(String[] args) {
        for(int i=2;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i + "x" + j + "=" + (i*j) + "\t");
            }
            System.out.println();
        }
    }
}