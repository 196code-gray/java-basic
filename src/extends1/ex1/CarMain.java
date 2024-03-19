package extends1.ex1;
/*
전기차와 가솔린차 둘 다 자동차.
두개 다 현재 move 메서드가 중복
충전 방식은 다름.
서로 공통 되는 부분을 따로 만들어서 상속으로 만드는 것이 좋음.
 */
public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GasCar gasCar =  new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }
}
