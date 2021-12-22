import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MonthSchedule ms=new MonthSchedule(30);
        System.out.println("이번달 스케쥴 관리 프로그램.");
        while (true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1: ms.input(); break;
                case 2: ms.view(); break;
                case 3: ms.finish(); return;
                default: System.out.println("잘못입력하였습니다.");
            }
            System.out.println();
        }
    }
}
class MonthSchedule {
    Scanner sc=new Scanner(System.in);
    Scanner sc2=new Scanner(System.in);
    public Day[] schedule;
    MonthSchedule(int num) {
        this.schedule=new Day[num];
        for(int i=0;i<num;i++){
            schedule[i]=new Day();//instance 배열 생성 시 배열 각각의 객체 생성해줘야 함
        }
    }
    public void input() {
        System.out.print("날짜(1~30)?");
        int date=sc.nextInt();
        for(Day d : schedule){
            if(d.get()!=null) {
                System.out.println("할 일이 이미 있습니다.");
            }
            else{
                System.out.print("할일(빈칸없이입력)?");
                String input=sc2.nextLine();
                schedule[date-1].set(input);
            }
            break;
        }
    }
    public void view() {
        System.out.print("날짜(1~30)?");
        int date=sc.nextInt();
        System.out.println(date + "일의 할 일은 " + schedule[date-1].get() + "입니다.");
    }
    public void finish() {
        System.out.println("프로그램을 종료합니다.");
    }
}
class Day {
    private String work;
    public void set(String work) { this.work=work; }
    public String get() {
        return work;
    }
    public void show() {
        if(work==null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}