package poly.car;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();

        driver.setK3Car(k3Car);
        driver.drive();
        // 자동차가 하나 추가 될 때마다 로직 변경이 너무 많이 일어남.
        Model3Car model3Car  = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
