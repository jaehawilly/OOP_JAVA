public class Ex1 {
    public static void main(String[] args) {
        showAll("FACEBOOK");
        showAll("APPLE", "MICROSOFT");
        showAll("AMAZON", "APPLE", "GOOGLE");
    }
    public static void showAll(String... top5) {
        Company com;
        for(int i=0;i<top5.length;i++){
            com=Company.valueOf(top5[i]);
            System.out.println(com);
        }
        System.out.println("세계 기업가치 Top5 중에서 " + top5.length + "개 기업이 있습니다.\n");
    }
}
enum Company {
    AMAZON(170), APPLE(165), GOOGLE(136), FACEBOOK(101), MICROSOFT(91);

    private int value;

    private Company(int value) {
        this.value=value;
    }

    public String toString() {
        return (this.ordinal()+1) + "위 " + this.name() + " 기업가치 " + this.value + "조";
    }
}