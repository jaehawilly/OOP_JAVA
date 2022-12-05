public class Ex1 {
    public static void main(String[] args) {
        TV myTV=new TV("LG",2017,32);
        myTV.show();
    }
}
class TV {
    String brand;
    int year;
    int size;
    public TV(String str, int n, int s) {
        brand=str;
        year=n;
        size=s;
    }
    public void show(){
        System.out.println(brand + "에서 만든 " + year + "년형 " + size + "인치 TV");
    }
}