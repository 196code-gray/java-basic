package poly.ex.pay0;

public class PayService1 {
    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다:" + "option=" + option + ", amount=" +
                amount);

        Pay pay = PayType.findPay(option);

        if (pay.pay(amount)) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
