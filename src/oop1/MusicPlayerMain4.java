package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.on();
        musicPlayer.volumeUp();
        musicPlayer.volumeUp();
        musicPlayer.volumeDown();
        musicPlayer.showStatus();
        musicPlayer.off();

        /*
        music player를 사용하는 입장에서는 단순하게 메서드를 호출만 해주면 됨.

        music player를 만드는 사람과 사용하는 사람이 분리되어 있다고 생각.
        이 전 클래스까지는 모두 절차지향 프로그래밍 방식.
        위에서 작성해놓은 순서대로 실행됨.
        객체치향이란 music player 라는 객체를 중심으로 기능이 만들어짐.

         */
    }
}
