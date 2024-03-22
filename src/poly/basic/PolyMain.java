package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent parent1 = new Child();
        // parent 타입은 본인 메서드만 알고 있는 상태. 그래서 child 는 사용 불가
        parent1.parentMethod();
        // 컴파일 오류 발생
        // 자식 타입은 부모 타입 담을 수 없음.
//        Child child1 = new Parent();

        /*
        이걸 왜 사용하는거지???
        메모리는 두배로 들고, 어차피 기능은 본인 것 밖에 사용을 못함.
        그럼 손해 아닌가??
         */
    }
}
