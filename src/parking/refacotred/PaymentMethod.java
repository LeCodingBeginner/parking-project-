package parking.refacotred;

public interface PaymentMethod {
    public String getType();
    public void pay(double amount);
}
