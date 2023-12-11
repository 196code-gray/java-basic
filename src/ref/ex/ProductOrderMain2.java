package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder productOrder1 = createOrder("두부", 2000, 2);
        ProductOrder productOrder2 = createOrder("김치", 5000, 1);
        ProductOrder productOrder3 = createOrder("콜라", 1500, 2);

        ProductOrder[] productOrders = new ProductOrder[] {productOrder1, productOrder2, productOrder3};

        printOrders(productOrders);
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
