package memory;

public class JavaMemoryMain2 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        // method1 스택 영역에서 제거 & 힙 영역 참조 x
        System.out.println("main end");
        // 힙 영역에 남은 data 참조값은 GC에 의해 처리
    }

    static void method1() {
        System.out.println("method1 start");
        // new Data를 사요하면서 참조값 data1에 들어가게 됨
        Data data1 = new Data(10);
        // data1의 참조값을 method2 메서드에 매개변수로 넘겨줌
        method2(data1);
        // method2 는 사용이 종료되고 스택 영역에서 제거 & 힙 영역에서 참조 x
        System.out.println("method1 end");
    }

    private static void method2(Data data2) {
        // 현재 힙 영역에 있는 data 참조값을 method1과 method2 두 곳에서 참조중
        System.out.println("method2 start");
        System.out.println(data2.getValue());
        System.out.println("method2 end");
    }

}
