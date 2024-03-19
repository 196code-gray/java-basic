package extends1.overriding;

public class ElectricCar extends Car {
    public void charge(){
        System.out.println("충전합니다.");
    }
    /*
    프로그램이 읽을 수 있는 주석이라고 생각.
    오버라이드
        상위 클래스에 있는 기능 내용을 재정의해서 사용할 수 있는 것.
            주의 점 : 메서드 이름, 매개변수 ,개수, (리턴)타입 같아야함.
     */
    @Override
    public void move(){
        System.out.println("전기차가 빠르게 이동합니다.");
    }
}
