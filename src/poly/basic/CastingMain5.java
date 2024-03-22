package poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        call(parent1);
        call(parent2);
    }
    private static void call(Parent parent){
        parent.parentMethod();

        // 현재 인스턴스가 child 타입이면 다운 캐스팅 문제 없음.
        if (parent instanceof Child){
            System.out.println("Child 인스턴스 맞음.");
            Child child = (Child) parent;
            child.childMethod();
        }
        else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
