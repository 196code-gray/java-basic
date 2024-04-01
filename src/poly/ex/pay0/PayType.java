package poly.ex.pay0;
/*
이 메스드를 PayService 가 가지고 있을경우 새로운 결제 방식 추가시 PayService 로직 변경해야 함.
OCP 원칙에 어긋남. 그렇기에 따로 빼줌.
 */
public abstract class PayType {
    static public Pay findPay(String type){
        if (type.equals("kakao")){
            return new KakaoPay();
        } else if (type.equals("naver")){
            return new NaverPay();
        }
        else return new DefaultPay();
    }
}
