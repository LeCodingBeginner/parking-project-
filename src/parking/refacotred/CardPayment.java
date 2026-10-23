package parking.refacotred;

public class CardPayment implements RefundablePayment{
    private String cardNumber;
    private String type = "CARD";

    public CardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public void pay(double amount){
        System.out.println("[CARD ****"+cardNumber.substring(cardNumber.length()-4)+"] paid " + amount + " MAD");
    }

    public void refund(double amount){

    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getType() {
        return type;
    }
}
