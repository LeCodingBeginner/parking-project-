package parking.refacotred;

public class CashPayment implements NonRefundablePayment{
    private String type = "CASH";

    public void pay(double amount) {
        System.out.println("[CASH] paid " + amount + " MAD");
    }

    public String getType() {
        return type;
    }
}
