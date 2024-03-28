package poly.diamond;
/*
인터페이스의 다중 구현
   상속과는 다르게 문제가 발생되지 않음
    why??
        상속은 부모에 따른 메서드 선택이 애매해지는 다이아몬드 문제 발생.
        하지만 인터페이스의 경우 추상 메서드이기 때문에 자식에서 무조건 오버라이딩 필수
        자바에서 하위 객체가 메서드를 참고할 시 오버라이딩이 우선권 가짐.
        그러므로 여러명의 상위 객체가 존재해도 결국 하위 객체가 오버라이딩한 메서드가 우선권을 가지기 때문에
        문제가 발생하지 않는 것.
 */
public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommend();

        Child c = new Child();
        c.methodB();
    }
}
