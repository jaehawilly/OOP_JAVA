public class Ex1 {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        Player p = new DVDPlayer();
        ExPlayer e = new DVDPlayer();
        System.out.println("*** DVDPlayer형 변수 d ***");
        d.play();
        d.stop();
        d.slow();
        System.out.println("*** Player형 변수 p ***");
        p.play();
        p.stop();
        System.out.println("*** ExPlayer형 변수 e ***");
        e.play();
        e.stop();
        e.slow();
    }
}
interface Player {
    void play();
    void stop();
}
interface ExPlayer extends Player {
    void play();
    void stop();
    void slow();
}
class DVDPlayer implements ExPlayer {
    public void play() {
        System.out.println("DVD 재생 시작!");
    }
    public void stop() {
        System.out.println("DVD 재생 종료!");
    }
    public void slow() {
        System.out.println("DVD 느린 재생 시작!");
    }
}