import java.util.Locale;

public class Ex3 {
    public static void main(String[] args) {
        String text1="eW";
        String text2="LOVE";
        String text3="C++";
        String text4="programming.";
        StringBuilder sb=new StringBuilder();
        sb.append(text1);
        sb.reverse();
        sb.append(" " + text2.toLowerCase());
        sb.append(" " + text3);
        sb.replace(8,11, "JAVA");
        sb.append(" " + text4);
        System.out.println(sb);
    }
}
