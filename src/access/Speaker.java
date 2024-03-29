package access;

public class Speaker {
    // 볼륨을 private으로 수정하여 직접 접근 불가능
    private int volume;

    public Speaker(int volume) {
        this.volume = volume;
    }
    void volumeUp(){
        if (volume >= 100) {
            System.out.println("최대 음량입니다.");
        }
        else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }
    void volumeDown(){
        volume -= 10;
        System.out.println("음량을 10 감소");
    }
    void showVolume(){
        System.out.println("현재 음량 : " + volume);
    }
}
