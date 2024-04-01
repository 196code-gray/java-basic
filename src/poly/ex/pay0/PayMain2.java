package poly.ex.pay0;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService1 payService = new PayService1();

        while (true) {
            System.out.print("결제 수단을 입력하세요:");
            String s = sc.nextLine();

            if (s.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.print("결제 금액을 입력하세요:");
            int price = sc.nextInt();
            sc.nextLine();

            payService.processPay(s, price);
        }
    }
}

