package behavioral.strategy;

public interface PaymentMode {

    void payByCredit();

    //much simpler way
    //love lambda fns <3
    PaymentMode cashPayment =
            () -> {
                System.out.println("Paying by Cash");
            };
}
