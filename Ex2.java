import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true){
            System.out.print("한글 단어?");
            String str=sc.nextLine();
            if(str.equals("그만")) break;
            String result=Dictionary.kor2Eng(str);
            System.out.println(result);
        }
    }
}
class Dictionary {
    private static String[] kor={"사랑","아기","돈","미래","희망"};
    private static String[] eng={"Love","baby","money","future","hope"};
    public static String kor2Eng(String word){
        for(int i=0;i<5;i++){
            if(word.equals(kor[i]))
                return (word + "은 " + eng[i]);
        }
        return (word + "는 저의 사전에 없습니다.");
    }
}