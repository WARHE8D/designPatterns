package behavioral.strategy;

public class PayByCredit implements PaymentMode {
    @Override
    public void payByCredit() {
        System.out.println("Paying By Credit Card");
    }
}
