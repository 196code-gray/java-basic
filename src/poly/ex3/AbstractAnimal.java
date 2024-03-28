package poly.ex3;

// 추상 클래스 & 추상 메소드
public abstract class AbstractAnimal {
    public abstract void sound();
    public void move(){
        System.out.println("동물이 움직입니다.");
    }
}
