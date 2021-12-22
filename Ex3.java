public class Ex3 {
    public static void main(String[] args) {
        char a='e';
        int n=a-97;
        for(int i=n+1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)('a'+j));
            }
            System.out.println();
        }
    }
}