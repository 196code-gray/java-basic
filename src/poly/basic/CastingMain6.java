package poly.basic;

/*
자바 16버전부터 가능.
 */
public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Parent parent2 = new Child();
        call(parent1);
        call(parent2);
    }
    private static void call(Parent parent){
        parent.parentMethod();

        // 인스턴스 타입이 child 가 맞다면 한번에 변수 생성 가능.
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음.");
            child.childMethod();
        }
        else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
