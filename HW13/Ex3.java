import java.util.*;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        IntSupplier is=()->{
            Random rand=new Random();
            return rand.nextInt(100) + 100;
        };
        list=makeRandomList(is, 10);
        System.out.println(list);

        IntUnaryOperator iu=i->i/100+(i%100)/10+i%10;
        sumDigits(iu, list);
        System.out.println(list);

        Predicate<Integer> ip=i->i>=10;
        list.removeIf(ip);
        System.out.println(list);
    }
    static <T> List<Integer> makeRandomList(IntSupplier s, int size) {
        List<Integer> makelist=new ArrayList<>();
        for(int i=0;i<size;i++)
            makelist.add(s.getAsInt());
        return makelist;
    }

    static void sumDigits(IntUnaryOperator u, List<Integer> list) {
        for(int i=0;i<list.size();i++)
            list.set(i, u.applyAsInt(list.get(i)));
    }
}
