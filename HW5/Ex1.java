public class Ex1 {
    public static void main(String[] args) {
        String text="I love you";
        int len=text.length();
        for(int i=0;i<len;i++){
            String str1=text.substring(i+1,len);
            String str2=text.substring(0,i+1);
            System.out.println(str1+str2);
        }
    }
}
