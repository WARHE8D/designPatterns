package behavioral.strategy;

public class PaymentApp {

    public void pay(PaymentMode paymentMode) {
        paymentMode.payByCredit();
    }
}
