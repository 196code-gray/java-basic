package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        // 사용자의 입력을 받는 주문 시스템
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: " );
        int n = sc.nextInt();
        ProductOrder[] productOrders = new ProductOrder[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String name = sc.next();
            System.out.print("가격: ");
            int price = sc.nextInt();
            System.out.print("수량: ");
            int quantity = sc.nextInt();

            productOrders[i] = createOrder(name, price, quantity);
        }

        System.out.println("총 결제 금액: " + getTotalAmount(productOrders));
        // ctrl + alt + v = 자동 단축키
    }

    static ProductOrder createOrder (String productName, int price, int quantity) {
        ProductOrder p = new ProductOrder();
        p.productName = productName;
        p.price = price;
        p.quantity = quantity;
        return p;
    }
    static void printOrders (ProductOrder[] orders) {
        for (ProductOrder p : orders) {
            System.out.println("상품명: " + p.productName + " 가격: " + p.price + " 수량: " + p.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders) {
        int totle = 0;
        for (ProductOrder p : orders) {
            totle += p.price * p.quantity;
        }
        return totle;
    }
}
