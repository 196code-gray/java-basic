package final1;
/*
final 을 지역변수로 지정한 경우 다시는 값 변경 x
하지만 인스턴스로 만들경우 중복으로 생성.
메모리로 그만큼 공간 사용
final 을 사용할 때는 static 을 붙여서 사용.
 */
public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수
        final int data1;
        data1 = 10;  // 처음 한번만 할당 가능

        // final 지역 변수2
        final int data2 = 10;

    }
    static void method(final int parmeter){
//        parmeter = 1;
    }
}
