package Week5.PaymentSystem.CashPayment;

import Week5.PaymentSystem.IPayable.IPayable;
import java.util.Random;
public class CashPayment implements IPayable{
    private double paymentAmount;
    public CashPayment() {
        Random rand = new Random();
        SetPaymentAmount(rand.nextInt(99) + 1);
    }

    public void SetPaymentAmount(double amount) {
        this.paymentAmount = amount;
    }

    public double GetPaymentAmount() {
        return this.paymentAmount;
    }

    @Override
    public void Pay() {
        System.out.printf("Frrrrr! -%.2f$\n", this.GetPaymentAmount());
    }

    @Override
    public void Refund() {
        System.out.printf("Giving back your cash +%.2f$\n", this.GetPaymentAmount());
    }
}
