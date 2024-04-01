package poly.ex.pay0;
/*
결제 수단이 없는 것도 하나의 결제 수단으로.
"null object 패턴" 이라고 함.
 */
public class DefaultPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("결제 수단을 찾을 수 없습니다.");
        return false;
    }
}
