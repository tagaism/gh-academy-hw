package Week5.PaymentSystem.CreditCardPayment;

import Week5.PaymentSystem.IPayable.IPayable;
import java.util.Random;
public class CreditCardPayment implements IPayable{
    private double paymentAmount;

    public CreditCardPayment() {
        Random rand = new Random();
        double paymentAmount = rand.nextInt(99) + 1;
        SetPaymentAmount(paymentAmount);
    }

    public void SetPaymentAmount(double payment) {
        this.paymentAmount = payment;
    }

    public double GetPaymentAmount() {
        return this.paymentAmount;
    }
    @Override
    public void Pay() {
        System.out.printf("Qling -%.2f$\n", GetPaymentAmount());
    }
    
    @Override
    public void Refund() {
        System.out.printf("Depositing account +%.2f$\n", GetPaymentAmount());
    }
}
