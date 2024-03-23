package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);
    }
    /*
    Animal 타입 하나로 다양한 하위 객체 호출 가능
    아까와 다르게 중복 코드 사라짐
    그리고 메서드 오버라이딩으로 각자의 메서드 호출
    다른 동물이 추가되어도 코드 추가 없이 그대로 사용 가능.
     */
    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
