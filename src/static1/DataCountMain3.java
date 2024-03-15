package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        Data3 data4 = new Data3("D");
        System.out.println("D count=" + data4.count);

        /*
        인스턴스를 통한 접근은 권장 x
        why?
          인스턴스 변수인지 헷갈릴 가능성 o

          개발할 때 만드는 입장 / 가져다 쓰는 입장 2가지 생각
          가져다 쓰는 입장을 생각하며 코드 작성해야 함.
         */

    }
}
