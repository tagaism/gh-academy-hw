package Week5.PaymentSystem.CashPayment;

import Week5.PaymentSystem.IPayable.IPayable;

public class CashPayment implements IPayable{
    @Override
    public void Pay() {
        System.out.println("Frrrrr!");
    }
}
