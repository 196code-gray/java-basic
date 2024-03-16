package static2.ex;

public class Car {
    private String name;
    static private int count;

    public Car(String name) {
        this.name = name;
        System.out.println("차량 구입, 이름: " + name);
        count++;
    }
    static void showTotalCars(){
        System.out.println("구매한 차량 수: " + count);
    }

}
