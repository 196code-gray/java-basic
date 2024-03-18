package final1;
/*
참조형 변수에 final 이 붙으면 참조값 변경 불가능
하지만 값은 변경 가능
값이 final 이 아니라면 변경 가능.
 */
public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();

        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

    }
}
