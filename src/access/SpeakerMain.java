package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 다른 개발자가 코드 설명을 못듣고 코드를 수정할 경우
        speaker.volume = 200;
        speaker.showVolume();
        speaker.volumeUp();
        // 볼륨을 100 초과로 올리면 안됨에도 불구 200으로 변경 = 문제 발생

    }
}
