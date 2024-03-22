package poly.basic;
public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();

        // 다운 캐스팅(부모 -> 자식 타입)
        Child child = (Child) poly;
//        child.childMethod();

        // 일식적 다운캐스팅 - 해당 메서드를 호출하는 순간만
        ((Child) poly).childMethod();

        // 업캐스팅
        Child child1 = new Child();
        Parent parent = (Parent) child1;
        Parent parent2 = child1; // 업캐스팅 생략

        parent.parentMethod();
    }
}
