import java.util.StringTokenizer;

public class Ex1 {
    public static void main(String[] args) {
        String s1 = "동해물과 백두산이 마르고 닳도록";
        String s2 = "2020/11/03";
        String s3 = "2020년11월03일";

        StringTokenizer st=new StringTokenizer(s1);
        int i=1;
        System.out.println("s1 count: " + st.countTokens());
        while(st.hasMoreTokens())
            System.out.println(i++ + " : " + st.nextToken());

        st=new StringTokenizer(s2,"/");
        i=1;
        System.out.println();
        System.out.println("s2 count : " + st.countTokens());
        while(st.hasMoreTokens())
            System.out.println(i++ + " : " + st.nextToken());

        st=new StringTokenizer(s3,"년월일");
        i=1;
        System.out.println();
        System.out.println("s3 count : " + st.countTokens());
        while(st.hasMoreTokens())
            System.out.println(i++ + " : " + st.nextToken());
    }
}
