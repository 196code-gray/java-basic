package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        account.withdraw(200000);
        System.out.println("balance : " + account.getBalance());

        /*
        캡슐화의 중요성
            isAmountValid 는 메서드를 사용할 때 금액이 0 초과인지 확인하는 용도
            사용자는 전혀 알 필요가 없음.
            하지만 public 으로 설정되어 있을 경우 개발자가 여러가지 의문을 가질 수 있음
            기능은 꼭 외부에 공개해야 하는 것만 public 으로.
         */
    }
}