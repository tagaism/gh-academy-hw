package Week5.PaymentSystem;

import Week5.PaymentSystem.CashPayment.CashPayment;
import Week5.PaymentSystem.CreditCardPayment.CreditCardPayment;

public class Main {
    public static void main(String[] args) {
        CashPayment cashPayment = new CashPayment();
        CreditCardPayment cardPayment = new CreditCardPayment();
        cashPayment.Pay();
        cardPayment.Pay();
    }
}
