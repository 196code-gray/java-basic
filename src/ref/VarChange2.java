package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println(dataA);
        System.out.println(dataB);
        System.out.println(dataA.value);
        System.out.println(dataB.value);
    }
    /*
    Data 타입의 dataA라는 새로운 인스턴스를 생성해준다.
    dataA에는 참조값이 들어간다.
    dataB에 dataA의 참조값을 복사해서 대입해준다.
    서로 같은 참조값을 참조하므로 참조값과 value 값이 같다.
     */
}
