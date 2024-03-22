package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        // 오루 발생
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod();

        /*
        다운 캐스팅은 생략이 불가능 하고 업캐스팅은 생략 가능한 이유
            상속을 받은 하위 객체는 인스턴스가 생성될 때 메모리에 상위 타입을 다 생성.
            그러기 때문에 절대 업캐스팅은 문제가 발생되지 않음.

            하지만 다운캐스팅의 경우 현재 메모리에 하위 객체는 생성 x
            하위 타입으로 생성하지 않는 이상 상위에서는 하위 공간을 생성하지 않음
            불확실성. 있을 가능성도 있고, 없을 가능성도 있음.
            없다면 에러 발생.
            그렇기에 다운 캐스팅은 꼭 개발자가 명시를 해줘야 함.
         */
    }
}
