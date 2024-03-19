package extends1.ex2;
/*
현재 전기차, 휘발유차 Car 를 extend (상속) 하고 있기 때문에 Car에 있는 기능 사용 가능.
부모 클래스(슈퍼 클래스)는 자식의 클래스 접근 불가능(누군지 모름)
자식만 기능 사용 가능

자바에서는 다중상속 불가능
 - 다이아몬드 문제 발생
        현 객체가 상속받은 부모의 기능을 사용할 때 어떤 부모를 말하는건지 알 수 없음.
        애매한 문제.
 - 클래스 계층 구도가 복잡해질 수 있음.
 */
public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
