import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random rand=new Random();
        int[] num=new int[100];
        int[] counter=new int[10];

        for(int i=0;i<num.length;i++){
            num[i]=rand.nextInt(10);
            System.out.print(num[i]);
            if(i%20==19) System.out.println();
        }
        System.out.println();
        for(int i=0;i<num.length;i++)
            counter[num[i]]++;
        printGraph(counter);

    }
    public static void printGraph(int[] c){
        for(int i=0;i<c.length;i++){
            System.out.print(i + "개수\t: ");
            for(int j=0;j<c[i];j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
