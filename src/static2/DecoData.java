package static2;
/*
static 은 static 에만 접근 가능
    why?
        static 은 JVM이 실행되고 거읠 바로 생성됨.
        클래스가 생성되고 static 이 생성되는데 static 메서드가 인스턴스를 참조하려면 인스턴스가 생성되야함.
        그리고 참조값도 필요.
        그래서 static 이 생성될 때 객체가 생성되지 않으므로 참조 불가
        static 변수, 메서드 모두 static 만 사용 가능.
        또, static 메서드는 클래스를 통해 바로 호출 가능. 그래서 참조값의 개념 존재 x
 */
public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++; // 정적 변수 접근
        staticMethod();   // 정적 메서드 접근
    }
    public void instanceCall(){
        instanceValue++;  // 인스턴스 변수 접근
        instanceMethod();  // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod();   // 정적 메서드 접근
    }
    /*
    static 메서드여도 참조값을 넘겨주면 그건 가능
    아래와 같은 메서드는 정상 동작
     */
    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
    }
    private void instanceMethod(){
        System.out.println("instanceValue: " + instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue" + staticValue);
    }
}
