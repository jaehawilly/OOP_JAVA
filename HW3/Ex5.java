public class Ex5 {
    public static void main(String[] args){
        for(int i=0;i<6;i++){
            System.out.println("f(" + i + ") = " + functionA(i));
        }
    }
    public static int functionA(int n){
        if(n==0) return 1;
        else return 2*functionA(n-1)+1;
    }
}
