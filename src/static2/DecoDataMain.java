package static2;

/*
import static 메서드를 적으면 클래스명 생략하고 사용 가능
 */
import static static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3.인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        staticCall(data1);

        DecoData data3 = new DecoData();
        // 인스턴스를 통해서 접근 가능하지만 권장 x
        // 다른 개발자가 봤을 때 인스턴스 메서드라고 생각할 수 있음.
        staticCall();

        staticCall();
    }
}