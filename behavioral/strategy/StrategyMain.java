package behavioral.strategy;

public class StrategyMain {
    public static void main(String[] args) {
        PaymentApp app = new PaymentApp();
        app.pay(new PayByCredit());//gives more flexible space to add more logic and pref this

        app.pay(PaymentMode.cashPayment);

        //or make a direct payment here
        app.pay(() -> {
            System.out.println("Paying by BankTransfer");
        });

    }
}
