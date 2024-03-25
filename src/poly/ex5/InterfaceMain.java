package poly.ex5;
/*
순수 추상 클래스가 인터페이스가 된 것뿐.
    추상 클래스와 동일하게 움직임.
    메모리 구조, 동작방식.

    인터페이스도 추상 클래스와 동일하게 껍데기뿐인 메서드 생성.

    모든 메서드가 추상인경우 인터페이스를 사용해야 함.
        why?
            - 제약
                순수 추상 클래스의 경우 다른 개발자가 그냥 메서드를 생성할 수 있음.
                그렇게 되었을 경우 추가된 기능을 자식 클래스에서 구현을 할 수도 있고 안할 수도 있음.
                이러한 예외상황을 차단할 수 있음.

           - 다중 구현 가능
 */
public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }
    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
