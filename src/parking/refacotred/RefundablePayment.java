package parking.refacotred;

public interface RefundablePayment extends PaymentMethod {
    public void refund(double amount);
}
