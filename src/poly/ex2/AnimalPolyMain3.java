package poly.ex2;
public class AnimalPolyMain3 {
    public static void main(String[] args) {
        // 새로운 동물이 추가 되어도 배열 부분 제외 코드가 변하지 않음.
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
