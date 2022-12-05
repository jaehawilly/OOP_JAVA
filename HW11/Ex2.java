public class Ex2 {
    public static void main(String[] args) {
        PairGen<String, Integer> p1 = new PairGen<>("Apple", 3);
        PairGen<String, Integer> p2 = new PairGen<>("Apple", 3);
        System.out.println(CompareGen.compare(p1, p2));

        PairGen<String, String> p3 = new PairGen<>("객체지향", "Java");
        PairGen<String, String> p4 = new PairGen<>("객체지향", "C++");
        System.out.println(CompareGen.compare(p3, p4));
    }
}
class PairGen<K,V> {
    private K k;
    private V v;
    public PairGen(K k, V v) {
        this.k=k;
        this.v=v;
    }
    public K getK() { return this.k; }
    public V getV() { return this.v; }
}
class CompareGen {
    public static <K,V> boolean compare(PairGen<K,V> p1, PairGen<K,V> p2) {
        return p1.getK() == p2.getK() && p1.getV() == p2.getV();
    }
}