package Week5.PaymentSystem;

import Week5.PaymentSystem.IPayable.*;
import Week5.PaymentSystem.CashPayment.CashPayment;
import Week5.PaymentSystem.CreditCardPayment.CreditCardPayment;

public class Main {
    public static void main(String[] args) {
        IPayable[] weekSpent = new IPayable[] {
            new CashPayment(),
            new CreditCardPayment(),
            new CashPayment(),
            new CashPayment(),
            new CreditCardPayment(),
            new CashPayment(),
            new CreditCardPayment(),
            new CashPayment(),
            new CreditCardPayment(),
        };

        int i = 0;
        for(IPayable p : weekSpent) {
            p.Pay();
            if(i % 2 == 0) {
                p.Refund();
            }
            i++;
        }
    }
}
