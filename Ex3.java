public class Ex3 {
    public static void main(String[] args) {
        Integer[] ArrayOne = { 1, 2, 3, 4, 5 };
        Double[] ArrayTwo = { 3.0, 4.0, 1.5, 2.5, 1.5 };
        Long[] ArrayThree = { 7L, 8L, 9L, 10L };
        System.out.println(getAverage(ArrayOne));
        System.out.println(getAverage(ArrayTwo));
        System.out.println(getAverage(ArrayThree));
    }
    public static <T extends Number> Double getAverage(T[] Array) {
        double sum=0;
        for(int i=0;i<Array.length;i++){
            sum+=Array[i].doubleValue();
        }
        return sum/Array.length;
    }
}
