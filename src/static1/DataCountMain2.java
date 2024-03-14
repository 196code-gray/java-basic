package static1;

public class DataCountMain2 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count " + counter.count);
    }
}
/*
data1에서의 문제는 해결이 되었지만 data의 값을 알기위해 Counter라는 클래스를 따로 생성해주었다는 점,
그리고 Counter 참조값을 생성해주어야 하고 Data2의 매개변수에도 Counter의 변수가 들어가야함
 */